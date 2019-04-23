class Solution {
    public void rotate(int[][] matrix) {
        int side_i = matrix[0].length - 1;
        int[] tmp = new int[matrix[0].length];
        for (int i = 0; (i+1) * 2 <= matrix.length;  ++i)
        {
            // store the 0th row
            int len = matrix[0].length - i * 2;
            
            if(len <= 1)
                return ;
            
            for (int j = 0; j < len; ++j)
                tmp[j] = matrix[i][j + i];
            
            // clocksize replacement
            // replace the 0th row
            for (int j = 0; j < len; ++j)
            {
                matrix[i][i+len-1-j] = matrix[j+i][i];
            }
            
            // replace the 0th col
            for (int j = 0; j < len; ++j)
            {
                matrix[i+j][i] = matrix[i+len-1][i+j];
            }
            
            // replace the (len-1)th row
            matrix[i+len-1][i+len-1] = tmp[len-1];
            for(int j = 1; j < len -1; ++j)
            {
                matrix[i+len-1][i+len-1-j] = matrix[i+j][i+len-1];
            }
            
            // replace the (len -1)th col
            for (int j = 1; j < len - 1; ++j)
            {
                matrix[i+j][i+len-1] = tmp[j];
            }
        }
        return ;
    }
}