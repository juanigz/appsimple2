package interfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.VentanaAdminControlador;
import controlador.VentanaPrincipalControlador;

// el admin puede agregar o eliminar libros.
public class VentanaAdmin extends JFrame
{
    private JLabel labelTituloPantalla;

    private JLabel labelTitulo;
    private JLabel labelAutor;
    private JLabel labelGenero;

    private JTextField campoTitulo;
    private JTextField campoAutor;
    private JTextField campoGenero;

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

		labelTituloPantalla = new JLabel("Admin");
		labelTituloPantalla.setForeground(new Color(255, 255, 255));
		labelTituloPantalla.setHorizontalAlignment(SwingConstants.CENTER);
		labelTituloPantalla.setFont(new Font("Tahoma", Font.BOLD, 30));
		labelTituloPantalla.setBounds(0, 11, 532, 29);
		getContentPane().add(labelTituloPantalla);

        // Define los componentes.
        labelTitulo = new JLabel("Titulo:");
        labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelTitulo.setBounds(10, 40, 230, 40);
        getContentPane().add(labelTitulo);

        campoTitulo = new JTextField();
        campoTitulo.setColumns(10);
        campoTitulo.setBounds(10,80,230,40);
        getContentPane().add(campoTitulo);

        labelAutor = new JLabel("Autor:");
        labelAutor.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelAutor.setBounds(10, 120, 230, 40);
        getContentPane().add(labelAutor);

        campoAutor = new JTextField();
        campoAutor.setColumns(10);
        campoAutor.setBounds(10,160,230,40);
        getContentPane().add(campoAutor);

        labelGenero = new JLabel("Genero:");
        labelGenero.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelGenero.setBounds(10, 200, 230, 40);
        getContentPane().add(labelGenero);

        campoGenero = new JTextField();
        campoGenero.setColumns(10);
        campoGenero.setBounds(10,240,230,40);
        getContentPane().add(campoGenero);

        botonVolverPrincipal = new JButton("Volver Principal");
        botonVolverPrincipal.setBounds(50,350,120,50);
        getContentPane().add(botonVolverPrincipal);

        botonAgregarLibro = new JButton("Agregar libro");
        botonAgregarLibro.setBounds(200,350,120,50);
        getContentPane().add(botonAgregarLibro);

        botonEliminarLibro = new JButton("Eliminar libro");
        botonEliminarLibro.setBounds(350,350,120,50);
        getContentPane().add(botonEliminarLibro);

        // Acciones.

        botonVolverPrincipal.addActionListener(e -> 
        {
            VentanaPrincipalControlador.mostrar();
            dispose();
        });

        botonAgregarLibro.addActionListener(e -> 
        {
            String titulo = campoTitulo.getText();
            String autor = campoAutor.getText();
            String genero = campoGenero.getText();

            if (!titulo.isBlank() && !autor.isBlank() && !genero.isBlank()) 
            {
                VentanaAdminControlador.agregarLibro(titulo, autor, genero);
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Libro registrado!");			
            }
            else 
            {					
                JOptionPane.showMessageDialog(null, "El título, autor o género no pueden estar vacíos.");
            }
        });

        botonEliminarLibro.addActionListener(e -> 
        {
            String titulo = campoTitulo.getText();
            String autor = campoAutor.getText();
            String genero = campoGenero.getText();

            if (!titulo.isBlank() && !autor.isBlank() && !genero.isBlank()) 
            {
                VentanaAdminControlador.eliminarLibro(titulo, autor, genero);
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Libro eliminado!");			
            }
            else 
            {					
                JOptionPane.showMessageDialog(null, "El título, autor o género no pueden estar vacíos.");
            }
        });
    }

    private void limpiarCampos() 
    {
	    campoTitulo.setText("");
		campoAutor.setText("");
        campoGenero.setText("");
	}
}
