//파일로부터 배열 생성하기
package tptty.example07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMain07_1 {

	public static void main(String[] args) {
		//파일생성 : 해당 프로젝트->new->file->파일이름입력->파일내용작성
		String filename = "map.txt"; //map.txt파일을 읽음:filename에 파일이름을 저장
		int[][] map = readMap(filename); //readmap함수 : filename에 있는 파일을 불러와서 2차원배열을 생성 후 반환
		if(map!=null) //2차원배열 map이 정상적으로 만들어졌다면, map은 null값이 아닐 것
			showMap(map); //showMap함수 : 위에서 만들어진 map배열을 출력

	}


	public static int[][] readMap(String filename) {
		int[][] map = null; //2차원 배열 map을 생성하고 그 값을 null로 초기화
		File file = new File(filename); //file을 불러오는 방법 File(파일이름)->java.io import필요
		
		//파일의 데이터를 scanner로 읽어냄 : 기존과는 다르게 키보드의 입력소스가 아니라 파일의 데이터를 읽어냄
		//scanner로 파일을 읽어내는 경우, 파일이 존재하지 않을 수도 있음->반드시 예외처리 필요
		//scanner객체 마우스-> thorw(걍 무시하고 진행), try/catch 중 후자 선택
		try {
			Scanner fileScan = new Scanner(file);
			//scanner사용해서 진짜 파일 읽기
			final int ROW = fileScan.nextInt(); //행
			final int COL = fileScan.nextInt(); //열
			map = new int[ROW][COL]; //2차원 배열 생성
			
			for(int i=0;i<map.length;i++) {
				for(int j=0;j<map[i].length;j++) {
					map[i][j] = fileScan.nextInt(); //map배열에 file의 남은 모두 정보 읽어오기
				}
			}
			fileScan.close(); //System.in과는 상관x, fileScan만 close
			
		} catch (FileNotFoundException e) { //파일이 존재하지 않은 경우
			System.out.println("파일이 존재하지 않습니다."); //파일존재유무를 간편히 파악하기 위한 출력문 추가
			e.printStackTrace(); //stack에 있던 오류사항들을 모두 출력
		}
		
		return map; //생성된 2차원 배열 map반환
	}

	public static void showMap(int[][] map) {
		for(int[] row : map) { //for(1차원 : 2차원)
			for(int col : row) { //for(상수 : 1차원)
				switch (col) {
				case 0:
					System.out.print("□");
					break;
				case 1:
					System.out.print("■");
					break;
				case 2:
					System.out.print("@");
					break;
				}
			}
			System.out.println();
		}
		
	}
}
