import java.rmi.Naming;

public class CalculadoraServidor {
    public CalculadoraServidor(){
        try{
            CalculadoraInterface c = new CalculadoraImpl();
            Naming.rebind("rmi://localhost/ServiciosCalculadora", c);
        }catch(Exception e){
            System.out.println("Error encontrado: "+ e);
        }
    }
    public static void main(String args[]){
        new CalculadoraServidor();
    }
}
