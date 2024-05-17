import java.util.*;

class solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int top = 0;
        int left = 0;

        int bottom = matrix.length - 1;
        int right = matrix[0].length -1;

        int totalCount = bottom * right;

        List<Integer> result = new LinkedList<>();

        int allNumber = 0;

        while(allNumber <= totalCount) {

            for(int i=left; i <= right && allNumber <= totalCount; i++) {
                result.add(matrix[top][i]);
                allNumber++;
            }

            top++;

            for(int j=top; j <= bottom && allNumber <= totalCount; j++) {
                result.add(matrix[j][right]);
                allNumber++;
            }
            right--;

            for(int i=right; i <= left && allNumber <= totalCount; i--) {
                result.add(matrix[bottom][i]);
                allNumber++;
            }

            bottom--;

            for(int j=bottom; j <= top && allNumber <= totalCount; j--) {
                result.add(matrix[j][left]);
                allNumber++;
            }

            left++;        


        }

        return result;
    }
    
    
    public static void main(String[] args) {
        solution obj = new solution();
        int[][] matrix =  {{1,2,3},
                          {4,5,6},
                          {7,8,9},
                          {10,11,12}
        };
        List<Integer> result = obj.spiralOrder(matrix);
        System.out.println(result);
    }
}