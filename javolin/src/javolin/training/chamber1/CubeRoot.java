package javolin.training.chamber1;


//http://stackoverflow.com/questions/22695654/computing-the-nth-root-of-p-using-bigdecimals
import java.math.BigDecimal;
import java.util.Scanner;

public class CubeRoot {

	private static final int SCALE = 10;
	private static final int ROUNDING_MODE = BigDecimal.ROUND_HALF_DOWN;

	public static BigDecimal nthRoot(int n, final BigDecimal a) {
		return nthRoot(n, a, BigDecimal.valueOf(.1).movePointLeft(SCALE));
	}

	private static BigDecimal nthRoot(final int n, final BigDecimal a, final BigDecimal p) {
		if (a.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("nth root can only be calculated for positive numbers");
		}
		if (a.equals(BigDecimal.ZERO)) {
			return BigDecimal.ZERO;
		}
		BigDecimal xPrev = a;
		BigDecimal x = a.divide(new BigDecimal(n), SCALE, ROUNDING_MODE);
		while (x.subtract(xPrev).abs().compareTo(p) > 0) {
			xPrev = x;
			x = BigDecimal.valueOf(n - 1.0).multiply(x).add(a.divide(x.pow(n - 1), SCALE, ROUNDING_MODE))
					.divide(new BigDecimal(n), SCALE, ROUNDING_MODE);
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		BigDecimal number = scanner.nextBigDecimal();
		BigDecimal result = CubeRoot.nthRoot(11,number);
		System.out.println(result);
		scanner.close();
	}

}
