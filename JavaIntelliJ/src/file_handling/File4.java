package file_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class File4 {
    public static void main(String[] args) throws Exception {

        String s="Java is very easy if you practice";
        FileOutputStream fout=new FileOutputStream("D:\\copydemo.txt");

        for (int i=0;i<s.length();i++)
        {
            fout.write(s.charAt(i));
        }

//        byte bt[]=s.getBytes();
//        fout.write(bt);

        fout.flush();
        fout.close();
        System.out.println("Successfully written");
    }
}
