class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()%2 != 0) return false;
        int f = 0;
        int s = 0;
        
        for(char c:moves.toCharArray()){
            if(c == 'U') f++;
            if(c == 'D') f--;
            if(c == 'L') s++;
            if(c == 'R') s--;
        }
        
        return (f==0) && (s==0);
        
    }
    /* //Alternate Solution using int conversion
    public boolean judgeCircle(String moves) {
        int[] arr = new int[26];
        for(char c: moves.toCharArray()) {
            int temp = c - 'A';
            arr[temp]++;
        } 
        return arr['L' -'A'] == arr['R' - 'A'] &&arr['U' -'A'] == arr['D' - 'A'];
        
    }*/

}