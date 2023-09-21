package 연산자;

import javax.swing.JOptionPane;

public class 연습문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력
		String day =JOptionPane.showInputDialog("오늘은 무슨 요일?");
		String what = JOptionPane.showInputDialog("수업끝나고 뭐할예정?");
		//처리
		String result = "오늘"+day+"에 수업후 나는"+what+"예정";
		//출력
		JOptionPane.showMessageDialog(null, result);
	}

}
