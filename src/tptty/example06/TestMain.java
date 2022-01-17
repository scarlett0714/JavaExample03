package tptty.example06;

public class TestMain {

	public static void main(String[] args) {
		example06_1();
	}

	public static void example06_1() {
		String[] name = new String[] {"홍길동", "고길동", "김길동", "이길동"}; //학생의 이름 배열 선언
		int[][] score = new int[][] { //점수와 총점이 들어갈 2차원 배열 생성
			{10,20,30,0}, //총점이 들어갈 자리는 0
			{20,30,40,0},
			{10,25,30,0},
			{30,30,40,0} };
			
		for(int arr[] : score) { //for each구문 작성 시:for(n차원:n+1차원)
			for(int i=0; i<arr.length-1; i++) {
					arr[arr.length-1] += arr[i];
			}
		}
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+" >> ");
			int k =0;
			for(int j : score[i]) {
				if(k==3)
					System.out.print(": ");
				System.out.print(j+" "); 
				k++;
				}

			System.out.println();
		}
			
	}
	
	
		
}
