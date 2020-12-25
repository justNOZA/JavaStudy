import java.util.Arrays;
import java.util.HashMap;

import javax.swing.table.TableStringConverter;

public class Hash01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"leo", "kiki", "eden"};
		String[] a2 = {"eden", "kiki"};
		
		String a3 =solution(a, a2);
		if(a3.equals("leo")) System.out.println("A(sol_01) is correct");
		
		a3 =solution2(a, a2);
		if(a3.equals("leo")) System.out.println("A(sol_02) is correct");
		
		String[] b = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] b2 = {"josipa", "filipa", "marina", "nikola"};
		
		String b3 = solution(b, b2);
		if(b3.equals("vinko")) System.out.println("B(sol_01) is correct");
		
		b3 = solution2(b, b2);
		if(b3.equals("vinko")) System.out.println("B(sol_02) is correct");
		
		String[] c = {"mislav", "stanko", "mislav", "ana"};
		String[] c2 = {"stanko", "ana", "mislav"};
		
		String c3 = solution(c, c2);
		if(c3.equals("mislav")) System.out.println("C(sol_01) is correct");
		
		c3 = solution2(c, c2);
		if(c3.equals("mislav")) System.out.println("C(sol_02) is correct");
		
	}

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        if(answer.isEmpty()) {
            answer = participant[participant.length - 1];
        }
        return answer;
    }
    
    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
