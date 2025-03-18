package com.pitayafruit.resp;

import lombok.Data;

import java.util.List;

@Data
public class ConversationResponse {

    private int limit;
    private boolean has_more;
    private List<ConversationItem> data;

}
