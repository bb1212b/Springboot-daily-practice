package com.example.hellospring.Controller;

import com.example.hellospring.domain.Memo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/memo")
public class MemoController {

    private final List<Memo> memoList = new ArrayList<>();
    private Long nextId = 1L;

    @PostMapping
    public Memo createMemo(@RequestBody String content) {
        Memo memo = new Memo(nextId++, content);
        memoList.add(memo);
        return memo;
    }

    @GetMapping("/{id}")
    public Memo getMemo(@PathVariable Long id) {
        return memoList.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("메모를 찾을 수 없습니다: id=" + id));
    }

    @GetMapping
    public List<Memo> getAllMemos() {
        return memoList;
    }

    @DeleteMapping("/{id}")
    public String deleteMemo(@PathVariable Long id) {
        Memo memo = memoList.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("메모를 찾을 수 없습니다: id=" + id));

        memoList.remove(memo);
        return "삭제 완료: id=" + id;
    }
}
