import java.util.Scanner;
public class Count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr= new int[5];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        int ans=countPositive(arr);
        System.out.println(ans);

     sc.close();
    }
    public static int countPositive(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                count++;
            }
        }
        return count;
    }
}