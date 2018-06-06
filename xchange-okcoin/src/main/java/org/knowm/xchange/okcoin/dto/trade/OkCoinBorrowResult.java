package org.knowm.xchange.okcoin.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OkCoinBorrowResult extends OkCoinErrorResult {

  private final long borrowId;

  public OkCoinBorrowResult(
      @JsonProperty("result") final boolean result,
      @JsonProperty("error_code") final int errorCode,
      @JsonProperty("borrow_id") final long borrowId) {

    super(result, errorCode);
    this.borrowId = borrowId;
  }

  public long getBorrowId() {
    return borrowId;
  }
}
