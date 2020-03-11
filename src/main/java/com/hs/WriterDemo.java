package com.hs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author HS
 * @date 2019/12/03 00:24:54
 **/
public class WriterDemo {
    public static void main(String[] args)throws IOException {
        File file=new File("c:/Users/HS/Downloads/test/file.txt");
        Writer writer=new FileWriter(file);
        String data0="file  'c:/Users/HS/Downloads/test/hls-240p";
        String data1=".mp4'\r\n";
        for (int i=0;i<17;i++){
            String data=data0+i+data1;
            writer.write(data);
        }
        writer.close();
    }
}
