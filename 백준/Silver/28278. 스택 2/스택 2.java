//package algorithm;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    private static Deque<String> stack = new ArrayDeque<>();
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            appendStackResult(input);
        }
        System.out.println(sb);
    }

    private static void appendStackResult(String[] input) {
        switch (input[0]) {
            case "1" :
                stack.push(input[1]);
                break;
            case "2":
                if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append('\n');
                } else {
                    sb.append("-1").append('\n');
                }
                break;
            case "3":
                sb.append(stack.size()).append('\n');
                break;
            case "4":
                if (stack.isEmpty()) {
                    sb.append("1").append('\n');
                } else {
                    sb.append("0").append('\n');
                }
                break;
            case "5":
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append('\n');
                } else {
                    sb.append("-1").append('\n');
                }
                break;
        }
    }
}
