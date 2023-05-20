package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Buscador extends JPanel {

	/**
	 * Create the panel.
	 */
	public Buscador() {
		setLayout(null);
		
		JPanel panel_centro = new JPanel();
		panel_centro.setLayout(null);
		panel_centro.setBackground(new Color(255, 255, 0));
		panel_centro.setBounds(0, 46, 546, 380);
		add(panel_centro);
		/////inicia_cargado_panel_buscar_por_nombre
		versolo solo = new versolo();
		solo.setBounds(10, 10, 526, 360);
		panel_centro.add(solo);
		solo.setVisible(true);
		////////////////////////////

		JPanel panel_arriba = new JPanel();
		panel_arriba.setBackground(new Color(255, 255, 255));
		panel_arriba.setBounds(0, 0, 546, 47);
		add(panel_arriba);
		panel_arriba.setLayout(null);
		
		
		
		
		
		
		
		
		JButton btn_bn = new JButton("Buscar por nombre");
		btn_bn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_centro.removeAll();
				versolo solo = new versolo();
				solo.setBounds(10, 10, 566, 447);
				panel_centro.add(solo);
				solo.setVisible(true);
				panel_centro.repaint();
			
				
			}
		});
		btn_bn.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_bn.setBounds(37, 10, 190, 27);
		panel_arriba.add(btn_bn);
		
		JButton btn_vc = new JButton("Ver clases");
		btn_vc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_centro.removeAll();
				verclase ver = new verclase();
				ver.setBounds(10, 10, 566, 447);
				panel_centro.add(ver);
				ver.setVisible(true);
				panel_centro.repaint();
			
			}
		});
		btn_vc.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_vc.setBounds(237, 10, 190, 27);
		panel_arriba.add(btn_vc);
		
		

	}
}
