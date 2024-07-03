//package implemention;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] word = input.split(" ");
            switch (word[0]) {

                case "push":
                stack.push(Integer.parseInt(word[1]));
                break;
                
                case  "pop":
                answer.add(stack.isEmpty() ? -1 : stack.pop());
                break;

                case "size":
                answer.add(stack.isEmpty() ? 0 : stack.size());
                break;

                case "empty":
                answer.add(stack.isEmpty() ? 1 : 0);
                break;

                case "top":
                answer.add(stack.isEmpty() ? -1 : stack.peek());
                break;
            }
        }
        for (int output : answer) {
            System.out.println(output);
        }
        
    }
}
