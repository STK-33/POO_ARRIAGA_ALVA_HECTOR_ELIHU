public class gato extends animal{
    /*
    Aqui deberia de colocar cada atributo
    nombre, raza, edad, tipo_alimento, sexo
    */

    int num_vidas;

    public gato(){
        //constructor de la clase
    }

    //sobrecarga para obtener y enviar el ladrido
    public gato(String nombre, String raza, String tipo_alimento, 
    int edad, int num_vidas){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;

    }
    public int getNum_vidas(){
        return num_vidas;
    }

    //enviar
    public void setNum_vidas( int num_vidas){
        this.num_vidas = num_vidas;
    }

    //metodo para mostrar la informacion del perro
    public void mostrarGato(){
        System.out.println("El nombre del michi es: " + getNombre() +"\n"
                            + "Su raza es: " + getRaza() +"\n"
                            + "Se alimenta de: " + getTipo_alimento() +"\n"
                            + "Tiene la edad de: " + getEdad() +"\n"
                            //+ "Su sexo es: " + getSexo() +"\n"
                            + "Su numero de vidas es: " + num_vidas  +"\n");
    }
}
