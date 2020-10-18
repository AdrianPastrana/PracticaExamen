package practicaexamen;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Componente {

    //getter ir por el metodo y regresa el resultado 
    public JButton getButton(String msg) { // con parametros para el nombre de boton
        JButton b = new JButton(); //crear boton 
        b.setText(msg); // texto al boton a partir de su metodo
        return b;
    }

    public JLabel getLabel(String msg) { //Etiquetas
        JLabel e = new JLabel(msg); // texto a partir de su constructor
        return e;

    }
    
    public JTextField getCaja(int tam){ // Cajas de texto
        JTextField t = new JTextField(tam);
        return t;
    }
    public JTextArea getArea (int w,int h){
        JTextArea jt = new JTextArea(w,h);
        JScrollPane js =new JScrollPane(jt);  
        return jt;
    }
   
    
}
