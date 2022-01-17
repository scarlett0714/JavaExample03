//양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하라.
package tptty.example01;

import java.util.Scanner;

public class TestMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] intArray; //배열 선언
		intArray = new int[5]; //배열의 방을 5개를 만들고 방은 모두 0으로 초기화
		int max = 0;
		
		System.out.println("양수 5개를 입력하세요:");
		for(int i=0;i<5;i++) {
			intArray[i]=scan.nextInt();
			if(intArray[i]>max) //배열에 추가된 입력받은 정수와 max(최댓값)을 비교
				max = intArray[i];
		}
		System.out.println("가장 큰 수는"+max+"입니다");
		
		scan.close();
		}
}
