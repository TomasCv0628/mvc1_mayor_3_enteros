package mvc1_mayor_3_enteros.vista;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;


import java.awt.Color;
import java.awt.Font;
public class PanelEntradaDatos extends JPanel
{
    // Atributos

    private JLabel lbTitulo;
    private JLabel lbX;
    private JLabel lbY;
    private JLabel lbZ;
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JTextField tX;
    private JTextField tY;
    private JTextField tZ;


    // Metodo constructor

    public PanelEntradaDatos()
    {
        this.setLayout(null);
        this.setBackground(Color.white);

        // crear y agregar etiqueta para titulo

        lbTitulo = new JLabel("Mayor de 3 enteros", JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setBounds(0,0,480,20);
        this.add(lbTitulo);

        // Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

        lbX = new JLabel("X = ");
        lbX.setFont(new Font("Arial", Font.BOLD, 20));
        lbX.setBounds(5,50,50,50);
        this.add(lbX);
        lbX.setForeground(Color.CYAN);
        JTextField X = new JTextField();
        tX.setBounds(50,70,90,15);
        tX.setBackground(Color.GRAY);
        tX.setForeground(Color.WHITE);
        this.add(X);

        // crear y agregar etiqueta para Y

        lbY = new JLabel("Y = ");
        lbY.setFont(new Font("Arial", Font.BOLD, 20));
        lbY.setBounds(5,100,50,50);
        lbY.setForeground(Color.CYAN);
        this.add(lbY);
        JTextField Y = new JTextField();
        Y.setBounds(50,120,90,15);
        Y.setBackground(Color.GRAY);
        Y.setForeground(Color.WHITE);
        this.add(Y);

        // crear y agregar etiqueta para Z

        lbZ = new JLabel("Z = ");
        lbZ.setFont(new Font("Arial", Font.BOLD, 20));
        lbZ.setBounds(5,150,50,50);
        lbZ.setForeground(Color.CYAN);
        this.add(lbZ);
        JTextField Z = new JTextField();
        tZ.setBounds(50,170,90,15);
        tZ.setBackground(Color.GRAY);
        tZ.setForeground(Color.WHITE);
        this.add(Z);

        iImagen = new ImageIcon(getClass().getResource("vista/mayor"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(5,360,100,100);
        this.add(lbImagen);
        // metodos

        public String gettX()
        {
            return tX.getText();
        }
           
        public String gettY()
        {
            return tY.getText();
        }
            
        public String gettZ()
        {
            return tZ.getText();
        }

        // Metodo Borrar caja de texto

        public void borrar()
        {
            X.setText("");
            Y.setText("");
            Z.setText("");

        }
                 
    }

}
