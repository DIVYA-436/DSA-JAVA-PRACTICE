import java.util.Scanner;
public class Appear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr= new int[5];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target=sc.nextInt();
        boolean ans=appearsThreeTimes(arr, target);
        System.out.println(ans);

     sc.close();
    }
    public static boolean appearsThreeTimes(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count==3;
    }

}
