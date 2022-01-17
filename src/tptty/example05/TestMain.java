package tptty.example05;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example05_1(); //학생이 써낸 답과 정답이 일치하는지 확인하기
		example05_2(); //학생의 답 std1과 std2를 합쳐서 std배열에 넣기 (배열복사이용)
	}


	public static void example05_1() {
		
		int[] answer = {1,2,3,3,2,1};
		int[] std1 = {1,2,3,4,1,2};
		System.out.print("정답 : ");
		for(int i : answer){
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("학생 : ");
		for(int i : std1){
			System.out.print(i+" ");
		}
		System.out.println();
		
//		int[] quizResult = getQuizResult(answer, std1); 그냥 std1배열을 함수에 전달하게 되면, std1배열을 공유하게 됨
		//->만약 getQuizResult함수에서 std1배열의 값을 변경하면 원래 std1배열이 변경됨
		int[] quizResult = getQuizResult(answer, std1.clone()); //기존의 std1배열과 함수에 전달해서 값을 변경할 std1배열을 독립시키기위해 clone함수사용
		
		System.out.print("결과 : ");
		for(int i : quizResult){
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("학생 : ");
		for(int i : std1){
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

	private static int[] getQuizResult(int[] answer, int[] std1) {
		
		for(int i =0; i<answer.length;i++) {
			if(std1[i]==answer[i]) //배열의 방을 하나하나 비교해서 값이 같으면 std1의 배열에 1을, 다르면 0을 저장
				std1[i] = 1; //굳이 다른 배열을 생성하지 않고 원래 있던 std1배열 이용
			else
				std1[i] = 0;
		}
		return std1;
	}

	public static void example05_2() {
		
		int[] std1 = {1,2,3,4,1,2};
		int[] std2 = {10,20,30,40,10,20};
		
		int[] std = new int[12]; //모두 0으로 채워진 배열 크기가 12인 정수형 배열 생성
		
		System.arraycopy(std1, 0, std, 0, std1.length); //System.arraycopy함수를 이용해서 배열복사시행
		System.arraycopy(std2, 0, std, std1.length, std2.length);
		//std1배열의 인덱스[0]을 std배열의 인덱스 [0]에 복사한다, 이 시행을 std1.length까지 실행한다
		//std2배열의 인덱스[0]을 std배열의 인덱스[std1.length]에 복사한다, 이 시행을 std2.length까지 실행한다
		
		
		System.out.print("학생 종합 : ");
		for(int i : std){
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
