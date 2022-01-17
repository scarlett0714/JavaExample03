//두 배열이 동일한지 비교
package tptty.example03;

public class TestMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example03();
	}
	
	public static void example03() {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4};
		
		boolean result = arrEquals(arr1, arr2); //처음엔 arrEquals함수가 없는 상태->마우스 갖다대면 함수 자동생성 가능
		System.out.println(arr1+"\t"+arr2); //arr1의 주소, arr2의 주소 출력
		System.out.println(result?"같음":"같지 않음"); //?조건문 : ?참:거짓
	}

	public static boolean arrEquals(int[] arr1, int[] arr2) //private->public
	{
		// TODO Auto-generated method stub
//		if(arr1 == arr2) //arr1과 arr2의 주소값을 비교(배열이 같은지를 비교한게 아님)
//			return true;
//		return false;
		
		if(arr1.length != arr2.length)
			return false;
		else
		{
			for(int i=0; i<arr1.length;i++) {
				if(arr1[i] != arr2[i])
					return false;
			}//방 vs 방으로 비교해야 배열 비교 가능
		}
		return true;
		
	};

}
