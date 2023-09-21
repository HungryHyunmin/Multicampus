package 연산자;

import javax.swing.JOptionPane;

public class 연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int pass=11;
		String password = JOptionPane.showInputDialog("비밀번호");
		String weight = JOptionPane.showInputDialog("몸무게 변화");
		
	
		double weight2 = Double.parseDouble(weight);
		int password2 = Integer.parseInt(password);
		
	if(password2 == pass && weight2 > 2) {
		JOptionPane.showMessageDialog(null, "오늘도 성공");
	}
	else {
		JOptionPane.showMessageDialog(null, "오늘도 실패");
	}
	}

}
