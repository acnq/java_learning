package com.at.g_prj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        // 存储牌号和花色
        String[] number = "2-3-4-5-6-7-8-9-10-J-Q-K-A".split("-");
        String[] color = "♠-♥-♣-♦".split("-");

        // 创建集合组成牌面
        ArrayList<String> poker = new ArrayList<>();

        // 遍历组装
        for (String num: number) {
            for (String clr: color) {
                String key = clr + num;
                poker.add(key);
            }
        }

        System.out.println(poker);
        poker.add("🤡");
        poker.add("😄");

        // 洗牌
        Collections.shuffle(poker);

        // 3人玩家 + 3张底牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();

        // 发牌
        for (int i = 0; i < poker.size(); i++) {
            String poke = poker.get(i);
            if (i >= 51) {
                last.add(poke);
            } else {
                if (i % 3 == 0) {
                    p1.add(poke);
                } else if (i % 3 == 1) {
                    p2.add(poke);
                } else {
                    p3.add(poke);
                }
            }
        }

        // 看牌
        System.out.println("A:" + p1);
        System.out.println("B:" + p2);
        System.out.println("C:" + p3);
        System.out.println("底牌：" + last);
    }
}
