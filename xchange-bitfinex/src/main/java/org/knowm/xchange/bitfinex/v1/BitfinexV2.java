package org.knowm.xchange.bitfinex.v1;

import java.io.IOException;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.knowm.xchange.bitfinex.v1.dto.marketdata.BitfinexTickerV2;

@Path("v2")
@Produces(MediaType.APPLICATION_JSON)
public interface BitfinexV2 {
  @GET
  @Path("/tickers")
  List<BitfinexTickerV2> getTickers(@QueryParam("symbols") List<String> symbols) throws IOException;
}
