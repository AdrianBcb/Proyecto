package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buscador extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5237607785177084098L;

	/**
	 * Create the panel.
	 */
	public Buscador() {
		setLayout(null);
//PANELES
		JPanel panel_centro = new JPanel();
		panel_centro.setLayout(null);
		panel_centro.setBackground(new Color(255, 255, 0));
		panel_centro.setBounds(0, 46, 546, 381);
		add(panel_centro);
/////inicia_cargado_panel_buscar_por_nombre
		versolo solo = new versolo();
		solo.setBounds(0,0, 546, 381);
		panel_centro.add(solo);
		solo.setVisible(true);
////////////////////////////

		JPanel panel_arriba = new JPanel();
		panel_arriba.setBackground(new Color(0, 0, 0));
		panel_arriba.setBounds(0, 0, 546, 47);
		add(panel_arriba);
		panel_arriba.setLayout(null);
		
		
		
		
		
//BOTONES
		
		
		JButton btn_bn = new JButton("Buscar por nombre");
		btn_bn.setFocusPainted(false);
		btn_bn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_centro.removeAll();
				versolo solo = new versolo();
				solo.setBounds(0,0, 566, 447);
				panel_centro.add(solo);
				solo.setVisible(true);
				panel_centro.repaint();
			
				
			}
		});
		btn_bn.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_bn.setBounds(75, 10, 190, 27);
		panel_arriba.add(btn_bn);
		
		JButton btn_vc = new JButton("Ver clases");
		btn_vc.setFocusPainted(false);
		btn_vc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_centro.removeAll();
				verclase ver = new verclase();
				ver.setBounds(0,0, 566, 447);
				panel_centro.add(ver);
				ver.setVisible(true);
				panel_centro.repaint();
			
			}
		});
		btn_vc.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_vc.setBounds(307, 10, 190, 27);
		panel_arriba.add(btn_vc);
		
		

	}
}
