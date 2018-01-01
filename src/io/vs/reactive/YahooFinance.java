package io.vs.reactive;

/**
 * Created by z063407 on 1/1/18.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;

/**
 * from Venkat Subramaniam book and code examples
 * http://pragprog.com/book/vsjava8/functional-programming-in-java
 */
public class YahooFinance {
	public static BigDecimal getPrice(final String ticker) {
		try {
//			final URL url =
//					new URL("http://ichart.finance.yahoo.com/table.csv?s=" + ticker);
//
//			final BufferedReader reader =
//					new BufferedReader(new InputStreamReader(url.openStream()));
//			final String data = reader.lines().skip(1).findFirst().get();
//			final String[] dataItems = data.split(",");
//			return new BigDecimal(dataItems[dataItems.length - 1]);
			
			BigDecimal max = new BigDecimal(50 + ".0");
			BigDecimal randFromDouble = new BigDecimal(Math.random());
			BigDecimal actualRandomDec = randFromDouble.divide(max,BigDecimal.ROUND_DOWN);
			return actualRandomDec;
			
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}