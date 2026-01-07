package coding.strings;

public class EvaluateString {

    public static void main(String[] args) {

        String s = "2*4/4-3-1";
        System.out.println(evaluate(s));

    }

    public static int evaluate(String s){
        int result = 0;
        int current = 0;
        int last = 0;
        char operation = '+';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Correct digit check
            if (Character.isDigit(ch)) {
                current = current * 10 + (ch - '0');
            }

            // If operator or end
            if (!Character.isDigit(ch) || i == s.length() - 1) {

                switch (operation) {
                    case '+':
                        result += last;
                        last = current;
                        break;

                    case '-':
                        result += last;
                        last = -current;
                        break;

                    case '*':
                        last = last * current;
                        break;

                    case '/':
                        last = last / current;
                        break;
                }

                operation = ch;
                current = 0;
            }
        }

        // Add leftover last value
        result += last;

        return result;
    }
}
