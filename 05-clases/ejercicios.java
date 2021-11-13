import java.util.Scanner;

public class ejercicios {

    Scanner entrada = new Scanner(System.in);
    char op;

    public void menu(){
        //menu del programa
        char op;

        System.out.println("ejercicios por mi");
        System.out.println("a.- calculadora");
        System.out.println("b.- conversion de unidades");
        System.out.println("c.- creacion de cuadros");
        System.out.println("d.- movimiento en cuadro");
        System.out.println("cualquier otra opcion sale del programa");

        op = entrada.next().charAt(0);

        // la estructura que se nesecita

        switch(op){
            case 'a':
            //implementar metoddos independientes para cada opcion
            ejercicio1();
            break;

            case 'b' :
            ejercicio2();
            break;

            case 'c' :
            ejercicio3();
            break;

            case 'd' :
            ejercicio4();
            break;

            default:
            System.out.println("gracias");
        }

    }

    public void ejercicio1(){

        double numero1= 0.00, suma = 0.00, multi = 1.00;
        char operacion;

        System.out.print("selecciona la operacion que deseas realizar: ");
        System.out.print("a. suma y resta: ");
        System.out.print("b. multiplicacion: ");
        System.out.print("c. divicion: ");

        operacion = entrada.next().charAt(0);

        switch(operacion){
            case 'a':
            do{
                System.out.println("para detener la operacion presiona 0");
                System.out.println("escribe los numeros que deseas sumar o restar");

                suma += numero1;

            }while(numero1 != 0);

            System.out.println("el resultado es: " + suma);

            case 'b':
            do{
                System.out.println("para detener la opercion dijite 0");
                System.out.println("escriba los numeros que dese multiplicar");
                numero1 = entrada.nextDouble();

                if(numero1 > 0 ){
                    multi *= numero1;
                }else{
                    System.out.println("error colo con positivos");
                }

            }while(numero1 != 0);
            System.out.println("el resultado es: " + multi);
            break;

            case 'c':
            double r, aux,aux2;
            int aux3=0;
            do{
                System.out.print("ingresa el dividendo: ");
                aux = entrada.nextDouble();
                //do
                System.out.print("ingresa el divisor: ");
                //deben de hacer para leer que no sea 0 que vuelva a solicitar
                aux2 = entrada.nextDouble();
                //condicion

                r = aux/aux2;
                System.out.print("el resultado es: " + r);

            }while(aux3 !=0);
            break;


            default:
            System.out.print("opcion no valida: ");
            break;
        }
        
    }
    public void ejercicio2(){
        //vamos a crear un programa que convierta m cm y pulgadas
        //de kg libras g
        //m/s a km/s
        double metros = 0.00, kilogramos = 0.00, velocidad = 0.00, cm = 0.00, pulgadas = 0.00, gramos=0.00, libra=2.20, ms = 0.00;
        double a,b;

        System.out.print("seleccione la cantidad que dese convertir: ");
        System.out.print("a. metros a cm y pulgadas: ");
        System.out.print("b. kg a libras y gramos: ");
        System.out.print("c. m/s a km/s: ");

        op = entrada.next().charAt(0);
        switch(op){
            case 'a':
            System.out.print("ingrese los metros: ");
            metros = entrada.nextDouble();

             a = metros * cm;

             b = metros * pulgadas;
            System.out.print("la cantidad en metros: " + metros + "de m a cm son: " + a 
            + "de ma pulgadas son: " + b);

            break;

            case 'b':
            System.out.print("ingrese los metros: ");
            kilogramos = entrada.nextDouble();

             a = kilogramos * gramos;

             b = kilogramos * libra;
            System.out.print("la cantidad en kilogramos: " + kilogramos + "de kg a gr son: " + a 
            + "de kg a libras son: " + b);

            break;

            case 'c':
            System.out.print("ingrese la velocidad  m/s: ");
            ms = entrada.nextDouble();

             a = ms * (3600/1000);

             
            System.out.print("la conversion de m/s a km/h es de" + a);


            break;

            default:
            System.out.print("opcion no valida");
            break;
        }



    }
    public void ejercicio3(){
        
        int n, m=0;

        do{
            System.out.println("Ingrese el numero de asteristicos que desea que tenga el cuadro: ");
            n = entrada.nextInt();

            //no debe de estar entre 1 y mil
            if( n<0 || n>1000){
                System.out.println("El cuadro no acepta ni negativos ni mayores a 1000");
            }else{
                //cuando si esta en el rango
                for(int i = 1; i<=n; i++){
                    System.out.print("*");
                }
                System.out.println();

                for(int i = 0; i< n-2; i++){
                    System.out.print("*");
                    for(int j = 0; j < n-2; j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }

                for(int i = 1; i<=n; i++){
                    System.out.print("*");
                }
                System.out.println();
            break;
            }
            // tarea salir de ese bucle infinito :3 que se quiebren la cabezita un ratito
        }while(m==0);
       
    }
    public void ejercicio4(){
     /*
        Quiero que se imprima una figura de la siguiente forma:
        ***********
        ///////////
        ***********
        ///////////
        **********
        //////////
        Hasta cubrir el tamaño de un cuadrado
        2 x 2
        **
        //
        3 x 3
        ***
        ///
        ***
        */
        int n;
        
        System.out.println("Ingrese el numero que desea que tenga  el cuadro: ");
            n = entrada.nextInt();

            if( n<0 || n>30){
                System.out.println("El cuadro no acepta ni negativos ni mayores a 30");
            }else{
               for(int i = 0; i< 1; i++){
                    System.out.print("");
                    for(int j = 0; j < n; j++){
                         
                    System.out.print("*");
                    }
                   System.out.println("");
                }

                for(int i = 0; i< 1; i++){
                    System.out.print("");
                    for(int j = 0; j < n; j++){
                         
                    System.out.print("/");
                    }
                   System.out.println("");
                }
                 
              
                for(int i = 0; i< 1; i++){
                    System.out.print("");
                    for(int j = 0; j < n; j++){
                         
                    System.out.print("*");
                    }
                   System.out.println("");
                }
            
            }

                
    }
    

}
