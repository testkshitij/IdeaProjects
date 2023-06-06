//Print file name using listFiles method and print the characters inside it also.

package file_handling;

import java.io.File;

public class File9 {

    public static void main(String[] args) {

        File fil=new File("D:\\Raghu");
        File fls[]=fil.listFiles();

        for(File f : fls)
        {
            if (f.getName().endsWith(".java"))
                System.out.println(f.getName()+" , size "+f.length());
        }
    }

}
