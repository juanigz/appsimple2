package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.VentanaClienteControlador;
import controlador.VentanaPrincipalControlador;
import logica.Libro;

// en esta ventana, el cliente puede registrarse, alquilar y devolver libros.
public class VentanaCliente extends JFrame {
    private JLabel labelTituloPantalla;

    private JLabel labelTitulo;
    private JLabel labelAutor;
    private JLabel labelGenero;

    private JTextField campoTitulo;
    private JTextField campoAutor;
    private JTextField campoGenero;

    private JButton botonVolverPrincipal;
    private JButton botonAlquilarLibro;
    private JButton botonDevolverLibro;
    private JButton botonVerAlquilados;

    private List<Libro> _librosDeCliente;

    public VentanaCliente() {
        inicializarCliente();
    }

    // Gestión de usuarios.
    public void inicializarCliente() {
        getContentPane().setBackground(new Color(163, 200, 211));
        setBounds(100, 100, 850, 490);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        setTitle("Gestión cliente");
        setLocationRelativeTo(null); // Centra la ventana en pantalla
        setResizable(false);

        labelTituloPantalla = new JLabel("Cliente");
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
        campoTitulo.setBounds(10, 80, 230, 40);
        getContentPane().add(campoTitulo);

        labelAutor = new JLabel("Autor:");
        labelAutor.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelAutor.setBounds(10, 120, 230, 40);
        getContentPane().add(labelAutor);

        campoAutor = new JTextField();
        campoAutor.setColumns(10);
        campoAutor.setBounds(10, 160, 230, 40);
        getContentPane().add(campoAutor);

        labelGenero = new JLabel("Genero:");
        labelGenero.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelGenero.setBounds(10, 200, 230, 40);
        getContentPane().add(labelGenero);

        campoGenero = new JTextField();
        campoGenero.setColumns(10);
        campoGenero.setBounds(10, 240, 230, 40);
        getContentPane().add(campoGenero);

        botonVolverPrincipal = new JButton("Volver Principal");
        botonVolverPrincipal.setBounds(50, 350, 120, 50);
        getContentPane().add(botonVolverPrincipal);

        botonAlquilarLibro = new JButton("Alquilar libro");
        botonAlquilarLibro.setBounds(200, 350, 120, 50);
        getContentPane().add(botonAlquilarLibro);

        botonDevolverLibro = new JButton("Devolver libro");
        botonDevolverLibro.setBounds(350, 350, 120, 50);
        getContentPane().add(botonDevolverLibro);

        botonVerAlquilados = new JButton("Ver libros");
        botonVerAlquilados.setBounds(500, 350, 120, 50);
        getContentPane().add(botonVerAlquilados);

        botonVolverPrincipal.addActionListener(e -> {
            VentanaPrincipalControlador.mostrar();
            dispose();
        });

        botonAlquilarLibro.addActionListener(event -> {
            String titulo = campoTitulo.getText();
            String autor = campoAutor.getText();
            String genero = campoGenero.getText();

            try {
                if (!titulo.isBlank() && !autor.isBlank() && !genero.isBlank()) {
                    Libro libro = VentanaClienteControlador.buscarLibro(titulo, autor, genero);
                    if (libro == null) {
                        throw new NullPointerException("libro no encontrado.");
                    }
                    _librosDeCliente = VentanaClienteControlador.alquilarLibro(libro);
                    limpiarCampos();
                    JOptionPane.showMessageDialog(this,
                            "Libro " + libro.toString() + ", alquilado al cliente: " + VentanaPrincipal.getCliente().toString());
                }
                else {
                    JOptionPane.showMessageDialog(null, "El título, autor o género no pueden estar vacíos.");
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        });

        // botonDevolverLibro.addActionListener(e ->
        // {
        // String titulo = campoTitulo.getText();
        // String autor = campoAutor.getText();
        // String genero = campoGenero.getText();

        // if (!titulo.isBlank() && !autor.isBlank() && !genero.isBlank())
        // {
        // VentanaClienteControlador.devolverLibro(titulo, autor, genero);
        // limpiarCampos();
        // JOptionPane.showMessageDialog(this, "Libro devuelto...!");
        // }
        // else
        // {
        // JOptionPane.showMessageDialog(null, "El título, autor o género no pueden
        // estar vacíos.");
        // }
        // });

        botonVerAlquilados.addActionListener(event -> {
            JOptionPane.showMessageDialog(this, "Abriendo registro de alquilados!");

            try {
                if (_librosDeCliente == null || _librosDeCliente.size() == 0) {
                    throw new NullPointerException("Librería vacia.");
                }

                System.out.println("registro de libros alquilados por: " + VentanaPrincipal.getCliente().getNombre());
                for (Libro libro : _librosDeCliente) {
                    System.out.println(libro.toString());
                    // impresión directamente por consola usando toString desde logica.persona, no
                    // hacía falta otra pantalla.
                }
            } 
            catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        });
    }

    private void limpiarCampos() {
        campoTitulo.setText("");
        campoAutor.setText("");
        campoGenero.setText("");
    }
}
