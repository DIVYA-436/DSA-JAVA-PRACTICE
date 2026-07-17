import java.util.Scanner;
public class GreaterThanAvg {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter array elements: ");
       int[] arr=new int[5];
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();

       }
       int ans=countGreaterThanAverage(arr);
       System.out.println(ans);
       sc.close();  
    }public static int countGreaterThanAverage(int[] arr){
        int sum=0;
        int avg=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=sum/arr.length;
        System.out.println("AVERAGE: "+avg);
        for(int i=0;i<arr.length;i++){
         if(avg<arr[i]){
            count++;
         }
        }
        return count;
    }

}
