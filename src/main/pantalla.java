package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tarea2.Controlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class pantalla extends JFrame {
	private Controlador c = new Controlador();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantalla frame = new pantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pantalla() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setBounds(0, 0, 729, 543);
		contentPane.add(panelFormulario);
		panelFormulario.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar Usuario Nuevo");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblNewLabel.setBounds(213, 74, 262, 34);
		panelFormulario.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNombre.setBounds(159, 141, 70, 16);
		panelFormulario.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblApellido.setBounds(159, 178, 65, 16);
		panelFormulario.add(lblApellido);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblFechaDeNacimiento.setBounds(158, 213, 163, 16);
		panelFormulario.add(lblFechaDeNacimiento);
		
		textField = new JTextField();
		textField.setBounds(386, 137, 170, 26);
		panelFormulario.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(386, 174, 170, 26);
		panelFormulario.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(386, 209, 38, 26);
		panelFormulario.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(436, 209, 38, 26);
		panelFormulario.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(486, 209, 70, 26);
		panelFormulario.add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxEntrenador = new JCheckBox("Entrenador");
		
		
		chckbxEntrenador.setBounds(159, 277, 111, 23);
		panelFormulario.add(chckbxEntrenador);
		
		JCheckBox chckbxFutbolista = new JCheckBox("Futbolista");
		
		
		chckbxFutbolista.setBounds(306, 277, 128, 23);
		panelFormulario.add(chckbxFutbolista);
		
		JCheckBox chckbxMasajista = new JCheckBox("Masajista");
		
		chckbxMasajista.setBounds(457, 277, 128, 23);
		panelFormulario.add(chckbxMasajista);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de Usuario");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(159, 249, 162, 16);
		panelFormulario.add(lblNewLabel_1);
		
		JPanel panelDorsal = new JPanel();
		panelDorsal.setBounds(146, 323, 449, 40);
		panelFormulario.add(panelDorsal);
		panelDorsal.setLayout(null);
		panelDorsal.setVisible(false);
		
		JLabel lblDorsal = new JLabel("Dorsal");
		lblDorsal.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblDorsal.setBounds(19, 6, 61, 16);
		panelDorsal.add(lblDorsal);
		
		textField_5 = new JTextField();
		textField_5.setBounds(248, 2, 163, 26);
		panelDorsal.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panelFederacion = new JPanel();
		panelFederacion.setLayout(null);
		panelFederacion.setBounds(146, 323, 449, 40);
		panelFormulario.add(panelFederacion);
		panelFederacion.setVisible(false);
		
		JLabel lblIdDeFederacion = new JLabel("Id de Federacion");
		lblIdDeFederacion.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblIdDeFederacion.setBounds(19, 6, 141, 16);
		panelFederacion.add(lblIdDeFederacion);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(248, 2, 163, 26);
		panelFederacion.add(textField_6);
		
		JButton btnRegistrar = new JButton("Registrar");
		
		btnRegistrar.setBounds(513, 463, 117, 29);
		panelFormulario.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		
		btnCancelar.setBounds(104, 463, 117, 29);
		panelFormulario.add(btnCancelar);
		
		chckbxEntrenador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxEntrenador.isSelected()) {
					panelFederacion.setVisible(true);
					panelDorsal.setVisible(false);
					chckbxFutbolista.setSelected(false);
					chckbxMasajista.setSelected(false);
				} else {
					panelFederacion.setVisible(false);
				}

			}
		});
		
		chckbxFutbolista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxFutbolista.isSelected()) {
					panelDorsal.setVisible(true);
					panelFederacion.setVisible(false);
					chckbxEntrenador.setSelected(false);
					chckbxMasajista.setSelected(false);
				} else {
					panelDorsal.setVisible(false);
				}
			}
		});
		
		chckbxMasajista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxMasajista.isSelected()) {
					chckbxEntrenador.setSelected(false);
					chckbxFutbolista.setSelected(false);
					panelDorsal.setVisible(false);
					panelFederacion.setVisible(false);
				}
			}
		});
		
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int dia;
				int mes;
				int anio;
				
				try {
					dia = Integer.parseInt(textField_2.getText());
					mes = Integer.parseInt(textField_3.getText());
					anio = Integer.parseInt(textField_4.getText());
					
					if (chckbxMasajista.isSelected()) {
						c.crearMasajista(1, textField.getText(), textField_1.getText(), LocalDate.of(anio, mes, dia), null);
						
					}else if (chckbxEntrenador.isSelected()) {
						int idFed = Integer.parseInt(textField_6.getText());
						
						c.crearEntrenador(1, textField.getText(), textField_1.getText(), LocalDate.of(anio, mes, dia), idFed);
						
					}else {
						int dorsal = Integer.parseInt(textField_5.getText());
						c.crearFutbolista(1, textField.getText(), textField_1.getText(), LocalDate.of(anio, mes, dia), dorsal);
					}
					
					c.imprimir();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Estas ingresando cualquiera, amistad");
					ex.printStackTrace();
				}
				
				
			}
		});
	}
}
