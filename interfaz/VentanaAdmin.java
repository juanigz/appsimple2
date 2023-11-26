package interfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controlador.VentanaPrincipalControlador;

// el admin puede agregar o eliminar libros.
public class VentanaAdmin extends JFrame
{
    private JLabel labelTitulo;

    private JButton botonVolverPrincipal;
    private JButton botonAgregarLibro;
    private JButton botonEliminarLibro;

    // Gestión de libros.
    public VentanaAdmin()
    {
        inicializarAdmin();
    }

    public void inicializarAdmin() 
    {
        getContentPane().setBackground(new Color(163, 200, 211));
        setBounds(100, 100, 550, 490);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        setTitle("Gestión admin");
		setLocationRelativeTo(null); //Centra la ventana en pantalla
		setResizable(false);

		labelTitulo = new JLabel("Admin");
		labelTitulo.setForeground(new Color(255, 255, 255));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		labelTitulo.setBounds(0, 11, 532, 29);
		getContentPane().add(labelTitulo);

        botonVolverPrincipal = new JButton("Volver Principal");
        botonVolverPrincipal.setBounds(50,350,120,50);
        getContentPane().add(botonVolverPrincipal);

        botonAgregarLibro = new JButton("Agregar libro");
        botonAgregarLibro.setBounds(200,350,120,50);
        getContentPane().add(botonAgregarLibro);

        botonEliminarLibro = new JButton("Eliminar libro");
        botonEliminarLibro.setBounds(350,350,120,50);
        getContentPane().add(botonEliminarLibro);

        botonVolverPrincipal.addActionListener(e -> 
        {
            VentanaPrincipalControlador.mostrar();
            dispose();
        });

        botonAgregarLibro.addActionListener(e -> 
        {
            
        });

        botonEliminarLibro.addActionListener(e -> 
        {
            
        });
    }
}
