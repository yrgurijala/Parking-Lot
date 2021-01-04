package com.myparking;

import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Welcome to Yash Parking Lot");
        System.out.println("We charge $2 for every hour" + "\n");

        InputFile files = new InputFile();
        File file1 = new File("input1.txt");
        //File file2 = new File("input2.txt");
        //File file3 = new File("input3.txt");
        //File file4 = new File("input4.txt");

        files.processInput(file1);
        //files.checkInput(file2);
        //files.checkInput(file3);
        //files.processInput(file4);
    }
}