import java.util.*;
class design{
	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		System.out.println("Number="+n);
	/*	for(int i=64+n;i>64;i--){
			System.out.println((char)i);
		}
	*/	for (int k=n;k>0 ;k-- ) {
			for(int i=1;i<k;i++){	//upper half
				System.out.print(" ");
			}
			for (int j=n;j>k-1 ;j-- ) {
				System.out.print(j);
			}
			//for(int i=1;i<n;i++){
			for(int j=k+1;j<=n;j++){
				System.out.print(j);
			}
			System.out.println();		//mid half end
			

	}
	for (int k=1;k<n ;k++ ) {
		//System.out.print(" ");
		for(int i=1;i<=k;i++){	//upper half
				System.out.print(" ");
			}
		for (int j=n;j>k ;j-- ) {
				System.out.print(j);
		}
			for(int j=k+2;j<=n;j++){
				System.out.print(j);
			}
			System.out.println(" ");
		//for(int i=1;i<k;i++){	//upper half
		//		System.out.print("-");
		//	}
	}

	}
}