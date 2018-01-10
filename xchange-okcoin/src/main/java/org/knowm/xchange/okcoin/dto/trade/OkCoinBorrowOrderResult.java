package org.knowm.xchange.okcoin.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OkCoinBorrowOrderResult extends OkCoinErrorResult {

    private final OkCoinBorrowOrder borrowOrder;

    public OkCoinBorrowOrderResult(@JsonProperty("result") final boolean result, @JsonProperty("error_code") final int errorCode,
                                   @JsonProperty("borrow_order") final OkCoinBorrowOrder borrowOrder) {

        super(result, errorCode);
        this.borrowOrder = borrowOrder;
    }

    public OkCoinBorrowOrder getBorrowOrder() {

        return borrowOrder;
    }
}