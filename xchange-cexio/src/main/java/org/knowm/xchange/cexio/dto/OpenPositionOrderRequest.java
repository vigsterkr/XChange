package org.knowm.xchange.cexio.dto;

import java.math.BigDecimal;

public class OpenPositionOrderRequest extends CexIORequest {

  public final String symbol;
  public final BigDecimal amount;
  // currency of user funds used, may be one of currencies in the pair, default is second currency
  // in the pair
  public final String msymbol;
  // leverage=3 means - ratio total/user's=3:1, margin=33.(3)%, 1/3 is users, 2/3 are borrowed; Note
  // that in UI it will be presented as 1/3
  public final BigDecimal leverage;
  // position type. long - buying product, profitable if product price grows; short - selling
  // product, profitable if product price falls;
  public final String ptype;
  // allows to open position at changed price
  public final String anySlippage;
  // estimated price at which your position will be opened
  public final BigDecimal eoprice;
  // price near which your position will be closed automatically in case of unfavorable market
  // conditions
  public final String stopLossPrice;

  public OpenPositionOrderRequest(
      String symbol,
      BigDecimal amount,
      String msymbol,
      BigDecimal leverage,
      String ptype,
      String anySlippage,
      BigDecimal eoprice,
      String stopLossPrice) {
    this.symbol = symbol;
    this.amount = amount;
    this.msymbol = msymbol;
    this.leverage = leverage;
    this.ptype = ptype;
    this.anySlippage = anySlippage;
    this.eoprice = eoprice;
    this.stopLossPrice = stopLossPrice;
  }
}
