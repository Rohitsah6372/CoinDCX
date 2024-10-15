package com.example.Coin.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class CoinDCXWebSocketClient extends TextWebSocketHandler {

    private static final String WEB_SOCKET_URL = "wss://stream.coindcx.com/socket.io/?EIO=3&transport=websocket";

    private WebSocketSession session;

    public void connect() throws Exception {
        WebSocketClient client = new StandardWebSocketClient();
        session = client.doHandshake(this, WEB_SOCKET_URL).get();
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("Connected to WebSocket!");
        // Subscribe to market data for a specific currency pair
        session.sendMessage(new TextMessage("{\"event\": \"join\", \"channel\": \"BTCUSDT\"}"));
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Handle received messages (market data)
        System.out.println("Received message: " + message.getPayload());
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.err.println("Error in WebSocket connection: " + exception.getMessage());
    }
}
