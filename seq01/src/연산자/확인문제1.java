package 연산자;

import javax.swing.JOptionPane;

public class 확인문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String on = JOptionPane.showInputDialog("날씨 입력");
		String wind = JOptionPane.showInputDialog("바람 입력");
		
		int on1 = Integer.parseInt(on);
		int wind1 = Integer.parseInt(wind);
		
		if(on1>=30 || wind1<88 ) {
			JOptionPane.showMessageDialog(null, "양산 들고감");
		}
		else {
			JOptionPane.showMessageDialog(null, "양산 들고가지않음");
		}
	}

}
