package firstStep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> list = new LinkedHashMap<>();
		list = inputData(3);
		print(list);
	}

	private static void print(LinkedHashMap<String, Integer> list) {
		// TODO Auto-generated method stub
		for( Entry<String, Integer> elem : list.entrySet()){
            // list 각각 hashmap받아서 출력합니다.
            System.out.println( String.format("%s, %d", elem.getKey(), elem.getValue()) );
        }
	}

	private static LinkedHashMap<String, Integer> inputData(int i) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(int j = 0; j < i; j++) {
				result.put(br.readLine(), Integer.parseInt(br.readLine()));
			}
			br.close();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return result;
	}

}
