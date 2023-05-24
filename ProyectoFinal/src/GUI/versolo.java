package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import clases.alumnos;
import mysql.metodos;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class versolo extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7126511588532326492L;
	private JTextField textField;
	private metodos m = new metodos();
	private JPanel panel_centro = new JPanel();
	JList list = new JList();
	JButton btn_quitar = new JButton("Dar de baja");
	JButton btn_edit = new JButton("Editar Alumno");
	private JTable table_Alumnos;
	DefaultTableModel model = new DefaultTableModel();
	
	
	//private JTextField textResultado;
	

	/**
	 * Create the panel.
	 */
	public versolo(){
		setLayout(null);
		
		panel_centro.setLayout(null);
		panel_centro.setBackground(new Color(0, 255, 0));
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
		table_Alumnos = new JTable();
		table_Alumnos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
			table_Alumnos.setBounds(69, 216, 407, 63);
			panel_centro.add(table_Alumnos);
			model.addColumn("nombre");
			model.addColumn("apellido");
			model.addColumn("Tutor");
			model.addColumn("Clase");
			table_Alumnos.setModel(model);
			model.addRow(new Object[] {"Nombre","Apellido","Tutor"});
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.setFocusPainted(false);
		btn_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nombreabuscar = textField.getText();
					ResultSet resultado = m.buscar(nombreabuscar);
						while(resultado.next()) {
							String Nombrea=resultado.getString("Nombre");
							String Apellido=resultado.getString("Apellidos");
							String Tutor=resultado.getString("Tutor");
	//						String Asignatura=resultado.getString("Asignatura");
							

							model.addRow(new Object[] {Nombrea,Apellido,Tutor});
						}
				
				}catch ( SQLException h) {
					// TODO Auto-generated catch block
					h.printStackTrace();
				}
		}});
		btn_buscar.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_buscar.setBounds(202, 173, 141, 27);
		panel_centro.add(btn_buscar);
				
				
//		table = new JTable();
				
				JLabel lbl_fondo = new JLabel("");
				lbl_fondo.setBounds(0, 0, 546, 380);
				lbl_fondo.setIcon(new ImageIcon("img/fondo5.png"));
				
						panel_centro.add(lbl_fondo);
						
//						textResultado = new JTextField();
//						textResultado.setBounds(46, 178, 86, 20);
//						panel_centro.add(textResultado);
//						textResultado.setColumns(10);
//		
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
