package com.example.Coin;

public class OrderPayload {

    public static String prepareBuyOrder(String symbol, double triggerPrice) {
        return String.format("{\"type\": \"buy\", \"symbol\": \"%s\", \"price\": %.2f}", symbol, triggerPrice);
    }

    public static String prepareSellOrder(String symbol, double triggerPrice) {
        return String.format("{\"type\": \"sell\", \"symbol\": \"%s\", \"price\": %.2f}", symbol, triggerPrice);
    }

    public static String prepareCancelOrder(String orderId) {
        return String.format("{\"type\": \"cancel\", \"order_id\": \"%s\"}", orderId);
    }
}
