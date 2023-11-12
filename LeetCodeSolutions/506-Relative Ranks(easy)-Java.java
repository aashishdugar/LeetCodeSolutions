class Solution {
    public String[] findRelativeRanks(int[] score) {
        //sort the array
        //hash it
        //retrieve values in result array
        Map<Integer,Integer> temp = new HashMap<>();
        String[] res = new String[score.length];
        int[] scoreSort = Arrays.copyOf(score, score.length);
        int rank = 0;
        Arrays.sort(scoreSort);
        
        for(int i=score.length-1; i>=0;i--){
            System.out.println(scoreSort[i]);
            temp.put(scoreSort[i],rank);
            rank++;
        }

        for(int x = 0; x < score.length; x++){
            int y = temp.get(score[x]);
            if(y == 0) res[x] = "Gold Medal";
            else if(y == 1) res[x] = "Silver Medal";
            else if(y== 2) res[x] = "Bronze Medal";
            else res[x] = Integer.toString(y+1);
        }

        return res;
    }
}