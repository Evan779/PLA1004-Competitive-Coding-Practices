import java.util.Scanner;
public class ANextRound{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int array[] = new int[n];

            for (int i = 0;i<n;i++){

               array[i]=sc.nextInt();
            }
            int target=array[k-1];
            int output=0;
            for(int n1 : array){
                if(n1>=target && n1>0){
                    output++;
                }
            }
            System.out.println(output);

    }
}