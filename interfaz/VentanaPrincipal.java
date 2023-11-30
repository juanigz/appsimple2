package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controlador.VentanaAdminControlador;
import controlador.VentanaClienteControlador;
import controlador.VentanaPrincipalControlador;

import logica.Cliente;

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

    private static Cliente user;

    public VentanaPrincipal() 
    {
        inicializar();
    }

    public void inicializar() 
    {
        // Configura la ventana principal.
        // getContentPane().setBackground(new Color(163, 200, 211));
        this.setBackground(new Color(163, 200, 211));
        this.setBounds(100, 100, 550, 490);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // getContentPane().setLayout(null);

        this.setTitle("Aplicación de biblioteca");
        this.setLocationRelativeTo(null); // Centra la ventana en pantalla
        this.setResizable(false);

        labelTitulo = new JLabel("Acceso de usuarios");
        labelTitulo.setForeground(new Color(250, 200, 100));
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
        labelTitulo.setBounds(10, 150, 532, 29);
        this.getContentPane().add(labelTitulo);

        // Define los componentes.
        labelNombre = new JLabel("Nombre:");
        campoNombre = new JTextField();
        campoNombre.setColumns(10);

        labelContraseña = new JLabel("Contraseña:");
        campoContraseña = new JTextField();
        campoContraseña.setColumns(10);

        botonIngresarAdmin = new JButton("Ingresar Admin");
        botonIngresarAdmin.setBounds(20, 400, 30, 30);
        botonIngresarCliente = new JButton("Ingresar Cliente");

        // Agrega todos los componentes a un JPanel particular.
        JPanel panel = new JPanel();

        //panel.add(labelTitulo);
        panel.add(labelNombre);
        panel.add(campoNombre);
        panel.add(labelContraseña);
        panel.add(campoContraseña);
        panel.add(botonIngresarAdmin);
        panel.add(botonIngresarCliente);

        this.add(panel);

        botonIngresarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAdminControlador.mostrar();
				dispose();
			}
		});

         botonIngresarCliente.addActionListener(e -> 
         {
            String nombre = campoNombre.getText();
            String contraseña = campoContraseña.getText();

            if (!nombre.isBlank() || !contraseña.isBlank()) 
            {
                user = VentanaPrincipalControlador.generarUsuario(nombre, contraseña);
                // limpiarCampos();
                JOptionPane.showMessageDialog(this, "Persona registrada!");
                
                VentanaClienteControlador.mostrar();
                dispose();	
            }
            else 
            {					
                JOptionPane.showMessageDialog(null, "El apellido o el nombre no pueden estar vacíos.");
            }
         });
    }

    public static Cliente getCliente()
    {
        return user;
    }

    // private void limpiarCampos() 
    // {
	//     campoNombre.setText("");
	// 	campoContraseña.setText("");
	// }
}
