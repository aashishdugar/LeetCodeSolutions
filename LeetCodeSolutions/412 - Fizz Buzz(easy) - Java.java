class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> temp = new ArrayList<String>();
        for(int i = 1;i<=n;i++){
            if((i%3 != 0) && (i%5 != 0)) temp.add(Integer.toString(i));
            if((i%3 == 0) && (i%5 != 0)) temp.add("Fizz");
            if((i%3 != 0) && (i%5 == 0)) temp.add("Buzz");
            if((i%3 == 0) && (i%5 == 0)) temp.add("FizzBuzz");
            
        }
        return temp;
        
    }
}