package io.zwt.chapter20;


// Using directories

import java.io.File;

public class DirList {

    public static void main(String[] args) {
        String dirname = "resources";
        File f1 = new File(dirname);

        // Output absolute path for debugging reference

        System.out.println(f1.getAbsolutePath());

        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);
            String[] s = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }
}
