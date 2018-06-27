package computer;

public class Bit2 {

	static char NOT(char a) {
		if (a == 'H') {
			a = 'L';
		} else {
			a = 'H';
		}
		return a;
	}

	static char AND(char a, char b) {
		char c = 'L';
		if (a == 'H') {
			if (b == 'H') {
				c = 'H';
				return c;
			}
		}
		return c;
	}

	static char OR(char a, char b) {
		char c;
		if (a == 'L' && b == 'L') {
			c = 'L';
		} else {
			c = 'H';
		}
		return c;
	}

	static char NAND(char a, char b) {
		char c = AND(a, b);
		char d = NOT(c);
		return d;
	}

	static char NOR(char a, char b) {
		char c = OR(a, b);
		char d = NOT(c);
		return d;
	}

	static char XOR(char a, char b) {
		char c = 'H';
		if (a == b) {
			c = 'L';
			return c;
		}
		return c;
	}

	static int Number(char a) {
		int c = 0;
		if (a == 'H') {
			c = 1;
			return c;
		}
		return c;
	}

	static char HL(int a) {
		char c = 'L';
		if (a == 1) {
			c = 'H';
			return c;
		}
		return c;
	}

	static char[] HA(char a, char b){
		char HA[] = new char[2];
		HA[0] = XOR(a,b);
		HA[1] = AND(a,b);

		return HA;
	}

	static char[] FA(char a, char b, char c) {
		char[] HA1 = HA(a,b);
		char[] HA2 = HA(HA1[0], c);
		char C = OR(HA2[1], HA1[1]);

		char[] FA = new char[2];
		FA[0] = HA2[0];
		FA[1] = C;

		return FA;
	}
}
