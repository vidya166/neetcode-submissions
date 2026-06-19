class Solution {
    public String minRemoveToMakeValid(String s) {
         Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
         for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                stack.push(i); // Store the position of '('
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // Balanced match found
                } else {
                    // Unbalanced ')': Mark it for removal by replacing it with a placeholder
                    sb.setCharAt(i, '*'); 
                }
            }
        }
        while (!stack.isEmpty()){
            sb.setCharAt(stack.pop(), '*'); // this was unbalanced '(' so we mark it *
        }
        return sb.toString().replace("*", ""); // remove all stars.
    }
}