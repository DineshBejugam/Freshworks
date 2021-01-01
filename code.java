import java.util.*;
import java.io.*;
public class FWorks 
{
    public static void path(String fpath)
    {
        if(!fpath.equals("0"))
        {
            try
            {
                File fstore = new File(fpath);
                if (fstore.createNewFile())
                {
                  System.out.println("File created: " + fstore.getName());
                }
                else
                {
                  System.out.println("File already exists.");
                }
            }
            catch (IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        else
        {
            try
            {
                File fstore = new File("textfile.txt");
                if (fstore.createNewFile())
                {
                  System.out.println("File created: " + fstore.getName());
                }
                else
                {
                  System.out.println("File already exists.");
                }
            }
            catch (IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fpath = scan.nextLine();
        fpath = fpath.replace("\\","\\\\");
        path(fpath);
        scan.close();
    }   
}
