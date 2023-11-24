package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
//import java.awt.List;
import java.awt.event.ActionListener;

import javax.swing.*;

import controlador.VentanaUsuarioControlador;
import logica.TipoUsuario;

//import logica.Usuario;

// ventana donde vemos si el usuario es administrador, o cliente ???
// las busquedas de libros son las mismas para ambos usuarios. se buscan por titulo, autor o género.
public class VentanaPrincipal extends JFrame 
{
    private JLabel labelTitulo;
    private JLabel labelNombre;
    private JLabel labelContraseña;

    private JTextField campoNombre;
    private JTextField campoContraseña;

    private JButton botonIngresarAdmin;
    private JButton botonIngresarCliente;

    // private List<Usuario> usuarios;

    public VentanaPrincipal() 
    {
        inicializar();
    }

    public void inicializar() 
    {
        // Configura la ventana principal.
        getContentPane().setBackground(new Color(163, 200, 211));
        setBounds(100, 100, 550, 490);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // getContentPane().setLayout(null);

        setTitle("Aplicación de biblioteca");
        setLocationRelativeTo(null); // Centra la ventana en pantalla
        setResizable(false);

        labelTitulo = new JLabel("Acceso de usuarios");
        labelTitulo.setForeground(new Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
        labelTitulo.setBounds(0, 11, 532, 29);
        // getContentPane().add(labelTitulo);

        // Define los componentes.
        labelNombre = new JLabel("Nombre:");
        campoNombre = new JTextField();

        labelContraseña = new JLabel("Contraseña:");
        campoContraseña = new JTextField();

        botonIngresarAdmin = new JButton("Ingresar Admin");
        botonIngresarCliente = new JButton("Ingresar Cliente");

        // Agrega todos los componentes a un JPanel particular.
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(labelNombre);
        panel.add(campoNombre);
        panel.add(labelContraseña);
        panel.add(campoContraseña);
        panel.add(botonIngresarAdmin);
        panel.add(botonIngresarCliente);

        this.add(panel);

        botonIngresarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaUsuarioControlador.setTipoUsuario(TipoUsuario.ADMIN);
				dispose();
			}
		});

        botonIngresarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaUsuarioControlador.setTipoUsuario(TipoUsuario.CLIENTE);
				dispose();
			}
		});
    }
}
