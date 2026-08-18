
class Solution { 
    public int evalRPN(String[] tokens) { 
        Stack<Integer> stack = new Stack<>(); 
        
        for (int i = 0; i < tokens.length; i++) { 
            String token = tokens[i];
            
            if (token.equals("+")) { 
                int y = stack.pop(); 
                int x = stack.pop(); 
                stack.push(x + y); 
            } else if (token.equals("-")) { 
                int y = stack.pop(); 
                int x = stack.pop(); 
                stack.push(x - y); 
            } else if (token.equals("*")) { 
                int y = stack.pop(); 
                int x = stack.pop(); 
                stack.push(x * y); 
            } else if (token.equals("/")) { 
                int y = stack.pop(); 
                int x = stack.pop(); 
                stack.push(x / y); 
            } else { 
                stack.push(Integer.parseInt(token)); 
            } 
        } 
        return stack.pop(); 
    } 
}
