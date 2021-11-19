
public class cadena {
    Scanner entrada = new Scanner(System.in);

    public void cadena(){

        string s1 = "hola ";

    System.out.println("el tamaño de la cadena es: " + s1.length());

    System.out.println("el tamaño de la cadena es: " + s1.startWith("hola"));

    System.out.println("la cadena termina v o f con gato: " + s1.endstWith("gato"));

    System.out.println("ingrese una palabra: ");
    String s2 = entrada.next();
    System.out.println("ingrese una palabra: " + s2);


    System.out.println("paarte de una subcadena de s1: " + s1.indexof("tito"));


    System.out.println("primera parte: " + s1.substring(12));

    System.out.println("primera parte: " + s1.substring(3,12));
    //convertir una variablw de la cadena
        in valor = 24;
        String s3 = String.valueof(valor);
        System.out.println("el valor es de : " + s3 + "como cadena");

        //convertir una cadena a un numero
        String s4 = "20";
        in numero= Integer.parseInt(s4);

        System.out.println("el valor es de : " + numero+ "ahora es un numero");

        //convertir cadena a un decimal

        String s5 ="20.89";
        Double numero1 = Double.parseDouble(s5);

        System.out.println("el valor es de : " + numero1 + "ahora es un Double");

        // metodo toString que convierte un entero a una cadena
        Integer x = 5;

        System.out.println("el valor es de : " + x.toString() + "ahora es una cadena");
        System.out.println("el valor es de : " + Integer.toString(12) + "ahora es una cadena");
    }
    
}
