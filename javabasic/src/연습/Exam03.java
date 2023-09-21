package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tele = JOptionPane.showInputDialog("통신사 입력");
		String number = JOptionPane.showInputDialog("전화번호 입력");
		String name = JOptionPane.showInputDialog("가입자 이름 입력");
		// 한줄 복사 단축키 ctrl+alt+화살표 아래
		String result = name +"님은"+tele+"에"+ number+ "입니다";
		//한줄 지우기 ctrl+D
		JOptionPane.showMessageDialog(null, result);	
	}
}
