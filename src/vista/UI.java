package vista;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JMenu;

public class UI extends JFrame {

	private JPanel contentPane;
	private PnlAltaEstancia pnlEstancia;
	private PnlConsuktaEstancia pnlConsultaEstancia;

	
	public void limpiarCrearEstancia() {
		limpiarTextComps(getTxtAlojamiento(),getTxtCliente(),getTxtEntrada(),getTxtSalida());
	}
	
	private void limpiarTextComps(JTextComponent ...componentes){
		for (int i = 0; i < componentes.length; i++) {
			componentes[i].setText("");
		}
	}
	public JButton getBtnValidar() {
		return pnlEstancia.getBtnValidar();
	}



	public JLabel getLblTipo() {
		return pnlEstancia.getLblTipo();
	}



	public JLabel getLblMensaje() {
		return pnlEstancia.getLblMensaje();
	}



	public JTextField getTxtAlojamiento() {
		return pnlEstancia.getTxtAlojamiento();
	}



	public JTextField getTxtCliente() {
		return pnlEstancia.getTxtCliente();
	}



	public JTextField getTxtSalida() {
		return pnlEstancia.getTxtSalida();
	}



	public JTextField getTxtEntrada() {
		return pnlEstancia.getTxtEntrada();
	}



	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1094, 665);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEstancia = new JMenu("Estancia");
		menuBar.add(mnEstancia);
		
		JMenuItem mntmEstancia = new JMenuItem("Crear");
		mnEstancia.add(mntmEstancia);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "consulta");
			}
		});
		mnEstancia.add(mntmConsultar);
		mntmEstancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "crear");
			}
		});
		
		JMenuItem mntmConsumir = new JMenuItem("Consumir");
		
		menuBar.add(mntmConsumir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		pnlEstancia = new PnlAltaEstancia();
		contentPane.add(pnlEstancia, "crear");
		
		JLabel lblEstancia = new JLabel("estancia");
		pnlEstancia.add(lblEstancia);
		
		JPanel pnlConsumir = new JPanel();
		contentPane.add(pnlConsumir, "consumir");
		
		JLabel lblConsumir = new JLabel("consumir");
		pnlConsumir.add(lblConsumir);
		mntmConsumir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "consumir");
			}
		});
		pnlConsultaEstancia=new PnlConsuktaEstancia();
		contentPane.add(pnlConsultaEstancia,"consulta");
		
		
	}



	public JTextArea getTextArea() {
		return pnlConsultaEstancia.getTextArea();
	}



	public JButton getBtnActualiza() {
		return pnlConsultaEstancia.getBtnActualiza();
	}

}
