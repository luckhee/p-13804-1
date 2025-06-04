package com.back.domain.global;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    String cmd;
    // 삭제?id=1
    Map<String, Integer> idMap = new HashMap<>();
    public Rq(String keyWord) {
        cmd = keyWord;
    }

    public int getParamAsInt(String keyWord, int defaultReturn) {
        int key;

        if(keyWord.contains("\\?")) {
            String[] splitCmd = keyWord.split("\\?");
            this.cmd = splitCmd[0];

            String splitCmdBit = splitCmd[1];
            String[] splitCmdBits = splitCmdBit.split("=");
            idMap.put(splitCmdBits[0],Integer.parseInt(splitCmdBits[1]));

            key = idMap.getOrDefault(keyWord,defaultReturn);
        } else {
            return defaultReturn;
        }


        return key;
    }
}
