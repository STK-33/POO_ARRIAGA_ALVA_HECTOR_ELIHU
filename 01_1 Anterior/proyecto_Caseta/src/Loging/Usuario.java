
package Loging;

import java.util.Vector;

public class Usuario {
    private String usuario;
    private String contraseña;
    private String rango;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRango() {
        return rango;
    }

    public static int verificarusuarioNuevo(String usuario){
    Vector lista = mostrar();
    Usuario obj;
    for(int i=0;i<lista.size();i++){
    obj = (Usuario)lista.elementAt(i);
    if(obj.getUsuario().equalsIgnoreCase(usuario)){
        return i;
    }
    }
    return -1;
    }
    public static int verificarIniciodeSesionNuevo(String usuario,String contraseña){
        Vector lista = mostrar ();
        Usuario obj;
        for(int i=0;i<lista.size();i++){
            obj =(Usuario)lista.elementAt(i);
            if(obj.getUsuario().equalsIgnoreCase(contraseña)&& obj.getContraseña().equalsIgnoreCase(contraseña)){
            return i;
        }
        }
        return -1;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }
    public static Vector mostrar(){
        return Listausuario.mostrar();
    }
}
