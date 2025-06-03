package com.back;

import com.back.domain.system.controller.SystemController;
import com.back.domain.wiseSaying.controller.WiseSayingController;

import java.util.Scanner;



public class App {
    Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;

    }

    public void run() {

        WiseSayingController wiseSayingController = new WiseSayingController(scanner);
        SystemController systemController = new SystemController();

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            switch (cmd) {
                case "등록" -> {
                    wiseSayingController.actionWirte();

                }
                case "목록" -> {
                    wiseSayingController.actionList();
                }
                case "종료" -> {
                    systemController.exit();
                    return;
                }
            }
        }

    }
}
