class Solution {

    public int[] rowAndMaximumOnes(int[][] mat) {

        int totalRow = mat.length;
        int totalCol = mat[0].length;

        int maxi = 0;
        int maxOneWaliRowIndex = 0;

        for (int row = 0; row < totalRow; row++) {

            int oneCount = 0;

            // Count 1s in current row
            for (int col = 0; col < totalCol; col++) {

                if (mat[row][col] == 1) {
                    oneCount++;
                }
            }

            // Don't use >= because we need the smallest row index
            if (oneCount > maxi) {
                maxi = oneCount;
                maxOneWaliRowIndex = row;
            }
        }

        return new int[]{maxOneWaliRowIndex, maxi};
    }
}