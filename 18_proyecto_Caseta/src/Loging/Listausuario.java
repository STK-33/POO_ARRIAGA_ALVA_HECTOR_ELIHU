
package Loging;

import java.util.*;


public class Listausuario {
    private static Vector<Usuario>datos = new Vector<Usuario>();
    public static void agregarUsuario(Usuario obj){
        datos.addElement(obj);
    }
    public static void eliminarUsuario(int pos){
        datos.removeElementAt(pos);
    }
    public static Vector mostrar(){
        return datos;
    }
}
