class LinearSearch {

    static int search(int[][] matrix, int target) {

        int n = matrix.length;  

        for(int i=0; i<n; i++) { 

            for(int j = 0; j<matrix[i].length; j++) {
                if(matrix[i][j] == target) {
                    
                    return j;
                }
            }
        }

       return -1;

    }


    public static void main(String[] args) {
        
        int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        int target = 5;
        
        System.out.println(search(matrix, target));






    }
}