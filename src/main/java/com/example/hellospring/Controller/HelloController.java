package com.example.hellospring.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
public class HelloController {

    // Day 1: hello 응답 API
    @GetMapping("/hello")
    public String hello() {
        return "Hello, 백엔더 주원이의 API 만들기!! ";
    }

    // Day 1: ping 응답 API
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    // Day 2: 명언 랜덤 응답 API
    @GetMapping("/quote")
    public Map<String, String> getQuote() {
        List<String> quotes = List.of(
                "실패는 성공으로 가는 지름길이다.",
                "지금 하지 않으면 평생 못 한다.",
                "천 리 길도 한 걸음부터.",
                "코드는 거짓말하지 않는다. 주석은 한다.",
                "해커톤은 열정의 축제다."
        );

        int index = new Random().nextInt(quotes.size());
        return Map.of("quote", quotes.get(index));
    }

    // Day 3: 메모 추가, POST
    private final List<String> memos = new ArrayList<>();

    //@PostMapping("/memo")
    public String addMemo(@RequestBody Map<String, String> request) {
        String content = request.get("content");
        memos.add(content);
        return "메모 저장 완료: " + content;
    }

    // Day 3: 메모 목록 조회, GET
    @GetMapping("/memos")
    public List<String> getMemos() {
        return memos;
    }
}
