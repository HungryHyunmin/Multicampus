package 연산자;

import javax.swing.JOptionPane;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String change = JOptionPane.showInputDialog("몸무게 변화");
		double change2 = Double.parseDouble(change);
		
		if(change2 >2) {
			JOptionPane.showMessageDialog(null, "다이어트 성공");
		}
		else {
			JOptionPane.showMessageDialog(null, "실패");
		}
	}

}
