package ex02;

import java.util.Scanner;


// 전역변수 field 와 메소드 함수 합치면 class다

/*
 입력
 번호  이름  국어  영어  수학
 num,  name, kor,  eng,  mat
 1,제나,90,80,70
 2,김채원,100,90,90
 3,윈터,100,100,100
 4,로제,79,80,0
 출력
 번호 이름   총점  평균
 num, name,  tot,  avg
 1    제나   240   80
 2    김채원 280   93.3
 3    윈터   300   100
 4    로제   159   53
 */
public class FuncTest {
	// Field 전역변수
	// 입력
	private static int    num;
	private static String name;
	private static int    kor;
	private static int    eng;
	private static int    mat;

	// 출력
	private static int    tot;
	private static double avg;


	// method
	// main

	public static void main(String[] args) {
		input();
		process();
		output();


		System.out.println("end .....");

	}

	// input
	private static void input() {
		 // 키보드 준비
		 Scanner in = new Scanner(System.in);
		 System.out.println("번호,이름,국어,영어,수학");
		 // line   "1,제나,90,80,70"
		 // li      0    1         2     3     4
		 //        "1", "안유진", "90", "80", "70"   
		 String      line = in.nextLine();
		 String   [] li   = line.split(","); // 문자열 -> 문자열 배열
		 num              = Integer.parseInt(li[0].trim());    // int <- String
		 name             = li[1];
		 kor              = Integer.parseInt(li[2].trim());    // 100 <- "100" 글자100을 숫자100으로 바꾼다
		 eng              = Integer.parseInt(li[3].trim());    // int <- String
		 mat              = Integer.parseInt(li[4].trim());    // int <- String
		 

	}
	// process
	private static void process() {
		// 총점
		tot = kor + eng + mat;
		// 평균
		// avg = (double) tot / 3.0;
		// 반올림된 평균
		avg = (int) (tot * 100 + 0.5) / 100.0 / 3.0;
		
		// 형변환 casting
		// 숫자 -> 문자열로 변환
		// String.valueOf(35.6) -> "35.6"
		// 35.6 + ""            -> "35.6"
	}
	// output
	private static void output() {
		// 평균은 소수이하 세자리로 출력(세자리 이후는 자동반올림)
		System.out.println("번호 이름 총점 평균");
		System.out.printf("%d %s  %d  %10.3f",
				num, name, tot, avg);
		 

	}

}
