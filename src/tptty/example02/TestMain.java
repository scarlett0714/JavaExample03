package tptty.example02;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example02(); //새로 정의한 example02함수 호출(선택정렬 : 정수배열)
		example02_1(); //새로 정의한 example02_1함수 호출(선택정렬 : 문자열배열)
	}
	
	//public : 접근방법, static : 객체를 생성하지 않고 함수호출 가능
	//함수를 정의하는 위치는 어디든지 상관없음(but TestMain class내부에 작성해야함)
	public static void example02() {
		/*1.*/ int[] list = {10, 50, 30, 60, 70, 20};
//		2. int[] list = new int[] {10, 50, 30, 60, 70, 20};
//		
//		3. int[] list = new int[6]; //초기화 리스트가 없을 경우 방의 개수를 설정해줄 것
//		list[0] = 10;
//		list[1] = 50;
//		list[2] = 30;
//		list[3] = 60;
//		list[4] = 70;
//		list[5] = 20;
		
		System.out.print("정렬 전 : "); //정렬 전 배열 출력
		for(int i : list)
			System.out.print(i+" ");
		System.out.println();
			
		
		for(int i=0;i<list.length-1;i++) //값을 바꾸는 건 list의 뒤에서 두번째 값까지 시행, 마지막 값은 앞에가 정렬되면 알아서 정렬됨
		{
			int minIndex = i; //minIndex : 배열 중 가장 작은 수를 가진 방의 인덱스값
			for(int j=(i+1);j<list.length;j++) //값에 대한 비교는 현재 i값(현재 작업이 진행되는 인덱스방)부터 리스트의 끝까지 시행
			{
				if(list[j]<list[minIndex]) 
				{
					minIndex = j;
				} //한 방씩 넘어가면서 가장 작은 값을 가진 방의 인덱스값을 minIndex에 저장
			}
				if(minIndex != i) //만약 정렬 전 배열의 순서와 달라졌다면, (minIndex값이 바뀌었다면)
				{
//					temp를 사용해서 swap하는 방법
//					int temp = list[minIndex];
//					list[minIndex] = list[i];
//					list[i] = temp;
					
					//temp를 사용하지 않고 swap하는 방법
					list[i] = list[i]^list[minIndex];
					list[minIndex] = list[i]^list[minIndex];
					list[i] = list[i]^list[minIndex];
					
					
				}//minIndex방의 값과 방금 비교한 방의 값을 swap
			
		}
		
		System.out.print("정렬 후 : "); //정렬 후 배열 출력
		for(int i : list)
			System.out.print(i+" ");
		System.out.println();
		
	};
	
	public static void example02_1() {
		String[] list = {"홍길동", "김길동", "이길동", "고길동", "최길동"};
		
		System.out.print("정렬 전 : "); //정렬 전 배열 출력
		for(String i : list)
			System.out.print(i+" ");
		System.out.println();
			
		
		for(int i=0;i<list.length-1;i++) //값을 바꾸는 건 list의 뒤에서 두번째 값까지 시행, 마지막 값은 앞에가 정렬되면 알아서 정렬됨
		{
			int minIndex = i; //minIndex : 배열 중 가장 작은 수를 가진 방의 인덱스값
			for(int j=(i+1);j<list.length;j++) //값에 대한 비교는 현재 i값(현재 작업이 진행되는 인덱스방)부터 리스트의 끝까지 시행
			{
				if(list[j].compareTo(list[minIndex]) <0) //String은 부등호 연산을 사용한 대소비교x
				//compareTo함수 : 사전식순서로 크기비교 -> 앞<뒤 : -반환, 앞=뒤 : 0반환, 앞>뒤 : +반환
				{
					minIndex = j;
				} //한 방씩 넘어가면서 가장 작은 값을 가진 방의 인덱스값을 minIndex에 저장
			}
				if(minIndex != i) //만약 정렬 전 배열의 순서와 달라졌다면, (minIndex값이 바뀌었다면)
				{
					//temp를 사용해서 swap하는 방법 : 참조 타입에서 사용
					String temp = list[minIndex];
					list[minIndex] = list[i];
					list[i] = temp;
					
					//temp를 사용하지 않고 swap하는 방법 (비트연산자 ^사용 : String타입(기본타입 이외의 참조타입)에서는 사용x)
					
				}//minIndex방의 값과 방금 비교한 방의 값을 swap
			
		}
		
		System.out.print("정렬 후 : "); //정렬 후 배열 출력
		for(String i : list)
			System.out.print(i+" ");
		System.out.println();
		
	};
	
}
