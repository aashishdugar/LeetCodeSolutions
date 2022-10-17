class Solution {
    public int numberOfBeams(String[] bank) {
        int edge = bank.length - 1;
        int beamSum = 0;
        int prevRow = 0;
        for(int i = 0; i<bank.length; i++){
            int temp = cameraCount(bank[i]);
            if(temp == 0) continue;
            else{
                System.out.println(temp +","+beamSum+","+prevRow); 
                beamSum = beamSum + (temp * prevRow);
                prevRow = temp;
            }
        }
          
        return beamSum;
        
    }
    
     public int cameraCount(String x){
            int counter = 0;
            char[] xArray = x.toCharArray();
            for(char y: xArray) {
                if (y =='1') counter++;
            }
            
            return counter;
        }
}