package io.lamdas.venkat;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class FPinJavaChaperOne {
	
	public static void main(String[] args) {
		
		final List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
				new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
				new BigDecimal("45"), new BigDecimal("17"));
		
		final BigDecimal totalOfDiscountedPrices = prices.stream()
				.filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
				.map(price -> price.multiply(BigDecimal.valueOf(0.9)))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.printf("Total of Discounted prices is: " + totalOfDiscountedPrices);
	}
}
