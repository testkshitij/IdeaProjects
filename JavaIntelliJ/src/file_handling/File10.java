//Add all the content of folder into another file

package file_handling;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class File10 {
    public static void main(String[] args) throws IOException {

        File fil=new File("D:\\Raghu");
        FileOutputStream fout=new FileOutputStream("D:\\RaghuCopy.txt");
        File fls[]=fil.listFiles();

        Vector<FileInputStream> vc=new Vector<FileInputStream>();

        for(File f:fls)
        {
            if(f.getName().endsWith(".java"))
                vc.add(new FileInputStream(f));
        }

        Enumeration e=vc.elements();

        SequenceInputStream sq=new SequenceInputStream(e);

        int bt=0;

        while ((bt=sq.read())!=0)
        {
            System.out.println((char) bt);
            fout.write(bt);
        }
        fout.flush();
        fout.close();
        sq.close();
    }
}
