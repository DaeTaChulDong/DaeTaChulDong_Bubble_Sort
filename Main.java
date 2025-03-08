package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정렬할 배열을 입력해주세요: (ex. 2 56 44 23 4 9 6)");
        String j = scanner.nextLine();
        String[] input = j.split(" ");
        List<Integer> v = new ArrayList<>();
        for (String s : input) {
            v.add(Integer.parseInt(s));
        }

        int place = 0;
        for(int b=0; b<v.size()-1;b++){
            int tmp=v.get(b);
            for (int a = b+1; a < v.size(); a++) {
                if (tmp > v.get(a)) {
                    tmp = v.get(a);
                    place = a;
                }
            }
            if(tmp!=v.get(b)){
                v.set(place, v.get(b));
                v.set(b, tmp);
            }
        }
        System.out.println("정렬된 배열은 다음과 같습니다: "+v);
    }
}