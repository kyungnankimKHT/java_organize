package pre.propertiesEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropTest {
	//메인메서드
	public static void main(String[] args) {
		Properties p = new Properties();
		//p.fileSave(); -> p 밑에서 추가로 가져오거나 작성할 때 사용하는 것
		// 메서드를 따로 만들어줬기 때문에 위 방법으로 사용하지 않음
		
		fileSave(p);
		fileOpen(p);
	}
	
	
	public static void fileSave(Properties p) {
		p.setProperty("1", "순풍산부인과,1998,682");
		p.setProperty("2", "똑바로살아라,2002,239");
		p.setProperty("3", "눈물의여왕,2024,16");
		p.setProperty("4", "아내의유혹,2008,129");
		//xml 텍스트 기반의 문서 웹에서 읽기 편하도록 < > 규칙을 지정해서 작성하는 공간
		//Properties xml 파일로저장
		try {
			FileOutputStream fos = new FileOutputStream("drama.xml");
			p.storeToXML(fos, null);
			fos.close();
			System.out.println("데이터가 drama.xml 파일에 저장되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void fileOpen(Properties p) {
		try {
			FileInputStream fis = new FileInputStream("drama.xml");
			p.loadFromXML(fis); //글이 적혀있는 xml 파일을 불러오기
			fis.close();
			
			//Properties 객체에 키-값을 넣어서 List 저장
			
			List<Drama> 드라마들 = new ArrayList<>();
			for(String key : p.stringPropertyNames()) {
				String[] values = p.getProperty(key).split(","); 
				String name = values[0];
				int 출시년도 = Integer.parseInt(values[1]);
				int 몇부작 = Integer.parseInt(values[2]);
				
				Drama 드라마 = new Drama(name, 출시년도, 몇부작);
				드라마들.add(드라마);
			}
			
			//정렬을 할 때는 정렬하는 기준
			//		정렬할 때는 이름이면 이름 년도별 몇부작  정렬하는 기준 
			//	담겨있는 드라마들을 다시정렬하겠다.   정렬하는 기준  Drama[0] = name
			Drama[] 드라마정렬 = 드라마들.toArray(new Drama[0]);
			//Drama[] 드라마정렬 = 드라마들.toArray(new Drama[1]); //출시년도 기준 정렬
			//Drama[] 드라마정렬 = 드라마들.toArray(new Drama[2]); //몇부작 기준 정렬
			Arrays.sort(드라마정렬);
			
			
			System.out.println("드라마 목록 : ");
			for(Drama d     :   드라마들) {
				System.out.println(d);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	//drama.xml
}









