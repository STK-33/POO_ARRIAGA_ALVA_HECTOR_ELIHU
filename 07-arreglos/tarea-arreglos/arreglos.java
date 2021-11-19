import java.util.*;
import java.lang.Math;

public class arreglos{

    //variables globales
    
    int opcion;
    char letra;

    //objeto
    Scanner entrada = new Scanner(System.in);


    public void menu(){
        /*
        Vamos a realizar un programa que se encargue de realizar el calculo
        del area y perimetro de:
        cuadrado
        triangulo
        circulo
        */
        do{
            System.out.println("Programa de arreglos.");
            System.out.println("Elija la opcion deseada: ");
            System.out.println("1.- promedio + y -");
            System.out.println("2.- Promedio pares");
            System.out.println("3.- calificaiones");
            System.out.println("4.- suma de matriz");
            System.out.println("5.- verificar si una palabra es un palindromo");
            System.out.println("6.- Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    promedio1();             
                    break;

                case 2:
                    promediopar();                
                    break;

                case 3:
                    calificaciones();                
                    break;

                case 4:
                    matriz();                
                    break;
                    
                case 5:
                    palindromo();                
                    break;    


                default:
                    System.out.println("Gracias hasta la proxima");
                    break;
            }
            System.out.println("Desea repetir el programa? S para repetir");
            letra = entrada.next().charAt(0);

        }while(letra == 's' || letra == 'S');
    }

    public void promedio1(){
        //do
        try{
            int i;
            int pos = 0, neg = 0; 
            int[] numeros = new int[10]; 
            double sumaPos = 0, sumaNeg = 0; 
            //lectura de datos y llenar el array
            System.out.println("ingrese 10 numero positivos y negativos: ");
            for (i = 0; i < 10; i++) {
                System.out.print("numeros[" + i + "]= ");
                numeros[i]=entrada.nextInt();
            }
    
            //recorrer el array para sumar por separado los números positivos 
            for (i = 0; i < 10; i++) {
                if (numeros[i] > 0){ //sumar positivos
                    sumaPos += numeros[i];
                    pos++;
                } else if (numeros[i] < 0){ //sumar negativos
                    sumaNeg += numeros[i];
                    neg++;
                }
            }
    
            //Calcular y mostrar las promedios
            if (pos != 0) {
                System.out.println("Media de los valores positivos: " + sumaPos / pos);                
            } else {
                System.out.println("No ha introducido numeros positivos");
            }
            if (neg != 0) {
                System.out.println("Media de los valores negativos: " + sumaNeg / neg);
            } else {
                System.out.println("No ha introducido numeros negativos");
            }
        }catch(Exception e){
            System.out.println("Ingresa unicamente valores numericos");
            System.out.println("Error: " + e.getMessage());

        }


    }

    public void promediopar(){
           
           try{
            int i;
            int[] numeros = new int[10];
            double media = 0;
    
            //lectura de datos y llenar el array
            System.out.println("ingresa 10 numeros a calcular: ");
            for (i = 0; i < 10; i++) {
                System.out.print("numeros[" + i + "]= ");
                numeros[i] = entrada.nextInt();
            }
            //Recorrer el array y calcular la media
            for (i = 0; i < 10; i++) {
                if (i % 2 == 0){ //si la posición actual es par
                    media = media + numeros[i]; //se suma el valor de esa posición
                }
            }
            //Calcular y mostrar la media
            System.out.println("El promedio de los valores que se encuentran en posiciones pares: "+ media/5);              
        
        } catch(Exception e){
            System.out.println("Ingresa unicamente valores numericos");
            System.out.println("Error: " + e.getMessage());

          }
    }

