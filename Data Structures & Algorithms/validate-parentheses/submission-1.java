class Solution {
    public boolean isValid(String st) {
        char[] ch = st.toCharArray();
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] == '(' || ch[i] == '[' ||ch[i] == '{'){
                s.push(ch[i]);
            }else{
                if(s.isEmpty()) {
                    return false;
                }
                if(ch[i] == ')' && s.pop() != '(' ) return false;
                if(ch[i] == ']' && s.pop() != '[' ) return false;
                if(ch[i] == '}' && s.pop() != '{' ) return false;
            }
        }
        return (s.isEmpty());
    }
}
