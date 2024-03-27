import java.util.*;

public class Main {
    public static void main(String[] args) {
        lib.clearConsole();
        Stack<String> stack = new Stack<String>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a postfix expression: ");
        String exp = input.nextLine();
        Scanner scan = new Scanner(exp);
        scan.useDelimiter(" ");
        lib.clearConsole();

        while (scan.hasNext()) {
            stack.push(scan.next());
            switch (stack.peek()) {
                case "+":
                    stack.pop();
                    Integer num2 = Integer.valueOf(stack.pop()); // the assignment here is kind of backwards because pop() returns the second number at first, so the second number needs to be assigned first
                    Integer num1 = Integer.valueOf(stack.pop());
                    stack.push(((Integer)(num1 + num2)).toString());
                    break;

                case "-":
                stack.pop();
                    Integer num4 = Integer.valueOf(stack.pop());
                    Integer num3 = Integer.valueOf(stack.pop());
                    stack.push(((Integer)(num3 - num4)).toString());
                    break;

                case "*":
                    stack.pop();
                    Integer num6 = Integer.valueOf(stack.pop());
                    Integer num5 = Integer.valueOf(stack.pop());
                    stack.push(((Integer)(num5 * num6)).toString());
                    break;

                case "/":
                stack.pop();
                    Integer num8 = Integer.valueOf(stack.pop());
                    Integer num7 = Integer.valueOf(stack.pop());
                    stack.push(((Integer)(num7 / num8)).toString());
                    break;

                case "%":
                    stack.pop();
                    Integer num10 = Integer.valueOf(stack.pop());
                    Integer num9 = Integer.valueOf(stack.pop());
                    stack.push(((Integer)(num9 % num10)).toString());
                    break;

                case "^":
                    stack.pop();
                    Integer num12 = Integer.valueOf(stack.pop());
                    Integer num11 = Integer.valueOf(stack.pop());
                    stack.push(((Math.pow(num11, num12) + ""))); //Turns out doubles can be turned into string by just adding "" to them
                    break;    
            }
        }
       System.out.println("Expression entered: " + exp);
       System.out.println("Solution: " + stack.peek());
       input.close();
       scan.close();
    }
}
