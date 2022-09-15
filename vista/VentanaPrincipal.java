package mvc1_mayor_3_enteros.vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //------------------------- 
    // Atributos
    //-------------------------
    private PanelEntradaDatos miPanelEntradaDatos;
    private PanelResultados miPanelResultados;
    private PanelOperaciones miPanelOperaciones;

    //------------------------- 
    // Métodos
    //-------------------------


    // Metodo constructor

    public VentanaPrincipal()
    {
        // Definicion
        this.setLayout(null);
        
        // Creación y adición de un panel tipo PanelResultados
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,210,480,125);
        this.add(miPanelOperaciones);
 
        // Creación y adición de un panel tipo PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,345,480,125);
        this.add(miPanelResultados);

        // Creación y adición de un panel tipo PanelEntradaDatos

        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,480,210);
        this.add(miPanelEntradaDatos);

        // Caracteristicas de la ventana
        this.setTitle("Mayor de tres enteros");
        this.setSize(500,500);
        // this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }




}