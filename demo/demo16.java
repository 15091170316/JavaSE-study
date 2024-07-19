public class demo16 {
    public static void main(String[] args) {
        int[] arr = {23, 43, 2, 45, 94, 12, 42, 75, 23, 4};
        int[] newArr = copyOfRange(arr, 3, 8);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    // 复制数组的 from-to 索引到新数组，并返回新数组
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index++] = arr[i];
        }
        return newArr;
    }
}
