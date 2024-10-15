package com.example.Coin.Controller;

import com.example.Coin.OrderPayload;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/trading")
public class TradingController {

    @PostMapping("/buy")
    public String prepareBuyOrder(@RequestParam String symbol, @RequestParam double triggerPrice) {
        String buyOrderPayload = OrderPayload.prepareBuyOrder(symbol, triggerPrice);
        return buyOrderPayload;  // Return the prepared buy order payload
    }

    @PostMapping("/sell")
    public String prepareSellOrder(@RequestParam String symbol, @RequestParam double triggerPrice) {
        String sellOrderPayload = OrderPayload.prepareSellOrder(symbol, triggerPrice);
        return sellOrderPayload;  // Return the prepared sell order payload
    }

    @PostMapping("/cancel")
    public String prepareCancelOrder(@RequestParam String orderId) {
        String cancelOrderPayload = OrderPayload.prepareCancelOrder(orderId);
        return cancelOrderPayload;  // Return the prepared cancel order payload
    }
}
