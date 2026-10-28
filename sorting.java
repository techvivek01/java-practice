import java.util.*;
class Sorting {
    // public static void printArray(int arr[]){
    //     for(int i =0 ; i<arr.length ; i++){
    //         System.out.print(arr[i]);
    //     }
    // }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        // int arr[] = {7,2,4,8,9,1,3};

        // for(int i = 0 ; i<arr.length-1;i++){
        //     for(int j= 0 ; j<arr.length-i-1 ; j++){
        //         if(arr[j] > arr[j+1]){

        //             int tem = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = tem; 
        //         }

        //     }

        // }

        // printArray(arr);
    // }
    // int arr[] = {7,8,3,1,2};
    // for(int i =1 ; i<arr.length; i++){
    //     int current = arr[i];
    //     int j = i-1;
    //     while(j>= 0 && current<arr[j]){
    //         arr[j+1] = arr[j];
    //         j--;
    //     }
    //     arr[j+1] = current;

    // }
    // printArray(arr);

    // Q-- arr[] = {9,5,2,6,7,4,1,9,0}
    // int arr[] = {9,5,2,6,7,4,1,9,0};
    // for(int i=0; i<arr.length-1; i++){
    //     for(int j=0; j<arr.length-i-1; j++){
    //         if(arr[j]> arr[j+1]){
    //             int temp = arr[j];
    //             arr[j] = arr[j+1];
    //             arr[j+1]= temp;
    //         }
    //     }
    // }
    // for(int i = 0 ; i<arr.length; i++){
    //     System.out.print(arr[i]+" ");
    // }

    // Seletion sort

    // int arr[] = {7,8,3,1,2};
    // for(int i = 0 ; i<arr.length-1 ; i++){
    //     int smallest = i;
    //     for(int j =1+i ; j <arr.length; j++ ){
    //         if(arr[smallest]>arr[j]){
    //             smallest = j;
    //         }
    //     }
    //     int temp = arr[smallest];
    //     arr[smallest] = arr[i];
    //     arr[i] = temp;
    // }
    // printArray(arr);


    // Q--> using bubble sort
//     int arr[] = {5,2,8,1,3};
    
//     for(int i = 0 ; i<arr.length-1 ; i++){

//         for(int j = 0 ;j<arr.length-1-i ; j++){
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
        
//         }
// }
//     System.out.println("Sorted array:");


//     for(int i=0 ; i<arr.length; i++){
//         System.out.println(arr[i] + " ");
//         }



    // Q--> bubble sort
    
    // float[] arr = {1.1f , 1.9f , 5.1f , 8 ,9, 4 , 0};
    // for( int i = 0 ; i<arr.length-1 ; i++){
    //     for(int j = 0 ; j<arr.length-1-i ; j++){
    //         if(arr[j]>arr[j+1]){
    //             float temp = arr[j];
    //             arr[j] = arr[j+1];
    //             arr[j+1] = temp ;
    //         }
    //     }
    // }
    // System.out.println("sorted array");
    // for(int i = 0 ; i<arr.length ; i++){
    //     System.out.println(arr[i] + " ");
    // }

    // float arr[] = {-1 , -9, -0 , 1 ,9, 20 , 100 , 1.5f};
    // for(int i = 0 ; i<arr.length-1 ; i++){
    //     for(int j = 0 ; j<arr.length-1-i ; j++){
    //         if(arr[j]> arr[j+1]){
    //             float temp = arr[j];
    //             arr[j] = arr[j+1];
    //             arr[j+1] = temp;   
    //         }
    //     }
    // }
    // System.out.print("Sorted array:");
    // for(int i = 0 ; i<arr.length ; i++){
    //     System.out.print(arr[i] + " ");
    // }

    // Q-->
    // System.out.print("Enter array size:");
    // int n = sc.nextInt();
    // int arr[] = new int[n];
    // System.out.println("Enter array");
    // for(int i = 0 ; i<n ; i++){
    //     arr[i] = sc.nextInt();
    // }

    // for(int i =0; i<n-1 ;i++){
    //     for(int j = 0 ; j<n-1-i; j++){
    //         if(arr[j]>arr[j+1]){
    //             int temp = arr[j];
    //             arr[j] = arr[j+1];
    //             arr[j+1] = temp;
    //         }
    //     }
    // }
    // System.out.print("Sorted array:");
    // for(int i =0  ; i<n; i++ ){
    //     System.out.print(arr[i]+" " );
    // }
    // sc.close();



    
    }
}