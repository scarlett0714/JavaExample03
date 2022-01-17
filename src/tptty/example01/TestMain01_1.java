//배열의 length필드를 이용하여 배열 크기만큼 정수를 입력 받고 평균을 출력하라.
package tptty.example01;

import java.util.Scanner;

public class TestMain01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요:");
		int[] intArray = new int[5];
		
		double sum = 0.0;
		for(int i=0;i<intArray.length;i++)
			intArray[i] = scan.nextInt();
		
		for(int i=0;i<intArray.length;i++)
			sum += intArray[i];
		
		System.out.println("평균은 "+sum/intArray.length); //나눗셈 연산
		scan.close();
		
	}

}
