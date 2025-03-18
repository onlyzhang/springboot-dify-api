package com.pitayafruit.resp;

import lombok.Data;
import java.util.List;

@Data
public class MessageResponse {

    private int limit;
    private boolean has_more;
    private Object inputs;
    private List<MessageItem> data;

}
