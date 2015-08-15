import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class GUI {

	private JFrame frame;
	private JTextField textFieldStore;
	private JTextField textFieldAmount;
	private JTextField textFieldDate;
	private JTextField textFieldBill;
	private JTextField textFieldPayer;
	private JTextField textFieldDescription;
	private JPanel panelMain, panelAddExp, panelSaved, panelNotSaved;
	private JComboBox<String> comboBoxMethod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(500, 500, 600, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Expense Tracking Software");
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		panelMain = new JPanel();
		panelMain.setBackground(SystemColor.window);
		frame.getContentPane().add(panelMain, "name_96139281938918");
		panelMain.setLayout(null);

		frame.setBounds(500, 500, 600, 650);
		panelAddExp = new JPanel();
		frame.getContentPane().add(panelAddExp, "name_96217125327114");
		panelAddExp.setBounds(500, 500, 600, 600);
		panelAddExp.setLayout(null);
		panelAddExp.setVisible(false);

		panelSaved = new JPanel();
		panelSaved.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		frame.getContentPane().add(panelSaved, "name_237321882135824");
		panelSaved.setLayout(null);
		panelSaved.setVisible(false);

		
		panelNotSaved = new JPanel();
		frame.getContentPane().add(panelNotSaved, "name_187585339734117");
		panelNotSaved.setLayout(null);
		panelNotSaved.setVisible(false);
		
		
		JLabel lblExpenseTracker = new JLabel("");
		lblExpenseTracker.setBackground(new Color(0, 0, 0));
		lblExpenseTracker.setIcon(new ImageIcon("/Users/siddharthgautam/Downloads/cooltext127444222362591.png"));
		lblExpenseTracker.setForeground(new Color(0, 0, 0));
		lblExpenseTracker.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 20));
		lblExpenseTracker.setBounds(136, 20, 401, 80);
		panelMain.add(lblExpenseTracker);

		JLabel lblYourPersonalExpense = new JLabel(
				"Your Personal Expense tracking Software");
		lblYourPersonalExpense.setForeground(SystemColor.controlHighlight);
		lblYourPersonalExpense.setFont(new Font("Rockwell Extra Bold",
				Font.ITALIC, 12));
		lblYourPersonalExpense.setBounds(156, 87, 303, 50);
		panelMain.add(lblYourPersonalExpense);

		JLabel label = new JLabel("$");
		label.setForeground(new Color(255, 153, 0));
		label.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 31));
		label.setBounds(58, 135, 74, 50);
		panelMain.add(label);

		JLabel label_1 = new JLabel(" €");
		label_1.setForeground(new Color(255, 153, 0));
		label_1.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 31));
		label_1.setBounds(131, 135, 74, 50);
		panelMain.add(label_1);

		JLabel label_2 = new JLabel(" ₹");
		label_2.setForeground(new Color(255, 153, 0));
		label_2.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 31));
		label_2.setBounds(257, 539, 74, 50);
		panelMain.add(label_2);

		JLabel label_3 = new JLabel("₽");
		label_3.setForeground(new Color(255, 153, 0));
		label_3.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 31));
		label_3.setBounds(164, 539, 74, 50);
		panelMain.add(label_3);

		JLabel label_4 = new JLabel("£");
		label_4.setForeground(new Color(255, 153, 0));
		label_4.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 31));
		label_4.setBounds(58, 539, 74, 50);
		panelMain.add(label_4);

		JLabel label_6 = new JLabel(" ₹");
		label_6.setForeground(new Color(255, 153, 0));
		label_6.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 31));
		label_6.setBounds(273, 135, 74, 50);
		panelMain.add(label_6);

		JLabel label_7 = new JLabel("£");
		label_7.setForeground(new Color(255, 153, 0));
		label_7.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 31));
		label_7.setBounds(385, 135, 74, 50);
		panelMain.add(label_7);

		JLabel label_8 = new JLabel("₽");
		label_8.setForeground(new Color(255, 153, 0));
		label_8.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 31));
		label_8.setBounds(498, 135, 74, 50);
		panelMain.add(label_8);

		JLabel label_5 = new JLabel(" €");
		label_5.setForeground(new Color(255, 153, 0));
		label_5.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 31));
		label_5.setBounds(369, 539, 74, 50);
		panelMain.add(label_5);

		JLabel label_9 = new JLabel("$");
		label_9.setForeground(new Color(255, 153, 0));
		label_9.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 31));
		label_9.setBounds(482, 539, 74, 50);
		panelMain.add(label_9);

		JLabel lblAProgramBy = new JLabel("A   Program   By   Siddharth Gautam");
		lblAProgramBy.setForeground(SystemColor.controlHighlight);
		lblAProgramBy.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 12));
		lblAProgramBy.setBounds(190, 578, 303, 50);
		panelMain.add(lblAProgramBy);

		JButton btnViewPerticularExpenses = new JButton(
				"View Particular Expense");
		btnViewPerticularExpenses.setBounds(41, 330, 200, 50);
		panelMain.add(btnViewPerticularExpenses);

		JButton btnAddExpense = new JButton("Add Expense");
		btnAddExpense.setSelectedIcon(null);
		btnAddExpense.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelMain.setVisible(false);
				panelAddExp.setVisible(true);
			}
		});
		btnAddExpense.setBounds(41, 211, 200, 50);
		panelMain.add(btnAddExpense);

		JButton btnEditExpense = new JButton("Edit Expense");
		btnEditExpense.setBounds(358, 260, 200, 50);
		panelMain.add(btnEditExpense);

		JButton btnViewAllExpenses = new JButton("View All Expenses");
		btnViewAllExpenses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// //jandjknsadnsaklmndkla
				// panelMain.setVisible(false);
				// panel
			}
		});
		btnViewAllExpenses.setBounds(358, 382, 200, 50);
		panelMain.add(btnViewAllExpenses);

		JButton btnDevelopersToolFor = new JButton(
				"Developers Tool for Querying");
		btnDevelopersToolFor.setBounds(358, 499, 200, 50);
		panelMain.add(btnDevelopersToolFor);

		JButton btnTotalExpenditureOver = new JButton(
				"Expenditure between dates");
		btnTotalExpenditureOver.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnTotalExpenditureOver.setBounds(41, 450, 200, 50);
		panelMain.add(btnTotalExpenditureOver);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("/Users/siddharthgautam/Desktop/Tracker1.jpg"));
		label_10.setBounds(19, 6, 100, 117);
		panelMain.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("/Users/siddharthgautam/Desktop/Tracker1.jpg"));
		label_11.setBounds(482, 6, 100, 117);
		panelMain.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("/Users/siddharthgautam/Downloads/add icon.png"));
		label_12.setBounds(424, 176, 100, 90);
		panelMain.add(label_12);

		JLabel lblAddExpense = new JLabel("Add Expense");
		lblAddExpense.setBounds(233, 6, 149, 50);
		lblAddExpense.setFont(new Font("Lucida Grande",
				Font.BOLD | Font.ITALIC, 20));
		lblAddExpense.setForeground(new Color(138, 43, 226));
		panelAddExp.add(lblAddExpense);

		textFieldStore = new JTextField();
		textFieldStore.setBounds(164, 53, 358, 50);
		panelAddExp.add(textFieldStore);
		textFieldStore.setColumns(10);

		JLabel lblStorereason = new JLabel("Store/Payee");
		lblStorereason.setBounds(62, 52, 162, 50);
		lblStorereason.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panelAddExp.add(lblStorereason);

		JLabel lblAmountInCad = new JLabel("Amount");
		lblAmountInCad.setBounds(62, 114, 131, 50);
		lblAmountInCad.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panelAddExp.add(lblAmountInCad);

		textFieldAmount = new JTextField();
		textFieldAmount.setBounds(164, 115, 358, 50);
		textFieldAmount.setColumns(10);
		panelAddExp.add(textFieldAmount);

		JLabel lblDate = new JLabel("Date (DD/MM/YYYY)");
		lblDate.setBounds(62, 176, 152, 50);
		lblDate.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panelAddExp.add(lblDate);

		textFieldDate = new JTextField();
		textFieldDate.setBounds(233, 177, 289, 50);
		textFieldDate.setColumns(10);
		panelAddExp.add(textFieldDate);

		JLabel lblPaymnetMethod = new JLabel("Payment Method");
		lblPaymnetMethod.setBounds(62, 238, 152, 50);
		lblPaymnetMethod.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panelAddExp.add(lblPaymnetMethod);

		comboBoxMethod = new JComboBox<String>();
		comboBoxMethod
				.setModel(new DefaultComboBoxModel<String>(new String[] { "Other",
						"Dada-Credit Card", "Mamu-Credit Card",
						"Siddu-Credit Card", "Cash", "Cheque",
						"Online Bank Transfer" }));
		comboBoxMethod.setBounds(233, 252, 187, 27);

		panelAddExp.add(comboBoxMethod);

		JLabel lblIfNotIn = new JLabel(
				"If not in the list, select none and enter mean in the description field below");
		lblIfNotIn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblIfNotIn.setBounds(62, 267, 460, 50);
		panelAddExp.add(lblIfNotIn);

		JLabel lblBillreceiptNumber = new JLabel("Bill/Receipt Number");
		lblBillreceiptNumber.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblBillreceiptNumber.setBounds(62, 313, 152, 50);
		panelAddExp.add(lblBillreceiptNumber);

		textFieldBill = new JTextField();
		textFieldBill.setColumns(10);
		textFieldBill.setBounds(233, 314, 289, 50);
		panelAddExp.add(textFieldBill);

		JLabel lblPayer = new JLabel("Payer");
		lblPayer.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPayer.setBounds(62, 375, 152, 50);
		panelAddExp.add(lblPayer);

		textFieldPayer = new JTextField();
		textFieldPayer.setColumns(10);
		textFieldPayer.setBounds(130, 375, 392, 50);
		panelAddExp.add(textFieldPayer);

		JLabel lblDescription = new JLabel(
				"Description (e.g Grocery/Fuel/Business Promotion etc.)");
		lblDescription.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblDescription.setBounds(62, 437, 412, 50);
		panelAddExp.add(lblDescription);

		textFieldDescription = new JTextField();
		textFieldDescription.setColumns(10);
		textFieldDescription.setBounds(62, 484, 460, 50);
		panelAddExp.add(textFieldDescription);

		JButton btnSave = new JButton("Save");
		btnSave.setBounds(62, 553, 200, 50);
		panelAddExp.add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textFieldStore.getText().isEmpty()){
					panelAddExp.setVisible(false);
					panelNotSaved.setVisible(true);
				}else{
					String Store = textFieldStore.getText();
					if(textFieldAmount.getText().isEmpty()){
						panelAddExp.setVisible(false);
						panelNotSaved.setVisible(true);
					}else{
						int Amount = Integer.parseInt(textFieldAmount.getText());
						String Date = textFieldDate.getText();
						String method = comboBoxMethod.getSelectedItem().toString();
						String billno = textFieldBill.getText();
						String payer = textFieldPayer.getText();
						String description = textFieldDescription.getText();
						
						DatabaseConnection.AddExpenseQuery(Store, Amount, Date, method,
								billno, payer, description);
							panelAddExp.setVisible(false);
							panelSaved.setVisible(true);
						}
					}
			}
		});
		

		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelMain.setVisible(true);
				panelAddExp.setVisible(false);
			}
		});
		btnMainMenu.setBounds(322, 553, 200, 50);
		panelAddExp.add(btnMainMenu);

		JPanel panelEditExp = new JPanel();
		frame.getContentPane().add(panelEditExp, "name_226108300708832");

		JLabel lblYourExpenditureEntry = new JLabel(
				"Your Expenditure entry has been saved successfully.");
		lblYourExpenditureEntry.setBounds(43, 74, 389, 16);
		panelSaved.add(lblYourExpenditureEntry);

		JButton btnReturnToMenu = new JButton("Return To Menu");
		btnReturnToMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelMain.setVisible(true);
				panelSaved.setVisible(false);
			}
		});
		btnReturnToMenu.setBounds(31, 375, 231, 29);
		panelSaved.add(btnReturnToMenu);

		JButton btnAddMoreExpenditure = new JButton(
				"Add more expenditure entries");
		btnAddMoreExpenditure.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelAddExp.setVisible(true);
				panelSaved.setVisible(false);
			}
		});
		btnAddMoreExpenditure.setBounds(343, 375, 231, 29);
		panelSaved.add(btnAddMoreExpenditure);
		
		
		
		JLabel lblYourExpenditureEntry_1 = new JLabel("Your Expenditure entry could not be saved. Fill all values appropriately and try again.");
		lblYourExpenditureEntry_1.setForeground(Color.RED);
		lblYourExpenditureEntry_1.setBounds(18, 66, 551, 54);
		panelNotSaved.add(lblYourExpenditureEntry_1);
		
		JButton btnReturnToThe = new JButton("Return to the current entry");
		btnReturnToThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAddExp.setVisible(true);
				panelNotSaved.setVisible(false);
			}
		});
		btnReturnToThe.setBounds(43, 367, 231, 29);
		panelNotSaved.add(btnReturnToThe);
		
		JButton button = new JButton("Return To Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNotSaved.setVisible(false);
				panelMain.setVisible(true);
			
			}
		});
		button.setBounds(331, 367, 231, 29);
		panelNotSaved.add(button);
	}
}
