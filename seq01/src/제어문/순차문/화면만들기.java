package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 화면만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame(); //JFrame() 생성자, 최소한 한번실행
		f.setSize(300,300);
		
		JButton b= new JButton();
		b.setText("--------------------나를 눌러-----------------------");
		JTextField t1= new JTextField(20);
		JTextField t2= new JTextField(20);
		JTextField t3= new JTextField(20);
		FlowLayout flow = new FlowLayout();
		//글자써주는 부품
		JLabel l1 = new JLabel();
		l1.setText("이름");
		JLabel l2 = new JLabel();
		l2.setText("나이");
		JLabel l3 = new JLabel();
		l3.setText("취미");
		
		
		
		
		f.setLayout(flow);
		f.add(b);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		
		
		
		
		
		
		f.setVisible(true);
	}

}
