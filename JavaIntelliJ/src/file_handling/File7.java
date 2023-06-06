//Copy the content from one folder to another folder.

package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class File7 {

    public static void main(String[] args) throws Exception {

        FileInputStream fin=new FileInputStream("D:\\demo.txt");
        FileOutputStream fout=new FileOutputStream("D:\\democ.txt");

        int bt=0;
        while((bt=fin.read())!=-1)
        {
            System.out.print((char) bt);
            fout.write(bt);
            Thread.sleep(100);
        }
        fin.close();
        fout.flush();
        fout.close();

    }

}
