import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Skill_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "CDA"};
		
		if(solution(skill, skill_trees) == 2) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
		}

	}
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        A:
        for(String i : skill_trees) {
        	int count = 0;
        	for(int j = 0; j < skill.length(); j++) {
        		char skillSet = skill.charAt(j);
        		if(count != j) continue A;
        		if(i.indexOf(skillSet) != -1) {
        			list.add(i.indexOf(skillSet));
        			list2.add(i.indexOf(skillSet));
        			count++;
        		}
        	}
        	Collections.sort(list);
        	if(Arrays.equals(list.toArray(), list2.toArray())) {
        		answer++;
        	}
        	list.clear();
        	list2.clear();
        }
        return answer;
    }
}
