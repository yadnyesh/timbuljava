package io.vs.reactive;
import rx.Observable;

import java.util.Arrays;
import java.util.List;


/**
 * Created by z063407 on 1/1/18.
 */
public class Two {
	
	public static void main(String[] args) throws InterruptedException{
		List<String> symbols = Arrays.asList("AMZN", "GOOG", "ORCL");
		Observable<StockInfo> feed = StockServer.getFeed(symbols);
		
		feed.subscribe(System.out::println);
	}
}
