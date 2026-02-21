class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        boolean[] remove = new boolean[n];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(') st.push(i);
            else if(ch==')'){
                if(st.isEmpty()) remove[i]=true;
                else st.pop();
            }
        }
        while(!st.isEmpty()){
            remove[st.pop()]=true;
        }
        for(int i=0;i<n;i++){
            if(!remove[i]) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}