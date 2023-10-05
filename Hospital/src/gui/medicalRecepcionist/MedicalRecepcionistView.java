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
	private JPanel panel_4;
	private JPanel panel_buttons;
	private JButton btnFinish;
	private JPanel panel_doctor_name;
	private JLabel lblTypeDoctor;
	private JTextField textField;
	private JRadioButton rdbtnUrgent;
	private JPanel panel_patient_id;
	private JLabel lblID_patient;
	private JTextField textField_id;
	private JScrollPane scrollPane_patients;
	private JList list_patients;

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
			panel_1.add(getPanel_4());
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
		}
		return panel_doctor;
	}
	private JPanel getPanel_patient() {
		if (panel_patient == null) {
			panel_patient = new JPanel();
			panel_patient.setBorder(new TitledBorder(null, "Patient Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_patient.setLayout(new BorderLayout(0, 0));
			panel_patient.add(getPanel_patient_id(), BorderLayout.NORTH);
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
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
		}
		return panel_4;
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
		if (panel_doctor_name == null) {
			panel_doctor_name = new JPanel();
			panel_doctor_name.setLayout(new GridLayout(0, 2, 0, 0));
			panel_doctor_name.add(getLblTypeDoctor());
			panel_doctor_name.add(getTextField());
		}
		return panel_doctor_name;
	}
	private JLabel getLblTypeDoctor() {
		if (lblTypeDoctor == null) {
			lblTypeDoctor = new JLabel("Type the doctor`s name:");
			lblTypeDoctor.setFont(new Font("Arial", Font.BOLD, 12));
		}
		return lblTypeDoctor;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JRadioButton getRdbtnUrgent() {
		if (rdbtnUrgent == null) {
			rdbtnUrgent = new JRadioButton("Urgent");
		}
		return rdbtnUrgent;
	}
	private JPanel getPanel_patient_id() {
		if (panel_patient_id == null) {
			panel_patient_id = new JPanel();
			panel_patient_id.setLayout(new GridLayout(1, 2, 0, 0));
			panel_patient_id.add(getLblID_patient());
			panel_patient_id.add(getTextField_id());
		}
		return panel_patient_id;
	}
	private JLabel getLblID_patient() {
		if (lblID_patient == null) {
			lblID_patient = new JLabel("ID:");
		}
		return lblID_patient;
	}
	private JTextField getTextField_id() {
		if (textField_id == null) {
			textField_id = new JTextField();
			textField_id.setColumns(10);
		}
		return textField_id;
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
}
