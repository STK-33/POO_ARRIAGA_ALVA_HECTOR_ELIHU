public class perico extends animal{
    /*
    Aqui deberia de colocar cada atributo
    nombre, raza, edad, tipo_alimento, sexo
    */

    String habla;

    public perico(){
        //constructor de la clase
    }

    //sobrecarga para obtener y enviar el ladrido
    public perico(String nombre, String raza, String tipo_alimento, 
    int edad, String habla){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre, raza, tipo_alimento, edad);
        this.habla = habla;

    }
    public String gethabla(){
        return habla;
    }

    //enviar
    public void sethabla(String habla){
        this.habla = habla;
    }

    //metodo para mostrar la informacion del perro
    public void mostrarperico(){
        System.out.println("El nombre del perico es: " + getNombre() +"\n"
                            + "Su raza es: " + getRaza() +"\n"
                            + "Se alimenta de: " + getTipo_alimento() +"\n"
                            + "Tiene la edad de: " + getEdad() +"\n"
                            //+ "Su sexo es: " + getSexo() +"\n"
                            + "El repite : " + habla  +"\n");
    }
}

