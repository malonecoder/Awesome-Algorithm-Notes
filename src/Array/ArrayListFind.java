package Array;

public class ArrayListFind {
    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * [[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
     *
     * @param args
     */
    public static void main(String[] args) {

        int[][] array = new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };

        boolean isFind7 = findElement(array, 7);
        boolean isFind3 = findElement(array, 3);

        boolean isFindAll7 = findElementByAll(array, 7);
        boolean isFindAll3 = findElementByAll(array, 3);
        System.out.println(isFind7);
        System.out.println(isFind3);
        System.out.println(isFindAll7);
        System.out.println(isFindAll3);
    }

    /**
     * 方法一：暴力法 直接循环全部查找二维数组
     */
    public static boolean findElementByAll(int[][] array, int target) {
        for (int row = 0; row < array.length - 1; row++) {
            for (int column = 0; column < array[row].length - 1; column++) {
                if (target == array[row][column]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 方法二：从左下角或右上角开始查找
     *
     * @param array
     * @param target
     * @return
     */
    public static boolean findElement(int[][] array, int target) {
        int row = array.length - 1;
        int column = 0;
        while (row >= 0 && column <= array[0].length - 1) {
            if (target < array[row][column]) {
                row -= 1;
            } else if (target > array[row][column]) {
                column += 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
