// 20. Valid Parentheses
class LC20 {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='(') st.push(ch);
            else if(!st.isEmpty()){
                char t=st.peek();
                if((t=='[' && ch==']')||(t=='{' && ch=='}')||(t=='(' && ch==')'))
                st.pop();
                else return false;
            }
            else return false;
        }
        if(st.isEmpty()) return true;
        return false;
    }
}