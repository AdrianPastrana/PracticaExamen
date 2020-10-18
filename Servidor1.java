
package practicaexamen;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static practicaexamen.Eventos.n1;
import static practicaexamen.Eventos.n2;

public class Servidor1 extends Thread{
    static  JLabel et1,et2,Es;
    static JTextField t1 , t2,ts;
    static JButton bSuma;
    Servidor1() 
    {
        Componente c = new Componente(); // objeto para poder usar ese metodo getButton();
        JFrame f = new JFrame();
        f.setSize(300, 400); //tamaño de la ventana un (SET)
        f.setTitle(" Ventana Servidor suma "); //nombre de la ventana
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cierre de operacion ... El proceso muera, el proceso se detenga
        f.setLayout(new FlowLayout()); // administrador de componentes, ordena de izq - der
        et1=c.getLabel("Num1");
        et2=c.getLabel("Num2");
        bSuma=c.getButton("suma");
        t1=c.getCaja(20);
        t2=c.getCaja(20);
        Es=c.getLabel("Resultado");
        f.add(et1);
        f.add(t1);
        f.add(et2);
        f.add(t2);
        f.add(bSuma);
        f.add(Es);
        f.setVisible(true); //visibilidad de la ventana
        bSuma.addActionListener(new Eventos());
}
     static int res; 
    public int resultado() 
    {
        try 
        {
            Thread.sleep(1000);//hacemos una espera de 7000 milisegundos 
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(Servidor1.class.getName()).log(Level.SEVERE, null, ex);
        }
        int res = n1+n2;
        return res;
    }
    
}
