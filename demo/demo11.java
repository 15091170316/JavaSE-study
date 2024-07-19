public class demo11 {
    public static void main(String[] args) {
        // 数组求最值
        int[] arr = {22,4,34,55,36};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
