package com.back.domain.wiseSaying.controller;

import com.back.domain.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    Scanner scanner;
    List<WiseSaying> wiseSayings = new ArrayList<>();
    int lastid =0;

    public WiseSayingController(Scanner scanner) {
        this.scanner = scanner;
    }
    public void actionWirte() {
        System.out.print("명언 : ");
        String content = scanner.nextLine();

        System.out.print("작가 : ");
        String author = scanner.nextLine();

        int id = ++lastid;



        wiseSayings.add(new WiseSaying(id, author,content));

        System.out.printf("%d번 명언이 등록되었습니다.",id);

    }

    public List<WiseSaying> findForList() {
        return wiseSayings;
    }

    public void actionList() {

        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");

        for(WiseSaying wiseSaying : wiseSayings.reversed()) {
            System.out.printf("%d / %s / %s\n",wiseSaying.getId(),wiseSaying.getAuthor(),wiseSaying.getContent());
        }

    }
}
