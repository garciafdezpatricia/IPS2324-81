package gui;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Color;

public class WorkPeriodView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFirstDay;
	private JLabel lblFirstDay;
	private JLabel lblLastDay;
	private JTextField txtLastDay;
	private JLabel lblMonday;
	private JTextField txtMondayStart;
	private JLabel lblTuesday;
	private JTextField txtTuesdayStart;
	private JLabel lblWednesday;
	private JTextField txtWednesdayStart;
	private JLabel lblThursday;
	private JLabel lblFriday;
	private JLabel lblSaturday;
	private JLabel lblSunday;
	private JTextField txtThursdayStart;
	private JTextField txtFridayStart;
	private JTextField txtSaturdayStart;
	private JTextField txtSundayStart;
	private JTextField txtMondayFinish;
	private JTextField txtTuesdayFinish;
	private JTextField txtWednesdayFinish;
	private JTextField txtThursdayFinish;
	private JTextField txtFridayFinish;
	private JTextField txtSaturdayFinish;
	private JTextField txtSundayFinish;
	private JLabel lblClockinTime;
	private JLabel lblClockoutTime;
	private JLabel lblIntroduceTheWork;
	private JButton btnCancel;
	private JButton btnFinish;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkPeriodView frame = new WorkPeriodView();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WorkPeriodView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 652);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtFirstDay());
		contentPane.add(getLblFirstDay());
		contentPane.add(getLblLastDay());
		contentPane.add(getTxtLastDay());
		contentPane.add(getLblMonday());
		contentPane.add(getTxtMondayStart());
		contentPane.add(getLblTuesday());
		contentPane.add(getTxtTuesdayStart());
		contentPane.add(getLblWednesday());
		contentPane.add(getTxtWednesdayStart());
		contentPane.add(getLblThursday());
		contentPane.add(getLblFriday());
		contentPane.add(getLblSaturday());
		contentPane.add(getLblSunday());
		contentPane.add(getTxtThursdayStart());
		contentPane.add(getTxtFridayStart());
		contentPane.add(getTxtSaturdayStart());
		contentPane.add(getTxtSundayStart());
		contentPane.add(getTxtMondayFinish());
		contentPane.add(getTxtTuesdayFinish());
		contentPane.add(getTxtWednesdayFinish());
		contentPane.add(getTxtThursdayFinish());
		contentPane.add(getTxtFridayFinish());
		contentPane.add(getTxtSaturdayFinish());
		contentPane.add(getTxtSundayFinish());
		contentPane.add(getLblClockinTime());
		contentPane.add(getLblClockoutTime());
		contentPane.add(getLblIntroduceTheWork());
		contentPane.add(getBtnCancel());
		contentPane.add(getBtnFinish());
	}
	private JTextField getTxtFirstDay() {
		if (txtFirstDay == null) {
			txtFirstDay = new JTextField();
			txtFirstDay.setBounds(291, 57, 181, 25);
			txtFirstDay.setColumns(10);
		}
		return txtFirstDay;
	}
	private JLabel getLblFirstDay() {
		if (lblFirstDay == null) {
			lblFirstDay = new JLabel("First day of the work period:");
			lblFirstDay.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblFirstDay.setBounds(39, 57, 196, 25);
		}
		return lblFirstDay;
	}
	private JLabel getLblLastDay() {
		if (lblLastDay == null) {
			lblLastDay = new JLabel("Last day of the work period:");
			lblLastDay.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblLastDay.setBounds(39, 110, 196, 25);
		}
		return lblLastDay;
	}
	private JTextField getTxtLastDay() {
		if (txtLastDay == null) {
			txtLastDay = new JTextField();
			txtLastDay.setColumns(10);
			txtLastDay.setBounds(291, 110, 181, 25);
		}
		return txtLastDay;
	}
	private JLabel getLblMonday() {
		if (lblMonday == null) {
			lblMonday = new JLabel("Monday:");
			lblMonday.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblMonday.setBounds(39, 206, 79, 25);
		}
		return lblMonday;
	}
	private JTextField getTxtMondayStart() {
		if (txtMondayStart == null) {
			txtMondayStart = new JTextField();
			txtMondayStart.setColumns(10);
			txtMondayStart.setBounds(216, 208, 181, 25);
		}
		return txtMondayStart;
	}
	private JLabel getLblTuesday() {
		if (lblTuesday == null) {
			lblTuesday = new JLabel("Tuesday:");
			lblTuesday.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTuesday.setBounds(39, 254, 79, 25);
		}
		return lblTuesday;
	}
	private JTextField getTxtTuesdayStart() {
		if (txtTuesdayStart == null) {
			txtTuesdayStart = new JTextField();
			txtTuesdayStart.setColumns(10);
			txtTuesdayStart.setBounds(216, 256, 181, 25);
		}
		return txtTuesdayStart;
	}
	private JLabel getLblWednesday() {
		if (lblWednesday == null) {
			lblWednesday = new JLabel("Wednesday:");
			lblWednesday.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblWednesday.setBounds(39, 302, 108, 25);
		}
		return lblWednesday;
	}
	private JTextField getTxtWednesdayStart() {
		if (txtWednesdayStart == null) {
			txtWednesdayStart = new JTextField();
			txtWednesdayStart.setColumns(10);
			txtWednesdayStart.setBounds(216, 304, 181, 25);
		}
		return txtWednesdayStart;
	}
	private JLabel getLblThursday() {
		if (lblThursday == null) {
			lblThursday = new JLabel("Thursday:");
			lblThursday.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblThursday.setBounds(39, 350, 108, 25);
		}
		return lblThursday;
	}
	private JLabel getLblFriday() {
		if (lblFriday == null) {
			lblFriday = new JLabel("Friday:");
			lblFriday.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblFriday.setBounds(39, 398, 108, 25);
		}
		return lblFriday;
	}
	private JLabel getLblSaturday() {
		if (lblSaturday == null) {
			lblSaturday = new JLabel("Saturday:");
			lblSaturday.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSaturday.setBounds(39, 446, 108, 25);
		}
		return lblSaturday;
	}
	private JLabel getLblSunday() {
		if (lblSunday == null) {
			lblSunday = new JLabel("Sunday:");
			lblSunday.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSunday.setBounds(39, 494, 108, 25);
		}
		return lblSunday;
	}
	private JTextField getTxtThursdayStart() {
		if (txtThursdayStart == null) {
			txtThursdayStart = new JTextField();
			txtThursdayStart.setColumns(10);
			txtThursdayStart.setBounds(216, 352, 181, 25);
		}
		return txtThursdayStart;
	}
	private JTextField getTxtFridayStart() {
		if (txtFridayStart == null) {
			txtFridayStart = new JTextField();
			txtFridayStart.setColumns(10);
			txtFridayStart.setBounds(216, 400, 181, 25);
		}
		return txtFridayStart;
	}
	private JTextField getTxtSaturdayStart() {
		if (txtSaturdayStart == null) {
			txtSaturdayStart = new JTextField();
			txtSaturdayStart.setColumns(10);
			txtSaturdayStart.setBounds(216, 448, 181, 25);
		}
		return txtSaturdayStart;
	}
	private JTextField getTxtSundayStart() {
		if (txtSundayStart == null) {
			txtSundayStart = new JTextField();
			txtSundayStart.setColumns(10);
			txtSundayStart.setBounds(216, 496, 181, 25);
		}
		return txtSundayStart;
	}
	private JTextField getTxtMondayFinish() {
		if (txtMondayFinish == null) {
			txtMondayFinish = new JTextField();
			txtMondayFinish.setColumns(10);
			txtMondayFinish.setBounds(445, 208, 181, 25);
		}
		return txtMondayFinish;
	}
	private JTextField getTxtTuesdayFinish() {
		if (txtTuesdayFinish == null) {
			txtTuesdayFinish = new JTextField();
			txtTuesdayFinish.setColumns(10);
			txtTuesdayFinish.setBounds(445, 256, 181, 25);
		}
		return txtTuesdayFinish;
	}
	private JTextField getTxtWednesdayFinish() {
		if (txtWednesdayFinish == null) {
			txtWednesdayFinish = new JTextField();
			txtWednesdayFinish.setColumns(10);
			txtWednesdayFinish.setBounds(445, 304, 181, 25);
		}
		return txtWednesdayFinish;
	}
	private JTextField getTxtThursdayFinish() {
		if (txtThursdayFinish == null) {
			txtThursdayFinish = new JTextField();
			txtThursdayFinish.setColumns(10);
			txtThursdayFinish.setBounds(445, 352, 181, 25);
		}
		return txtThursdayFinish;
	}
	private JTextField getTxtFridayFinish() {
		if (txtFridayFinish == null) {
			txtFridayFinish = new JTextField();
			txtFridayFinish.setColumns(10);
			txtFridayFinish.setBounds(445, 400, 181, 25);
		}
		return txtFridayFinish;
	}
	private JTextField getTxtSaturdayFinish() {
		if (txtSaturdayFinish == null) {
			txtSaturdayFinish = new JTextField();
			txtSaturdayFinish.setColumns(10);
			txtSaturdayFinish.setBounds(445, 448, 181, 25);
		}
		return txtSaturdayFinish;
	}
	private JTextField getTxtSundayFinish() {
		if (txtSundayFinish == null) {
			txtSundayFinish = new JTextField();
			txtSundayFinish.setColumns(10);
			txtSundayFinish.setBounds(445, 496, 181, 25);
		}
		return txtSundayFinish;
	}
	private JLabel getLblClockinTime() {
		if (lblClockinTime == null) {
			lblClockinTime = new JLabel("Clock-in time");
			lblClockinTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblClockinTime.setBounds(258, 173, 86, 25);
		}
		return lblClockinTime;
	}
	private JLabel getLblClockoutTime() {
		if (lblClockoutTime == null) {
			lblClockoutTime = new JLabel("Clock-out time");
			lblClockoutTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblClockoutTime.setBounds(484, 173, 95, 25);
		}
		return lblClockoutTime;
	}
	private JLabel getLblIntroduceTheWork() {
		if (lblIntroduceTheWork == null) {
			lblIntroduceTheWork = new JLabel("Introduce the work period time and the hours of work");
			lblIntroduceTheWork.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblIntroduceTheWork.setBounds(107, 10, 489, 25);
		}
		return lblIntroduceTheWork;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");
			btnCancel.setForeground(Color.RED);
			btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnCancel.setBounds(445, 556, 95, 34);
		}
		return btnCancel;
	}
	private JButton getBtnFinish() {
		if (btnFinish == null) {
			btnFinish = new JButton("Finish");
			btnFinish.setForeground(Color.GREEN);
			btnFinish.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnFinish.setBounds(567, 556, 95, 34);
		}
		return btnFinish;
	}
}
