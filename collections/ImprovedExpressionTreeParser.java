package collections;

import java.util.Scanner;
import java.util.Stack;

class Node {
    String value;
    Node left;
    Node right;

    Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class ImprovedExpressionTreeParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mathematical expression: ");
        String expression = scanner.nextLine();

        if (areParenthesesBalanced(expression)) {
            Node root = buildExpressionTree(expression);

            System.out.println("Expression Tree:");
            printExpressionTree(root, 0);
        } else {
            System.out.println("Error: Unbalanced parentheses in the expression.");
        }
    }

    private static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // Unbalanced closing parenthesis
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // True if all opening parentheses have matching closing parentheses
    }

    private static Node buildExpressionTree(String expression) {
        String[] tokens = expression.split("\\s+");
        Stack<Node> stack = new Stack<>();

        for (String token : tokens) {
            Node node = new Node(token);

            if (isOperator(token)) {
                node.right = stack.pop();
                node.left = stack.pop();
            }

            stack.push(node);
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static void printExpressionTree(Node root, int indent) {
        if (root == null) {
            return;
        }

        printExpressionTree(root.right, indent + 4);

        for (int i = 0; i < indent; i++) {
            System.out.print(" ");
        }
        System.out.println(root.value);

        printExpressionTree(root.left, indent + 4);
    }
}
