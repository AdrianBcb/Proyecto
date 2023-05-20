package GUI;

import javax.swing.JPanel;

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

	/**
	 * Create the panel.
	 */
	public verclase() {
		setLayout(null);
		
		JPanel panel_centro = new JPanel();
		panel_centro.setLayout(null);
		panel_centro.setBackground(Color.YELLOW);
		panel_centro.setBounds(0, 0, 546, 380);
		add(panel_centro);
		
		JLabel lbl_nada = new JLabel("Clase:");
		lbl_nada.setFont(new Font("Arial", Font.PLAIN, 15));
		lbl_nada.setBounds(85, 46, 102, 22);
		panel_centro.add(lbl_nada);
		
		JButton btn_quitar = new JButton("Dar de baja");
		btn_quitar.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_quitar.setBounds(293, 327, 141, 27);
		panel_centro.add(btn_quitar);
		
		JButton btn_edit = new JButton("Editar Alumno");
		btn_edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	m.editar(alumno a);
			}
		});
		btn_edit.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_edit.setBounds(84, 327, 141, 27);
		panel_centro.add(btn_edit);
		
		JComboBox comboBox_clases = new JComboBox();
		comboBox_clases.setBounds(199, 45, 268, 26);
		panel_centro.add(comboBox_clases);
		
		JList list = new JList();
		list.setBackground(new Color(255, 255, 255));
		list.setBounds(57, 96, 438, 204);
		panel_centro.add(list);

	}
}
