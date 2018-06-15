package org.knowm.xchange.bitfinex.v1.service.marketdata;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.bitfinex.v1.BitfinexExchange;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.service.marketdata.MarketDataService;
import org.knowm.xchange.service.marketdata.params.CurrencyPairsParam;

/** @author timmolter */
public class TickerFetchIntegration {

  @Test
  public void tickerFetchTest() throws Exception {

    Exchange exchange = ExchangeFactory.INSTANCE.createExchange(BitfinexExchange.class.getName());
    MarketDataService marketDataService = exchange.getMarketDataService();
    Ticker ticker = marketDataService.getTicker(new CurrencyPair("BTC", "USD"));
    System.out.println(ticker.toString());
    assertThat(ticker).isNotNull();
  }

  @Test
  public void tickersFetchTest() throws Exception {
    Exchange exchange = ExchangeFactory.INSTANCE.createExchange(BitfinexExchange.class.getName());
    MarketDataService marketDataService = exchange.getMarketDataService();
    CurrencyPairsParam params =
        new CurrencyPairsParam() {
          @Override
          public Collection<CurrencyPair> getCurrencyPairs() {
            return Arrays.asList(new CurrencyPair("BTC", "USD"), new CurrencyPair("LTC", "USD"));
          }
        };
    List<Ticker> tickers = marketDataService.getTickers(params);
    assertThat(tickers.size()).isEqualTo(2);
    for (Ticker ticker : tickers) {
      System.out.println(ticker.toString());
      assertThat(ticker).isNotNull();
    }
  }
}
