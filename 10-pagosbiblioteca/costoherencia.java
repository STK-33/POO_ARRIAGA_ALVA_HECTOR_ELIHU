package costoherencia.multiple;

public class costoherencia extends libro{
    /*
    Aqui deberia de colocar cada atributo
    nombre, raza, edad, tipo_alimento, sexo
    */

    int cost;

    

    //sobrecarga para obtener y enviar el ladrido
    public costoherencia(int pISBN, String pTitulo, String pAutor, int pNumPaginas, int pcost){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
         super(pISBN,pTitulo,pAutor,pNumPaginas,pcost);
        this.cost = cost;
        

    }
    public int getcost(){
        return cost;
    }

    //enviar
    public void setcost(int cost){
        this.cost = cost;
    }
    
    //metodo para mostrar la informacion del perro
    public void mostrardatos(){
        System.out.println( "el costo del libro es: " + cost +"\n");
    }
    
}