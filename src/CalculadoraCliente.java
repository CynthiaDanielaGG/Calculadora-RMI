import java.rmi.Naming;
import javax.swing.JOptionPane;
public class CalculadoraCliente
{
    public static void main(String [] args)
    {
        try{
            float op1 = 0, op2 = 0;
            CalculadoraInterface c = (CalculadoraInterface)Naming.lookup("rmi://localhost/ServiciosCalculadora");
            
            String operaciones [] = {"Multiplicacion","Division","Suma","Resta","Modulo","Potencia","Raiz cuadrada","Raiz cubica","Salir"};
            int opcion = 0;
            while(opcion != 8)
            {
                opcion = JOptionPane.showOptionDialog(null, "Elige una operacion", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, operaciones, 0);
                if(opcion == 0)//multiplicacion
                {
                    op1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de a"));
                    op2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de b"));
                    float mul = c.multiplicacion(op1, op2);
                    JOptionPane.showMessageDialog(null, "Resultado de la multiplicacion: "+mul);
                }
                else if(opcion == 1){//Division
                    op1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de a"));
                    op2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de b"));
                    float div = c.division(op1, op2);
                    JOptionPane.showMessageDialog(null, "Resultado de la division: "+div);
                }else if(opcion == 2)// suma
                {
                    op1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de a"));
                    op2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de b"));
                    float suma = c.suma(op1, op2);
                    JOptionPane.showMessageDialog(null, "Resultado de la suma: "+suma);
                }else if(opcion == 3){// resta
                    op1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de a"));
                    op2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de b"));
                    float resta = c.restar(op1, op2);
                    JOptionPane.showMessageDialog(null, "Resultado de la resta: "+resta);
                }else if(opcion == 4)//modulo
                {
                    op1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de a"));
                    op2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de b"));
                    float modulo = c.division_modulo(op1, op2);
                    JOptionPane.showMessageDialog(null, "Resultado del modulo: "+modulo);
                }else if(opcion == 5){//potencia
                    op1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de a"));
                    op2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de b"));
                    float pot = c.potencia(op1, op2);
                    JOptionPane.showMessageDialog(null, "Resultado de la potencia: "+pot);
                }else if(opcion == 6)// raiz
                {
                    op1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de a"));      
                    float r = c.raiz_cuadrada(op1);
                    JOptionPane.showMessageDialog(null, "Resultado de la raiz cuadrada: "+r);
                }
                else if(opcion == 7){//raiz cubica
                    op1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor de a"));      
                    float r = c.raiz_cubica(op1);
                    JOptionPane.showMessageDialog(null, "Resultado de la raiz cubica: "+r);
                }
                else if(opcion == 8){
                    JOptionPane.showMessageDialog(null, "*Hasta Pronto! :D*");
                }
            }            
        }catch(Exception e){
            System.out.println();
            System.out.println(e);
        }
    }
}
