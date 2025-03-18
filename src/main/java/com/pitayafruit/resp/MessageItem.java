package com.pitayafruit.resp;

import lombok.Data;

import java.util.List;

@Data
public class MessageItem {
    private String id;
    private String conversation_id;
    private Object inputs;
    private String query;
    private String answer;
    private List<RetrieverResourceItem> retriever_resources;
    private int created_at;
}
