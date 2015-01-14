package study.java.javajerngsuck;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
float floatValue() //값을 float형으로 반환
double doubleValue() //값을 double형으로 반환
BigInteger toBigInteger() //값을 BigInteger로 반환 (소수점 아래는 날아감)
 
BigDecimal add(BigDecimal augend) //덧셈 + 연산
BigDecimal subtract(BigDecimal subtrahend) //뺄셈 - 연산
BigDecimal multiply(BigDecimal multiplicand) //곱셈 * 연산
BigDecimal divide(BigDecimal divisor) //나눗셈 / 연산
BigDecimal remainder(BigDecimal divisor) //나머지 % 연산
 */
public class Chap1_6BigDeciaml {
	public static void main(String[] arg) {
		// int 보다 작은 타입은 int(btye.char,short)
		System.out.println('a' + '4');

		System.out.println("[Integer max value]" + Integer.MAX_VALUE);// int 형 -2,147,483,648 ~ 2,147,483,647
		System.out.println("[Long max value]" + Long.MAX_VALUE);
		int b = 1000000;
		int c = 1000000;

		long a = (int) b * (int) c;
		System.out.println(a);

		b = 100000;
		c = 100000;
		a = (int) b * (int) c;
		System.out.println(a);

		BigInteger bi = new BigInteger("1000000");
		BigInteger bi2 = new BigInteger("1000000");
		System.out.println(bi.multiply(bi2));

		BigDecimal amount = new BigDecimal("100.05");
		BigDecimal discountPercent = new BigDecimal("0.1");
		BigDecimal taxPercent = new BigDecimal("0.05");

		BigDecimal discount = amount.multiply(discountPercent);
		discount = discount.setScale(2, RoundingMode.HALF_UP);

		BigDecimal total = amount.subtract(discount);
		total = total.setScale(2, RoundingMode.HALF_UP);

		BigDecimal tax = total.multiply(taxPercent);
		tax = tax.setScale(2, RoundingMode.HALF_UP);

		BigDecimal taxedTotal = total.add(tax);
		taxedTotal = taxedTotal.setScale(2, RoundingMode.HALF_UP);

		System.out.println("Subtotal : " + amount);
		System.out.println("Discount : " + discount);
		System.out.println("Total : " + total);
		System.out.println("Tax : " + tax);
		System.out.println("Tax+Total: " + taxedTotal);

		BigDecimal a1 = new BigDecimal("2.2");
		BigDecimal b1 = new BigDecimal("3");
		BigDecimal c1 = a1.divide(b1, 9, BigDecimal.ROUND_HALF_UP);
		System.out.println(c1);
		
	}
}
