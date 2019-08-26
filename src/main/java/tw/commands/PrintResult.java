package tw.commands;

import java.util.List;

public class PrintResult {
	private String answer;
	private GuessInputToList guessInputToList=new GuessInputToList();
	private GuessSameNumber guessSameNumber=new GuessSameNumber(answer);
	public PrintResult(GuessSameNumber guessSameNumber) {
		this.guessSameNumber=guessSameNumber;
		}
	public String  print(String str) {
		List<Integer> list =guessInputToList.getArray(str);
		int num1=guessSameNumber.countSameNumber(list);
		int num2=guessSameNumber.countContainsNumbers(list);
		String output=num1+"A"+num2+"B";
		return output;
		
	}


}
