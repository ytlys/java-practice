import java.util.ArrayList;
import java.util.Scanner;

public class DeathRow {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		 * n are the number of people in the circle
		 */
		int n = scanner.nextInt();
		/*
		 * m is the step
		 */
		int m = scanner.nextInt();
				
		System.out.println(findWinner(n, m));
		scanner.close();
	}
	
	public static int findWinner(int n, int m) {
		
		ArrayList<Integer> mArr = new ArrayList<Integer>(n);	
		int br=1;
		while(br<=n){
		mArr.add(br);
		br++;
		}
	 
		//for(int i : mArr){
		// System.out.print(i+ " ");
		 
		//}
		//System.out.println();
	 
		/*
		 * start is the position from which we start counting
		 */
		int start = 0;
		
		/*
		 * del is the position of the person that should be removed from the circle
		 */
		int del = 0;
	
	while(n!= 2){
		del = start+m-1;
		if(del<n){
			mArr.remove(del);
			start+=m-1;
		}
		if(del>=n){
			del = start+m-1 - n;
			mArr.remove(del);
			start=del;
		}
		n--;
	}
	if ((start > n - 1)||(start==0)){
		start = 0;		
		if(m%2==1){
			del = start;
			}
		else{
			del = 1;
			}
		}
	
	if(start == 1){
		if(m%2==1){
			del = start;
			}
		else{
			del = 1;
			}
	}
	mArr.remove(del);
	
	int lastManStanding = 0;
	for(int i2: mArr){
		 //System.out.print(i2 + " ");
		 lastManStanding = i2;
	 }		
		return lastManStanding;
	}
}
