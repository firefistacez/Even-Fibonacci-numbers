package com.example.problem2;

public class problem2 {
    public static int fibonacci(int i){
        int answer;
        if(i==0 || i==1)
        {
            answer = 1;
        }
        else
        {
            answer = fibonacci(i-2) + fibonacci(i-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        long total = 0L;
        int i = 1;
        while(fibonacci(i) < 4000000){
            int ans = fibonacci(i);
            if (ans % 2 == 0) {
                total = total + ans;
            }
            i += 1;
        }
        System.out.println(total);
    }
}

