package gui.medicalRecepcionist;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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
	private JPanel panel_1;
	private JLabel lblTitle;
	private JPanel panel_doctor;
	private JPanel panel_patient;
	private JPanel panel_3;
	private JPanel panel_information;
	private JPanel panel_buttons;
	private JButton btnFinish;
	private JPanel panel_doctor_filter;
	private JLabel lblTypeDoctor;
	private JTextField textFieldName;
	private JRadioButton rdbtnUrgent;
	private JPanel panel_patient_filter;
	private JLabel lblIPatientNam;
	private JTextField textFieldNamePatient;
	private JScrollPane scrollPane_patients;
	private JList list_patients;
	private JLabel lblRegistrationNumber;
	private JTextField textFieldRegistrationNumber;
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
					frame.setLocationRelativeTo(null); //centrar pantalla
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static final String url = "jdbc:oracle:thin:@";
	public static final String usuario = "Admin";
	public static final String contraseña = "LyQmZ7HwG4edJ2";

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
		contentPane.add(getPanel_1(), BorderLayout.CENTER);
		contentPane.add(getPanel_buttons(), BorderLayout.SOUTH);
	}
	private JPanel getPanel_title() {
		if (panel_title == null) {
			panel_title = new JPanel();
			panel_title.add(getLblTitle());
		}
		return panel_title;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new GridLayout(2, 2, 0, 0));
			panel_1.add(getPanel_doctor());
			panel_1.add(getPanel_patient());
			panel_1.add(getPanel_3());
			panel_1.add(getPanel_information());
		}
		return panel_1;
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
			panel_doctor.setBorder(new TitledBorder(null, "Doctor ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
			panel_patient.setBorder(new TitledBorder(null, "Patient Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_patient.setLayout(new BorderLayout(0, 0));
			panel_patient.add(getPanel_patient_filter(), BorderLayout.NORTH);
			panel_patient.add(getScrollPane_patients(), BorderLayout.CENTER);
		}
		return panel_patient;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
		}
		return panel_3;
	}
	private JPanel getPanel_information() {
		if (panel_information == null) {
			panel_information = new JPanel();
			panel_information.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		}
		return btnFinish;
	}
	private JPanel getPanel_5() {
		if (panel_doctor_filter == null) {
			panel_doctor_filter = new JPanel();
			panel_doctor_filter.setLayout(new GridLayout(0, 2, 0, 0));
			panel_doctor_filter.add(getLblTypeDoctor());
			panel_doctor_filter.add(getTextFieldName());
			panel_doctor_filter.add(getLblRegistrationNumber());
			panel_doctor_filter.add(getTextFieldRegistrationNumber());
		}
		return panel_doctor_filter;
	}
	private JLabel getLblTypeDoctor() {
		if (lblTypeDoctor == null) {
			lblTypeDoctor = new JLabel("Filter by name:");
			lblTypeDoctor.setFont(new Font("Tahoma", Font.BOLD, 12));
		}
		return lblTypeDoctor;
	}
	private JTextField getTextFieldName() {
		if (textFieldName == null) {
			textFieldName = new JTextField();
			textFieldName.setColumns(10);
		}
		return textFieldName;
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
	private JLabel getLblRegistrationNumber() {
		if (lblRegistrationNumber == null) {
			lblRegistrationNumber = new JLabel("Filter by doctor's registration number");
			lblRegistrationNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return lblRegistrationNumber;
	}
	private JTextField getTextFieldRegistrationNumber() {
		if (textFieldRegistrationNumber == null) {
			textFieldRegistrationNumber = new JTextField();
			textFieldRegistrationNumber.setColumns(10);
		}
		return textFieldRegistrationNumber;
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
			lblSSNumber = new JLabel("Filter by social security number");
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
}
