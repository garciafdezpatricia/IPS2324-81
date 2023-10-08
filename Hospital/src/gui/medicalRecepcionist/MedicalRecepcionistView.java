package gui.medicalRecepcionist;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger.Level;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class MedicalRecepcionistView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_title;
	private JPanel panelGeneral;
	private JLabel lblTitle;
	private JPanel panel_doctor;
	private JPanel panel_patient;
	private JPanel panel_office;
	private JPanel panel_information;
	private JPanel panel_buttons;
	private JButton btnFinish;
	private JPanel panel_doctor_filter;
	private JRadioButton rdbtnUrgent;
	private JPanel panel_patient_filter;
	private JLabel lblIPatientNam;
	private JTextField textFieldNamePatient;
	private JScrollPane scrollPane_patients;
	private JList list_patients;
	private JScrollPane scrollPaneDoctor;
	private JList listDoctor;
	private JLabel lblSSNumber;
	private JTextField textFieldSSNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicalRecepcionistView frame = new MedicalRecepcionistView();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null); // centrar pantalla
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static final String url = "jdbc:oracle:thin:@";
	public static final String usuario = "Admin";
	public static final String contraseña = "LyQmZ7HwG4edJ2";
	private JPanel panelNameAndNumber;
	private JLabel lblTypeDoctor;
	private JTextField textField_3;
	private JLabel lblRegistrationNumber;
	private JTextField textField_4;
	private JPanel panelDate;
	private JLabel lblDay;
	private JTextField textField;
	private JLabel lblFrom;
	private JTextField textField_1;
	private JLabel lblTo;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public MedicalRecepcionistView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel_title(), BorderLayout.NORTH);
		contentPane.add(getPanelGeneral(), BorderLayout.CENTER);
		contentPane.add(getPanel_buttons(), BorderLayout.SOUTH);
	}

	private JPanel getPanel_title() {
		if (panel_title == null) {
			panel_title = new JPanel();
			panel_title.add(getLblTitle());
		}
		return panel_title;
	}

	private JPanel getPanelGeneral() {
		if (panelGeneral == null) {
			panelGeneral = new JPanel();
			panelGeneral.setLayout(new GridLayout(2, 2, 0, 0));
			panelGeneral.add(getPanel_doctor());
			panelGeneral.add(getPanel_patient());
			panelGeneral.add(getPanel_office());
			panelGeneral.add(getPanel_information());
		}
		return panelGeneral;
	}

	private JLabel getLblTitle() {
		if (lblTitle == null) {
			lblTitle = new JLabel("Reservation of appointments");
			lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblTitle;
	}

	private JPanel getPanel_doctor() {
		if (panel_doctor == null) {
			panel_doctor = new JPanel();
			panel_doctor
					.setBorder(new TitledBorder(null, "Doctor ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_doctor.setLayout(new BorderLayout(0, 0));
			panel_doctor.add(getPanel_5(), BorderLayout.NORTH);
			panel_doctor.add(getRdbtnUrgent(), BorderLayout.SOUTH);
			panel_doctor.add(getScrollPaneDoctor(), BorderLayout.CENTER);
		}
		return panel_doctor;
	}

	private JPanel getPanel_patient() {
		if (panel_patient == null) {
			panel_patient = new JPanel();
			panel_patient.setBorder(
					new TitledBorder(null, "Patient Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_patient.setLayout(new BorderLayout(0, 0));
			panel_patient.add(getPanel_patient_filter(), BorderLayout.NORTH);
			panel_patient.add(getScrollPane_patients(), BorderLayout.CENTER);
		}
		return panel_patient;
	}

	private JPanel getPanel_office() {
		if (panel_office == null) {
			panel_office = new JPanel();
		}
		return panel_office;
	}

	private JPanel getPanel_information() {
		if (panel_information == null) {
			panel_information = new JPanel();
			panel_information.setBorder(
					new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_information.setLayout(new BorderLayout(0, 0));
		}
		return panel_information;
	}

	private JPanel getPanel_buttons() {
		if (panel_buttons == null) {
			panel_buttons = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel_buttons.getLayout();
			flowLayout.setAlignment(FlowLayout.TRAILING);
			panel_buttons.add(getBtnFinish());
		}
		return panel_buttons;
	}

	private JButton getBtnFinish() {
		if (btnFinish == null) {
			btnFinish = new JButton("Finish");
			btnFinish.addActionListener(new ActionListener() {

				// TODO: si hay mas citas resrrvadas a esa hora para ese doctor poner un aviso
				@Override
				public void actionPerformed(ActionEvent e) {
					int opcion = JOptionPane.showConfirmDialog(MedicalRecepcionistView.this,
							"Are you sure you want to reserve the appointment between the doctor(s) "
									+ "xxxx and the patient xxxx on mm/dd/yy at hh/mm in the office xxxx?",
							"Confirmation", JOptionPane.YES_NO_OPTION);

					// Verificar la respuesta del usuario
					if (opcion == JOptionPane.YES_OPTION) {
						// El usuario ha confirmado, realiza la acción
						// Puedes poner aquí el código que quieras ejecutar después de la confirmación
						System.out.println("Acción realizada.");
						// TODO: se envia un correo
						if (rdbtnUrgent.isSelected()) {
							sendEmail();
						}
					} else {
						// El usuario ha cancelado la acción
						System.out.println("Acción cancelada.");
					}

				}
			});
		}
		return btnFinish;
	}


	private void sendEmail() {
		String destinatario = "lauratbg2001@gmail.com";
        String asunto = "Urgent appointment";
        String mensaje = "You have a new urgent appointment!";

        // Configurar propiedades para la conexión SMTP
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");

        // Crear una sesión de correo electrónico
        Session sesion = Session.getInstance(propiedades, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("ips232481@gmail.com", "tojp oyjw kamn xxmy");
            }
        });

        try {
            // Crear un mensaje de correo electrónico
            MimeMessage mensajeCorreo = new MimeMessage(sesion);
            mensajeCorreo.setFrom(new InternetAddress("tu-correo@gmail.com"));
            mensajeCorreo.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mensajeCorreo.setSubject(asunto);
            mensajeCorreo.setText(mensaje);

            // Enviar el correo electrónico
            Transport.send(mensajeCorreo);
            System.out.println("Correo enviado con éxito.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}

	private JPanel getPanel_5() {
		if (panel_doctor_filter == null) {
			panel_doctor_filter = new JPanel();
			panel_doctor_filter.setLayout(new BorderLayout(0, 0));
			panel_doctor_filter.add(getPanelNameAndNumber());
			panel_doctor_filter.add(getPanelDate(), BorderLayout.NORTH);
		}
		return panel_doctor_filter;
	}

	private JRadioButton getRdbtnUrgent() {
		if (rdbtnUrgent == null) {
			rdbtnUrgent = new JRadioButton("Urgent");
		}
		return rdbtnUrgent;
	}

	private JPanel getPanel_patient_filter() {
		if (panel_patient_filter == null) {
			panel_patient_filter = new JPanel();
			panel_patient_filter.setLayout(new GridLayout(0, 2, 0, 0));
			panel_patient_filter.add(getLblIPatientNam());
			panel_patient_filter.add(getTextFieldNamePatient());
			panel_patient_filter.add(getLblSSNumber());
			panel_patient_filter.add(getTextFieldSSNumber());
		}
		return panel_patient_filter;
	}

	private JLabel getLblIPatientNam() {
		if (lblIPatientNam == null) {
			lblIPatientNam = new JLabel("Filter by name:");
			lblIPatientNam.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblIPatientNam;
	}

	private JTextField getTextFieldNamePatient() {
		if (textFieldNamePatient == null) {
			textFieldNamePatient = new JTextField();
			textFieldNamePatient.setColumns(10);
		}
		return textFieldNamePatient;
	}

	private JScrollPane getScrollPane_patients() {
		if (scrollPane_patients == null) {
			scrollPane_patients = new JScrollPane();
			scrollPane_patients.setViewportView(getList_patients());
		}
		return scrollPane_patients;
	}

	private JList getList_patients() {
		if (list_patients == null) {
			list_patients = new JList();
			list_patients.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		return list_patients;
	}

	private JScrollPane getScrollPaneDoctor() {
		if (scrollPaneDoctor == null) {
			scrollPaneDoctor = new JScrollPane();
			scrollPaneDoctor.setViewportView(getListDoctor());
		}
		return scrollPaneDoctor;
	}

	private JList getListDoctor() {
		if (listDoctor == null) {
			listDoctor = new JList();
		}
		return listDoctor;
	}

	private JLabel getLblSSNumber() {
		if (lblSSNumber == null) {
			lblSSNumber = new JLabel("Filter by social security number:");
			lblSSNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblSSNumber;
	}

	private JTextField getTextFieldSSNumber() {
		if (textFieldSSNumber == null) {
			textFieldSSNumber = new JTextField();
			textFieldSSNumber.setColumns(10);
		}
		return textFieldSSNumber;
	}

	private JPanel getPanelNameAndNumber() {
		if (panelNameAndNumber == null) {
			panelNameAndNumber = new JPanel();
			panelNameAndNumber
					.setBorder(new TitledBorder(null, "Filters", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelNameAndNumber.setLayout(new GridLayout(0, 2, 0, 0));
			panelNameAndNumber.add(getLblTypeDoctor_1());
			panelNameAndNumber.add(getTextField_3());
			panelNameAndNumber.add(getLblRegistrationNumber_1());
			panelNameAndNumber.add(getTextField_4());
		}
		return panelNameAndNumber;
	}

	private JLabel getLblTypeDoctor_1() {
		if (lblTypeDoctor == null) {
			lblTypeDoctor = new JLabel("Filter by name:");
			lblTypeDoctor.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblTypeDoctor;
	}

	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
		}
		return textField_3;
	}

	private JLabel getLblRegistrationNumber_1() {
		if (lblRegistrationNumber == null) {
			lblRegistrationNumber = new JLabel("Filter by doctor's registration number:");
			lblRegistrationNumber.setFont(new Font("Tahoma", Font.BOLD, 10));
		}
		return lblRegistrationNumber;
	}

	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
		}
		return textField_4;
	}

	private JPanel getPanelDate() {
		if (panelDate == null) {
			panelDate = new JPanel();
			panelDate.setBorder(
					new TitledBorder(null, "Day and hour", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelDate.setLayout(new GridLayout(0, 6, 0, 0));
			panelDate.add(getLblDay());
			panelDate.add(getTextField());
			panelDate.add(getLblFrom());
			panelDate.add(getTextField_1());
			panelDate.add(getLblTo());
			panelDate.add(getTextField_2());
		}
		return panelDate;
	}

	private JLabel getLblDay() {
		if (lblDay == null) {
			lblDay = new JLabel("Day:");
			lblDay.setFont(new Font("Tahoma", Font.BOLD, 10));
		}
		return lblDay;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setText("mm/dd/yy");
			textField.setColumns(10);
		}
		return textField;
	}

	private JLabel getLblFrom() {
		if (lblFrom == null) {
			lblFrom = new JLabel("From:");
			lblFrom.setFont(new Font("Tahoma", Font.BOLD, 10));
		}
		return lblFrom;
	}

	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setText("hh:mm");
			textField_1.setColumns(10);
		}
		return textField_1;
	}

	private JLabel getLblTo() {
		if (lblTo == null) {
			lblTo = new JLabel("To:");
			lblTo.setFont(new Font("Tahoma", Font.BOLD, 10));
		}
		return lblTo;
	}

	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setText("hh:mm");
			textField_2.setColumns(10);
		}
		return textField_2;
	}
}
