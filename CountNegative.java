import java.util.Scanner;
public class CountNegative{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr= new int[5];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        int ans=countNegative(arr);
        System.out.println(ans);

     sc.close();
    }
    public static int countNegative(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
        }
        return count;
    }
}
