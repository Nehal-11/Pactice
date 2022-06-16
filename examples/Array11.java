package examples;
import java.util.Iterator;
import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a = new int [5];
int [][]b = new int [3][3];
int [][]c = new int [2][];
c[0] = new int[3];
c[1] = new int[4];
Scanner scan = new Scanner(System.in);
//for(int i=0; i<a.length; i++) {
	//a[i]= scan.nextInt();
//}
for (int i = 0; i < b.length; i++) {
	for (int j = 0; j < b[i].length; j++) {
		b[i][j]= scan.nextInt();
	}
}
	}

}
