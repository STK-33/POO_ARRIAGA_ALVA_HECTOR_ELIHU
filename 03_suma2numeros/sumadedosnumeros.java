import java.util.Scanner;

class sumadedosnumeros{
    //el identado del codigo
    //metodo principal
    public static void main(string[] args){
        //definir un objeto de la libreria scanner que nos sirva para obtener los datos
        Scanner entrada = new Scanner(System.in);
        //definicion de variables
        int num1, num2;
        int resultado=0;

        do{

        System.out.println("Introduce los numeros que quieras sumar; si pones 0 se detiene la suma ");
        //asignar el primer numero a su variable
        num1 = entrada.nextInt();
        
        

        resultado = resultado + num1;

        }while(num1 !=0);
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
}