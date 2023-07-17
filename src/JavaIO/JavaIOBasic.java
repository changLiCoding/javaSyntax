package JavaIO;

import java.io.File;

public class JavaIOBasic {
    public static void main(String[] args) {
//        Java data Input and Output
//        Stream in between
        String filePath = "/Users/changli/Desktop/Java syntax/data/newFolder";
        File file = new File(filePath);
        System.out.println(file.isFile());
        System.out.println(file.getFreeSpace());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        if(file.exists()) {
            System.out.println("The file object exists");
        } else {
            System.out.println("The file object does not exist.");
            file.mkdir();
            File newFile = new File("/Users/changli/Desktop/Java syntax/data/newFolder/newFile.txt");
            try {
                newFile.createNewFile();
                System.out.println(newFile.length());
            } catch (Exception e) {
                System.out.println("Something wrong");

                e.printStackTrace();
            }
        }
    }
}
