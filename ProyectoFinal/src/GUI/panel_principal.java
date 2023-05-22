package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class panel_principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3897192868953116032L;
	private JPanel contentPane;
	private JLabel lbl_nada1 = new JLabel("www.myheroacademia.com.mx");
	private JLabel lbl_fondoinicio = new JLabel("");
	private JLabel lbl_bienv = new JLabel("Hola, Bienvenido.");
	private JPanel panel_cambios = new JPanel();

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
//AREA_PANEL
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBackground(new Color(56, 100, 139));
		panel_menu.setBounds(10, 56, 190, 447);
		contentPane.add(panel_menu);
		panel_menu.setLayout(null);
		
		panel_cambios.setBackground(new Color(255, 255, 255));
		panel_cambios.setBounds(210, 56, 566, 447);
		contentPane.add(panel_cambios);
		panel_cambios.setLayout(null);
		
		JPanel panel_logo = new JPanel();
		panel_logo.setBounds(10, 10, 170, 100);
		panel_menu.add(panel_logo);
		panel_logo.setLayout(null);
		
		JPanel panel_arriba = new JPanel();
		panel_arriba.setBackground(new Color(255, 255, 255));
		panel_arriba.setBounds(10, 10, 766, 36);
		contentPane.add(panel_arriba);
		panel_arriba.setLayout(null);
		
		JPanel panel_logom = new JPanel();
		panel_logom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cargarinicio();
			}
		});
		panel_logom.setBackground(new Color(255, 255, 255));
		panel_logom.setBounds(0, 0, 47, 36);
		panel_arriba.add(panel_logom);
		panel_logom.setLayout(null);
		
		
		
		
//AREA_LABEL
		
		
		JLabel lbl_img = new JLabel("");
		lbl_img.setBounds(0, 0, 170, 100);
		panel_logo.add(lbl_img);
		lbl_img.setIcon(new ImageIcon("img/logo-chico.jpg"));

		JLabel lbl_inicio = new JLabel("");
		lbl_inicio.setBounds(4, 1, 38, 33);
		panel_logom.add(lbl_inicio);
		lbl_inicio.setIcon(new ImageIcon("img/inicio2.jpg"));

		


		
		cargarinicio();

		JLabel lbl_titulo = new JLabel("My Hero Academia");
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lbl_titulo.setBounds(223, 0, 320, 33);
		panel_arriba.add(lbl_titulo);
		
		
//AREA_DE_BOTONES:

		JButton btnR = new JButton("Registro");
		btnR.setFocusTraversalPolicyProvider(true);
		btnR.setFocusable(false);
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
		btnR.setBackground(Color.white); 
        btnR.setForeground(Color.black);
		
		JButton btnBusqueda = new JButton("Busqueda");
		btnBusqueda.setFocusPainted(false);
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
		btnBusqueda.setBackground(Color.white); 
        btnBusqueda.setForeground(Color.black);
		btnBusqueda.setBounds(10, 201, 170, 34);
		panel_menu.add(btnBusqueda);
		
		JButton btnAdministracin = new JButton("Administración");
		btnAdministracin.setFocusPainted(false);
		btnAdministracin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//estebotonsinosdatiempolohacemosnadamas_
				
			}
		});
		btnAdministracin.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAdministracin.setBackground(Color.white); 
		btnAdministracin.setForeground(Color.black);
		btnAdministracin.setBounds(10, 262, 170, 34);
		panel_menu.add(btnAdministracin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFocusPainted(false);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_principal.this.setVisible(false);
			}
		});
		btnSalir.setFont(new Font("Arial", Font.PLAIN, 16));
		btnSalir.setBackground(Color.white); 
		btnSalir.setForeground(Color.black);
		btnSalir.setBounds(10, 403, 170, 34);
		panel_menu.add(btnSalir);
		
		
		
	}
	
	
	
	
	
	public void cargarinicio(){
		panel_cambios.removeAll();
		lbl_nada1.setForeground(new Color(255, 255, 255));
		lbl_nada1.setBounds(178, 420, 210, 17);
		panel_cambios.add(lbl_nada1);
		lbl_nada1.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl_bienv.setBackground(new Color(0, 0, 255));
		lbl_bienv.setForeground(new Color(255, 255, 255));
		lbl_bienv.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_bienv.setBounds(190, 92, 186, 32);
		panel_cambios.add(lbl_bienv);
		lbl_fondoinicio.setBounds(0, 0, 566, 447);
		panel_cambios.add(lbl_fondoinicio);
		lbl_fondoinicio.setIcon(new ImageIcon("img/fondo3.jpg"));
		panel_cambios.repaint();
		
		}
}
