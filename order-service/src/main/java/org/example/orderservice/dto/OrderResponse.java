package org.example.orderservice.dto;

public class OrderResponse {
    private String message;
    private String status;
    private Object data;

    public OrderResponse(String message, String status, Object data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public Object getData() {
        return data;
    }
}