/**
 * Created by Luzius Meisser on Jun 18, 2017
 * Copyright: Meisser Economics AG, Zurich
 * Contact: luzius@meissereconomics.com
 *
 * Feel free to reuse this code under the MIT License
 * https://opensource.org/licenses/MIT
 */
package com.agentecon.production;

import com.agentecon.market.IPriceMakerMarket;

public interface IGoodsTrader {

	public void offer(IPriceMakerMarket market);

	public void adaptPrices();
	
}
