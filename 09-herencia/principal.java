public class principal{


    public static void main(String[] args){

        //gracias al constructor poder hacer las instancias de las clases
        perro dog = new perro("pulgas", "de la calle", "Croquetas dogcaut", 1,"hace guau guau" );
        gato cat = new gato("Michi", "de colores", "wiscas", 2, 7);
        hamster ham = new hamster("julio", "de colores", "Galletas para perros", 1, "hace ts ts");
        perico per = new perico("panchito", "de colores", " diente de leon", 1, " algunas palabras");
        


        //vamos a mostrar los datos del perro y del gato
        dog.mostrarPerro();
        cat.mostrarGato();
        ham.mostrarhamster();
        per.mostrarperico();

        /*
        Quiero que se imprima el sexo de los animales
        Quiero que agreguen la clase hamster
        quiero una clase mas de otro animal domestico
        
        */ 
    }
}
