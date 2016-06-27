package com.foreset.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by zxl on 2016/6/22 0022 09:44.
 * channel,buffer, selector
 */
public class NIOTest {
    public static void main(String args[]) {
        NIOTest nioTest = new NIOTest();
      //  nioTest.channelTest();
        nioTest.channelTransferTest();
    }

    private void channelTest(){
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("D:\\git-place\\IOPractice\\IOPractice.iml","rw");
            FileChannel fileChannel = randomAccessFile.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(48);
            int bytesRead = fileChannel.read(byteBuffer);
            while (bytesRead != -1) {
                System.out.println("Read " + bytesRead);
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()) {
                    System.out.println((char)byteBuffer.get());
                }
                byteBuffer.clear();
                bytesRead = fileChannel.read(byteBuffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void channelTransferTest(){
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("D:\\git-place\\IOPractice\\IOPractice.iml","rw");
            FileChannel fromChannel = randomAccessFile.getChannel();

            RandomAccessFile toFile = new RandomAccessFile("D:\\git-place\\IOPractice\\toIOPractice.txt","rw");
            FileChannel toChannel = toFile.getChannel();

            long position = 0;
            long count = fromChannel.size();

         //   toChannel.transferFrom(fromChannel,position, count);
            fromChannel.transferTo(position, count, toChannel);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void bufferTest() {

    }

    private void selectorTest() {

    }
}
