package com.back.domain.wiseSaying;

import com.back.domain.wiseSaying.entity.WiseSaying;
import com.back.domain.wiseSaying.repository.WiseSayingRepository;

import java.util.List;

public class WiseSayingService {

    private WiseSayingRepository wiseSayingRepository = new WiseSayingRepository();

    public WiseSaying write(String content ,String author) {
        WiseSaying wiseSaying = wiseSayingRepository.save(content, author);
        return wiseSaying;
    }

    public List<WiseSaying> findForList() {
        return wiseSayingRepository.findList();
    }
}
