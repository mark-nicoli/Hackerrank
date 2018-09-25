package hackerrank;
import java.util.Scanner;

public class endoffile 
{
	public static void main(String[]args)
	{
		String sentence = "";
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<3;i++)
		{
			sentence = scan.nextLine();
			if(sentence == "end-of-file");
			{
				scan.close();
			}
		}
	}
}
