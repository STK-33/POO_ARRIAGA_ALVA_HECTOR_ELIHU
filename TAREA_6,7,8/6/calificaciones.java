import java.util.Scanner;

public class calificaciones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int calificacion;
        System.out.print("Ingresa el valor de calificacion: ");
        calificacion = in.nextInt();
        in.nextLine();
        if(calificacion==19||calificacion==20)
            System.out.println("A");
        if(calificacion==16||calificacion==18)
            System.out.println("B");
        if(calificacion>=13&&calificacion<=15)
            System.out.println("C");
        if(calificacion>=10&&calificacion<=12)
            System.out.println("D");
        if(calificacion>=1&&calificacion<=9)
            System.out.println("E");
    }

}