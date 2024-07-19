public class demo21 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String s = arrToString(arr);
        System.out.println(s);
    }

    public static String arrToString(int[] intArr){
        if(intArr == null || intArr.length == 0){
            return "[]";
        }
        String str = "[";
        for (int i = 0; i < intArr.length; i++) {
            str += intArr[i];
            if(i != intArr.length - 1){
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
