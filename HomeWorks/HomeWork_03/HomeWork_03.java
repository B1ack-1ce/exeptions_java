package HomeWorks.HomeWork_03;

public class HomeWork_03 {
    public static void main(String[] args) {
        int[] nums = {3,6,8,10,5};

        System.out.println(isEvenNum(nums[2]));

        System.out.println(sumArr(nums));

        getLength("Hello");
    }

    private static boolean isEvenNum(int num){
        return num % 2 == 0;
    } 

    private static int sumArr(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static void getLength(String word){
        System.out.println(word.length());
    }
}
