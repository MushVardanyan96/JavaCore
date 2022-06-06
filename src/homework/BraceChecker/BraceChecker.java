package homework.BraceChecker;

import java.util.Stack;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack myStack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char a;
            switch (c) {
                case '{':
                case '[':
                case '(':
                    myStack.push(c);
                    break;
                case '}':
                    a = (char) myStack.pop();
                    if (a != '{') {
                        System.out.println("error " + i + " opened " + a + " butclosed " + c);
                    }
                    break;
                case ']':
                    a = (char) myStack.pop();
                    if (a != '[') {
                        System.out.println("error " + i + " opened " + a + " butclosed " + c);
                    }
                case ')':
                    a = (char) myStack.pop();
                    if (a != '(') {
                        System.out.println("error " + i + " opened " + a + " butclosed " + c);
                    }
                    break;
            }
        }
    }
}

