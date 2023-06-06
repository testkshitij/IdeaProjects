package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File1 {

    public static void main(String[] args) {

        FileInputStream fin=null;
        try
        {
            fin=new FileInputStream("D:\\demo.txt");
            int bt=0;
            while((bt=fin.read())!=-1)
            {
                System.out.print((char)bt);
            }
            System.out.println("Thank you");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File is not present");
        }
        catch (IOException e)
        {
            System.out.println("Can't read");
        }
        finally {
            try
            {
                fin.close();
            }
            catch (IOException e)
            {
                System.out.println("Can't close the file");
            }
        }
    }

}
