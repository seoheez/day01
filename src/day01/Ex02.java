package day01;

public class Ex02 {

	public static void main(String[] args) {
     /*
      * \n : 엔터와 비슷하다. 
      * \t : 탭 크기만큼 오른쪽으로 이동 (윈도우에서는 대략 8칸 정도)
      * \" : "(큰따옴표) 표시 (일반 문자로 사용하고자 할 때)
      * \\ : \(역슬래시) 표현할 때 사용
      */
		
		// " " : 쌍따옴표로 묶인 값은 문자열로 인식한다.
		System.out.println("Hello\nJava");
		System.out.println("1\t1234567\t12345678\t12");

//큰따옴표를 적고싶으면 \”   \“ 라고 해야 문자로 인식한다.
//슬래시도 마찬가지로 \ 하나만 적으면 안되고 // 적어야 슬래시가 표현된다.
		System.out.println("test \"123\" \\456");
	}

}
