//695. Max Area of Island

// public class Max_area_of_island_695 {
//     public static void main(String[] args) {

//     }

//     public int maxAreaOfIsland(int[][] grid) {
//         int ansver = 0;

//         for (int i = 0; i < grid.length; ++i) {
//             for (int j = 0; j < grid[0].length; ++j) {
//                 ansver = Math.max(ansver, dfs(grid, i, j));
//             }
//         }

//         return ansver;
//     }

//     public int dfs(int[][] grid, int i, int j) {
//         if (i < 0 || i == grid.length || j < 0 || j == grid[0].length) return 0;
//         if (grid[i][j] != 1) return 0;

//         grid[i][j] = 2;

//         return 1 + dfs(grid, i + 1, j) + dfs(grid, i - 1, j)
//                 + dfs(grid, i, j + 1) + dfs(grid, i, j - 1);
//     }
// }


// -----------------------------------------------------------------------------------------

//733. Flood Fill


// class Solution {
//     public int[][] floodFill(int[][] image, int sr, int sc, int colour) {
//         int originalColour = image[sr][sc];
//         if (originalColour != colour) {
//             dfs(image, sr, sc, colour, originalColour);
//         }

//         return image;
//     }

//     public void dfs(int[][] image, int i, int j, int newColour, int originalColour) {
//         if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != originalColour) {
//             return;
//         }
//         image[i][j] = newColour;

//         dfs(image, i - 1, j, newColour, originalColour);
//         dfs(image, i + 1, j, newColour, originalColour);
//         dfs(image, i, j - 1, newColour, originalColour);
//         dfs(image, i, j + 1, newColour, originalColour);
//     }
// }

// ---------------------------------------------------------------------------------

//101. Symmetric Tree


public class Symetric_Tree_101 {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;

        return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }
}