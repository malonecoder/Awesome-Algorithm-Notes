package Search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[]{4, 12, 1, 6, 9, 7, 10};
        boolean isFind = binarySearch(array, 100);
        System.out.println(isFind);
    }

    public static boolean binarySearch(int[] array, int findElement) {
        if (array != null && array.length != 0) {
            int low = 0;
            int high = array.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (array[mid] > findElement) {
                    high = mid - 1;
                } else if (array[mid] < findElement) {
                    low = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}