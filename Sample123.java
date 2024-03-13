package Exception_Handling_Concept;

import java.io.IOException;
import java.util.Scanner;

public class Sample123
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the time limit in seconds");
	int second=sc.nextInt();
	Runtime r1=Runtime.getRuntime();
	System.out.println("PC will shutdown within" +second+"seconds");
	try{
		r1.exec("shutdown -s -t "+second);
	}
	catch(IOException e)
	{
		e.printStackTrace(); 
	}
}
}
