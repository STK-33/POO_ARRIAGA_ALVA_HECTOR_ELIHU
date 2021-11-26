public class libro {
     /*Atributos*/
     private int ISBN;
     private String titulo;
     private String autor;
     private int numPaginas;
     private int cost;
      
     /*Constructores*/
      
     public libro(int pISBN, String pTitulo, String pAutor, int pNumPaginas, int pcost){
      
         ISBN=pISBN;
         titulo=pTitulo;
         autor=pAutor;
         numPaginas=pNumPaginas;
         cost= pcost;
     }
      
     /*Metodos*/
  
     public int getISBN() {
         return ISBN;
     }
  
     public void setISBN(int ISBN) {
         this.ISBN = ISBN;
     }
  
     public String getTitulo() {
         return titulo;
     }
  
     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }
  
     public String getAutor() {
         return autor;
     }
  
     public void setAutor(String autor) {
         this.autor = autor;
     }
  
     public int getNumPaginas() {
         return numPaginas;
     }
  
     public void setNumPaginas(int numPaginas) {
         this.numPaginas = numPaginas;
     }
     
     public int getcost() {
        return cost;
    }
 
    public void setcost(int cost) {
        this.cost = cost;
    }
      
     
     public String toString(){
         return "El libro "+titulo+" con ISBN "+ISBN+""
                 + " creado por el autor "+autor
                 + " tiene "+numPaginas+" paginas"
                 + " su precio es de: $"+cost+" pesos";
     } 
     
}
