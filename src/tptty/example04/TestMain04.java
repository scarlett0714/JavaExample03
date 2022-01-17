//로또 번호 생성기 만들기
package tptty.example04;

import java.util.Random;

public class TestMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example04_1(); //example04_1함수 실행
	}
	public static void example04_1() {
		int[] lotto = makeLotto(); //lotto라는 정수배열에 makeLotto함수의 반환값을 대입
		for(int i : lotto) { //배열인덱스[0]부터 끝까지 출력
			System.out.print(i+" ");
		}
	}
	
	public static int[] makeLotto() { //makeLotto함수
		int[] lotto = new int[6]; //lotto : 배열 크기 6인 정수형 배열
		Random rand = new Random(); //Random함수 생성 -> java.util에 있으니 import할 것
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = rand.nextInt(45) +1; //rand.nextInt(정수) : 0~정수-1 중 랜덤하게 난수 생성
			for(int j=0; j<i;j++) { //중복배제 구문
				if(lotto[i]==lotto[j]) {
					i--; //i번째 방에 들어갔던 수 대신 새로 난수를 생성해서 값을 재대입해야함. i값 복구작업
					break;
				}
			
			}
		}
		
		
		return lotto; //반환값은 정수배열 lotto
	}
}
