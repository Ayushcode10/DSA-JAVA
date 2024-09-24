package com.ADSA;
class ValidParen {
    public boolean isValid(String s) {
        // Counters for each type of bracket
        int round = 0;  // Count of '(' and ')'
        int square = 0; // Count of '[' and ']'
        int curly = 0;  // Count of '{' and '}'

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                    round++;
                    break;
                case ')':
                    round--;
                    if (round < 0) return false; // More closing than opening
                    break;
                case '[':
                    square++;
                    break;
                case ']':
                    square--;
                    if (square < 0) return false; // More closing than opening
                    break;
                case '{':
                    curly++;
                    break;
                case '}':
                    curly--;
                    if (curly < 0) return false; // More closing than opening
                    break;
                default:
                    return false; // Invalid character
            }
        }

        // Check that all counters are zero
        return round == 0 && square == 0 && curly == 0;
    }

    public static void main(String[] args) {
        String s = "([)]";

    }
}
