/*
 * @lc app=leetcode.cn id=733 lang=java
 *
 * [733] 图像渲染
 */

// @lc code=start
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // if(0 <= sr && sr < image.length && 0 <= sc && sc < image[0].length) {
        // image[sr][sc] = newColor;

        // floodFill(image, sr - 1, sc, newColor);
        // floodFill(image, sr + 1, sc, newColor);
        // floodFill(image, sr, sc - 1, newColor);
        // floodFill(image, sr, sc + 1, newColor);

        // return image;
        // }

        // return null;

        if(image[sr][sc] == newColor){
            return image;
        }

        Stack<Point> stack = new Stack<>();
        stack.push(new Point(sr, sc));
        int target = image[sr][sc];
        image[sr][sc] = newColor;

        while (!stack.isEmpty()) {
            Point point = stack.pop();

            if (point.left() >= 0 && image[point.left()][point.getY()] == target) {
                image[point.left()][point.getY()] = newColor;
                stack.push(new Point(point.left(), point.getY()));
            }

            if (point.right() < image.length && image[point.right()][point.getY()] == target) {
                image[point.right()][point.getY()] = newColor;
                stack.push(new Point(point.right(), point.getY()));
            }

            if (point.up() >= 0 && image[point.getX()][point.up()] == target) {
                image[point.getX()][point.up()] = newColor;
                stack.push(new Point(point.getX(), point.up()));
            }

            if (point.down() < image[0].length && image[point.getX()][point.down()] == target) {
                image[point.getX()][point.down()] = newColor;
                stack.push(new Point(point.getX(), point.down()));
            }

        }
        return image;
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int left() {
        return x - 1;
    }

    public int right() {
        return x + 1;
    }

    public int up() {
        return y - 1;
    }

    public int down() {
        return y + 1;
    }
}
// @lc code=end
