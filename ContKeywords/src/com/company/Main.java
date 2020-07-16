package com.company;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Java source file:");
        String fileName = input.nextLine();
        File file = new File(fileName);
        if(file.exists()){
            System.out.println("The number of keywords in: " + fileName + " is " + countKeywords(file));
        }
        else{
            System.out.println("File " + fileName + " does not exist");
        }
    }
    public static int countKeywords(File file) throws Exception{
        // Array of all Java keywords + true, false and null
        String[] keywordString = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"};
        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;
        Scanner input = new Scanner(file);
        while (input.hasNext()){
            String word = input.next();
            if(keywordSet.contains(word)){
                count++;
            }
        }
        return count;

    }
}
