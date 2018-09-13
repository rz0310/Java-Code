package Calculate;

import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculate extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Calculate() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		//�ı���
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, textField, 31, SpringLayout.NORTH, this);
		add(textField);
		textField.setColumns(10);
		
		//��ť0�ļ�����
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("0");
				}
				else{
					String str = textField.getText();
					textField.setText(str+"0");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button, 17, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, button);
		add(button);
		
		//��ť1�ļ�����
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("1");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"1");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, button, -6, SpringLayout.WEST, button_1);
		springLayout.putConstraint(SpringLayout.NORTH, button_1, 0, SpringLayout.NORTH, button);
		add(button_1);
		
		//��ť2�ļ�����
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("2");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"2");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, button_2, -91, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, button_1, -6, SpringLayout.WEST, button_2);
		springLayout.putConstraint(SpringLayout.NORTH, button_2, 0, SpringLayout.NORTH, button);
		add(button_2);
		
		//��ť3�ļ�����
		JButton button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("3");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"3");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_4, 20, SpringLayout.SOUTH, button);
		springLayout.putConstraint(SpringLayout.EAST, button_4, 0, SpringLayout.EAST, button);
		add(button_4);
		
		//��ť4�ļ�����
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("4");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"4");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, button_5, 0, SpringLayout.WEST, button_1);
		springLayout.putConstraint(SpringLayout.SOUTH, button_5, 0, SpringLayout.SOUTH, button_4);
		add(button_5);
		
		//��ť5�ļ�����
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("5");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"5");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_6, 0, SpringLayout.NORTH, button_4);
		springLayout.putConstraint(SpringLayout.WEST, button_6, 0, SpringLayout.WEST, button_2);
		add(button_6);
		
		//��ť+�ļ�����
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("+");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"+");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, button_3);
		springLayout.putConstraint(SpringLayout.NORTH, button_3, 0, SpringLayout.NORTH, button);
		springLayout.putConstraint(SpringLayout.WEST, button_3, 6, SpringLayout.EAST, button_2);
		add(button_3);
		
		//��ť-�ļ�����
		JButton button_7 = new JButton("-");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("-");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"-");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_7, 0, SpringLayout.NORTH, button_4);
		springLayout.putConstraint(SpringLayout.EAST, button_7, 0, SpringLayout.EAST, button_3);
		add(button_7);
		
		//��ť6�ļ�����
		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("6");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"6");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_8, 23, SpringLayout.SOUTH, button_4);
		springLayout.putConstraint(SpringLayout.WEST, button_8, 0, SpringLayout.WEST, button);
		add(button_8);
		
		//��ť7�ļ�����
		JButton button_9 = new JButton("7");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("7");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"7");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, button_9, 0, SpringLayout.WEST, button_1);
		springLayout.putConstraint(SpringLayout.SOUTH, button_9, 0, SpringLayout.SOUTH, button_8);
		add(button_9);
		
		//��ť8�ļ�����
		JButton button_10 = new JButton("8");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("8");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"8");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_10, 0, SpringLayout.NORTH, button_8);
		springLayout.putConstraint(SpringLayout.WEST, button_10, 0, SpringLayout.WEST, button_2);
		add(button_10);
		
		//��ť9�ļ�����
		JButton button_11 = new JButton("9");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("9");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"9");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_11, 22, SpringLayout.SOUTH, button_8);
		springLayout.putConstraint(SpringLayout.WEST, button_11, 0, SpringLayout.WEST, button);
		add(button_11);
		
		//��ť*�ļ�����
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText("*");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"*");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_12, 0, SpringLayout.NORTH, button_8);
		springLayout.putConstraint(SpringLayout.WEST, button_12, 0, SpringLayout.WEST, button_3);
		add(button_12);
		
		//��ť.�ļ�����
		JButton button_13 = new JButton(".");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0"))
				{
					textField.requestFocus();
					textField.setText(".");
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+".");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_13, 0, SpringLayout.NORTH, button_11);
		springLayout.putConstraint(SpringLayout.WEST, button_13, 0, SpringLayout.WEST, button_1);
		add(button_13);
		
		//��ť=�ļ�����
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().indexOf("+")!=-1)
				{
					String [] str = textField.getText().split("[+]");
					Double d1 = Double.valueOf(str[0]);
					Double d2 = Double.valueOf(str[1]);
					double answer1 = d1+d2;
					String answer2 = String.valueOf(answer1);
					textField.setText(answer2);
				}else if(textField.getText().indexOf("-")!=-1){
					String [] str = textField.getText().split("[-]");
					Double d1 = Double.valueOf(str[0]);
					Double d2 = Double.valueOf(str[1]);
					double answer1 = d1-d2;
					String answer2 = String.valueOf(answer1);
					textField.setText(answer2);
				}else if(textField.getText().indexOf("*")!=-1){
					String [] str = textField.getText().split("[*]");
					Double d1 = Double.valueOf(str[0]);
					Double d2 = Double.valueOf(str[1]);
					double answer1 = d1*d2;
					String answer2 = String.valueOf(answer1);
					textField.setText(answer2);
				}else if(textField.getText().indexOf("/")!=-1){
					String [] str = textField.getText().split("[/]");
					Double d1 = Double.valueOf(str[0]);
					Double d2 = Double.valueOf(str[1]);
					double answer1 = d1/d2;
					String answer2 = String.valueOf(answer1);
					textField.setText(answer2);
				}else{
					textField.setText(textField.getText());
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_14, 0, SpringLayout.NORTH, button_11);
		springLayout.putConstraint(SpringLayout.WEST, button_14, 0, SpringLayout.WEST, button_2);
		add(button_14);
		
		//��ť/�ļ�����
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("/"))
				{
					textField.requestFocus();
				}
				else
				{
					String str = textField.getText();
					textField.setText(str+"/");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_15, 0, SpringLayout.NORTH, button_11);
		springLayout.putConstraint(SpringLayout.WEST, button_15, 0, SpringLayout.WEST, button_3);
		add(button_15);
		
		//��ťBackspace�ļ�����
		JButton btnBackspace = new JButton("Backspace");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				if(text.length()==0)
				{
					textField.setText("0");
				}
				else{
					text = text.substring(0,text.length()-1);
					textField.setText(text);
				}
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnBackspace, 0, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBackspace, -10, SpringLayout.SOUTH, this);
		add(btnBackspace);
		
		//��ťC�ļ�����
		JButton btnC = new JButton("   C   ");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnC, 0, SpringLayout.NORTH, btnBackspace);
		springLayout.putConstraint(SpringLayout.EAST, btnC, 0, SpringLayout.EAST, textField);
		add(btnC);

	}
}
