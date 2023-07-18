package JavaIO;

import java.io.*;

public class ManipulateDataInStream {
    public static void main(String[] args)  {
        String newFilePath = "/Users/changli/Desktop/Java syntax/data/newFolder/newFile.txt";
        String wordPath = "/Users/changli/Desktop/Java syntax/data/word.txt";

        File srcFile = new File(wordPath);
        File destFile = new File(newFilePath);

//      Buffer in and out
        BufferedReader reader = null;
        PrintWriter writer = null;
//      Buffered Area
        byte[] cache = new byte[1024];

        try {
            reader = new BufferedReader(new FileReader(srcFile));
            writer = new PrintWriter(destFile);

//            bufferIn = new BufferedInputStream(in);
//            bufferOut = new BufferedOutputStream(out);

//            for (int index = 0; index < srcFile.length(); index++) {
//                int data = in.read();
//                if(data != -1) {
//                    System.out.println(data);
//                    out.write(data);
//                }
//            }

            String line = null;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.println(line);
//                System.out.println(cache.length);
//                bufferOut.write(cache, 0, data);
//                out.write(data);
            }

            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try{
                    reader.close();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }

            if (writer != null) {
                writer.close();
            }
        }


    }
}
