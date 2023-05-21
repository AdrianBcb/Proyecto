package GUI;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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
		lblnombre.setBounds(92, 55, 107, 17);
		panel_1.add(lblnombre);
		
		JLabel lblapellidos = new JLabel("Apellidos");
		lblapellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblapellidos.setBounds(92, 94, 96, 17);
		panel_1.add(lblapellidos);
		
		JLabel lblsexo = new JLabel("Sexo");
		lblsexo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblsexo.setBounds(92, 138, 96, 17);
		panel_1.add(lblsexo);
		
		JLabel lblnacionalidad = new JLabel("Nacionalidad");
		lblnacionalidad.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnacionalidad.setBounds(92, 176, 96, 17);
		panel_1.add(lblnacionalidad);
		
		JLabel lbltutor = new JLabel("Tutor");
		lbltutor.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltutor.setBounds(92, 260, 96, 17);
		panel_1.add(lbltutor);
		
		JLabel lbldireccion = new JLabel("Direccion");
		lbldireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldireccion.setBounds(92, 220, 96, 17);
		panel_1.add(lbldireccion);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltelefono.setBounds(92, 299, 96, 17);
		panel_1.add(lbltelefono);
		

		JComboBox comboBox_na = new JComboBox();
		comboBox_na.setModel(new DefaultComboBoxModel(new String[] {"Mexicana"}));
		comboBox_na.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_na.setBounds(242, 175, 153, 20);
		panel_1.add(comboBox_na);
		
		JComboBox comboBox_se = new JComboBox();
		comboBox_se.setToolTipText("");
		comboBox_se.setModel(new DefaultComboBoxModel(new String[] {"H", "M"}));
		comboBox_se.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_se.setBounds(242, 135, 153, 20);
		panel_1.add(comboBox_se);

		textField_nombre = new JTextField();
		textField_nombre.setColumns(10);
		textField_nombre.setBounds(241, 55, 141, 19);
		panel_1.add(textField_nombre);
		
		textField_apelllidos = new JTextField();
		textField_apelllidos.setColumns(10);
		textField_apelllidos.setBounds(241, 94, 141, 19);
		panel_1.add(textField_apelllidos);
		
		textField_direccion = new JTextField();
		textField_direccion.setColumns(10);
		textField_direccion.setBounds(241, 220, 141, 19);
		panel_1.add(textField_direccion);
		
		textField_tutor = new JTextField();
		textField_tutor.setColumns(10);
		textField_tutor.setBounds(241, 260, 141, 19);
		panel_1.add(textField_tutor);
		
		textField_telefono = new JTextField();
		textField_telefono.setColumns(10);
		textField_telefono.setBounds(241, 299, 141, 19);
		panel_1.add(textField_telefono);

		
		
		JButton btn_registrar = new JButton("Registrar");
		btn_registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=textField_nombre.getText();
				String apellido=textField_apelllidos.getText();
				String direccion=textField_direccion.getText();
				String sexo=String.valueOf(comboBox_se.getSelectedIndex());
				String nacionalidad=String.valueOf(comboBox_na.getSelectedIndex());
				String tutor=textField_tutor.getText();
				String telefono=textField_telefono.getText();
				m.registrar(nombre, apellido, sexo, nacionalidad, tutor, telefono, direccion);
				textField_nombre.setText("");
				textField_apelllidos.setText("");
				textField_direccion.setText("");
				textField_tutor.setText("");
				textField_telefono.setText("");
				
				//	alumnos alumnoR = new Persona(textField_nombre.getText(), textField_apelllidos.getText(),
				//		textField_direccion.getText(), textField_sexo.getText(), ABORTa,textField.naciona TOOL_TIP_TEXT_KEY);
			//	m.registrar(alumnoR);
				
				
			}
		});
		btn_registrar.setFont(new Font("Arial", Font.BOLD, 16));
		btn_registrar.setBounds(174, 360, 129, 27);
		panel_1.add(btn_registrar);
		
		JLabel lbl_fondo = new JLabel("");
		lbl_fondo.setBounds(0, 0, 546, 427);
		lbl_fondo.setIcon(new ImageIcon("img/fondo2.jpg"));

		panel_1.add(lbl_fondo);
		
	}
}
