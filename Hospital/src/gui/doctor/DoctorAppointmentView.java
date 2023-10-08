package gui.doctor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class DoctorAppointmentView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel appointmentInfoPanel;
	private JLabel lblAppointmentPatient;
	private JLabel lblAppointmentDate;
	private JPanel appointmentOptionsPanel;
	private JLabel lblCheckInTime;
	private JTextField txtCheckInTime;
	private JLabel lblCheckOutTime;
	private JTextField txtCheckOutTime;
	private JButton btnCheckInTime;
	private JButton btnCheckOutTime;
	private JPanel buttonsPanel;
	private JButton btnExit;
	private JButton btnSave;
	private JLabel lblAttendance;
	private JRadioButton rdbtnYes;
	private JRadioButton rdbtnNo;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorAppointmentView frame = new DoctorAppointmentView();
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
	public DoctorAppointmentView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getAppointmentInfoPanel(), BorderLayout.NORTH);
		contentPane.add(getAppointmentOptionsPanel(), BorderLayout.CENTER);
		contentPane.add(getButtonsPanel(), BorderLayout.SOUTH);
	}

	private JPanel getAppointmentInfoPanel() {
		if (appointmentInfoPanel == null) {
			appointmentInfoPanel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) appointmentInfoPanel.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			flowLayout.setHgap(25);
			appointmentInfoPanel.add(getLblAppointmentPatient());
			appointmentInfoPanel.add(getLblAppointmentDate());
		}
		return appointmentInfoPanel;
	}
	private JLabel getLblAppointmentPatient() {
		if (lblAppointmentPatient == null) {
			lblAppointmentPatient = new JLabel("New label");
			lblAppointmentPatient.setText("MARGARITA RAMOS ARIAS");
		}
		return lblAppointmentPatient;
	}
	private JLabel getLblAppointmentDate() {
		if (lblAppointmentDate == null) {
			lblAppointmentDate = new JLabel("New label");
			lblAppointmentDate.setText("12/10/2024 10.15");
		}
		return lblAppointmentDate;
	}
	private JPanel getAppointmentOptionsPanel() {
		if (appointmentOptionsPanel == null) {
			appointmentOptionsPanel = new JPanel();
			appointmentOptionsPanel.setLayout(null);
			appointmentOptionsPanel.add(getLblCheckInTime());
			appointmentOptionsPanel.add(getTxtCheckInTime());
			appointmentOptionsPanel.add(getLblCheckOutTime());
			appointmentOptionsPanel.add(getTxtCheckOutTime());
			appointmentOptionsPanel.add(getBtnCheckInTime());
			appointmentOptionsPanel.add(getBtnCheckOutTime());
			appointmentOptionsPanel.add(getLblAttendance());
			appointmentOptionsPanel.add(getRdbtnYes());
			appointmentOptionsPanel.add(getRdbtnNo());
		}
		return appointmentOptionsPanel;
	}
	private JLabel getLblCheckInTime() {
		if (lblCheckInTime == null) {
			lblCheckInTime = new JLabel("Check-in:");
			lblCheckInTime.setBounds(24, 72, 59, 25);
		}
		return lblCheckInTime;
	}
	private JTextField getTxtCheckInTime() {
		if (txtCheckInTime == null) {
			txtCheckInTime = new JTextField();
			txtCheckInTime.setBounds(81, 74, 60, 20);
			txtCheckInTime.setColumns(10);
		}
		return txtCheckInTime;
	}
	private JLabel getLblCheckOutTime() {
		if (lblCheckOutTime == null) {
			lblCheckOutTime = new JLabel("Check-out:");
			lblCheckOutTime.setBounds(319, 77, 96, 14);
		}
		return lblCheckOutTime;
	}
	private JTextField getTxtCheckOutTime() {
		if (txtCheckOutTime == null) {
			txtCheckOutTime = new JTextField();
			txtCheckOutTime.setBounds(395, 74, 62, 20);
			txtCheckOutTime.setColumns(10);
		}
		return txtCheckOutTime;
	}
	private JButton getBtnCheckInTime() {
		if (btnCheckInTime == null) {
			btnCheckInTime = new JButton("Auto-fill");
			btnCheckInTime.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Date currentDate = new Date();
					SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
                    String currentTime = dateFormat.format(currentDate);
                    // Update the text field with the current time
                    getTxtCheckInTime().setText(currentTime);
				}
			});
			btnCheckInTime.setBounds(151, 73, 89, 23);
		}
		return btnCheckInTime;
	}
	private JButton getBtnCheckOutTime() {
		if (btnCheckOutTime == null) {
			btnCheckOutTime = new JButton("Auto-fill");
			btnCheckOutTime.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Date currentDate = new Date();
					SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
                    String currentTime = dateFormat.format(currentDate);
                    // Update the text field with the current time
                    getTxtCheckOutTime().setText(currentTime);
				}
			});
			btnCheckOutTime.setBounds(467, 73, 89, 23);
		}
		return btnCheckOutTime;
	}
	private JPanel getButtonsPanel() {
		if (buttonsPanel == null) {
			buttonsPanel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) buttonsPanel.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			buttonsPanel.add(getBtnExit());
			buttonsPanel.add(getBtnSave());
		}
		return buttonsPanel;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
		}
		return btnExit;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
		}
		return btnSave;
	}
	private JLabel getLblAttendance() {
		if (lblAttendance == null) {
			lblAttendance = new JLabel("Did the patient attend the appointment?");
			lblAttendance.setBounds(24, 11, 252, 35);
		}
		return lblAttendance;
	}
	private JRadioButton getRdbtnYes() {
		if (rdbtnYes == null) {
			rdbtnYes = new JRadioButton("Yes");
			rdbtnYes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                    getTxtCheckInTime().setEnabled(true);
                    getTxtCheckOutTime().setEnabled(true);
                    getBtnCheckOutTime().setEnabled(true);
                    getBtnCheckInTime().setEnabled(true);
				}
			});
			
			buttonGroup.add(rdbtnYes);
			rdbtnYes.setBounds(303, 18, 59, 23);
		}
		return rdbtnYes;
	}
	private JRadioButton getRdbtnNo() {
		if (rdbtnNo == null) {
			rdbtnNo = new JRadioButton("No");
			rdbtnNo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getTxtCheckInTime().setEnabled(false);
                	getTxtCheckOutTime().setEnabled(false);
                    getBtnCheckOutTime().setEnabled(false);
                    getBtnCheckInTime().setEnabled(false);
				}
			});
			
			
			buttonGroup.add(rdbtnNo);
			rdbtnNo.setBounds(372, 18, 59, 23);
		}
		return rdbtnNo;
	}
}
