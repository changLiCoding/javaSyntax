package JavaIO;

import java.io.*;

public class JavaFileObjClone {
    public static void main(String[] args)  {
        String newFilePath = "/Users/changli/Desktop/Java syntax/data/newFolder/newFile.txt";
        String wordPath = "/Users/changli/Desktop/Java syntax/data/word.txt";

        File srcFile = new File(wordPath);
        File destFile = new File(newFilePath);

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

//            for (int index = 0; index < srcFile.length(); index++) {
//                int data = in.read();
//                if(data != -1) {
//                    System.out.println(data);
//                    out.write(data);
//                }
//            }

            int data = 0;
            while((data = in.read()) != -1) {
                out.write(data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                try{
                    in.close();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }

            if (out != null) {
                try{
                    out.close();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
