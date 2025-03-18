package com.pitayafruit.resp;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ConversationItem {

    private String id;
    private String name;
    private Object inputs;
    private String status;
    private Timestamp created_at;
    private Timestamp updated_at;
}
