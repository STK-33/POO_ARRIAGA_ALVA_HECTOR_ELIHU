import java.util.*;
public class manipularprogram {
    public void menu(){
        Scanner entrada = Scanner(System.in);
        accionespersona control = new accionespersona();

        System.out.println("bienbenido al programa de registro");
        System.out.println("elije la opcion deseada");
        System.out.println("1. mostrar todas las personas");
        System.out.println("2. registrar nueva victima");
        System.out.println("3. editar datos");
        System.out.println("4. borrar esa persona");
        System.out.println("5. salir");

        int opcion = integer.parseInt(entrada.nextLine());
switch (opcion) {
    case 1 :
        ArrayList<persona> listapersonas = control.mostrarpersonas();
        for(persona objeto : listadepersonas){
            System.out.println("el id es: " objeto.getid()
            +"\n"+"el nombre es: " objeto.getnombre()
            +"\n"+"su edad es : " objeto.getedad());

        }
        menu();
        break;
        case 2 :
        System.out.println("ingrese el id de la persona");
        int idpersona = Integer.parseInt(entrada.nextLine());//para pasar option pane
        System.out.println("ingrese el nombre");
        string nombrepersona = Integer.parseInt(entrada.nextLine());
        System.out.println("ingrese la edad");
        int edadpersona = Integer.parseInt(entrada.nextLine());
        //ya que obtuve los datos para agreagrlos ala lista  de personas debo de crear el objeto que pase eseos parametros
        persona personanuevo = new persona(idpersona, nombrepersona, edadpersona);
        control.agreagrpersona(personanuevo);
        menu();
        break;
        case 3 :
          //primero debo de buscar a la persona que quiero editar
          System.out.println("dijite el id de la persona a buscar");
          

          persona personabuscar = control.buscarpersona(idpersona);
          //primero visualizamos los datos
          System.out.println("la informacion de la persona es: \n"
                                +"id: " +personabuscar.getid()+ "\n"
                                +"nombre: " +personabuscar.getnombre()+ "\n"
                                +"edad: " +personabuscar.getedad()+ "\n");
            //que datos se puedam cambiar
            System.out.println("ingresa el nuevo nombre");
            string nuevonombre = entrada.nextline();
            System.out.println("ingresa la nueva edad");
            int nuevaedad = Integer.parseInt(entrada.nextline());

            //como ya tengo los nuevos datos debo enviarlos al objeto 
            personabuscar.setnombre(nuevonombre);
            personabuscar.setedad(nuevaedad);
            //haora si actualizo
            control.actualizarpersona(personabuscar);
            menu();
        break;
        case 4 :
        System.out.println("dijite el id que dese eliminar: ");
        int idpersona = Integer.parseInt(entrada.nextLine());
        //creo mi objeto de la persona eliminar
        persona personaeliminar = control.buscarpersona(idpersona);
        control.eliminarpersona(personaeliminar);

        System.out.println("el registro se a borrado: ");
        menu();

        
    default:
    System.out.println("opcion no valida: ");
        break;
}

    }
}
