// Rating Improvement (Codechef Problem)
import java.util.Scanner;

 class Rating_Improvement {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int X=input.nextInt();
            int Y=input.nextInt();
            int M=X+200;

            if(X<=Y && Y<=M){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
