public class Exception {
   
    public static void main(String[] args) 
    {
        int x=10,y=0,z;

        try
        {
            z=x/y;
            System.out.println("Answer is"+z);

        }

        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
