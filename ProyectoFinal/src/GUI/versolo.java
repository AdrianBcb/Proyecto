package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import clases.alumnos;
import mysql.metodos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class versolo extends JPanel {
	private JTextField textField;
	private metodos m = new metodos();
	private JPanel panel_centro = new JPanel();

	JList list = new JList();
	JButton btn_quitar = new JButton("Dar de baja");
	JButton btn_edit = new JButton("Editar Alumno");
	

	/**
	 * Create the panel.
	 */
	public versolo(){
		setLayout(null);
		
		panel_centro.setLayout(null);
		panel_centro.setBackground(Color.YELLOW);
		panel_centro.setBounds(0, 0, 546, 380);
		add(panel_centro);
		
		JLabel lbl_nada = new JLabel("Ingresa el nombre a buscar:");
		lbl_nada.setFont(new Font("Arial", Font.PLAIN, 15));
		lbl_nada.setBounds(178, 75, 189, 22);
		panel_centro.add(lbl_nada);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(147, 107, 251, 26);
		panel_centro.add(textField);
		
		
		
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreabuscar = textField.getText();
				//bien puede un try aqui por si acaso
				alumnos resultado = m.buscar(nombreabuscar);
				
				//es_AQUI_DONDE_SE_DECIDE_SI_SE_MUESTRAN_LOS_BOTONES_O_NO
				if (resultado!=null) {
					mostrarbotones();
				}else {
					quitarbotones();
				}
			}
		});
		btn_buscar.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_buscar.setBounds(202, 175, 141, 27);
		panel_centro.add(btn_buscar);
		
	}
	public void mostrarbotones() {
		//Quiero_ocultar_la_Jlist_y_los_ULTIMOS_DOS_BOTONES_PORFA_QUE_SOLO_SE_MUESTREN_SI_HUBO_RESULTADOS
		btn_edit.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_edit.setBounds(99, 329, 141, 27);
		panel_centro.add(btn_edit);
		
		btn_quitar.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_quitar.setBounds(293, 329, 141, 27);
		panel_centro.add(btn_quitar);
		
		list.setBounds(43, 214, 452, 105);
		panel_centro.add(list);
		}
	public void quitarbotones() {
		panel_centro.remove(btn_edit);
		panel_centro.remove(btn_quitar);
		panel_centro.remove(list);
	}
}
