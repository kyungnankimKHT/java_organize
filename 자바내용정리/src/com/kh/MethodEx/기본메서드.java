package com.kh.MethodEx;
/*
메서드(method) 
	특정 행동이나 작업을 진행하는 코드 블록  {     }
	ex ) 메서드급 연기! ㅇㅇㅇ 메소드급 영화 출현
	
	Setter : 필드에 작성한 변수를 복사해서 원본 변수 대신에 값을 변경하고 저장하는 메서드
		public void set변수명(자료형 매개변수) {
			this.변수 = 매개변수;
		}
		
	Getter : Setter에 저장된 변수값을 다른곳에서 사용할 수 있도록 전달해주는 메서드
		public 자료형 get변수명() {
			return 변수명;
		}
	
	생성자 : 파일명과 클래스이름과 똑같이 작성을 해줘야하고 
			객체의 기본 값을 설정해거나 값을 각각 변경해서 사용하는데 쓰이는 메서드 
		기본 : 매개변수가 필수로 없어도 되는 생성자 / 필수입력이 없음
		public 클래스이름 (   )   {
		
		}
		
		필수 : 매개변수가 필수로 존재해야하는 생성자 / 필수로 작성해줬으면 하는 값을 표기
		public 클래스이름 (자료형 매개변수, 재료형 매개변수2) {
			this.변수명 = 매개변수;
			this.변수명2 = 매개변수2;
		}
			예를들어 회원가입을 진행할 때 필수로 이름 나이는 넣어주고
					결혼기념일 광고수신동의는 선택으로 하고 싶다면 필수로 이름 나이를 ( ) 넣어줌
			public 클래스이름 (String 이름, String 나이) {
				this.이름 = 이름;
				this.나이 = 나이;
			}
			
		void   : 어떤 행동을 수행하기 위해 작성하고, 수행한다음 특별히 전달할 내용이 없을 때 사용
				 void vocare 라틴어 보이다 비어있다
				 특정 행동을 하고 난 다음에 행동을 끝내는 것이지 값을 전달하거나 추가로 어떤 행동을 하지 않음
			예제
				public void 특정행동이름 () {	
					//행동하거나 보여주고싶은 내용 작성
				}
				
				public void 특정행동이름 (매개변수) { 
					//행동하거나 보여주고싶은 내용 작성
				}
				
		return : 어떤 행동을 실행하고 행동을 한 다음에 행동에 대한 결과를 필요한 곳에 전달
			
			메서드를 작성해줄 때 컴퓨터가 어떤 자료형인지(공간을 얼마나 줘야하는지)를 전달해주고
				처음에 작성한 자료형과 마지막에 전달할 자료형이 동일해야함
			
			예제
				public 자료형 특정행동이름 () {	
					return 자료형;
				}
				
				public 자료형 특정행동이름 (매개변수) { 
					return 자료형;
				}
				
				
			//문자열을 전달  = String
			 public String 특정행동1 () {
			 	return "안녕하세요";  // 위에 String을 작성했으니 return 다음에 String을 작성
			 }
			 
			 public int  특정행동2() {
			 
			 	return 1; 			// public 옆에 int 를 작성했으니 return 다음에 숫자값을 작성
			 }
			
	main : 최종으로 실행하거나 최종으로 실행하고 싶은 내용만 작성하는 메서드
	
	public static void main(String[] args) {
		// 정말로 출력하거나 실행하고싶은 내용만 작성
	}
*/









public class 기본메서드 {

}
