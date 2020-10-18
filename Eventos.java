
package practicaexamen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static practicaexamen.Servidor1.Es;
import static practicaexamen.Servidor1.t1;
import static practicaexamen.Servidor1.t2;
import static practicaexamen.Servidor1.bSuma;
import static practicaexamen.VCliente.bo;
public class Eventos implements ActionListener
{
    static int n1,n2;
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
     if (e.getSource().equals(bo)) {
          Servidor1 s1=new Servidor1();
          Es.setText("La suma es:"+s1.resultado());
        }
     if(e.getSource().equals(bSuma))
     {
    n1 =Integer.parseInt(t1.getText());
    n2=Integer.parseInt(t2.getText());
      Es.setText((n2+n1)+"");
     }
     }
}