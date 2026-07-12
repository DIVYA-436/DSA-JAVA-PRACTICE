 import java.util.Scanner;
public class AllPositive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr= new int[5];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        boolean ans=allPositive(arr);
        System.out.println(ans);

     sc.close();
    }
    public static boolean  allPositive(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
              return false;
            }
        }
        return true;
    }
}

