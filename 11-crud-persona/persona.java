public class persona {
    
//variables
private int id;
private String nombre;
private int edad;

//costructor
public persona(){

}

//sobrecarga al costructor

public persona(in id, string nombre, int edad){
    //para inicializar las variables 
    this.id = id;
    this.nombre = nombre;
    this.edad = edad;
}

//getter y setter

public int getid(){
    return id;
}

public void setid(int id){
    this.id = id;
}

public string getnombre(){
    return nombre;
}

public void setnombre(string nombre){
    this.nombre = nombre;
}
//enviar
public string getedad(){
    return edad;
}
//recibir
public void setnombre(int edad){
    this.edad = edad;
}


}
