import org.json.simple.JSONObject; // JSON객체 생성
import org.json.simple.parser.JSONParser; // JSON객체 파싱
import org.json.simple.parser.ParseException; // 예외처리

public class JSONTEST {
	String json;
    void jsonadd() {
        JSONObject inner = new JSONObject();
        inner.put("name",  "noza"); // key는 "name", value는 "송요시"
        inner.put("gender", "양성"); // key는 "gender", value는 "여자"
        inner.put("age", "25"); // key는 "age", value는 "25"
        inner.put("address", "나고야"); // key는 "address", value는 "서울"
        
        JSONObject outer = new JSONObject();
        outer.put("inf", inner);
        
        json = outer.toJSONString(); // JSON객체를 String으로 변환
 
        System.out.println(json);
        
    }
}
