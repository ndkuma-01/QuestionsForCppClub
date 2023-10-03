package Easy.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Basics {

    //Interacting with text files is very important skill
    //In this folder there is a file called input.txt
    //Feel free to open input.txt and add your own stuff to the file
    // currently it has 1 2 3 4 5 on seperate lines
    public static void main(String[] args) throws FileNotFoundException {

        //To access it we need to import scanner and then call it
        //Instead of putting System.in, we want to put our file here
        //So we declare a new File([Insert path as a string])
        //Then we can put our path inside there^^^, I put a relative path as shown below
        //Keep in mind that when you need to import Scanner, File, and FileNotFoundException
        //last put "throws FileNotFoundException" to the main method syntax (line 13).
        // this says that if Java can't find the file with the given path it won't panic like crazy
        Scanner stdin = new Scanner(new File("src/Easy/FileIO/input.txt"));

        //after all of this we can treat the stdin as if we were reading from the console:
        while(stdin.hasNextLine()){
            System.out.println(stdin.nextLine());
        }

        //remember to close your scanner:
        stdin.close();

        //To write to a file use a PrintWriter

        PrintWriter pw = new PrintWriter(new File("src/Easy/FileIO/input.txt"));

        //we can then print stuff to the file as if we were printing ot the console:
        pw.println("hello!");

        //however everything you print using printwrite will only be printed if there is a close statement:
        pw.close();

    }

    //from this point on you should be able to work with files,
    //this skill will be thoroughly useful for our future purposes



}
