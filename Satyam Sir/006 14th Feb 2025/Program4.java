// Rahul is given a row of numbers where each row and columns are same. 
// Rahul now prints the numbers of the rows as shown in the following manner. 
// Help Rahul to write the code .

// The first line of input consists of the size followed by the row numbers. 

// Sample Input:
// 3
// 1 2 3 
// 4 5 6
// 7 8 9


// Explanation:

// 1<-2<-3 
// |
// 4->5->6
//              |
// 7<-8<-9
   

// Sample Output: 
// 3 2 1 4 5 6 9 8 7

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        printZigZag(grid, n);
    }

    public static void printZigZag(int[][] grid, int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                for (int j = n - 1; j >= 0; j--)
                    System.out.print(grid[i][j] + " ");
            else
                for (int j = 0; j < n; j++)
                    System.out.print(grid[i][j] + " ");
        }
    }
}