package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Controlador;
import logica.Entrenador;
import logica.Integrante;
import logica.Masajista;
import logica.Futbolista;

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
	private Controlador c = Controlador.getInstancia();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textFieldIDBaja;
	private JTextField textFieldIDConsulta;

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
	
	private void limpiarPantallaAgregarIntegrante() {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_6.setText("");
	}
	
	
	
	public pantalla() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panelConsulta = new JPanel();
		panelConsulta.setBounds(0, 0, 729, 537);
		contentPane.add(panelConsulta);
		panelConsulta.setLayout(null);
		panelConsulta.setVisible(false);
		
		JLabel lblConsultaIntegrante = new JLabel("Consulta Integrante");
		lblConsultaIntegrante.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblConsultaIntegrante.setBounds(285, 46, 179, 16);
		panelConsulta.add(lblConsultaIntegrante);
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setBounds(215, 103, 61, 16);
		panelConsulta.add(lblId_1);
		
		textFieldIDConsulta = new JTextField();
		textFieldIDConsulta.setBounds(409, 98, 66, 26);
		panelConsulta.add(textFieldIDConsulta);
		textFieldIDConsulta.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(215, 138, 61, 16);
		panelConsulta.add(lblNewLabel_2);
		
		JLabel lblApellido_2 = new JLabel("Apellido");
		lblApellido_2.setBounds(215, 174, 61, 16);
		panelConsulta.add(lblApellido_2);
		
		JLabel lblEdad = new JLabel("Fecha Nacimiento");
		lblEdad.setBounds(215, 215, 136, 16);
		panelConsulta.add(lblEdad);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(215, 257, 61, 16);
		panelConsulta.add(lblTipo);
		
		JLabel lblUserNameConsulta = new JLabel("New label");
		lblUserNameConsulta.setBounds(409, 136, 130, 16);
		panelConsulta.add(lblUserNameConsulta);
		
		JLabel lblUserApellidoConsulta = new JLabel("New label");
		lblUserApellidoConsulta.setBounds(409, 174, 123, 16);
		panelConsulta.add(lblUserApellidoConsulta);
		
		JLabel lblUserFechaNacConsulta = new JLabel("New label");
		lblUserFechaNacConsulta.setBounds(409, 215, 130, 16);
		panelConsulta.add(lblUserFechaNacConsulta);
		
		JLabel lblUserTypeConsulta = new JLabel("New label");
		lblUserTypeConsulta.setBounds(409, 257, 130, 16);
		panelConsulta.add(lblUserTypeConsulta);
		
		JLabel lblRellenoInfo = new JLabel("New label");
		lblRellenoInfo.setBounds(409, 297, 130, 16);
		panelConsulta.add(lblRellenoInfo);
		
		JLabel lblRelleno = new JLabel("Tipo");
		lblRelleno.setBounds(215, 297, 61, 16);
		panelConsulta.add(lblRelleno);
		
		JButton btnBuscar_1 = new JButton("Buscar");
		
		btnBuscar_1.setBounds(487, 98, 117, 29);
		panelConsulta.add(btnBuscar_1);
		
		JButton btnCancelar_2 = new JButton("Cancelar");
		
		btnCancelar_2.setBounds(120, 446, 117, 29);
		panelConsulta.add(btnCancelar_2);
		
		JPanel panelBaja = new JPanel();
		panelBaja.setBounds(0, 0, 729, 543);
		contentPane.add(panelBaja);
		panelBaja.setLayout(null);
		panelBaja.setVisible(false);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(228, 107, 61, 16);
		panelBaja.add(lblId);
		
		textFieldIDBaja = new JTextField();
		textFieldIDBaja.setBounds(389, 102, 130, 26);
		panelBaja.add(textFieldIDBaja);
		textFieldIDBaja.setColumns(10);
		
		JPanel panelInfoBaja = new JPanel();
		panelInfoBaja.setBounds(145, 232, 465, 171);
		panelBaja.add(panelInfoBaja);
		panelInfoBaja.setLayout(null);
		
		btnBuscar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblRelleno.setVisible(false);
					lblRellenoInfo.setVisible(false);
					lblUserNameConsulta.setText("");
					lblUserApellidoConsulta.setText("");
					lblUserFechaNacConsulta.setText("");
					lblRelleno.setText("");
					lblRellenoInfo.setText("");
					lblUserTypeConsulta.setText("");
					
					int id = Integer.parseInt(textFieldIDConsulta.getText());
					Integrante integrante = Controlador.getInstancia().consultarIntegrante(id);
					
					if (integrante == null)
						throw new NullPointerException("No se encuentra al integrante con ese ID");
					
					lblUserNameConsulta.setText(integrante.getNombre());
					lblUserApellidoConsulta.setText(integrante.getApellido());
					lblUserFechaNacConsulta.setText(integrante.getFechaNac().toString());
					
					//lblUserType.setText(integrante.getClass().getName());
					
					if (integrante instanceof Masajista) {
						lblUserTypeConsulta.setText("Masajista");
						lblRelleno.setVisible(false);
						lblRellenoInfo.setVisible(false);
						
					} else if (integrante instanceof Entrenador) {
						lblRelleno.setVisible(true);
						lblRellenoInfo.setVisible(true);
						lblUserTypeConsulta.setText("Entrenador");
						lblRelleno.setText("Id Federeacion");
						int idF = ((Entrenador)integrante).getIdFed();
						lblRellenoInfo.setText(Integer.toString(idF));
						
					} else {
						lblRelleno.setVisible(true);
						lblRellenoInfo.setVisible(true);
						lblUserTypeConsulta.setText("Futbolista");
						lblRelleno.setText("Dorsal");
						int dorsal = ((Futbolista)integrante).getDorsal();
						lblRellenoInfo.setText(Integer.toString(dorsal));
					}
					
					panelInfoBaja.setVisible(true);
					 
				}catch(ClassCastException ex) {
					JOptionPane.showMessageDialog(null, "Imposible transformar una letra o palabra en un numero.");
					
				}catch(NullPointerException ex2) {
					JOptionPane.showMessageDialog(null, ex2.getMessage());
				}
			}
		});
		

		
		
		

		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(89, 22, 61, 16);
		panelInfoBaja.add(lblNombre_1);
		
		JLabel lblApellido_1 = new JLabel("Apellido:");
		lblApellido_1.setBounds(89, 48, 61, 16);
		panelInfoBaja.add(lblApellido_1);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de Usuario:");
		lblTipoDeUsuario.setBounds(89, 76, 103, 16);
		panelInfoBaja.add(lblTipoDeUsuario);
		
		JLabel lblUserName = new JLabel("New label");
		lblUserName.setBounds(259, 22, 177, 16);
		panelInfoBaja.add(lblUserName);
		
		JLabel lblUserApellido = new JLabel("New label");
		lblUserApellido.setBounds(259, 48, 177, 16);
		panelInfoBaja.add(lblUserApellido);
		
		JLabel lblUserType = new JLabel("New label");
		lblUserType.setBounds(259, 76, 177, 16);
		panelInfoBaja.add(lblUserType);
		
		JButton btnEliminar = new JButton("Eliminar");
		
		btnEliminar.setBounds(248, 125, 117, 29);
		panelInfoBaja.add(btnEliminar);
		
		JButton btnBuscar = new JButton("Buscar");
		
		btnBuscar.setBounds(389, 167, 130, 29);
		panelBaja.add(btnBuscar);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		
		btnCancelar_1.setBounds(129, 465, 117, 29);
		panelBaja.add(btnCancelar_1);
		
		JLabel lblBajaDeIntegrante = new JLabel("Baja de Integrante");
		lblBajaDeIntegrante.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblBajaDeIntegrante.setBounds(286, 44, 156, 16);
		panelBaja.add(lblBajaDeIntegrante);
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(textFieldIDBaja.getText());
					Integrante integrante = Controlador.getInstancia().consultarIntegrante(id);
					
					if (integrante == null)
						throw new NullPointerException("No se encuentra al integrante con ese ID");
					
					lblUserName.setText(integrante.getNombre());
					lblUserApellido.setText(integrante.getApellido());
					
					//lblUserType.setText(integrante.getClass().getName());
					
					if (integrante instanceof Masajista) {
						lblUserType.setText("Masajista");
					} else if (integrante instanceof Entrenador) {
						lblUserType.setText("Entrenador");
					} else {
						lblUserType.setText("Futbolista");
					}
					
					panelInfoBaja.setVisible(true);
					 
				}catch(ClassCastException ex) {
					JOptionPane.showMessageDialog(null, "Imposible transformar una letra o palabra en un numero.");
					
				}catch(NullPointerException ex2) {
					JOptionPane.showMessageDialog(null, ex2.getMessage());
				}
			}
		});
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textFieldIDBaja.getText());
				
				Controlador.getInstancia().darDeBajaIntegrante(id);
				
				JOptionPane.showMessageDialog(null, "Dado de baja!");
			}
		});
		
		
		
		JPanel panelInicio = new JPanel();
		panelInicio.setBounds(0, 0, 729, 543);
		contentPane.add(panelInicio);
		panelInicio.setLayout(null);
		
		JButton btnAltaIntegrante = new JButton("Alta Integrante");
		
		btnAltaIntegrante.setBounds(273, 91, 168, 29);
		panelInicio.add(btnAltaIntegrante);
		
		JButton btnBajaIntegrante = new JButton("Baja Integrante");
		
		btnBajaIntegrante.setBounds(273, 151, 168, 29);
		panelInicio.add(btnBajaIntegrante);
		
		JButton btnConsultaIntegrante = new JButton("Consulta Integrante");
		
		btnConsultaIntegrante.setBounds(273, 212, 168, 29);
		panelInicio.add(btnConsultaIntegrante);
		
		
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setBounds(0, 0, 729, 543);
		contentPane.add(panelFormulario);
		panelFormulario.setLayout(null);
		panelFormulario.setVisible(false);
		
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
		
		btnCancelar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConsulta.setVisible(false);
				panelInicio.setVisible(true);
			}
		});
		
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
		
		btnCancelar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInfoBaja.setVisible(false);
				panelBaja.setVisible(false);
				textFieldIDBaja.setText("");
				panelInicio.setVisible(true);
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
						c.crearMasajista(textField.getText(), textField_1.getText(), LocalDate.of(anio, mes, dia), null);
						
					}else if (chckbxEntrenador.isSelected()) {
						int idFed = Integer.parseInt(textField_6.getText());
						
						c.crearEntrenador(textField.getText(), textField_1.getText(), LocalDate.of(anio, mes, dia), idFed);
						
					}else if(chckbxFutbolista.isSelected()){
						int dorsal = Integer.parseInt(textField_5.getText());
						c.crearFutbolista(textField.getText(), textField_1.getText(), LocalDate.of(anio, mes, dia), dorsal);
					} else {
						throw new Exception("Se esperaba el check en algun lugar");
					}
					
					c.imprimir(); 
					
					limpiarPantallaAgregarIntegrante();
					chckbxEntrenador.setSelected(false);
					chckbxMasajista.setSelected(false);
					chckbxFutbolista.setSelected(false);
					
					JOptionPane.showMessageDialog(null, "Se creo el usuario de ID: " + Controlador.getInstancia().getLastId());
					
					
				} catch (ClassCastException ex) {
					JOptionPane.showMessageDialog(null, "Imposible transformar una letra o palabra en un numero.");
					//ex.printStackTrace();
					
				} catch (Exception ex1) { 
					JOptionPane.showMessageDialog(null, ex1.getMessage());
				}
				
				
			}
		});
		
		btnBajaIntegrante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBaja.setVisible(true);
				panelInfoBaja.setVisible(false);
				panelInicio.setVisible(false);
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarPantallaAgregarIntegrante();
				chckbxEntrenador.setSelected(false);
				chckbxMasajista.setSelected(false);
				chckbxFutbolista.setSelected(false);
				panelFormulario.setVisible(false);
				panelInicio.setVisible(true);
			}
		});
		
		btnAltaIntegrante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelFormulario.setVisible(true);
				panelInicio.setVisible(false);
				
			}
		});
		
		
		
		btnConsultaIntegrante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConsulta.setVisible(true);
				panelInicio.setVisible(false);
			}
		});
		
		
		
	}
}