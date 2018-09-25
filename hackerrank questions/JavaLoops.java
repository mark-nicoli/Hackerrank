import java.util.Scanner;
public class JavaLoops{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    for(int j = 0;j<size;j++){
    int previous = 0;
    int a = scan.nextInt();
    int b = scan.nextInt();
    int n = scan.nextInt();

    for (int i = 0; i < n; i++){
       int d = previous+((int)Math.pow(2,i)*b);
       System.out.print((d+a)+" ");
    }
    System.out.println();
  }
  }
}
