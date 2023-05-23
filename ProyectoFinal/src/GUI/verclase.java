package GUI;

import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import clases.alumnos;
import mysql.metodos;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class verclase extends JPanel {
private metodos m = new metodos();
private JButton btn_quitar = new JButton("Dar de baja");
private JButton btn_edit = new JButton("Editar Alumno");
private JPanel panel_centro = new JPanel();
DefaultListModel<String> modelo = new DefaultListModel<>();
int i=0;

	/**
	 * Create the panel.
	 */
	public verclase() {
		setLayout(null);
		
		panel_centro.setLayout(null);
		panel_centro.setBackground(Color.YELLOW);
		panel_centro.setBounds(0, 0, 546, 380);
		add(panel_centro);

		JList list = new JList();
		list.setModel(modelo);
		list.setBackground(new Color(255, 255, 255));
		list.setBounds(118, 92, 310, 171);
		panel_centro.add(list);
		
		JLabel lbl_nada = new JLabel("Clase:");
		lbl_nada.setForeground(new Color(255, 255, 255));
		lbl_nada.setFont(new Font("Arial", Font.PLAIN, 15));
		lbl_nada.setBounds(85, 46, 102, 22);
		panel_centro.add(lbl_nada);
		
		JComboBox comboBox_clases = new JComboBox();
		comboBox_clases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox_clases.getSelectedItem() != "selecciona") {
					//mostrarbotones();
				
				modelo.removeAllElements();
				i=0;
				list.removeAll();
				list.repaint();
				quitarbotones();
				panel_centro.repaint();
				String claseamostrar=(String) comboBox_clases.getSelectedItem();
				ResultSet resultado = m.verclase(claseamostrar);
				try {
					while(resultado.next()) {
						alumnos a = new alumnos (resultado.getString("Nombre"),resultado.getString("Apellidos"),resultado.getString("Sexo")
						,resultado.getString("Nacionalidad"),resultado.getString("Tutor"),resultado.getString("Telefono"),resultado.getString("Direccion"));
						
					//	a.getNombre()
						String enclase = resultado.getString("Nombre")+"          "+ resultado.getString("Apellidos")+"          "
						+resultado.getString("Tutor");
						modelo.add(i, enclase);
						i++;
							}
				} catch (SQLException h) {
					// TODO Auto-generated catch block
					h.printStackTrace();
				}
			//	list.add(null, resultado.getUpdateCount());
				
				}else {
					quitarbotones();
					
				}
				
				
			}
		});
		comboBox_clases.setModel(new DefaultComboBoxModel(new String[] {"Literatura", "Muai Tai", "Kung Fu"}));
		comboBox_clases.setBounds(199, 45, 268, 26);
		panel_centro.add(comboBox_clases);
		
		JLabel lbl_fondo = new JLabel("");
		lbl_fondo.setIcon(new ImageIcon("img/fondo7.jpg"));
		
				lbl_fondo.setBounds(0, 0, 546, 380);
				panel_centro.add(lbl_fondo);
		
		

//BOTON
		if (list.getSelectedValue()!=null) {
			mostrarbotones();
		}else {
			quitarbotones();
		}
	
		 list.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	            	
	            	
	            	if (list.getSelectedValue()!=null) {
	        			mostrarbotones();
	        		}else {
	        			quitarbotones();
	        		}
	      
	            }
	        });

		
		
	
		
	}

//SE_MUESTRAN_ESTOS_BOTONES_DESPUES_DE_SELECCIONAR_A_UN_ALUMNO_EN_LA_JLIST

	public void mostrarbotones() {
		btn_quitar.setFocusPainted(false);
		btn_quitar.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_quitar.setBounds(293, 327, 141, 27);
		
		btn_quitar.setFocusPainted(false);
		btn_quitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	m.editar(alumno a);
				
			}
		});
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
