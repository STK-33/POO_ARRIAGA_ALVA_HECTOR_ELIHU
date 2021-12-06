public class ejer {
    public static void main(String[] args) {
        
        //Creamos lo objetos
        libro libro1=new libro(1010112981, "Crimen y castigo", "Fiodor Dostoyevski.", 30, 30);
        libro libro2=new libro(1181191142, "Un mundo feliz", "Aldous Huxley", 60, 45);
        libro libro3=new libro(1311611912, "Orgullo y prejuicio", "Jane Austen", 90, 240);
        libro libro4=new libro(1165191412, "En busca del tiempo perdido", " Marcel Proust", 60, 90);
        libro libro5=new libro(1119111612, "El proceso", "Franz Kafka", 80, 60);
         
        //Mostramos su estado
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(libro4.toString());
        System.out.println(libro5.toString());
         
        //Modificamos el atributo numPaginas del libro1
        libro1.setNumPaginas(70);
         
        //Comparamos quien tiene mas paginas
        if(libro1.getNumPaginas()>libro2.getNumPaginas()){
            System.out.println(libro1.getTitulo()+" tiene mas paginas");
        }else{
            System.out.println(libro2.getTitulo()+" tiene mas paginas");
        }
         
         
    }
     

}
