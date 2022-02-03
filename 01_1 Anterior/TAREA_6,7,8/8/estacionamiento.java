package estacionamiento;


public class estacionamiento {

  
    public static void main(String[] args) {
        
        int HE=10;
        int HS=12;
        
        int pago = 0;
        int horadeestadia=HS-HE;
        int fraccion=horadeestadia;
        int horarestante=horadeestadia-1;
        
        
        if(horadeestadia>1){
            
            pago=10+(horarestante*60);
            
            
              
        }else{
          pago=10;
        }
        System.out.println("el pago por el estacionamiento es:  "+pago);
    }
    
}