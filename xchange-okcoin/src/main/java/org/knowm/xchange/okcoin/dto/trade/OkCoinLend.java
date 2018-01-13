package org.knowm.xchange.okcoin.dto.trade;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OkCoinLend {

    private final BigDecimal amount;

    private final String days;

    private final BigDecimal numOfLoans;

    private final BigDecimal rate;

    public OkCoinLend(@JsonProperty("amount") final BigDecimal amount, @JsonProperty("days") final String days,
                       @JsonProperty("num") final BigDecimal num, @JsonProperty("rate") final BigDecimal rate) {
        this.amount = amount;
        this.days = days;
        this.numOfLoans = num;
        this.rate = rate;
    }

    public BigDecimal getAmount() {

        return amount;
    }

    public String getDays() {

        return days;
    }

    public BigDecimal getNumOfLoans() {

        return numOfLoans;
    }

    public BigDecimal getRate() {

        return rate;
    }
}
