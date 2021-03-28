import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSonParse {

public static void main(String[] args) throws ParseException { // 예외처리
        
		JSONTEST jsonAdd = new JSONTEST();
        jsonAdd.jsonadd(); // 전에 만든 JSON 생성 클래스를 불러옴
        
        JSONParser parser = new JSONParser(); // 파싱 작업을 하기 위한 객체를 만들어 줌
        
        JSONObject obj = (JSONObject)parser.parse(jsonAdd.json); // String json을 파싱받은 뒤, JSONObject 형태로 저장함
        JSONObject inf = (JSONObject)obj.get("inf");
        
     // "" 안은 String이기 때문에 (String)inf.get으로 형변환
        String name = (String)inf.get("name"); // inf객체의 name정보 파싱
        String gender = (String)inf.get("gender"); // inf객체의 gender정보 파싱
        String age = (String)inf.get("age"); // inf객체의 age정보 파싱
        String address = (String)inf.get("address"); //inf객체의 address정보 파싱
        
        System.out.println("이름 : " + name);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
    }

}
