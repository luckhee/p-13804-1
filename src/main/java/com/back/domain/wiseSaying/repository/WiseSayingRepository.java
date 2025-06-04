package com.back.domain.wiseSaying.repository;

import com.back.domain.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingRepository {
    private int lastid =0;
    private List<WiseSaying> wiseSayings = new ArrayList<>();

    public WiseSaying save(String content, String author) {

        WiseSaying wiseSaying = new WiseSaying(++lastid, author,content);
        wiseSayings.add(wiseSaying);
        return wiseSaying;
    }

    public List<WiseSaying> findList() {
        return wiseSayings.reversed();
    }
}
