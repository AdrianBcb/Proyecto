package GUI;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import mysql.metodos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Registro extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_nombre;
	private JTextField textField_apelllidos;
	private JTextField textField_direccion;
	private JTextField textField_tutor;
	private JTextField textField_telefono;
	private metodos m = new metodos();
	/**
	 * Create the panel.
	 */
	public Registro() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 546, 427);
		add(panel_1);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnombre.setBounds(105, 54, 107, 17);
		panel_1.add(lblnombre);
		
		JLabel lblapellidos = new JLabel("Apellidos");
		lblapellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblapellidos.setBounds(105, 94, 96, 17);
		panel_1.add(lblapellidos);
		
		JLabel lblsexo = new JLabel("Sexo");
		lblsexo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblsexo.setBounds(105, 138, 96, 17);
		panel_1.add(lblsexo);
		
		JLabel lblnacionalidad = new JLabel("Nacionalidad");
		lblnacionalidad.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnacionalidad.setBounds(105, 177, 96, 17);
		panel_1.add(lblnacionalidad);
		
		JLabel lbltutor = new JLabel("Tutor");
		lbltutor.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltutor.setBounds(105, 260, 96, 17);
		panel_1.add(lbltutor);
		
		JLabel lbldireccion = new JLabel("Direccion");
		lbldireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldireccion.setBounds(105, 220, 96, 17);
		panel_1.add(lbldireccion);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltelefono.setBounds(105, 299, 96, 17);
		panel_1.add(lbltelefono);
		

		JComboBox comboBox_na = new JComboBox();
		comboBox_na.setModel(new DefaultComboBoxModel(new String[] {"Mexicana", "Extranjera"}));
		comboBox_na.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_na.setBounds(262, 175, 153, 20);
		panel_1.add(comboBox_na);
		
		JComboBox comboBox_se = new JComboBox();
		comboBox_se.setToolTipText("");
		comboBox_se.setModel(new DefaultComboBoxModel(new String[] {"H", "M",}));
		comboBox_se.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_se.setBounds(262, 136, 153, 20);
		panel_1.add(comboBox_se);
		
		JComboBox comboBox_A = new JComboBox();
		comboBox_A.setToolTipText("");
		comboBox_A.setModel(new DefaultComboBoxModel(new String[] {"Literatura", "Kun Fu","Karate-do"}));
		comboBox_A.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_A.setBounds(262, 340, 153, 20);
		panel_1.add(comboBox_A);

		textField_nombre = new JTextField();
		textField_nombre.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_nombre.setColumns(10);
		textField_nombre.setBounds(262, 53, 141, 19);
		panel_1.add(textField_nombre);
		
		textField_apelllidos = new JTextField();
		textField_apelllidos.setColumns(10);
		textField_apelllidos.setBounds(262, 94, 141, 19);
		panel_1.add(textField_apelllidos);
		
		textField_direccion = new JTextField();
		textField_direccion.setColumns(10);
		textField_direccion.setBounds(262, 220, 141, 19);
		panel_1.add(textField_direccion);
		
		textField_tutor = new JTextField();
		textField_tutor.setColumns(10);
		textField_tutor.setBounds(262, 260, 141, 19);
		panel_1.add(textField_tutor);
		
		textField_telefono = new JTextField();
		textField_telefono.setColumns(10);
		textField_telefono.setBounds(262, 299, 141, 19);
		panel_1.add(textField_telefono);

		
		
		JButton btn_registrar = new JButton("Registrar");
		btn_registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=textField_nombre.getText();
				String apellidos=textField_apelllidos.getText();
				String direccion=textField_direccion.getText();
				
				String sexo=String.valueOf(comboBox_se.getSelectedItem());
				String nacionalidad=String.valueOf(comboBox_na.getSelectedItem());
				String asignatura=String.valueOf(comboBox_A.getSelectedItem());
				String tutor=textField_tutor.getText();
				String telefono=textField_telefono.getText();
				boolean z = m.registrar(nombre, apellidos, direccion, sexo, nacionalidad, tutor, telefono, asignatura);
				if (z==true) {
					textField_nombre.setText("");
					textField_apelllidos.setText("");
					textField_direccion.setText("");
					textField_tutor.setText("");
					textField_telefono.setText("");
					JOptionPane.showMessageDialog(btn_registrar, "Alumno registrado correctamente");
				}else {
					JOptionPane.showMessageDialog(btn_registrar, "No se pudo registrar");

				}
			}
		});
		btn_registrar.setFont(new Font("Arial", Font.BOLD, 16));
		btn_registrar.setBounds(183, 390, 129, 27);
		panel_1.add(btn_registrar);
		
		JLabel lblAsignatura = new JLabel("Asignatura");
		lblAsignatura.setFont(new Font("Arial", Font.PLAIN, 14));
		lblAsignatura.setBounds(105, 340, 96, 19);
		panel_1.add(lblAsignatura);
		
		JLabel lbl_fondo = new JLabel("");
		lbl_fondo.setBounds(0, 0, 546, 427);
		lbl_fondo.setIcon(new ImageIcon("img/fondo2.jpg"));
		
				panel_1.add(lbl_fondo);
		
	}
}
