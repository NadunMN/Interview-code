public class Merge {

    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'1', '2', '3'};
        char[] mergedArray = mergeArrays(arr1, arr2);

        System.out.print("Merged Array: ");
        for (char num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static char[] mergeArrays(char[] arr1, char[] arr2) {
        char[] merged = new char[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length || j < arr2.length) {

            if ( i < arr1.length) {
                merged[k++] = arr1[i++];
            }
            if (j < arr2.length) {
                merged[k++] = arr2[j++];
            }
        }

        return merged;
    }

}