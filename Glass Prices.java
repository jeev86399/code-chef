import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=2*a;
		if (c<b)
            System.out.println("PLASTIC");
        else
            System.out.println("METAL");  
	}
}
