class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0;
        //1. while the strings have comparable lengths
        while(i<v1.length && i<v2.length)
        {
           
            if (Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])) return 1;
            if (Integer.parseInt(v2[i]) > Integer.parseInt(v1[i])) return -1;
            if (Integer.parseInt(v1[i]) == Integer.parseInt(v2[i])) i++;
        }
        //2. when v1 reaches it's limit
        if (i == v1.length && i < v2.length) 
        {
            while (i<v2.length)
            {
                if (Integer.parseInt(v2[i]) != 0) return -1;
                if (Integer.parseInt(v2[i]) == 0) i++;
            }
        }
        //3. when v2 reaches it's limit
        if (i == v2.length && i < v1.length)
        {
            while(i<v1.length)
            {
                if(Integer.parseInt(v1[i]) != 0) return 1;
                if(Integer.parseInt(v1[i]) == 0) i++;
            }
        }
        return 0;
    }
    
}