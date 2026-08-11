class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        // If the color is already the target color,
        // no changes are needed.
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    private void dfs(int[][] image, int row, int col,
                     int originalColor, int color) {

        // Out of bounds
        if (row < 0 || row >= image.length ||
            col < 0 || col >= image[0].length) {
            return;
        }

        // Not the original color
        if (image[row][col] != originalColor) {
            return;
        }

        // Change the color
        image[row][col] = color;

        // Up
        dfs(image, row - 1, col, originalColor, color);

        // Down
        dfs(image, row + 1, col, originalColor, color);

        // Left
        dfs(image, row, col - 1, originalColor, color);

        // Right
        dfs(image, row, col + 1, originalColor, color);
    }
}