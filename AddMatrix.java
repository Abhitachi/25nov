package geek_assignment_26;
import java.util.Scanner;
public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] sum=new int[3][3];
		int r=a.length;
		int c=a[0].length;
		System.out.println("enter elements of first matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		

		System.out.println("enter elements of second matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
			}
		}
	
		if(r!=c) {
			System.out.println("rows and columns should be equal");
		}
		else {
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					sum[i][j]=a[i][j]+b[i][j];
				}
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

}
