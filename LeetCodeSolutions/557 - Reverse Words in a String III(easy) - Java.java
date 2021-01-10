class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        int index = 0;
        for(String x: arr){
            StringBuilder temp = new StringBuilder(x);
            arr[index] = temp.reverse().toString();
            index++;
        }
        
        StringBuilder res = new StringBuilder();
        index = 0;
        for(String x: arr) {
            index++;
            res.append(x);
            if(index >= arr.length) break;
            res.append(" ");
        }
        
        return res.toString();
        
    }
}