public class Array2DSearchInStatic {
    // public static boolean searchLinear(int a[][],int key){

    // //row wise search data
    // // int i=0;
    // // int j=a[0].length-1;
    // // while(i<a.length &&j>=0){
    // // if(a[i][j]==key){
    // // System.out.println("my element is (" +i+","+j+")");

    // // }
    // // else if(key<a[i][j]){
    // // j--;
    // // }
    // // else{
    // // i++;
    // // }

    // // }

    // // System.out.println("key value is not matched in array");
    // // }

    // //column wise search data in
    // int i=a.length-1;
    // int j=0;
    // while(j<a.length && i>=0){
    // if(a[i][j]==key){
    // System.out.println("my element is (" +i+","+j+")");
    // return true;
    // }
    // else if(key<a[i][j]){
    // i--;
    // }
    // else{
    // j++;
    // }
    // }
    // System.out.println("data is not matched");
    // return false;
    // }
    // public static void main(String[] args) {
    // int a[][]={
    // {10,20,30,40},
    // {21,25,27,29},
    // {31,34,36,38},
    // {41,42,45,48}
    // };
    // searchLinear(a, 27);
    // }
    // }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int r = searchInsert(nums, 5);
        System.out.println(r);
    }
}