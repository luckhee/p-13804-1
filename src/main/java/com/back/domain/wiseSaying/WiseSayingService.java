package com.back.domain.wiseSaying;

import com.back.domain.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    private int lastid =0;
    private List<WiseSaying> wiseSayings = new ArrayList<>();

    public WiseSaying write(String content ,String author) {
        int id = ++lastid;
        WiseSaying wiseSaying = new WiseSaying(id,author,content);

        wiseSayings.add(wiseSaying);

        return wiseSaying;
    }

    public List<WiseSaying> findForList() {
        return wiseSayings.reversed();
    }
}
