package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File6 {

    public static void main(String[] args) {

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("C:\\Users\\KSHITIJ\\IdeaProjects\\JavaIntelliJ\\src\\basic.LeapYear.java");
            int count = 1, bt = 0;
            while ((bt = fin.read()) != -1)
            {
                if (bt == '\n')
                    count++;
            }
            System.out.println("No of lines " + count);
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        } catch (IOException e)
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
