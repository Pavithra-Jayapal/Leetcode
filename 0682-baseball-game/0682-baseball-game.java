class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        //int ans=0;
        for(String op:operations){
            if(!op.equals("D")&&!op.equals("C")&&!op.equals("+")){
                int n=Integer.parseInt(op);
                s.push(n);
            }
            else if(op.equals("C")) s.pop();
            else if(op.equals("D")){
                int num=s.peek();
                s.push(num*2);
                
            }
            else if(op.equals("+")){
                int num2=s.pop();
                int num1=s.peek();
                s.push(num2);
                s.push(num1+num2);
            }
        }
        int sum=0;
        for(int i:s){
            sum+=i;
        }
        return sum;
    }
}