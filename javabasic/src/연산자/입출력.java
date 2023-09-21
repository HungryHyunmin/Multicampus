package 연산자;

import javax.swing.JOptionPane;

public class 입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("당신의 취미는 무엇인가요");
		JOptionPane.showMessageDialog(null, name+"의 취미는 테니스 입니다");
	}
		String time = JOptionPane.showInputDialog("당신은 몇시에 일어나요?");
		
		//문자열을 숫자로 변경해주는 작업은 굉장히 자주사용
		int time2 = Integer.parseInt(time);

}
