package file_handling;

import java.io.FileInputStream;
import java.io.IOException;

public class File3 {

    public static void main(String[] args) {

        FileInputStream fin=null;
        try
        {
            fin=new FileInputStream("D:\\demo.txt");
            byte b[]=new byte[fin.available()];
            fin.read(b);
            String s1=new String(b);
            System.out.println(s1);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                fin.close();
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
        }
    }
}
