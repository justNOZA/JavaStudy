import org.json.simple.JSONObject; // JSON��ü ����
import org.json.simple.parser.JSONParser; // JSON��ü �Ľ�
import org.json.simple.parser.ParseException; // ����ó��

public class JSONTEST {
	String json;
    void jsonadd() {
        JSONObject inner = new JSONObject();
        inner.put("name",  "noza"); // key�� "name", value�� "�ۿ��"
        inner.put("gender", "�缺"); // key�� "gender", value�� "����"
        inner.put("age", "25"); // key�� "age", value�� "25"
        inner.put("address", "�����"); // key�� "address", value�� "����"
        
        JSONObject outer = new JSONObject();
        outer.put("inf", inner);
        
        json = outer.toJSONString(); // JSON��ü�� String���� ��ȯ
 
        System.out.println(json);
        
    }
}
