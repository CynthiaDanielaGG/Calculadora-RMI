import java.rmi.*;
import java.rmi.server.*;

public class CalculadoraImpl extends UnicastRemoteObject implements CalculadoraInterface{

    public CalculadoraImpl() throws RemoteException{
        super();
    }
    
    @Override
    public float suma(float a, float b) throws RemoteException {
       return a + b;
    }

    @Override
    public float restar(float a, float b) throws RemoteException {
        return a - b;
    }

    @Override
    public float multiplicacion(float a, float b) throws RemoteException {
        return a * b;
    }

    @Override
    public float division(float a, float b) throws RemoteException {
        return a / b;
    }

    @Override
    public float potencia(float a, float b) throws RemoteException {
        return (float)Math.pow(a, b);
    }

    @Override
    public float raiz_cuadrada(float a) throws RemoteException {
        return (float)Math.sqrt(a);
    }

    @Override
    public float raiz_cubica(float a) throws RemoteException {
        return (float)Math.cbrt(a);
    }

    @Override
    public float division_modulo(float a, float b) throws RemoteException {
        return a % b;
    }
    
}