    public void calificaciones(){
       
        try{
            int nalumno,i;
            double suma = 0, media,mayor=0, menor=0;
            
    
            //Lectura del número de alumnos. Debe ser un valor positivo
            do {
                System.out.print("Ingresa el numero de alumnos de la clase: ");
                nalumno = entrada.nextInt();
            } while (nalumno <= 0);
    
            double[] notas = new double[nalumno];

            for (i = 0; i < notas.length; i++) {
                System.out.print("Alumno " + (i + 1) + " Nota final: ");
                notas[i] = entrada.nextDouble();
            }

            // Sumar todas las notas
            for (i = 0; i < notas.length; i++) {
                suma = suma + notas[i];
            }
    
            // Calcular la media
            media = suma / notas.length;

            // Mostrar promedio
            System.out.printf("Promedio de las calificaciones : %.2f %n", media);

             //La calificación más alta y la más baja. 
            
             for ( i = 0; i < notas.length; i++) {
            
                notas [i] = notas[i];
                    }
                mayor = menor = notas [0];
           
                for ( i = 0; i < notas.length; i++) {
                if(notas [i] > mayor) {
                    mayor = notas[i];
                }
                if(notas[i]<menor) {
                    menor = notas[i];
                }
                    }
                System.out.println("La mayor calificacion es: "+mayor);
                System.out.println("La menor calificacion es: "+menor);
            // Mostrar los valores superiores a la media
            System.out.println("Listado de calificaciones superiores al promedio: ");
            for (i = 0; i < notas.length; i++) {
                if (notas[i] > media) {
                    System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
                }
            }
            //La cantidad de alumnos aprobados y reprobados. 
            for ( i = 0; i < notas.length; i++) {
                if (notas[i] >= 5) {
            System.out.println("aprobado: Alumno numero " + (i + 1)+ " Nota final: " + notas[i] );
            }else{
            System.out.println("reprobado: Alumno numero " + (i + 1)+ " Nota final: " + notas[i] );
            }

            }
           
                
    
           
            
        } catch(Exception e){
            System.out.println("Ingresa unicamente valores numericos");
            System.out.println("Error: " + e.getMessage());

          }
          
    

    }

    public void matriz(){
           
        try{
            int matriza[][] = new int [3][3];
            int matrizb[][] = new int [3][3];
            int matrizc[][] = new int [3][3];
            int i, j;
            
            
            System.out.println("Ingresa los datos de la Matriz A :");
            
            for (i=0; i<=2; i++){
                for (j=0; j<=2; j++){
                    System.out.print("Escribir valor " + i + " , " + j + " : ");
                    matriza [i][j]= entrada.nextInt();
                   }
               }
               
               System.out.println("Ingresa los datos de la Matriz B :");
               
               for (i=0; i<=2; i++){
                for (j=0; j<=2; j++){
                    System.out.print("Escribir valor " + i + " , " + j + " : ");
                    matrizb [i][j]= entrada.nextInt();
                   }
               }
               
               for (i=0; i<=2; i++){
                for (j=0; j<=2; j++){
                    matrizc [i][j]= matriza[i][j]+matrizb[i][j];
                   }
               }
               
               System.out.println("Matriz resultante de la suma :");
       for (i=0;i<=2;i++){
               for (j=0;j<=2;j++) {
                   System.out.print(matrizc[i][j] + " ");
               }
               System.out.println("");
               
           }
                 
     
     } catch(Exception e){
         System.out.println("Ingresa unicamente valores numericos");
         System.out.println("Error: " + e.getMessage());

       }
 }
 
 public void palindromo(){
           
    try{
        Scanner palindro= new Scanner(System.in);
        System.out.print("Introduce una palabra : ");
        String s=palindro.nextLine();
        
        s=s.replace(" ", "");
        s=s.replace(",", "");
        s=s.replace(".", "");
        System.out.print(s);
        int fin = s.length()-1;
        int ini=0;
        boolean espa=true;
        
        while(ini < fin){
            if(s.charAt(ini)!=s.charAt(fin)){
                espa=false;
            }
        ini++;
        fin--;
        }
        if(espa)
            System.out.print("\nEs palindromo.");
        else
            System.out.print("\nNo es palindromo.");

            System.out.println("");

    } catch(Exception e){
     System.out.println("Ingresa unicamente valores numericos");
     System.out.println("Error: " + e.getMessage());

         }
    }

}