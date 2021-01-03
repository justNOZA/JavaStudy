import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

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
		
        return answer;
    }
	
	public int solution2(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }
	
	public int solution3(String skill, String[] skill_trees) {
		int answer = 0;

		int index = 0;
		while(true) {
			String skill_tree = skill_trees[index];
			String skill_clone = new String(skill_tree);
			int size = skill_tree.length();
			for (int i =0; i < size; i++) {
				String oneSkill = String.valueOf(skill_clone.charAt(i));
				if (!skill.contains(oneSkill)) {
					skill_tree = skill_tree.replace(oneSkill, "");
				}
			}
			if (skill.indexOf(skill_tree) == 0) {
				answer++;
			}
			index++;
			if(index == skill_trees.length) break;
		}
		
		return answer;
		}
	public int solution4(String skill, String[] skill_trees) {
	    int answer = 0;
	    int treeLength = skill_trees.length;
	    for(int i=0; i<treeLength; i++){
	        int skillIndex=0;
	        boolean flag = true;

	        int treeIdxLength = skill_trees[i].length();
	        for(int j=0; j<treeIdxLength; j++){

	            int skillLength = skill.length();
	            for(int k=skillIndex; k<skillLength; k++){
	                if(skill.charAt(k) == skill_trees[i].charAt(j)){
	                    if(k!=skillIndex){
	                        flag = false;
	                    }else{
	                        skillIndex++;
	                    }

	                }
	            }
	        }

	        if(flag == true){
	            answer ++;
	        }
	    }
	        return answer;
	    }
}
