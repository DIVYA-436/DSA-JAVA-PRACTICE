import java.util.Scanner;
public class ReverseArray {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        int[] arr=new int[5];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    } 
    reverseArray(arr);
    
    sc.close();
}
    public static void reverseArray(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        } 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
   
    
}
