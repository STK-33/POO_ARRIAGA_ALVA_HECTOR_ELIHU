import javax.swing.*;
import java.util.*;
public class sueldoempleado {
    //obtener los pagos correspondeientes a los trabajadores
    private int ID_empleado, num_horas;
    private string nombre, apat, appatmat;
    private Double sueldo;


    public void menuempleado(){

        string text;

        text = JOptionPane.showInputDialog("selecciona la opcion deseada: "
        +"\n 1. Agregar nuevo empleado"
        +"\n 2. consultar empleado por ID"
        +"\n 3. consultar todos los empleados"
        +"\n 4. pagar al empleado por ID");

        /*
        primero debo de tener una clase llamada empleado

        quiero 5 empleados

        si elijo 1 
        se debe de ingresar el ID,num_horas que trabaja,nombre,appat,appmat,sueldo por hr
        si elijo 2
        se debe de tener un metodo en el cual se va a buscar por el ID

        public int buscaridempleado(int id)

        si elijo 3
        debo de imprimir la informacion de todods los empleados

        si eljo 4
        voy a tener 2 opciones
        1pago quincenal
            suledo y el num de horas * 15 y que aparesca la info del empleado + pago
        2 pago mensual
            suledo y el num de horas * 30 y que aparesca la info del empleado + pago
        */
    }
}
