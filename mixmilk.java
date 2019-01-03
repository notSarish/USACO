import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
ID:  dreosh
LANG: JAVA
TASK: friday
*/

public class mixmilk =
{

	public static void main(String[] args) throws IOException
	{	
		Scanner scan = new Scanner(new File("mixmilk.in"));
		PrintWriter out = new PrintWriter(new File("mixmilk.out")); 
		int ca = 0; 
		long[] level = new long[3];	
		long[] cap = new long[3]; 
		while(ca<3)
		{
			cap[ca] = Integer.parseInt(scan.next());
			level[ca] = Integer.parseInt(scan.next());
			ca++;
		}
		int i =0;
		while(i<100)
		{
			if(level[i%3] + level[(i+1)%3] <= cap[(i+1)%3])
			{
				level[(i+1)%3] = level[(i+1)%3] + level[i%3];
				level[i%3] = 0;
			}
			if(level[i%3] + level[(i+1)%3] > cap[(i+1)%3])
			{
				level[i%3] = level[i%3] - (cap[(i+1)%3] - level[(i+1)%3]);
				level[(i+1)%3] = cap[(i+1)%3];		
			}
			i++;
		}
		
		out.println(level[0]);
		out.println(level[1]);
		out.println(level[2]);
		out.close();


	}
	
}