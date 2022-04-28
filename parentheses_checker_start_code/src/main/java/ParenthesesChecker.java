import java.util.Stack;

public class ParenthesesChecker {


     public boolean checkParentheses(String test) {
        Stack<Character> stackTest = new Stack<>();
        for (char c : test.toCharArray()) {
            if (c == '(' || c == '{' || c == '[' || c == '<') {
                stackTest.push(c);
            } else if (!stackTest.empty() && (
                              (c == ')' && stackTest.peek() == '(') ||
                              (c == '}' && stackTest.peek() == '{') ||
                              (c == ']' && stackTest.peek() == '[') ||
                              (c == '>' && stackTest.peek() == '<'))) {
                stackTest.pop();


            }  else if (stackTest.empty() && ((c == ')' || c == '}' || c == ']' || c == '>'))) {
                        stackTest.push(c);

            }

        }
        return  stackTest.isEmpty() ? true : false;
    } // --- however does not work for "(])"
}






    /* -- Standard for loop --
    public boolean checkParentheses(String test) {
        Stack<Character> stackTest = new Stack<>();
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == '(') {
                stackTest.push(test.charAt(i));
            } else if (!stackTest.empty() && test.charAt(i)== ')' && stackTest.peek() == '(') {
                stackTest.pop();

            }  else if (stackTest.empty() && test.charAt(i) == ')'){
                stackTest.push(test.charAt(i));
            }
        }
        return  stackTest.isEmpty() ? true : false;
    }

}
 */








