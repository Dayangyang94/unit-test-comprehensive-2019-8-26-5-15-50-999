package tw.commands;

import java.util.ArrayList;
import java.util.List;



public class GuessInputToList {
	private List<Integer> answer=new ArrayList<>();

	 public GuessInputToList() {
	  // TODO Auto-generated constructor stub
	 }
	 public List<Integer> getArray(String input) {
	  String[] strs=input.split(" ");
	  for(int i=0;i<strs.length;i++) {
		  answer.add(Integer.valueOf(strs[i]));
	   
	  }
	  
	  return answer;
	  
	 }
	
	

}
