package Calculate;

import javax.swing.JFrame;

public class Frame {
	public static void main(String[] args) {
		JFrame f = new JFrame("¼òÒ×¼ÆËãÆ÷");
		f.setBounds(400, 200, 280, 310);
		Calculate c = new Calculate();
		f.add(c);
		f.setVisible(true);
	}
}
