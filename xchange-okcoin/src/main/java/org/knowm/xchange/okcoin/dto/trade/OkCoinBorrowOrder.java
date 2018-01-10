package org.knowm.xchange.okcoin.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class OkCoinBorrowOrder {
    private final long borrowId;

    private final int status;

    private final String symbol;

    private final BigDecimal amount;

    private final BigDecimal dealAmount;

    private final Date borrowDate;

    private final BigDecimal rate;

    private final BigDecimal days;

    public OkCoinBorrowOrder(@JsonProperty("borrow_id") final long borrowId, @JsonProperty("status") final int status,
                       @JsonProperty("symbol") final String symbol, @JsonProperty("amount") final BigDecimal amount,
                       @JsonProperty("deal_amount") final BigDecimal dealAmount, @JsonProperty("rate") final BigDecimal rate,
                       @JsonProperty("days") final BigDecimal days, @JsonProperty("borrow_date") final Date borrowDate) {

        this.borrowId = borrowId;
        this.status = status;
        this.amount = amount;
        this.symbol = symbol;
        this.dealAmount = dealAmount;
        this.rate = rate;
        this.days = days;
        this.borrowDate = borrowDate;
    }

    public long getBorrowId() {

        return borrowId;
    }

    public int getStatus() {

        return status;
    }

    public String getSymbol() {

        return symbol;
    }

    public BigDecimal getAmount() {

        return amount;
    }

    public BigDecimal getDealAmount() {

        return dealAmount;
    }

    public Date getBorrowDate() {

        return borrowDate;
    }

    public BigDecimal getRate() {

        return rate;
    }

    public BigDecimal getDays() {

        return days;
    }

}
