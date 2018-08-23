public class Ejecutable{
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.numero = 1234;
        c1.propietario = "Jim";
        c1.saldo = 300;
        System.out.println("Saldo: "+c1.saldo);
        c1.consignar(1000);
        System.out.println("Nuevo: "+c1.saldo);
    }
}
