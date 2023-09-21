package 연산자;

import javax.swing.JOptionPane;

public class 연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "p";
		String password2= JOptionPane.showInputDialog("암호입력");
		
		
		
		if(password.equals(password2)) {
			JOptionPane.showMessageDialog(null, "성공");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "재입력");
		}
	}

}
