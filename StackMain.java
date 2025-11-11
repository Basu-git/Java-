import java.util.Scanner;

class Stack {
    private int maxsize = 10;
    private int top;
    private int[] stackarray;

    public Stack() {
        stackarray = new int[maxsize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxsize - 1) {
            System.out.println("Stack is full. Unable to push " + value);
            return;
        }
        stackarray[++top] = value;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Popped " + stackarray[top--] + " from the stack");
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack:");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackarray[i] + " ");
        }
        System.out.println();
    }
}

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Display");
            System.out.println("4) Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter a number to push:");
                    int num = scanner.nextInt();
                    stack.push(num);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }
}
