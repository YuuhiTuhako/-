package computer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bit extends Bit3 {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
			try {
				String line = reader.readLine();
				char[] t = new char[4];
				t[0] = line.charAt(0);
				t[1] = line.charAt(1);
				t[2] = line.charAt(2);
				t[3] = line.charAt(3);

				int[]A=YUUHIC(t[0]);
				int[]B=YUUHIC(t[1]);
				int[]C=YUUHIC(t[2]);
				int[]D=YUUHIC(t[3]);

				System.out.print(" ");
				sph(A);
				sph(B);
				System.out.println("");

				System.out.print(" ");
				sph(C);
				sph(D);
				System.out.println("");

				char[] x = BIT4(B);
				char[] X = BIT4(A);
				char[] y = BIT4(D);
				char[] Y = BIT4(C);

				char[] M1 = HA(x[0], y[0]);
				char[] M2 = FA(x[1], y[1], M1[1]);
				char[] M3 = FA(x[2], y[2], M2[1]);
				char[] M4 = FA(x[3], y[3], M3[1]);
				char[] M5 = FA(X[0], Y[0], M4[1]);
				char[] M6 = FA(X[1], Y[1], M5[1]);
				char[] M7 = FA(X[2], Y[2], M6[1]);
				char[] M8 = FA(X[3], Y[3], M7[1]);


				sp(Number(M8[1]));
				sp(Number(M8[0]));
				sp(Number(M7[0]));
				sp(Number(M6[0]));
				sp(Number(M5[0]));
				sp(Number(M4[0]));
				sp(Number(M3[0]));
				sp(Number(M2[0]));
				System.out.println(Number(M1[0]));

				sp(Number(M1[0]) * 1 + Number(M2[0]) * 2 + Number(M3[0])
						* 4 + Number(M4[0]) * 8 + Number(M5[0]) * 16 + Number(M6[0])
						* 32 + Number(M7[0]) * 64 + Number(M8[0]) * 128 + Number(M8[1])
						* 256);

			}catch (IOException e){
				System.out.println(e);
		}
	}
}
