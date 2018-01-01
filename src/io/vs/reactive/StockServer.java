package io.vs.reactive;

import rx.Observable;

import java.util.List;


/**
 * Created by z063407 on 1/1/18.
 */
public class StockServer {
	
	public static Observable<StockInfo> getFeed(List<String> symbols) {
		return Observable.create(subscriber -> {
			while(true){
				symbols.stream()
						.map(StockInfo::fetch)
						.forEach(subscriber::onNext);
				sleep(1000);
			}
		});
	}
	
	private static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
