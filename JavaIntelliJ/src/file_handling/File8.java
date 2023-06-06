//Print the file names from the folder.

package file_handling;

import java.io.File;

public class File8 {

    public static void main(String[] args) {

        File f1=new File("D:\\Raghu");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getParent());

        String fnames[]=f1.list();

        for (String nm:fnames)
        {
            System.out.println(nm);
        }
        System.out.println("Java files only");

        for(String nm:fnames)
        {
            if (nm.endsWith(".java"))
                System.out.println();
        }

    }
}
