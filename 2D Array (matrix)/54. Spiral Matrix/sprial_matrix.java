
import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans;
        ans = new ArrayList<>();

        int top = 0; //row
        int right = matrix[0].length - 1; //col
        int bottom = matrix.length - 1; //row
        int left = 0; //col

        while (top <= bottom && left <= right) {
            for (int i = top; i <= right; i++) { // Traverse from left to right on the top row
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) { // Traverse from top to bottom on the rightmost column
                ans.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) { // Traverse from right to left on the bottom row
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) { // Traverse from bottom to top on the leftmost column
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}

public class sprial_matrix {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println(result);
    }
}
