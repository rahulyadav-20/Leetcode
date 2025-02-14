from typing import List
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        ans=[]

        top=0
        right=len(matrix[0])-1
        bottom=len(matrix)-1
        left=0

        while(top<=bottom and left<=right):
            for i in range(top,right+1):  #Traverse from left to right on the top row
                ans.append(matrix[top][i])
            top+=1
            for i in range(top,bottom+1): #Traverse from top to bottom on the rightmost column
                ans.append(matrix[i][right])
            right-=1
            if(top<=bottom):
                for i in range(right,left-1,-1): #Traverse from right to left on the bottom row
                    ans.append(matrix[bottom][i])
                bottom-=1
            if(left<=right):
                for i in range(bottom,top-1,-1): #Traverse from bottom to top on the leftmost column
                    ans.append(matrix[i][left])
                left+=1
        return ans
    
if __name__ == "__main__":
    matrix = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]
    sol = Solution()
    print(sol.spiralOrder(matrix))


        