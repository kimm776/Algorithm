import java.util.Scanner;
public class Main {


	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        int score=scan.nextInt();
	        if(score>=0||score<=100)//0에서 100까지 정수
	        {
	            if(score>=90)//90점 이상이면 A
	            {
	                        System.out.println("A");
	            }
	            else if(score>=80)//80점 이상이면 B
	            {
	                System.out.println("B");
	            }
	            else if(score>=70)//70점 이상이면 C
	            {
	                   System.out.println("C");
	            }
	             else if(score>=60)//60점 이상이면 D
	            {
	                   System.out.println("D");
	            }
	            else//60점 미만 F
	            {
	                System.out.println("F");
	            }
	        }

	    }
}