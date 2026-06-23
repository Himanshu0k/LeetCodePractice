class Solution {
    public String reverseOnlyLetters(String str) {

        StringBuilder s = new StringBuilder(str);

        Stack<Character> stack = new Stack<>();

        for(char c: str.toCharArray()) {
            if((c > 64 && c < 91) ||  (c > 96 && c < 123))  stack.push(c);
        }

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if((c > 64 && c < 91) ||  (c > 96 && c < 123))  {
                s.setCharAt(i, stack.pop());
            }
        }

        return s.toString();
    }
}