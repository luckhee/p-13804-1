package com.back;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        int lastid=0;
        List<WiseSaying> wiseSayings = new ArrayList<>();
        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            switch (cmd) {
                case "등록" -> {
                    System.out.print("명언 : ");
                    String content = scanner.nextLine();

                    System.out.print("작가 : ");
                    String author = scanner.nextLine();

                    int id = ++lastid;



                    wiseSayings.add(new WiseSaying(id, author,content));

                    System.out.printf("%d번 명언이 등록되었습니다.",id);
                }
                case "목록" -> {
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("----------------------");

                    for(WiseSaying wiseSaying : wiseSayings.reversed()) {
                        System.out.printf("%d / %s / %s\n",wiseSaying.getId(),wiseSaying.getAuthor(),wiseSaying.getContent());
                    }
                }
                case "종료" -> {
                    return;
                }
            }
        }

    }
}
