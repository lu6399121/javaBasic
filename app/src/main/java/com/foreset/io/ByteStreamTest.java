package com.foreset.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.RandomAccessFile;

/**
 * Created by zxl on 2016/6/21 0021 10:25.
 */
public class ByteStreamTest {
    public static void main(String args[]) {
        ByteStreamTest byteStreamTest = new ByteStreamTest();
        byteStreamTest.writeToByteArray();
    }



    private void writeToByteArray() {
        String source = "Hello world!";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(source.getBytes("UTF-8"));
            byte[] bytes = outputStream.toByteArray();
            String result = new String(bytes);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromByteArray() {
        byte[] bytes = new byte[1024];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        int data = byteArrayInputStream.read();
        while (data != -1) {
            //do something
            data = byteArrayInputStream.read();
        }
    }

    private void randomAccessFileTest() {
        String filePath = "filePath";
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw");
            randomAccessFile.seek(100);
            randomAccessFile.read();
            randomAccessFile.write(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void pipedStreamTest() {
        PipedInputStream pipedInputStream = new PipedInputStream();
    }

    private void objectStreamTest() {


    }

}
