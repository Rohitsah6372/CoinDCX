package com.example.Coin.service;

import com.example.Coin.websocket.CoinDCXWebSocketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebSocketService {

    private final CoinDCXWebSocketClient coinDCXWebSocketClient;

    @Autowired
    public WebSocketService(CoinDCXWebSocketClient coinDCXWebSocketClient) {
        this.coinDCXWebSocketClient = coinDCXWebSocketClient;
    }

    public void start() {
        try {
            coinDCXWebSocketClient.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
