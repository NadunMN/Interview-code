public class Main{

    public static int forSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int whileSum(int arr[]) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static int recursiveSum(int arr[], int n) {
        if (n <= 0) {
            return 0;
        } else {
            return arr[n - 1] + recursiveSum(arr, n - 1);
        }
    }

    
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum using for loop: " + forSum(arr));
        System.out.println("Sum using while loop: " + whileSum(arr));
        System.out.println("Sum using recursion: " + recursiveSum(arr, arr.length));
        // System.out.println("Hello, World!");
    } 
}