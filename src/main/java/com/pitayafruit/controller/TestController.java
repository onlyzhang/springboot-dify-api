package com.pitayafruit.controller;

import com.pitayafruit.resp.*;
import com.pitayafruit.service.DifyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor

public class TestController {

    @Value("${dify.key.test}")
    private String testKey;

    private final DifyService difyService;

    @GetMapping("/block")
    public String test1() {
        String query = "鲁迅和周树人什么关系？";
        BlockResponse blockResponse = difyService.blockingMessage(query, 0L, testKey);
        return blockResponse.getAnswer();
    }

//    @CrossOrigin(origins = "http://localhost:8088")
    @GetMapping("/stream")
    public Flux<StreamResponse> stream(@RequestParam("message") String message,
                                      @RequestParam("sessionId") String sessionId,
                                      @RequestParam("userId") String userId) {
//        String query = "鲁迅和周树人什么关系？";
        return difyService.streamingMessage(message, userId, testKey);
    }

    @GetMapping("/sessions")
    public List<ConversationItem> sessions(@RequestParam("userId") String userId) {
        ConversationResponse conversationResponse = difyService.chatSessions(userId, testKey);
        return conversationResponse.getData();
    }


    @GetMapping("/messages")
    public List<MessageItem> messages(@RequestParam("user") String user,
                                      @RequestParam("sessionId") String sessionId) {
        MessageResponse response = difyService.messages(user, sessionId, testKey);
        return response.getData();
    }

}
