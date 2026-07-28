import java.util.Scanner;
public class ATeam{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nProblems = sc.nextInt();
        int solvedCount=0;
        for(int i=0;i<nProblems;i++){
            int petya=sc.nextInt();
            int vasya=sc.nextInt();
            int tonya=sc.nextInt();
            int total=petya+vasya+tonya;
            if(total>=2){
                solvedCount++;
            }
        }
        System.out.println(solvedCount);
    }
}