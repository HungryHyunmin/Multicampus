package 제어문.순차문;



import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 벽돌부품만들기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setSize(500, 500);
		JButton b = new JButton();
		b.setText("버튼입니다.");
		
		f.add(b);// f에 버튼을 올려라.
		
		FlowLayout flow = new FlowLayout(); // 레이아웃을 겹치지 않게 순서대로 흐르듯이
		f.setLayout(flow);
	
		JTextField t1 =new JTextField();
		JTextField t2 =new JTextField();
		JTextField t3 =new JTextField();
		t1.setSize(100, 100);
		t2.setSize(100, 100);
		t3.setSize(100, 100);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.setVisible(true); // setvisible은 항상 마지막에 놓는것이 좋음-> 순서대로 실행 되니깐
		
	}

}
