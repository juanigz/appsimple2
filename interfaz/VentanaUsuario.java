package interfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaUsuario extends JFrame 
{
    JLabel labelTitulo;

    public VentanaUsuario() 
    {
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

    }

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

    }
}
