package com.ll.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Calculator {
    public static void main(String[] args) {
    }
    public static int run(String str){
        List<Character> op=Arrays.asList('+','-','*','/');
        Stack<Integer> stack=new Stack<>();
        List<String> splits= Arrays.stream(str.split(" ")).toList();

        List<Integer> numbers= splits.stream()
                .filter(x -> x.matches("^[0-9]+$"))
                .map(Integer::parseInt)
                .toList();


        if(str.contains("-")){
            return numbers.stream().reduce((x,y)->x-y).orElse(-1);
        }
        if(str.contains("*")){
            return numbers.stream().reduce(1,(x,y)->x*y);
        }
        if(str.contains("/")){
            return numbers.stream().reduce((x,y)->x/y).orElse(-1);
        }
        int sum=numbers.stream().reduce(0,Integer::sum);
        return sum;

    }
}
