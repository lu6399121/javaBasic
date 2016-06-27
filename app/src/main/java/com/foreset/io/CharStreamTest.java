package com.foreset.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by zxl on 2016/6/22 0022 10:38.
 */
public class CharStreamTest {
    public static void main(String args[]) {
        CharStreamTest charStreamTest = new CharStreamTest();
        try {
            charStreamTest.readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readFile() throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\git-place\\IOPractice\\IOPractice.iml"))) {
            String lineContent = bufferedReader.readLine();
            while (lineContent != null) {
                System.out.println(lineContent);
                lineContent = bufferedReader.readLine();
            }
        }
    }
}
