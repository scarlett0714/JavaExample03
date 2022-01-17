package tptty.example07;

import java.util.Random;
import java.util.Scanner;

public class TestMain {

	public static Scanner scan = new Scanner(System.in); //scan, rand함수를 사용하기 위해 import
	public static Random rand = new Random();
	
	public static void main(String[] args) {
		int[][]arr = makeArray2D(); //2차원 배열 arr을 반환하는 makeArray2D함수
		
		scan.close(); //makeArray2D함수에서 사용한 scan.close
		printArray2D(arr); //위에서 만든 arr배열을 출력하는 printArray2D함수

	}

	public static int[][] makeArray2D() {
		
		System.out.print("원하는 층의 개수를 입력하세요 : ");
		final int floor = scan.nextInt();
		int[][] arr = new int[floor][]; //층의 개수만을 입력받아 가변 배열로 arr정의(행에 대한 부분만 정보를 알고 열은 이후에 동적할당)
		
		for(int i=0; i<floor;i++) { //입력받은 층의 개수를 사용해 각각의 층마다 방의 개수를 입력받음
			System.out.print(i+"층의 방의 개수 : ");
			arr[i] = new int[scan.nextInt()];
		}
		for(int i=0;i<arr.length;i++) { //위에서 배열 arr의형태가 모두 0으로 초기화된 상태로 만들어지면, 이제부터 난수로 값을 할당
			for(int j=0;j<arr[i].length;j++) { //2차원배열은 행과 열이 있어 중첩반복문을 사용
				arr[i][j] = rand.nextInt(100); //0~99까지의 난수를 생성
			}
		}
		
		return arr; //배열 arr을 반환
	}
	
	public static void printArray2D(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"층 : ");
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
