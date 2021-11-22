
    public class hamster extends animal{
        /*
        Aqui deberia de colocar cada atributo
        nombre, raza, edad, tipo_alimento, sexo
        */
    
        String chillido;
    
        public hamster(){
            //constructor de la clase
        }
    
        //sobrecarga para obtener y enviar el ladrido
        public hamster(String nombre, String raza, String tipo_alimento, 
        int edad, String chillido){
            //para poder obtener los atributos por herencia
            //se debe de colocar super
            super(nombre, raza, tipo_alimento, edad);
            this.chillido = chillido;
    
        }
        public String getchillido(){
            return chillido;
        }
    
        //enviar
        public void setchillido(String chillido){
            this.chillido = chillido;
        }
    
        //metodo para mostrar la informacion del perro
        public void mostrarhamster(){
            System.out.println("El nombre del hamster es: " + getNombre() +"\n"
                                + "Su raza es: " + getRaza() +"\n"
                                + "Se alimenta de: " + getTipo_alimento() +"\n"
                                + "Tiene la edad de: " + getEdad() +"\n"
                                //+ "Su sexo es: " + getSexo() +"\n"
                                + "Su chillido es: " + chillido  +"\n");
        }
    }

