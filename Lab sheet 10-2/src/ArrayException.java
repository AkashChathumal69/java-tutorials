public class ArrayException {
    public static void main(String[] args)
    {
        try{
            int arr[]=new int[5];
            arr[5]=10;
            System.out.println("value :"+arr[5]);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
