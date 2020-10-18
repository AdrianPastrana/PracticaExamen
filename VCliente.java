
package practicaexamen;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class VCliente {
    static JButton bo;
    VCliente() 
    {
        Componente c = new Componente(); // objeto para poder usar ese metodo getButton();
        JFrame f = new JFrame();
        f.setSize(100, 200); //tamaño de la ventana un (SET)
        f.setTitle(" Ventana Cliente "); //nombre de la ventana
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cierre de operacion ... El proceso muera, el proceso se detenga
        f.setLayout(new FlowLayout()); // administrador de componentes, ordena de izq - der
        bo = c.getButton(" Operacion ");
        f.add(bo);
        f.setVisible(true); //visibilidad de la ventana
        bo.addActionListener(new Eventos());
}
}