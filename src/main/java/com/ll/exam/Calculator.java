package com.ll.exam;

import java.util.*;
import java.util.stream.Collectors;

public class Calculator {
    public static void main(String[] args) {
       run("1 * 2 + 3");
    }
    public static int run(String str){
        Stack<String> stack=new Stack<>();
        Stack<Integer> numberStack=new Stack<>();
        List<String> splits= Arrays.stream(str.split(" ")).toList();
        List<String> result=new ArrayList<>();

         for(String s:splits){
             if(s.matches("^[0-9]+$")){
                 numberStack.push(Integer.parseInt(s));
                 continue;
             }
             if(stack.isEmpty()) {
                 stack.push(s);
                 continue;
             }
             if(stack.peek().equals("+")||stack.peek().equals("-")){
                 if(s.equals("*")||s.equals("/")){
                     String s1=stack.peek();
                     stack.pop();
                     stack.push(s);
                     stack.push(s1);
                 }
             }else{
                 stack.push(s);
             }
         }
        result.addAll(stack);
        System.out.println("NumberStack : "+numberStack);
        System.out.println("Op "+result);
        Loop1 :
       while(true){
           if(numberStack.size()==1) break;
           int n1=numberStack.peek();
           numberStack.pop();
           int n2=numberStack.peek();
           numberStack.pop();
           for(String s:result){
               switch (s){
                   case("+") : numberStack.push(n1+n2); result.remove(s); continue Loop1;
                   case("-") : numberStack.push(n1-n2); result.remove(s); continue Loop1;
                   case("*") : numberStack.push(n1*n2); result.remove(s); continue Loop1;
                   //case("/") : numberStack.push(n1/n2);
               }
           }
       }
        System.out.println(numberStack.peek());
        return numberStack.peek();
    }
}
