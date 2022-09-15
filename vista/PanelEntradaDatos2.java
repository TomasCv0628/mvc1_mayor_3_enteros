package mvc1_mayor_3_enteros.vista;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;


import java.awt.Color;
import java.awt.Font;

public class PanelEntradaDatos2 extends JPanel
{
    //------------------------- 
    // Atributos
    //-------------------------

    private JLabel lbX;
    private JLabel lbY;
    private JLabel lbZ;




    //------------------------- 
    // Métodos
    //-------------------------


    // Metodo constructor

    public PanelEntradaDatos2()
    {

        this.setLayout(null);
        this.setBackground(Color.GREEN);

        // crear y agregar etiqueta para X

        lbX = new JLabel("X = ");
        lbX.setFont(new Font("Arial", Font.BOLD, 20));
        lbX.setBounds(5,40,50,50);
        this.add(lbX);

        // crear y agregar etiqueta para Y

        lbY = new JLabel("Y = ");
        lbY.setFont(new Font("Arial", Font.BOLD, 20));
        lbY.setBounds(5,80,50,50);
        this.add(lbY);

        // crear y agregar etiqueta para Z

        lbZ = new JLabel("Z = ");
        lbZ.setFont(new Font("Arial", Font.BOLD, 20));
        lbZ.setBounds(5,120,50,50);
        this.add(lbZ);
        


        this.setBackground(Color.WHITE);
    }
}