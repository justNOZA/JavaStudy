import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSonParse {

public static void main(String[] args) throws ParseException { // ����ó��
        
		JSONTEST jsonAdd = new JSONTEST();
        jsonAdd.jsonadd(); // ���� ���� JSON ���� Ŭ������ �ҷ���
        
        JSONParser parser = new JSONParser(); // �Ľ� �۾��� �ϱ� ���� ��ü�� ����� ��
        
        JSONObject obj = (JSONObject)parser.parse(jsonAdd.json); // String json�� �Ľ̹��� ��, JSONObject ���·� ������
        JSONObject inf = (JSONObject)obj.get("inf");
        
     // "" ���� String�̱� ������ (String)inf.get���� ����ȯ
        String name = (String)inf.get("name"); // inf��ü�� name���� �Ľ�
        String gender = (String)inf.get("gender"); // inf��ü�� gender���� �Ľ�
        String age = (String)inf.get("age"); // inf��ü�� age���� �Ľ�
        String address = (String)inf.get("address"); //inf��ü�� address���� �Ľ�
        
        System.out.println("�̸� : " + name);
        System.out.println("���� : " + gender);
        System.out.println("���� : " + age);
        System.out.println("�ּ� : " + address);
    }

}
