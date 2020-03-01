package io.zwt.chapter20;

// Directory of .HTML files.


import java.io.File;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "resources";
        File f1 = new File(dirname);
//        FilenameFilter only = new OnlyExt("html");
        String[] s = f1.list((dir, name) -> name.endsWith(".html"));

        assert s != null;
        for (String value : s) {
            System.out.println(value);
        }
    }
}
