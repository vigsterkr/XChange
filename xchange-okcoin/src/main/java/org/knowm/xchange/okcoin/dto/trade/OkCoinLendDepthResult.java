package org.knowm.xchange.okcoin.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OkCoinLendDepthResult extends OkCoinErrorResult {

    private final OkCoinLend[] lends;

    public OkCoinLendDepthResult(@JsonProperty("result") final boolean result, @JsonProperty("error_code") final int errorCode,
                                 @JsonProperty("lend_depth") final OkCoinLend[] lends) {

        super(result, errorCode);
        this.lends = lends;
    }

    public OkCoinLend[] getLends() {

        return lends;
    }

}
