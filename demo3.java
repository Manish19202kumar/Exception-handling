package Exception_Handling_Concept;

public class demo3 {
	
	public static void main(String[] args) 
			{
			  System.out.println("main start");
			 try{
		    	int i= 1/0;
		      }
		   finally
			   {
				   System.out.println("i am finally block");
			   }
			   System.out.println("main ends");

			}
		}


