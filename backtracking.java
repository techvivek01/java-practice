class Backtracking {
// Q --> 1
    // public static void printpermutations(String str, String perm, int idx) {

    //     if (str.length() == 0) {
    //         System.out.println(perm);
    //         return;
    //     }

    //     for (int i = 0; i < str.length(); i++) {

    //         char currchar = str.charAt(i);

    //         String newstr = str.substring(0, i) + str.substring(i + 1);

    //         printpermutations(newstr, perm + currchar, idx + 1);
    //     }
    // }

// Q --> 2

    // public static void findsubsets(int[] arr , int idx , String subsets){
    //     if (idx == arr.length){
    //         System.out.println(subsets);
    //         return;
    //     }
    //     findsubsets(arr, idx + 1, subsets + arr[idx]);
    //     findsubsets(arr, idx + 1, subsets);
    // }

    public static void printbinary(int n, String str, int idx) {
        if (idx == n) {
            System.out.println(str);
            return;
        }
        printbinary(n, str + "0", idx + 1);
        printbinary(n, str + "1", idx + 1);
    }





    public static void main(String[] args) {
// Q-->1
        // String str = "abc";
        // printpermutations(str, "", 0);

// Q--> 2  find all subsets of a array
        // int[] arr = {1, 2, 3};

        // findsubsets(arr, 0, "");

    // Q--> print all binary string of length
    int n = 3;
    printbinary(n, "", 0);






    }
}


