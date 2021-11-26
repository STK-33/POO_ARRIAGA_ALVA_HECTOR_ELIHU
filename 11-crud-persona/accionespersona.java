//esta clase es el controlador(son las acciones de la persona, para poder manipular)
import java.util.ArrayList;
// vamos hacer el crud de personas
// altas bajas modificaciones y  consulta de un objeto
//C  = consult  R = registrer u = update  D = delete
public class accionespersona {
    /*
    manipular los datos y guardarlos dentrro de un objeto que pueda soportar diferentes tipo de dato
    */ 
    //declaro mi objeto de array list
    public Arraylist<persona> listapersona = new ArrayList<persona>();
    // tipo de acseso   clase<obj> objeto de objeto

    //metodo para agregar un apersona
    public void agreagrpersona(persona p){
        //mando a llamar a mi objeto lista de personas e invoco el tedodo agregar
        listapersona.add(p);
    }
    //buscar a una persona por su identificador
    public persona buscarpersona(int id){
        //necesito una instancia de persona
        persona encontrada = new persona();
        //recorrer todo el arreglo de personas hasta encontrar el id = parametro
        for(persona p : listapersona){
            //aqui tengo condicion id = parametro
            if(id == p.getid()){//quiero la posicion de la persona 43 valor lista persona.lenght
                //le asigno a mi objeto persona(encontrada) los valores
                encontrada = p;
            }else{
                System.out.println("no exixte ese registro");
            }
        }

        //cuando es un metodo que no es vacio se debe de retornar un valos
        return encontrada;
    }

    //actualizar los datos de la persona
    public void actualizarpersona(persona actualizada){
        //primero de bo buscar a una persona , obtener sus datos y elegir cual voy a cambiar
        //creo a mi instancia de persona
        persona actualizar = buscarpersona(actualizada.getid());
        //cambio los datos
        listapersona.remove(actualizar);
        //guardar
        listapersona.add(actualizar);

    }
    //eliminar a una persona
    public void eliminarpersona(persona eliminar){
        listapersona.remove(eliminar);
    }
    //mostrar a todas las personas 
    public ArrayList<persona>mostrarpersonas(){
            return listapersona;
    }
}
