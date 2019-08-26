package example;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.results.PrintableResult;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.omg.CORBA.PRIVATE_MEMBER;

import net.bytebuddy.jar.asm.commons.StaticInitMerger;
import tw.commands.GuessInputToList;
import tw.commands.GuessSameNumber;
import tw.commands.PrintResult;


public class GuessGameTest {
	private static  GuessInputToList guessInputToList;
	private static  GuessSameNumber guessSameNumber;

	@BeforeAll
	public static void setUp() {
		guessInputToList=new GuessInputToList();
	    guessSameNumber=new GuessSameNumber("1234");
	}
	@BeforeEach
	public void clearUp() {
		
	}
	  @Test
	    public void should_return_List_when_input_is_String() {
	        //given
		  List<Integer> list=new ArrayList<Integer>();
		
	      String input="1 2 3 4";  
	        //when
	       List<Integer> inputArr=guessInputToList.getArray(input);
	        //then
	       assertEquals((Integer)1,inputArr.get(0));
	       assertEquals((Integer)2,inputArr.get(1));
	       
	    }
	  @Test
	  public void should_count_same_number() {
		  //given
		  List<Integer> guessinput=new ArrayList<>();
		  guessinput.add(1);
		  guessinput.add(2);
		  guessinput.add(3);
		  guessinput.add(4);
		  GuessSameNumber guessSameNumber=new GuessSameNumber("1234");
		  //when
		  int number=guessSameNumber.countSameNumber(guessinput);
		  //then
		  assertEquals(4, number);
		  
	  }
	  
	  @Test
	  public void should_count_contains_number() {
		  //given
		  List<Integer> guessinput=new ArrayList<>();
		  guessinput.add(1);
		  guessinput.add(2);
		  guessinput.add(3);
		  guessinput.add(4);
		  GuessSameNumber guessSameNumber=new GuessSameNumber("1234");
		  //when
		  int num=guessSameNumber.countContainsNumbers(guessinput);
		  //then
		  assertEquals(4, num);
		  
	  }

	  @Test
	    public void should_verify_print_with_mockito() {
	        //given
	    	String string="1 2 3 4";
	    	PrintResult printResult=new PrintResult(guessSameNumber);
	        //when
	    	String output=printResult.print(string);
        //then
	    	 assertEquals("4A4B", output);
	    	
	    }


}
