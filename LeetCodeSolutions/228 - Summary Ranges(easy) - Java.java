class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        int a = 0;
        int b = 1;
        int count = 0;
        
        if (nums.length == 0) return res;
        
        while (b < nums.length) {
            if(nums[b] == nums[a] + (b-a)) {
                System.out.println("Check Step - "+ nums[a]+","+nums[b]);
                b++;
                count++;
                continue;
            }
        else {
            if(count == 0) {
                res.add(String.valueOf(nums[a]));
                a = b;
                b++;

            }
            else {
                res.add(String.valueOf(nums[a]) + "->" + String.valueOf(nums[b-1]));
                a = b;
                b++;
                count = 0;
            }
            
        }
        }
        if(count == 0) {
                res.add(String.valueOf(nums[a]));
                a = b;
                b++;


            }
            else {
                res.add(String.valueOf(nums[a]) + "->" + String.valueOf(nums[b-1]));
                a = b;
                b++;
                count = 0;
            }
        
        return res;
    }
}