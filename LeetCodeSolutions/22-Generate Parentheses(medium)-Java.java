class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        createStrings("", n, n);

        return res;
    }

    public boolean validate(String s){
        Stack<Character> temp = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') temp.push(c);
            else {
                if (!temp.isEmpty()) temp.pop();
                else return false;
            }

        }

        return temp.isEmpty();
    }

    public void createStrings(String s, int n1, int n2){
        if(n1 == 0 && n2 == 0){
            if(validate(s)) {
                res.add(s);
                return;
            }
        }

        if(n1 != 0){
            s += "(";
            createStrings(s, n1-1, n2);
            s = s.substring(0, s.length() - 1);

        }
        if(n2 != 0){
            s += ")";
            createStrings(s,n1,n2-1);
        }
    }
}