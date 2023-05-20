package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class panel_principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel_principal frame = new panel_principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public panel_principal() {
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBackground(new Color(255, 255, 255));
		panel_menu.setBounds(10, 56, 190, 447);
		contentPane.add(panel_menu);
		panel_menu.setLayout(null);
		
		JPanel panel_cambios = new JPanel();
		panel_cambios.setBackground(new Color(255, 255, 255));
		panel_cambios.setBounds(210, 56, 566, 447);
		contentPane.add(panel_cambios);
		panel_cambios.setLayout(null);
		
		JPanel panel_logo = new JPanel();
		panel_logo.setBounds(10, 10, 170, 100);
		panel_menu.add(panel_logo);
		panel_logo.setLayout(null);
		
		JLabel lbl_img = new JLabel("");
		lbl_img.setBounds(0, 0, 170, 100);
		panel_logo.add(lbl_img);
		lbl_img.setIcon(new ImageIcon("img/logo-chico.jpg"));

		

		JPanel panel_arriba = new JPanel();
		panel_arriba.setBounds(10, 10, 766, 33);
		contentPane.add(panel_arriba);
		panel_arriba.setLayout(null);
		
		JPanel panel_logom = new JPanel();
		panel_logom.setBackground(new Color(255, 255, 255));
		panel_logom.setBounds(0, 0, 46, 33);
		panel_arriba.add(panel_logom);
		
		
		
		JLabel lbl_bienv = new JLabel("Hola, Bienvenido.");
		lbl_bienv.setBackground(new Color(0, 0, 255));
		lbl_bienv.setForeground(new Color(255, 255, 255));
		lbl_bienv.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_bienv.setBounds(190, 92, 186, 32);
		panel_cambios.add(lbl_bienv);
		
		JLabel lbl_nada1 = new JLabel("www.myheroacademia.com.mx");
		lbl_nada1.setForeground(new Color(255, 255, 255));
		lbl_nada1.setBounds(178, 420, 210, 17);
		panel_cambios.add(lbl_nada1);
		lbl_nada1.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lbl_fondoinicio = new JLabel("");
		lbl_fondoinicio.setBounds(0, 0, 566, 447);
		panel_cambios.add(lbl_fondoinicio);
		lbl_fondoinicio.setIcon(new ImageIcon("img/fondo3.jpg"));

		JLabel lbl_titulo = new JLabel("My Hero Academia");
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lbl_titulo.setBounds(223, 0, 320, 33);
		panel_arriba.add(lbl_titulo);
		
		
		
		
		
		
		
		
		JButton btnR = new JButton("Registro");
		btnR.setBounds(10, 139, 170, 34);
		panel_menu.add(btnR);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_cambios.removeAll();				
				Registro reg = new Registro();
				reg.setBounds(10, 10, 566, 447);
				panel_cambios.add(reg);
				reg.setVisible(true);
				panel_cambios.repaint();
				
			}
		});
		btnR.setFont(new Font("Arial", Font.PLAIN, 16));
		btnR.setBackground(null);
		
		JButton btnBusqueda = new JButton("Busqueda");
		btnBusqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_cambios.removeAll();
				Buscador buscador = new Buscador();
				buscador.setBounds(10, 10, 566, 447);
				panel_cambios.add(buscador);
				buscador.setVisible(true);
				panel_cambios.repaint();
			}
		});
		btnBusqueda.setFont(new Font("Arial", Font.PLAIN, 16));
		btnBusqueda.setBackground((Color) null);
		btnBusqueda.setBounds(10, 201, 170, 34);
		panel_menu.add(btnBusqueda);
		
		JButton btnAdministracin = new JButton("Administración");
		btnAdministracin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//estebotonsinosdatiempolohacemosnadamas_
				
			}
		});
		btnAdministracin.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAdministracin.setBackground((Color) null);
		btnAdministracin.setBounds(10, 262, 170, 34);
		panel_menu.add(btnAdministracin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_principal.this.setVisible(false);
			}
		});
		btnSalir.setFont(new Font("Arial", Font.PLAIN, 16));
		btnSalir.setBackground((Color) null);
		btnSalir.setBounds(10, 403, 170, 34);
		panel_menu.add(btnSalir);
		
		
		
	}
}
