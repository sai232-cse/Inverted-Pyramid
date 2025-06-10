import java.util.Scanner; 
public class InvertedPyramid
{ 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the number of rows to print");
        int n = sc.nextInt();
	System.out.println("The inverted pyramid pattern is: ");
        for (int i = n; i >= 1; i--) 
        { 
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}