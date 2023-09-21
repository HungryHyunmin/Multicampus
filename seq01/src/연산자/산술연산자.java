package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 200;
		int y = 100;
		
		int sum = x+y;
		
		double avg = sum/2;
		double avg2 = (double)sum/2;
		// 강제형 변환
		// 자바의 연산시 하나라도 실수면 결과는 실수!!
		System.out.println(avg);
		System.out.println(avg2);
		
	}

}
