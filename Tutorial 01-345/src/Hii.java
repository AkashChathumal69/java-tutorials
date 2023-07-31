/*04.
  Break
10
20
I’m  out of the Loop now.

  Continue
10
20
40
50
I’m  out of the Loop now.


05.
    i)
    Excellent!
    Your grade is A

    ii)
    Excellent!
    You passed
    Better Try Again
    Your grade is A  */

    //   iii)
public class Hii
{           
    public static void main(String[] args)
      {
        char grade ='A';
	
        if(grade=='A')
        {
            System.out.println("Excellent!"); 
        }
        else if(grade=='D')
        {
            System.out.println("You passed");
        }
        else if(grade=='F')
        {
            System.out.println("Better Try Again");
        }
        else
        {
            System.out.println("Invalid grade");
        }	
	
	System.out.println("Your grade is "+grade);
      }
}
