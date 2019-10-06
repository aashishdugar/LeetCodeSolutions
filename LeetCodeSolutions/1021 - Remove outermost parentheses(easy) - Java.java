class Solution {
    public String removeOuterParentheses(String S) {
         char[] cs=S.toCharArray();
        StringBuilder res=new StringBuilder();
        int start=0;
        int count=0;
        for(int i=0;i<cs.length;i++){
            count=(cs[i]=='(')?(count+1):(count-1);
            if(count==0){
                res.append(new String(cs,start+1,i-start-1));
                start=i+1;
            }
        }
        return res.toString(); 
    }
}