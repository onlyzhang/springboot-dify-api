package com.pitayafruit.resp;

import lombok.Data;

@Data
public class RetrieverResourceItem {

    private int position;
    private String dataset_id;
    private String dataset_name;
    private String document_id;
    private String document_name;
    private String segment_id;
    private String score;
    private String content;
}
