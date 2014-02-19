package com.dt.modules.backtest.scripts;

import com.dt.StockDatabase;
import com.dt.classes.Stock;
import com.dt.modules.backtest.Script;

public class Diagnostics extends Script {

	@Override
	public void handleEnterTick() {
		Stock stock = StockDatabase.getStock("IBM");
		System.out.println("Close: "+stock.getClose());
		System.out.println("Price change: "+(stock.getClose()-stock.getClose(1)));
		System.out.println("MA 30: "+stock.getMA(30));
		System.out.println("SD 5: "+stock.getMovingSD(5));
		System.out.println("SD 30: "+stock.getMovingSD(30));
		System.out.println("SD 90: "+stock.getMovingSD(90));

	}

}
