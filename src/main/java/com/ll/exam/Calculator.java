package com.ll.exam;

public class Calculator {
    public static int run(String str){
        if(str.contains(" - ")){
            String[] splitString=str.split(" - ");
            int n1=Integer.parseInt(splitString[0]);
            int n2=Integer.parseInt(splitString[1]);
            return n1-n2;
        }
        if(str.contains("*")){
            String[] splitString=str.split(" \\* ");
            int n1=Integer.parseInt(splitString[0]);
            int n2=Integer.parseInt(splitString[1]);
            return n1*n2;
        }
        String[] splitString=str.split(" \\+ ");
        int n1=Integer.parseInt(splitString[0]);
        int n2=Integer.parseInt(splitString[1]);
        return n1+n2;

    }
}
