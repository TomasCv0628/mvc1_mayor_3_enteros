package mvc1_mayor_3_enteros.vista;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class PanelOperaciones extends JPanel
{
    //------------------------- 
    // Atributos
    //-------------------------


    //------------------------- 
    // Métodos
    //-------------------------


    // Metodo constructor

    public PanelOperaciones()
    {
        this.setBackground(Color.GRAY);

        JButton B1 = new JButton("Borrar");
        B1.setBounds(5,70,20,20);
        this.add(B1);

        JButton B2 = new JButton("Resolver");
        B2.setBounds(5,30,10,10);
        this.add(B2);

        JButton B3 = new JButton("??");
        this.add(B3);

    }
}