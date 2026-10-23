package ex01;

public class ArrayTest01 {
	// Array : 여러변수를 하나의 이름으로 통일해서 사용

	public static void main(String[] args) {
		// 원이 미나미 제나 리브 메이
		System.out.println("원이");
		System.out.println("미나미");
		System.out.println("제나");
		System.out.println("리브");
		System.out.println("메이");
		System.out.println("윈터");
		System.out.println();
		
		String [] ives = new String[] {
			//   0      1        2        3       4       5
				"원이", "미나미", "제나", "리브", "메이", "윈터"
				
		};
		System.out.println(ives[0]);
		System.out.println(ives[1]);
		System.out.println(ives[2]);
		System.out.println(ives[3]);
		System.out.println(ives[4]);
		System.out.println(ives[5]);
		System.out.println();
		
		for (int i = 0; i < ives.length; i++) {
			System.out.println(ives[i]);
		}
			
		// System.out.println(ives[6]); 
	}

}
