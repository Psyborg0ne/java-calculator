package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalcFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8210377051756531920L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CalcFrame frame = new CalcFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JPanel contentPane;
	private JTextField txtTest;
	private double firstVariable;

	private char operator;
	private double memory;

	/**
	 * Create the frame.
	 */
	public CalcFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		txtTest = new JTextField();
		txtTest.setBackground(Color.WHITE);
		txtTest.setForeground(Color.BLACK);
		txtTest.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTest.setFont(new Font("Arial", Font.PLAIN, 23));
		txtTest.setEditable(false);
		txtTest.setBounds(10, 11, 206, 30);
		panel.add(txtTest);
		txtTest.setColumns(10);

		JButton button = new JButton("<");
		button.setToolTipText("Deletes last digit");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (txtTest.getText().length() > 0) {
					txtTest.setText(txtTest.getText().substring(0, txtTest.getText().length()-1));
				}
			}
		});
		button.setBounds(116, 52, 45, 25);
		panel.add(button);

		JButton btnNewButton = new JButton("C");
		btnNewButton.setToolTipText("Clears display and memory");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtTest.setText("");
				memory = 0;
			}
		});
		btnNewButton.setBounds(171, 52, 45, 25);
		panel.add(btnNewButton);

		JButton button_1 = new JButton("+");
		button_1.setToolTipText("Addition");
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mathOperation(button_1, txtTest);
			}
		});
		button_1.setBounds(171, 103, 45, 25);
		panel.add(button_1);

		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				typeTxtBox(button_2, txtTest);
			}
		});
		button_2.setBounds(10, 102, 45, 25);
		panel.add(button_2);

		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				typeTxtBox(button_3, txtTest);
			}
		});
		button_3.setBounds(61, 103, 45, 25);
		panel.add(button_3);

		JButton button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				typeTxtBox(button_4, txtTest);
			}
		});
		button_4.setBounds(116, 103, 45, 25);
		panel.add(button_4);

		JButton button_5 = new JButton("-");
		button_5.setToolTipText("Substraction");
		button_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mathOperation(button_5, txtTest);
			}
		});
		button_5.setBounds(171, 139, 45, 25);
		panel.add(button_5);

		JButton button_6 = new JButton("4");
		button_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				typeTxtBox(button_6, txtTest);
			}
		});
		button_6.setBounds(10, 138, 45, 25);
		panel.add(button_6);

		JButton button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				typeTxtBox(button_7, txtTest);
			}
		});
		button_7.setBounds(61, 139, 45, 25);
		panel.add(button_7);

		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				typeTxtBox(button_8, txtTest);
			}
		});
		button_8.setBounds(116, 139, 45, 25);
		panel.add(button_8);

		JButton button_9 = new JButton("*");
		button_9.setToolTipText("Multiplication");
		button_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mathOperation(button_9, txtTest);
			}
		});
		button_9.setBounds(171, 175, 45, 25);
		panel.add(button_9);

		JButton button_10 = new JButton("1");
		button_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				typeTxtBox(button_10, txtTest);
			}
		});
		button_10.setBounds(10, 174, 45, 25);
		panel.add(button_10);

		JButton button_11 = new JButton("2");
		button_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				typeTxtBox(button_11, txtTest);
			}
		});
		button_11.setBounds(61, 175, 45, 25);
		panel.add(button_11);

		JButton button_12 = new JButton("3");
		button_12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				typeTxtBox(button_12, txtTest);
			}
		});
		button_12.setBounds(116, 175, 45, 25);
		panel.add(button_12);

		JButton button_13 = new JButton("/");
		button_13.setToolTipText("Division");
		button_13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mathOperation(button_13, txtTest);
			}
		});
		button_13.setBounds(171, 211, 45, 25);
		panel.add(button_13);

		JButton button_14 = new JButton("0");
		button_14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				typeTxtBox(button_14, txtTest);
			}
		});
		button_14.setBounds(10, 210, 45, 25);
		panel.add(button_14);

		JButton button_15 = new JButton(".");
		button_15.setToolTipText("Decimal point");
		button_15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				typeTxtBox(button_15, txtTest);
			}
		});
		button_15.setBounds(61, 211, 45, 25);
		panel.add(button_15);

		JButton button_16 = new JButton("=");
		button_16.setToolTipText("Equals");
		button_16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mathOperation(button_16, txtTest);
			}
		});
		button_16.setBounds(116, 211, 45, 25);
		panel.add(button_16);

		JLabel lblPsyborgThe = new JLabel("Psyborg, making things work since 1997");
		lblPsyborgThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPsyborgThe.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 10));
		lblPsyborgThe.setBounds(10, 267, 206, 16);
		panel.add(lblPsyborgThe);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTest.setText("");
				txtTest.setText(Double.toString(memory));
			}
		});
		btnL.setToolTipText("Loads the number stored in memory on the display");
		btnL.setBounds(61, 52, 45, 25);
		panel.add(btnL);
		
		JButton btnMs = new JButton("S");
		btnMs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				memory = Double.parseDouble(txtTest.getText());
				txtTest.setText("");
			}
		});
		btnMs.setToolTipText("Stores the number shown on the display in memory.");
		btnMs.setBounds(10, 52, 45, 25);
		panel.add(btnMs);
	}

	void mathOperation(JButton btn, JTextField txtBox) {
		
			switch (btn.getText()) {
			case "+":
				firstVariable = Double.parseDouble(txtBox.getText());
				operator = '+';
				txtBox.setText("");
				break;

			case "-":
				firstVariable = Double.parseDouble(txtBox.getText());
				operator = '-';
				txtBox.setText("");
				break;

			case "/":
				firstVariable = Double.parseDouble(txtBox.getText());
				operator = '/';
				txtBox.setText("");
				break;

			case "*":
				firstVariable = Double.parseDouble(txtBox.getText());
				operator = '*';
				txtBox.setText("");
				break;

			case "=":

				switch (operator) {

				case '+':
					txtBox.setText(firstVariable + Double.parseDouble(txtBox.getText()) + " ".trim());
					break;

				case '-':
					txtBox.setText(firstVariable - Double.parseDouble(txtBox.getText()) + " ".trim());
					break;

				case '*':
					txtBox.setText(firstVariable * Double.parseDouble(txtBox.getText()) + " ".trim());

					break;

				case '/':
					if (firstVariable == 0 || Double.parseDouble(txtBox.getText()) == 0) {
						txtBox.setText("ERROR");
					}else {
					txtBox.setText(firstVariable / Double.parseDouble(txtBox.getText()) + " ".trim());
					txtBox.setText(Double.toString((Math.round(Double.parseDouble(txtBox.getText()) * 100) / 100D)));
					break;
					}

				default:
					break;
				}

				break;

			default:
				break;
			}
		
	}

	void typeTxtBox(JButton btn, JTextField txtBox) {	
		if (txtBox.getText().compareTo("ERROR") == 0) {txtBox.setText("");} //Check if ERROR and clear
		txtBox.setText(txtBox.getText().concat(btn.getText()));
			
		
	}
}
