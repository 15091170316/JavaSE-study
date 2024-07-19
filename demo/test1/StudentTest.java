package test1;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student s1 = new Student(1, "张三", 18);
        Student s2 = new Student(2, "王诗韵", 20);
        Student s3 = new Student(3, "王五", 24);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        Student s4 = new Student(4, "李四", 16);

        boolean flag = contains(arr, s4.getId());
        if(flag){
            System.out.println("当前学生id已存在，请修改学生信息！");
        }else{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == null){
                    arr[i] = s4;
                    printArr(arr);
                    return;
                }
            }
            Student[] newArr = new Student[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[newArr.length - 1] = s4;
            printArr(newArr);
        }
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " + arr[i].getAge());
            }
        }
    }

    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getId() == id){
                return true;
            }
        }
        return false;
    }
}
