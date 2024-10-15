# CoinDCX Trading Simulation Application

## Description

The CoinDCX Trading Simulation Application is a Spring Boot-based Java application that connects to the CoinDCX WebSocket API to fetch real-time cryptocurrency trading data. This application allows users to prepare JSON payloads for simulated order operations (buy, sell, cancel) based on user-defined trigger prices.

## Features

- **WebSocket Connection**: Establishes a connection to the CoinDCX WebSocket API to receive live market data.
- **Order Payload Preparation**: Prepares structured payloads for buy and sell orders when the market price meets the specified trigger price.
- **Order Cancellation Simulation**: Prepares payloads for canceling existing orders.
- **REST API**: Exposes endpoints for preparing orders without executing them.
- **Error Handling and Logging**: Manages WebSocket communication issues and logs error messages.

## Technologies Used

- **Java**: The primary programming language used for the application.
- **Spring Boot**: Framework for building the RESTful application.
- **WebSocket**: For real-time communication with the CoinDCX API.
- **Maven**: For dependency management.

## Setup and Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/CoinDCXTradingApp.git
   cd CoinDCXTradingApp
