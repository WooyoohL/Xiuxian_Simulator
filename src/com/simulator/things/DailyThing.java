package com.simulator.things;

import java.util.Random;
import java.util.Scanner;

public class DailyThing {

    private Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public int Daily0_10() {
        int LingliChangement = 0;
        switch (random.nextInt(8)) { //每加一条加一个case，random范围+1;
            case 0:
                System.out.println("【日常事件】你出去玩扭伤了脚，灵力-1。");
                LingliChangement = -1;
                break;
            case 1:
                System.out.println("【日常事件】你被邻居家的狗吓尿裤子了,灵力-2。");
                LingliChangement = -2;
                break;
            case 3:
                System.out.println("【日常事件】你去私塾里上学。知识使人进步，灵力+2。");
                LingliChangement = 2;
                break;
            case 4:
                System.out.println("【日常事件】你掉到了河里，灵力-1。");
                LingliChangement = -1;
                break;
            case 5:
                System.out.println("【日常事件】你吃糖噎着了，灵力-2。");
                LingliChangement = -2;
                break;
            case 6:
                System.out.println("【日常事件】你和邻居家的小妹妹指腹为婚，十分高兴，修炼速度加快，灵力+2。");
                LingliChangement = 2;
                break;
            case 7:
                System.out.println("【日常事件】你学会了骑自行车，十分高兴，修炼速度加快，灵力+2。");
                LingliChangement = 2;
                break;
        }//每加一条加一个case，random范围+1;
        return LingliChangement;
    }

    public int Daily11_20() {
        int LingliChangement = 0;
        switch (random.nextInt(5)) {   //每加一条随机范围+1。
            case 0:
                System.out.println("【日常事件】你自己动手修好了炼丹炉，动手能力提高。灵力+3。");
                LingliChangement = 3;
                break;
            case 1:
                System.out.println("【情感事件】你谈恋爱了，你体验到了更多的快乐。灵力+4。");
                LingliChangement = 4;
                break;
            case 2:
                System.out.println("【情感事件】你定的娃娃亲被嫌弃然后被退婚了，你大受挫折，灵力-4。");
                LingliChangement = -4;
                break;
            case 3:
                System.out.println("【日常事件】你去工地搬砖，身体更加强健。灵力+1。");
                LingliChangement = 1;
                break;
            case 4:
                System.out.println("【情感事件】你谈恋爱被甩了，你大受挫折，灵力-3。");
                LingliChangement = -3;
                break;
        }
        return LingliChangement;
    }
}
