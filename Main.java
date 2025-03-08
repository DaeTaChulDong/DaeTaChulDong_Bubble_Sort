package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("정렬할 숫자 배열을 입력하세요. ex) 3 4 8 32 3 0");
        List<Integer> v=new ArrayList<>();
        String abc=scanner.nextLine();
        String[] input=abc.split(" ");
        for(int i=0;i<input.length;i++){
            v.add(Integer.parseInt(input[i]));
        }

        for(int a=0; a<v.size()-1;a++){
            for(int b=0;b<v.size()-1-a;b++){
                if(v.get(b)>v.get(b+1)){
                    int tmp=v.get(b);
                    v.set(b, v.get(b+1));
                    v.set(b+1, tmp);
                }
            }
        }

        System.out.println("정렬된 배열은 다음과 같습니다: "+v);
    }
}