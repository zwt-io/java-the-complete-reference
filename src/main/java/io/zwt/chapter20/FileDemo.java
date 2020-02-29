package io.zwt.chapter20;

// Demonstrate File.

import java.io.*;

public class FileDemo {

    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        int i;

        File f1 = new File("\\\\localhost\\Users\\tao\\Desktop\\java-the-complete-reference\\src\\main\\resources\\java\\LUCK");
        System.out.println("_______________Get started----------");
//        boolean success = f1.renameTo(new File("java/LUCK"));
//        System.out.println("is renamed: " + success);
        System.out.println("---------------Content--------------");

        p("File Name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Abs Path: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "does not exist");
        p(f1.canWrite() ? "is writeable" : "is not writeable");
        p(f1.canRead() ? "is readable" : "is not readable");
        p("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
        p(f1.isFile() ? "is normal file" : "might be a named pipe");
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified: " + f1.lastModified());
        p("File size: " + f1.length() + "Bytes");


        // The following code uses a try-with-resources statement to open
        // a file and then automatically close it when the try block is left.

        try (FileReader fin = new FileReader(f1)) {

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        }
    }
}
