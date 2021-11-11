/*
Vamos a crear un programa que se encargue de realizar las siguientes operaciones
1.- Bono o descuento por edad
2.- Convertir numeros decimales a binarios
3.- Convertir temperaturas celcius, kelvine y rankine
4.- Numero de positivos y negativos segun una lista de numeros
5.- Tiendita peke
6.- Area y Perimetro de figuras geometricas
7.- Tabla
8.- Factorial
9.- Dibujitos de codigo
10.- Figuras huecas de codigo
11.- Patrones de codigos
12.- Diamante de codigo
13.- Calculadora
14.- Salir
*/ 

import java.util.Scanner;
import java.lang.Math;

class EstructuradeDatos{

    //Programa 1
    /*
    EL PROGRAMA DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65, 
    AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. 
    SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON 
    SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 
    45%; EN CASO CONTRARIO, SE LES APLICA UN 25%. 
    variable edad
    condiciones
    */ 

    public static void main(String[] args){

        //objetos
        Scanner entrada = new Scanner(System.in);
        //Scanner socio = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        //SCANER TEMPERATURAS
        Scanner sc = new Scanner(System.in);
        // area de figuras
        Scanner teclado = new Scanner(System.in);


        //variables
        int edad, opcion, socio, numbinario, total, su, b;
        int numerototal = 0;
        int positivos = 0;
        int negativos = 0;
        double precio, bono;
        char letras, operacion;
        long factorial=1;
        int num;
        float precios = 0;
        float resultado = 0;
        int cantidad = 0;
        String binario = "",nombre;
        int opciones=0;
        int n=0;

        
       
        

        //cuerpo del programa

        //menu de las opciones de arriba
        do{

        System.out.println("Bienvenido a tu primer programa de estructuras.");
        System.out.println("Por favor elija la opcion deseada:");
        System.out.println("1.- Descuento por edad");
        System.out.println("2.- Convertir numero decimal a binario");
        System.out.println("3.- Conversiones de temperatura");
        System.out.println("4.- Numeros positivos y negativos");
        System.out.println("5.- Tienda");
        System.out.println("6.- Area y Perimetros");
        System.out.println("7.- Tabla");
        System.out.println("8.- Factorial");
        System.out.println("9.- Dibujos de codigo");
        System.out.println("10.- Figura Hueca");
        System.out.println("11.- Patrones de codigo");
        System.out.println("12.- Diamante");
        System.out.println("13.- Calculadora");
        System.out.println("14.- Salir");

        //condicion switch para el menu

        opcion = entrada.nextInt();


        switch(opcion){

            case 1: //problema 1
                System.out.println("Ingresa el Bono A cobrar");
                bono = entrada.nextDouble();
                System.out.println("Ingresa la edad");
                edad = entrada.nextInt();
                //la estructura de condiciones
                // SI ÉSTA ES MAYOR DE 65, AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%.
                if(edad >= 65){
                    //proceso
                    bono = bono*.6;
                    System.out.println("Su descuento es de 40%");
                    System.out.println("El total a pagar es de: " + bono);
                }
                /*
                SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON 
    SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 
    45%; EN CASO CONTRARIO, SE LES APLICA UN 25%. 
                */ 
                if(edad <= 21){
                    System.out.println("Si tus padres son socios ingresa 1, sino lo son ingresa 2");
                    socio = entrada.nextInt();

                    switch(socio){
                        case 1: 
                            bono = bono*.55;
                            System.out.println("Su descuento fue del 45%");
                            System.out.println("El total a pagar es de: " +bono);
                            break;
                        case 2: 
                            bono = bono*.75;
                            System.out.println("Su descuento fue del 25%");
                            System.out.println("El total a pagar es de: " +bono);
                            break;
                        default:
                        //es el caso por defecto osea los demas casos
                            System.out.println("Opcion no valida");

                    }
                }
                System.out.println("Tu edad es de: " + edad);
                System.out.println("El total a pagar es: " + bono);
                break;

                case 2:
                System.out.println("ingrese un numero positivo entero que dese convertir");
                numbinario = entrada.nextInt();

                if(numbinario > 0){
                    /*
                    Como el algoritmo para convertir un numero decimal en binario
                    aplicar al numbinario mod 2
                    */
                    while(numbinario > 0){
                        if(numbinario % 2 == 0){
                            binario = "0" + binario;
                        }else{
                            binario = "1" + binario;
                        }
                        numbinario = (int)numbinario / 2;
                    }
                }else if (numbinario == 0){
                    binario = "0";
                }else{
                    binario = "No se pudo convertir el numero, ingrese solo positivos.";
                }
                System.out.println("El numero convertirdo a binario es: " + binario);
                break;
               
                case 3: //TAREA *****************************************************
                System.out.println ("Introduzca el tipo de temperatura a convertir: C, F o k");
			String s = sc.next().trim();
			if ("c".equalsIgnoreCase(s)) {
				 // Convertir de Celsius a Fahrenheit
				 System.out.println ("Introduzca la temperatura en celcius : ..");
				double db = sc.nextDouble();
				double db2 = (db * 9 / 5) + 32;
				 System.out.println ("Temperatura en Fahrenheit :" + db2 + "F");
			} else if ("f".equalsIgnoreCase(s)) {
				 // Convertir Fahrenheit a Celsius
				 System.out.println ("Introduzca la temperatura en Fahrenheit : ..");
				double db = sc.nextDouble();
				double db2 = (db - 32) * 5 / 9;
				 System.out.println ("Temperatura en Celsius :" + Math.round (db2) + "C");
			}else if ("k".equalsIgnoreCase(s)) {
                // Convertir Celsius a kelvin
                System.out.println ("Introduzca la temperatura en celsius : ..");
               double db = sc.nextDouble();
               double db2 = (db + 273.15);
                System.out.println ("Temperatura en kelvin :" + Math.round (db2) + "k");
            }else if("exit".equalsIgnoreCase(s)){
				break;
			}
            break;


                case 4:
                System.out.println("inserte ¿cuantos numeros va a ingresar?");
                total = entrada.nextInt();

                do{
                    System.out.println("Inserte el numero");
                    //condicion
                    if(numerototal == 0){
                        //contarcuantos positivos hubo
                        positivos = positivos + 0;
                    }else{
                        if(numerototal > 0){
                            positivos = positivos +1;
                        }else{
                            negativos = negativos +1;
                        }
                    }

                    // SABER EL TOTAL
                    total = total-1;


                }while(total != 0);
                System.out.println("el total de positivo es: "+ positivos);
                System.out.println("el total de positivo es: "+ negativos);

                break;

                case 5:
                System.out.println("¿cuantos elementos vas a ingresar?");
                total = entrada.nextInt();

                for(int i = 1; i <= total; i++){
                    System.out.println("¿ingresa el precio del producto?");
                    precios = entrada.nextFloat();
                    System.out.println("¿ingresa la cantidad del producto?");
                    cantidad = entrada.nextInt();

                    resultado = precios * cantidad; 
                }

                System.out.println("el resultado es: " + resultado);

                break;

                case 6:// tarea ****************************************************
                
                   do{
                    System.out.println();
                    System.out.println("BIENVENIDO AL PROGRAMA AREA DE FIGURAS");
                   System.out.println(" ======== MENU DE OPCIONES ========= ");
                   System.out.println(" ___________________________________ ");
                   System.out.println(" ======== 1. Cuadrado      ========= ");
                   System.out.println(" ======== 2. Circulo       ========= ");
                   System.out.println(" ======== 3. Triangulo     ========= ");
                   System.out.println(" ======== 4. Rectangulo    ========= ");
                   System.out.println(" ======== 5. Pentagono     ========= ");
                   System.out.println(" ======== 6. Rombo         ========= ");
                   System.out.println(" ======== 7. Salir         ========= ");
                   System.out.println(" ___________________________________ ");
                   System.out.println(" Ingrese una opcion ");
                   opciones = teclado.nextInt();
                   switch (opciones){
                   case 1:
                   double area;
                   Scanner cua=new Scanner(System.in);
                   System.out.println("ingrese el lado de cuadrado");
                   double a=cua.nextDouble();         
                   area=a*a;
                   System.out.println("EL AREA DEL CUADRADO ES: " + (area));
                   break;
                         case 2:
                         double areacirculo, radio;
                         Scanner r = new Scanner(System.in);
                         try {
                             System.out.print("Introduce el radio de un Circulo: ");
                             radio = r.nextDouble();
                             areacirculo = Math.PI*(radio*radio);
                             System.out.println("El area del Circulo resultante es: " + areacirculo);
                         } catch (Exception e) {
                             System.out.println("Error: " + e);
                         } 
                   break;
                         case 3:
                         double baset, alturat, areatri;     
                         Scanner obj = new Scanner(System.in);
                          
                         System.out.print("Ingrese base:\t");
                         baset = obj.nextDouble();
                          
                         System.out.print("Ingrese altura:\t");
                         alturat = obj.nextDouble();
                          
                         areatri = ((baset*alturat)/2);
                          
                         System.out.print("El area del Triangulo es:\t"+areatri);
                   break;
                         case 4:
                         double baser, alturar, arear;     
                         Scanner rec = new Scanner(System.in);
                          
                         System.out.print("Ingrese base:\t");
                         baser = rec.nextDouble();
                          
                         System.out.print("Ingrese altura:\t");
                         alturar = rec.nextDouble();
                          
                         arear = (baser*alturar);
                          
                         System.out.print("El area del Rectangulo es:\t"+arear);
                         break;
                         case 5:
                         double ladop,radiop,apotema,areap;
                         Scanner penta = new Scanner(System.in);
		
                         System.out.println("Dame el lado del pentagono. Si no lo conoces teclea 0");
                         ladop = penta.nextDouble();
                         
                         System.out.println("Dame el radio del pentagono. Si no lo conoces teclea 0");
                         radiop = penta.nextDouble();
                         
                         System.out.println("Dame el apotema del pentagono. Si no lo conoces teclea 0");
                         apotema = penta.nextDouble();
                         
                         if ((radiop == 0) && (apotema == 0)){
                             areap = 1.72048 * Math.pow(ladop,2);
                         } else if (apotema == 0) {
                             apotema = Math.sqrt(Math.pow(radiop, 2)-Math.pow(ladop/2, 2));
                             areap = ((ladop*5)*apotema)/2;
                         } else {
                             areap = ((ladop*5)*apotema)/2;
                         }
                 
                         System.out.println("El área del pentagono es " + areap);
                         
                         
                         penta.close();
                         break;

                         case 6:
                         float d1,d2, arearo;
        
                         Scanner romb = new Scanner(System.in);
                         System.out.println("Ingresar primera diagonal:");
                         d1=romb.nextInt();
                         System.out.println("Ingresar segunda diagonal:");
                         d2=romb.nextInt();
                    
                         arearo=(d1*d2)/2;
                         
                          System.out.println("Area del Rombo es:  " +arearo);
                         break;
                        
                   }
                   
                   } while(opciones!=7);
                   
                  break;
                  
                case 7: 
                for(n = 1; n<=10; n++){
                    System.out.println(n + " " + (n*10)+ " " + (n*100) + " " + (n*1000));
                }
                break;

                case 8: //tarea *****************************************
                System.out.println("Bienvenido a Factorial ");
                System.out.println("Introduce un numero: ");
                num = numero.nextInt();

                for (int i = num; i > 0; i--) {
                    factorial = factorial * i;
                    
                }
                System.out.println("El factorial de " + num + " es: " + factorial);
                break;
 

                case 9:
                /*
                ESCRIBA UN PROGRAMA QUE LEA EL LADO DE UN CUADRADO Y A CONTINUACIÓN LO IMPRIMA 
                EN FORMA DE ASTERISCOS SU PROGRAMA DEBERa PODER FUNCIONAR PARA CUADRADOS 
                DE TODOS TAMAÑOS ENTRE 1 Y 20. 
                */

                    System.out.println("Cuadrado Magico");
                    System.out.println("Inserta el numero de lados: ");
                    n = entrada.nextInt();

                    if( n>= 1 && n <=20){
                        //se puede imprimir
                        //aqui tengo las filas
                        for(int i = 1; i<=n; i++){
                            //columnas
                            for(int j = 1; j<=n; j++){
                                System.out.print("* ");

                            }
                        System.out.println(" ");

                        }
                    }else{
                        System.out.println("Error, el rango debe de ser entre 1 y 20, intente de nuevo");
                    }

                    break;
                case 10:
                System.out.println("Cuadrado Magico Hueco ");
                System.out.println("Inserta el numero de lados: ");
                n = entrada.nextInt();

                if( n>= 1 && n <=20){
                    //se puede imprimir

                    //imprir la linea superior
                    for(int i = 0; i < n; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                    //lo de enmedio solo quiero las esquinas
                    //cuadrado interno
                    //aqui  las filas
                    for(int i = 0; i < n-2; i++){
                        System.out.print(" * ");
                        //columnas
                        for(int j = 0; j < n-2; j++){
                            System.out.print("  ");

                        }
                    System.out.println("   * ");
                        
                    }

                    //imprimir la linea inferior
                    for(int i = 0; i < n; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }else{
                    System.out.println("Error, el rango debe de ser entre 1 y 20, intente de nuevo");
                }

                break;

                case 11: //TAREA *****************************************************
                System.out.print("Por favor ingresa un numero: ");
                n = entrada.nextInt();
                if(n >= 2 && n <= 30) {
                    for (int i = 1; i <= 2; i++) {
                        for (int j = 1; j <= n ; j++) {
                        System.out.print(" *");
                            
                        }
                        System.out.println("");
                    }
                    
                }else {
                    System.out.println("Por favor ingrese un numero entre 2 y 30");
                }
    
                break;

                case 12: // tarea ****************************************************
                try {
                    System.out.print("Ingresa una cantidad entera: ");
                    n = entrada.nextInt();
                } catch (Exception e) {
                    //En caso que el dato ingresado no sea de tipo entero, se indica el error.
                    System.out.println("ERROR: se espera dato entero.");
                }
                final char simbolo = '*';
                //primer for
                for (int i = 0; i < n; ++i) {
                    System.out.println();
                    //Utilizamos dos "for" para lograr la forma.
                    for (int j = 0; j < n-i-1; ++j) {                      
                        System.out.print(" ");           
                    }
                    for (int j = 0; j < 2*i+1; ++j){
                        System.out.print(simbolo);
                    }            
                }
                //Se utiliza otro grupo de for para lograr el "diamante"
                for (int j = n-2; j >= 0; --j) {
                    System.out.println();
                    for (int i = 0; i < n-j-1; ++i) {
                        System.out.print(" ");
                    }
                    for (int i = 0; i < 2*j+1; ++i) {
                        System.out.print(simbolo);
                    }
                }
                System.out.println();
                break;

                case 13:
                System.out.println("calculadora");
                System.out.println("ingresar un numero");
                su= entrada.nextInt();
                System.out.println("ingresa un segundo numero");
                b= entrada.nextInt();
                System.out.println("ingresa el tipode operacion que deseas realizar: (+,  -, *, /)");
                operacion = entrada.next().charAt(0);

                /*
                switch
                
                */
                switch(operacion){
                    case '+' :
                    resultado = su+b;
                    System.out.println("la suma es: " + resultado);
                    break;
                    case '-' :
                    resultado = su-b;
                    System.out.println("la resta es: " + resultado);
                    break;
                    case '*' :
                    resultado = su*b;
                    System.out.println("la multiplicacion es: " + resultado);
                    break;
                    case '/' :
                    if(b != 0){
                        resultado = su/b;
                        System.out.println("la divicion es: " + resultado);
                        
                    }else{
                        System.out.println("no es posible dividir entre 0");
                    }
                    break;
                    default:
                    System.out.println("operacion no valida");
                }

                default:
                    System.out.println("Gracias por ver este hermoso programa :");



        }
        //auqi se cierra  do
    System.out.println("¿deseas repetir el programa? si lo deseas escriba s ");
    /*para recibir la respuesta debe obtener un caracter
    char se utiliza 
    */

    letras = entrada.next().charAt(0);
    }while(letras == 's');
    

    

    }
}