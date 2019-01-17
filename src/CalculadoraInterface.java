import java.rmi.*;
/**
 *
 * @author Hertz
 */
public interface CalculadoraInterface extends Remote{
    
    public float suma(float a, float b) throws RemoteException;
    public float restar(float a, float b)throws RemoteException;
    public float multiplicacion(float a, float b)throws RemoteException;
    public float division(float a, float b)throws RemoteException;
    public float potencia(float a, float b)throws RemoteException;
    public float raiz_cuadrada(float a)throws RemoteException;
    public float raiz_cubica(float a)throws RemoteException;
    public float division_modulo(float a, float b)throws RemoteException;
}
