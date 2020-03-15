package vista;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlAltaEstancia extends JPanel {
	private JTextField txtAlojamiento;
	private JTextField txtCliente;
	private JTextField txtSalida;
	private JTextField txtEntrada;
	private JButton btnValidar;
	private JLabel lblTipo;
	private JLabel lblMensaje;
	

	public JTextField getTxtAlojamiento() {
		return txtAlojamiento;
	}


	public JTextField getTxtCliente() {
		return txtCliente;
	}


	public JTextField getTxtSalida() {
		return txtSalida;
	}


	public JTextField getTxtEntrada() {
		return txtEntrada;
	}


	public JButton getBtnValidar() {
		return btnValidar;
	}


	public JLabel getLblTipo() {
		return lblTipo;
	}


	/**
	 * Create the panel.
	 */
	public PnlAltaEstancia() {
		
		JLabel lblNewLabel = new JLabel("Alta Estancias");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		
		JLabel lblAlojamiento = new JLabel("Alojamiento");
		lblAlojamiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtAlojamiento = new JTextField();
		txtAlojamiento.setColumns(10);
		
		JLabel labeltipo = new JLabel("Tipo");
		labeltipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblTipo = new JLabel(" ");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblEntrada = new JLabel("Entrada");
		lblEntrada.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblSalida = new JLabel("Salida");
		lblSalida.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnValidar = new JButton("Validar");
	
		btnValidar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtCliente = new JTextField();
		txtCliente.setColumns(10);
		
		txtSalida = new JTextField();
		txtSalida.setColumns(10);
		
		txtEntrada = new JTextField();
		txtEntrada.setColumns(10);
		
		JLabel mensaje = new JLabel("Mensaje");
		mensaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblMensaje = new JLabel(" ");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(130)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAlojamiento, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
										.addComponent(labeltipo, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEntrada, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSalida, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
										.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtEntrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtAlojamiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtSalida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(277)
											.addComponent(btnValidar)))
									.addPreferredGap(ComponentPlacement.RELATED, 162, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addGap(37)
									.addComponent(lblMensaje, GroupLayout.PREFERRED_SIZE, 752, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(351)
							.addComponent(lblNewLabel)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(53)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAlojamiento, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAlojamiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(labeltipo, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
							.addGap(45)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEntrada, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEntrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSalida, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSalida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(45)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(129))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnValidar)
							.addGap(112)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMensaje, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(48))
		);
		setLayout(groupLayout);

	}


	public JLabel getLblMensaje() {
		return lblMensaje;
	}
}
