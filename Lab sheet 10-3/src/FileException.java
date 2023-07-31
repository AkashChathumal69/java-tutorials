import java.io.File;
import java.io.FileNotFoundException;

public class FileException {
    public static void main(String[] args)
    {
        try
        {
            boolean file = false;
            File f1=new file ("C:\Users\Dell\OneDrive\Documents\NetBeansProjects\javatemp\sample.txt");
            System.out.println(f1.exists());
            
            new file=f1.createNewFile();
        }

        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
