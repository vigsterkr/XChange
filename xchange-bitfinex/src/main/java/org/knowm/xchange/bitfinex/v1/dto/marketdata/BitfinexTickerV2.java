package org.knowm.xchange.bitfinex.v1.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.math.BigDecimal;

@JsonPropertyOrder({
        "symbol",
        "bid",
        "bidSize",
        "ask",
        "askSize",
        "dailyChange",
        "dailyChangePercent",
        "lastPrice",
        "volume",
        "high",
        "low"})
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class BitfinexTickerV2 {
    private final String symbol;
    private final BigDecimal bid;
    private final BigDecimal bidSize;
    private final BigDecimal ask;
    private final BigDecimal askSize;
    private final BigDecimal dailyChange;
    private final BigDecimal dailyChangePercent;
    private final BigDecimal lastPrice;
    private final BigDecimal volume;
    private final BigDecimal high;
    private final BigDecimal low;

    public BitfinexTickerV2(
            @JsonProperty("symbol") String symbol,
            @JsonProperty("bid") BigDecimal bid,
            @JsonProperty("bidSize") BigDecimal bidSize,
            @JsonProperty("ask") BigDecimal ask,
            @JsonProperty("askSize") BigDecimal askSize,
            @JsonProperty("dailyChange") BigDecimal dailyChange,
            @JsonProperty("dailyChangePercent") BigDecimal dailyChangePercent,
            @JsonProperty("lastPrice") BigDecimal lastPrice,
            @JsonProperty("volume") BigDecimal volume,
            @JsonProperty("high") BigDecimal high,
            @JsonProperty("low") BigDecimal low) {
        this.symbol = symbol;
        this.bid = bid;
        this.bidSize = bidSize;
        this.ask = ask;
        this.askSize = askSize;
        this.dailyChange = dailyChange;
        this.dailyChangePercent = dailyChangePercent;
        this.lastPrice = lastPrice;
        this.volume = volume;
        this.high = high;
        this.low = low;
    }


    public String getSymbol() {
        return symbol;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public BigDecimal getBidSize() {
        return bidSize;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public BigDecimal getAskSize() {
        return askSize;
    }

    public BigDecimal getDailyChange() {
        return dailyChange;
    }

    public BigDecimal getDailyChangePercent() {
        return dailyChangePercent;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public BigDecimal getLow() {
        return low;
    }

    @Override
    public String toString() {
        return "BitfinexTickerV2 [" +
                "symbol='" + symbol + '\'' +
                ", bid=" + bid +
                ", bidSize=" + bidSize +
                ", ask=" + ask +
                ", askSize=" + askSize +
                ", dailyChange=" + dailyChange +
                ", dailyChangePercent=" + dailyChangePercent +
                ", lastPrice=" + lastPrice +
                ", volume=" + volume +
                ", high=" + high +
                ", low=" + low +
                ']';
    }
}
