package interfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controlador.VentanaPrincipalControlador;

// en esta ventana, el cliente puede registrarse, alquilar y devolver libros.
public class VentanaCliente extends JFrame
{
    private JLabel labelTitulo;

    private JButton botonVolverPrincipal;
    private JButton botonAlquilarLibro;
    private JButton botonDevolverLibro;

    public VentanaCliente()
    {
        inicializarCliente();
    }

    // Gestión de usuarios.
    public void inicializarCliente() 
    {
        getContentPane().setBackground(new Color(163, 200, 211));
        setBounds(100, 100, 550, 490);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        setTitle("Gestión cliente");
		setLocationRelativeTo(null); //Centra la ventana en pantalla
		setResizable(false);

		labelTitulo = new JLabel("Cliente");
		labelTitulo.setForeground(new Color(255, 255, 255));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		labelTitulo.setBounds(0, 11, 532, 29);
		getContentPane().add(labelTitulo);

        botonVolverPrincipal = new JButton("Volver Principal");
        botonVolverPrincipal.setBounds(50,350,120,50);
        getContentPane().add(botonVolverPrincipal);

        botonAlquilarLibro = new JButton("Alquilar libro");
        botonAlquilarLibro.setBounds(200,350,120,50);
        getContentPane().add(botonAlquilarLibro);

        botonDevolverLibro = new JButton("Devolver libro");
        botonDevolverLibro.setBounds(350,350,120,50);
        getContentPane().add(botonDevolverLibro);

        botonVolverPrincipal.addActionListener(e -> 
        {
            VentanaPrincipalControlador.mostrar();
            dispose();
        });

        botonAlquilarLibro.addActionListener(e -> 
        {
            
        });

        botonDevolverLibro.addActionListener(e -> 
        {
            
        });
    }
}
