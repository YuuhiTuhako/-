package computer;

public class Bit3 extends Bit2{
	public static int[] YUUHIC (char a){

		if (a == 'A'){
			int[] A = new int[4];
				A[0]=0;
				A[1]=0;
				A[2]=0;
				A[3]=0;
			return A;
		}
		if (a == 'B'){
			int[] A = new int[4];
				A[0]=1;
				A[1]=0;
				A[2]=0;
				A[3]=0;
			return A;
		}
		if (a == 'C'){
			int[] A = new int[4];
				A[0]=0;
				A[1]=1;
				A[2]=0;
				A[3]=0;
			return A;
		}
		if (a == 'D'){
			int[] A = new int[4];
				A[0]=1;
				A[1]=1;
				A[2]=0;
				A[3]=0;
			return A;
		}
		if (a == 'E'){
			int[] A = new int[4];
				A[0]=0;
				A[1]=0;
				A[2]=1;
				A[3]=0;
			return A;
		}
		if (a == 'F'){
			int[] A = new int[4];
				A[0]=1;
				A[1]=0;
				A[2]=1;
				A[3]=0;
			return A;
		}
		if (a == 'G'){
			int[] A = new int[4];
				A[0]=0;
				A[1]=1;
				A[2]=1;
				A[3]=0;
			return A;
		}
		if (a == 'H'){
			int[] A = new int[4];
				A[0]=1;
				A[1]=1;
				A[2]=1;
				A[3]=0;
			return A;
		}
		if (a == 'I'){
			int[] A = new int[4];
				A[0]=0;
				A[1]=0;
				A[2]=0;
				A[3]=1;
			return A;
		}
		if (a == 'J'){
			int[] A = new int[4];
				A[0]=1;
				A[1]=0;
				A[2]=0;
				A[3]=1;
			return A;
		}
		if (a == 'K'){
			int[] A = new int[4];
				A[0]=0;
				A[1]=1;
				A[2]=0;
				A[3]=1;
			return A;
		}
		if (a == 'L'){
			int[] A = new int[4];
				A[0]=1;
				A[1]=1;
				A[2]=0;
				A[3]=1;
			return A;
		}
		if (a == 'M'){
			int[] A = new int[4];
				A[0]=0;
				A[1]=0;
				A[2]=1;
				A[3]=1;
			return A;
		}
		if (a == 'N'){
			int[] A = new int[4];
				A[0]=1;
				A[1]=0;
				A[2]=1;
				A[3]=1;
			return A;
		}
		if (a == 'O'){
			int[] A = new int[4];
				A[0]=0;
				A[1]=1;
				A[2]=1;
				A[3]=1;
			return A;
		}
		if (a == 'P'){
			int[] A = new int[4];
				A[0]=1;
				A[1]=1;
				A[2]=1;
				A[3]=1;
			return A;
		}
		int[] A = new int[4];
		A[0]=0;
		A[1]=0;
		A[2]=0;
		A[3]=0;
	return A;
	}

	public static char[] BIT4(int[] a){
		char[] A = new char[4];
		A[0] = HL(a[0]);
		A[1] = HL(a[1]);
		A[2] = HL(a[2]);
		A[3] = HL(a[3]);

		return A;
	}

	public static void sp(int a){
		System.out.print(a);
	}
	
	public static void spl(int a){
		System.out.println(a);
	}
	
	public static void sph(int[] a){
		for(int i = a.length - 1; i >= 0; i--)
		System.out.print(a[i]);
	}
}
