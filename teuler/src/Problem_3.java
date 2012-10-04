import java.math.BigInteger;

public class Problem_3 {
	public static void main(String[] args) {
		bigInteger("600851475143");
	}

	public static void bigInteger(String nb) {

		BigInteger n = new BigInteger("600851475143");
		BigInteger remainder = n;
		BigInteger i = BigInteger.valueOf(3);
		BigInteger incr = BigInteger.valueOf(2);

		BigInteger maxDiv = BigInteger.ONE;

		for (; i.compareTo(remainder) <= 0; i = i.add(incr)) {
			BigInteger[] qr = remainder.divideAndRemainder(i);
			BigInteger modulo = qr[1];

			if (modulo.bitCount() == 0 && modulo.intValue() == 0) {
				remainder = qr[0];

				maxDiv = i;
			}
		}
		System.out.println(maxDiv);
	}
}
