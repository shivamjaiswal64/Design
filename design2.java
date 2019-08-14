import java.util.*;
class design2{
    public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		System.out.println("Number="+n);
		for (int k=n;k>0 ;k-- ){
			for(int i=1;i<k;i++){	//upper half, quadrant IV
				System.out.print("--");
			}
			for (int j=n;j>k-1 ;j-- ) {
				System.out.print("-"+j);
			}
			
			for(int j=k+1;j<=n;j++){	//upper half, quadrant I
				System.out.print("-"+j);
			}
			for(int i=1;i<k;i++)
				System.out.print("--");		//mid half end
			
			System.out.println()	;
		}
		
	for (int k=1;k<n ;k++ ) {
		
		for(int i=1;i<=k;i++){		//Lower half , Quadrant III
			System.out.print("--");
		}
		for (int j=n;j>k ;j-- ) {
			System.out.print("-"+j);
		}
		for(int j=k+2;j<=n;j++){	//Lower half, Quadrant II
			System.out.print("-"+j);
		}
		for(int i=1;i<=k;i++)
			System.out.print("--");
		
		System.out.println();
	}					//Lower Half Ends

    }
}
