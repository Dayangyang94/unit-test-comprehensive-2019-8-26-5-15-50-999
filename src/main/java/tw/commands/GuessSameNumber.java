package tw.commands;

import java.util.List;

import org.mockito.internal.runners.StrictRunner;

public class GuessSameNumber {
	private String answer;
	public GuessSameNumber(String answer) {
		this.answer=answer;
		}
	 public int countSameNumber(List<Integer> guessinput) {
		 int number=0;
		
		for(int i=0;i<answer.length();i++) {
			String string=answer.substring(i,i+1);
			if(Integer.parseInt(string)==guessinput.get(i))
				number++;
		}
		return number;
		 
	 }
	 public int countContainsNumbers(List<Integer> guessinput) {
		 int num=0;
		 for (Integer integer : guessinput) {
			if(answer.contains(Integer.toString(integer))) {
				num++;
			}
		}
		 return num;
	 }

}
