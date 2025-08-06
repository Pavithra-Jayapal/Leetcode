class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        //int res=0;
        for(String token:tokens){
            if(isoperator(token))
            {
            int a=stack.pop();
            int b=stack.pop();
            int  res=applyop(b,a,token);
            stack.push(res);
            }
            else{
            int num=Integer.parseInt(token);
            stack.push(num);
        }
        }
        return stack.pop();
    }
    public boolean isoperator(String token){
        return token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/");
    }
    public int applyop(int b,int a,String token){
        switch(token){
            case "+": return b+a;
            case "-": return b-a;
            case "*": return b*a;
            case "/": return b/a;
            default: throw new IllegalArgumentException("Invalid operator: " + token);
        }
        
    }
}