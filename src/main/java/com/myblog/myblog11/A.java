package com.myblog.myblog11;

import java.util.Scanner;
public class A
{


        public static void main(String[] args) {
            // Creating Strings
            String str1 = "Hello, World!";
            String str2 = new String("Java Strings");

            // String Concatenation
            String firstName = "John";
            String lastName = "Doe";
            String fullName = firstName + " " + lastName;

            // String Length
            String text = "Java is awesome!";
            int length = text.length();

            // Accessing Characters
            String str3 = "Hello";
            char firstChar = str3.charAt(0);

            // Substring
            String original = "Java Programming";
            String sub = original.substring(5, 16);

            // String Comparison
            String str4 = "Hello";
            String str5 = "hello";
            boolean areEqual = str4.equals(str5);

            // String Manipulation
            String sentence = "   Java is Fun!   ";
            String trimmed = sentence.trim();

            // Immutable Nature
            String immutableStr = "Immutable";
            immutableStr = immutableStr.concat(" Example");

            // String Pool
            String str6 = "Hello";
            String str7 = "Hello";

            // StringBuilder and StringBuffer
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");

            // Output
            System.out.println("str1: " + str1);
            System.out.println("str2: " + str2);
            System.out.println("fullName: " + fullName);
            System.out.println("Length of text: " + length);
            System.out.println("First character of str3: " + firstChar);
            System.out.println("Substring: " + sub);
            System.out.println("Are str4 and str5 equal? " + areEqual);
            System.out.println("Trimmed sentence: " + trimmed);
            System.out.println("Modified immutableStr: " + immutableStr);
            System.out.println("Are str6 and str7 the same object? " + (str6 == str7));
            System.out.println("StringBuilder result: " + sb.toString());
        }
    }




