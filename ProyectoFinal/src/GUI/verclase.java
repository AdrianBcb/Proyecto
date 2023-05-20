package GUI;

import javax.swing.JPanel;

import clases.alumnos;
import mysql.metodos;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class verclase extends JPanel {
private metodos m = new metodos();
private JButton btn_quitar = new JButton("Dar de baja");
private JButton btn_edit = new JButton("Editar Alumno");
private JPanel panel_centro = new JPanel();

	/**
	 * Create the panel.
	 */
	public verclase() {
		setLayout(null);
		
		panel_centro.setLayout(null);
		panel_centro.setBackground(Color.YELLOW);
		panel_centro.setBounds(0, 0, 546, 380);
		add(panel_centro);

		
		
		JComboBox comboBox_clases = new JComboBox();
		comboBox_clases.setBounds(199, 45, 268, 26);
		panel_centro.add(comboBox_clases);
		
		JList list = new JList();
		list.setBackground(new Color(255, 255, 255));
		list.setBounds(118, 92, 310, 171);
		panel_centro.add(list);
		
		JLabel lbl_fondo = new JLabel("");
		lbl_fondo.setBounds(0, 0, 546, 380);
		panel_centro.add(lbl_fondo);
		
		JLabel lbl_nada = new JLabel("Clase:");
		lbl_nada.setFont(new Font("Arial", Font.PLAIN, 15));
		lbl_nada.setBounds(85, 46, 102, 22);
		panel_centro.add(lbl_nada);

//BOTON
		String nombreabuscar="o";//jalar_de_la_lista
		alumnos resultado = m.buscar(nombreabuscar);
		//insertacodigochidoparaversiyase_seleccionóalgode_LA_JLIST_XD

		//es_AQUI_DONDE_SE_DECIDE_SI_SE_MUESTRAN_LOS_BOTONES_O_NO
		if (resultado==null) {
			mostrarbotones();
		}else {
			quitarbotones();
		}
		
		
	}
	
	
	
//SE_MUESTRAN_ESTOS_BOTONES_DESPUES_DE_SELECCIONAR_A_UN_ALUMNO_EN_LA_JLIST

	public void mostrarbotones() {
		btn_quitar.setFocusPainted(false);
		btn_quitar.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_quitar.setBounds(293, 327, 141, 27);
		panel_centro.add(btn_quitar);
		
		btn_edit.setFocusPainted(false);
		btn_edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	m.editar(alumno a);
			}
		});
		btn_edit.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_edit.setBounds(84, 327, 141, 27);
		panel_centro.add(btn_edit);
		
	}
	public void quitarbotones() {
		panel_centro.remove(btn_edit);
		panel_centro.remove(btn_quitar);
	}
}
