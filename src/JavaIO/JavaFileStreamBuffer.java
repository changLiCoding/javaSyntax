package JavaIO;

import java.io.*;

public class JavaFileStreamBuffer {
    public static void main(String[] args)  {
        String newFilePath = "/Users/changli/Desktop/Java syntax/data/newFolder/newFile.txt";
        String wordPath = "/Users/changli/Desktop/Java syntax/data/word.txt";

        File srcFile = new File(wordPath);
        File destFile = new File(newFilePath);

        FileInputStream in = null;
        FileOutputStream out = null;
//      Buffer in and out
        BufferedInputStream bufferIn = null;
        BufferedOutputStream bufferOut = null;
//      Buffered Area
        byte[] cache = new byte[1024];

        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            bufferIn = new BufferedInputStream(in);
            bufferOut = new BufferedOutputStream(out);

//            for (int index = 0; index < srcFile.length(); index++) {
//                int data = in.read();
//                if(data != -1) {
//                    System.out.println(data);
//                    out.write(data);
//                }
//            }

            int data = 0;
            while((data = bufferIn.read(cache)) != -1) {
                bufferOut.write(cache, 0, data);
//                out.write(data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferIn != null) {
                try{
                    bufferIn.close();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }

            if (bufferOut != null) {
                try{
                    bufferOut.close();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
