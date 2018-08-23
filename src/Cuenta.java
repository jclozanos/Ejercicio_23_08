public class Cuenta {
   public int numero;
   public String propietario;
   public double saldo;
   
   public String getPropietario(){
    return null;
   }
   public void setPropietario(String _propietario){
       
   }
   public void consignar(double valor){
       saldo += valor;
   }
}


