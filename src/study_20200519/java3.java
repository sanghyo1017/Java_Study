package study_20200519;

public class java3 {
	public static void main(String[] args) {
		
		//1. 배열 선언과 생성
		int[]a = new int[4];
	
		
		//2. 할당
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		//3-1. 출력
		System.out.println(a[0]);
		System.out.println(a[1]);
	
		int a1 = a[1];
		int a2 = a[2];
		int sum = a[1] + a[2];
		
		System.out.println(sum);
		
		//3-2. 출력 (for loop)
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		//3-3. 출력 (enhanced for loop)-enhanced는 중요함
		
		for(int value : a) { 
			System.out.println(value);
		}
		
//---------------------------------------------------------------------------------------------//
		
		//1. 배열 선언, 생성, 할당이 동시에!!!!
		//String[] str = {"문자1","문자2","문자3","문자4"};
		String[] str = {"apple","banana","strawberry","peach"};
		
		//2-1. 출력(for loop)
		for(int i=0; i<str.length; i++) {
			String value = str[i];
			System.out.println(value);
		}
		
		//2-2. 출력 (enhanced for loop) -
		for(String value : str) {
			System.out.println(value);
		}
		
		
//---------------------------------------------------------------------------------------------//
		
		Customer[] cust = new Customer[2];
		
		cust[0] = new Customer("이상효");
		cust[1] = new Customer("김민규");
		
		for(Customer value : cust ) {
			System.out.println(value.name);
		}
		
		//1. 배열 선언 및 생성
		int[] array = new int[4];
		
		//2. 배열 할당
		array[0] = 100;
		array[1] = 200;
		array[2] = 300;
		array[3] = 400;
		
		//3-1. 출력 (for loop)
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	

		
		//3-2. 출력(enhanced for loop)
		for(int value : array) {
			System.out.println(value);
		}
		
	
	}


}
