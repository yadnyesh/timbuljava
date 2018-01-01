package io.vs.reactive;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by z063407 on 1/1/18.
 */
public class StockInfo {
	public final String ticker;
	public final BigDecimal value;
	
	public StockInfo(String ticker, BigDecimal value) {
		this.ticker = ticker;
		this.value = value;
	}
	
	public static StockInfo fetch(String ticker){
		return new StockInfo(ticker, YahooFinance.getPrice(ticker));
	}
	
	@Override
	public String toString() {
		return "StockInfo{" + "ticker='" + ticker + '\'' + ", value=" + value + '}';
	}
}
