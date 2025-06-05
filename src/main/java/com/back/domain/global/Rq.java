package com.back.domain.global;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    String cmd;

    Map<String, Integer> idMap = new HashMap<>();
    Map<String, String> kewordMap = new HashMap<>();
    public Rq(String keyWord) { // 삭제?id=
        cmd = keyWord;

        if(cmd.contains("?")) {
            String[] splitCmd = cmd.split("\\?");

            String splitCmdBit = splitCmd[1];
            String[] splitCmdBits = splitCmdBit.split("=");
            if(splitCmdBits.length >= 2 && isNumeric(splitCmdBits[1])) {
                idMap.put(splitCmdBits[0],Integer.parseInt(splitCmdBits[1]));
            }

        }
    }

    // 유연한 사고 안되면 메소드 만들어서 억지로 하라고
    private boolean isNumeric(String splitCmdBit) {
        try  {
            Integer.parseInt(splitCmdBit);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int getParamAsInt(String keyWord, int defaultReturn) {
        int key;
        key = idMap.getOrDefault(keyWord,defaultReturn);



        return key;
    }


    public String getParam(String searchKeyword, String defaultReturn) {
        return "!2";
    }
}
