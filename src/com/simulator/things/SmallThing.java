package com.simulator.things;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class SmallThing {        //每加一条加一个case，random范围+1;
    private Random random = new Random();
    static Scanner in = new Scanner(System.in);


    public int Small0_10() throws IOException {
        int LingliChangement = 0;
        switch (random.nextInt(20)) {//每加一条加一个case，random范围+1;
            case 0:
                System.out.println("【我的好爷爷】你爷爷抱着你照了照太阳说：“这孩子魂淡”，灵力-3。");
                LingliChangement = -3;
                break;
            case 1:
                System.out.println("【偶有好运】你掏鸟蛋的时候捡到一颗宝珠，拿在手里感觉心神宁静，灵力+6。");
                LingliChangement = 6;
                break;
            case 2:
                System.out.println("你见到天降祥瑞。灵力+6。");
                LingliChangement = 6;
                break;
            case 3:
                System.out.println("【不祥之兆】天降异象，大雨七天七夜，淹了好多地方，你的灵力受损。灵力-6。");
                LingliChangement = -6;
                break;
            case 4:
                System.out.println("【宁可信其有】路过的盲人算卦先生说你必有后福。灵力+4。");
                LingliChangement = 4;
                break;
            case 5:
                System.out.println("【是块料子】你抓阄抓到了拂尘，灵力+6。");
                LingliChangement = 6;
                break;
            case 6:
                System.out.println("【招财进宝】过年走亲戚，你特别讨人喜欢，收了不少压岁钱，你的奶粉质量提高。灵力+5。");
                LingliChangement = 5;
                break;
            case 7:
                System.out.println("【倒霉倒他身上了】偷看了隔壁于鞭叔叔的线装《金**》，差点走火入魔。灵力-4。");
                LingliChangement = -4;
                break;
            case 8:
                System.out.println("【交友不慎】和隔壁于叔叔家的郭小宝一起玩耍，学会了玩儿摇滚，沉迷不可自拔。");
                System.out.println("大哥你玩摇滚,你玩他有啥用啊？灵力-4。");
                LingliChangement = -4;
                break;
            case 9:
                System.out.println("【熊孩子】父母居然要送你去上幼儿园！！你拒绝然后就被揍了。灵力-5。");
                LingliChangement = -5;
                break;
            case 10:
                System.out.println("【熊孩子】你在火影跑的时候摔倒伤到了脑子，灵力-10。");
                LingliChangement = -6;
                break;
            case 11:
                System.out.println("【老倒霉蛋】抄写第99遍《修炼一百法》时发现作业不是这个，心态爆炸，灵力-5。");
                LingliChangement = -5;
                break;
            case 12:
                System.out.println("【旧物利用】大哥把用旧的通灵剑送给了你。灵力+10。");
                LingliChangement = 10;
                break;
            case 13:
                System.out.println("【无心插柳】你在修炼时贪玩，却无意中发现了新的经脉运行方式。灵力+11。");
                LingliChangement = 11;
                break;
            case 14:
                System.out.println("【左右为难】有两位仙尊都看中了你，要收你为徒，你却在两个师傅中难以做出抉择。");
                new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次进行下一步
                System.out.println("最终两位仙尊拂袖而去。你心境大跌，灵力-15。");
                LingliChangement = -15;
                break;
            case 15:
                System.out.println("【天生一对】邻村的扁担姐和板凳哥在一起了，你大为震撼。灵力+3。");
                LingliChangement = 3;
                break;
            case 16:
                System.out.println("【是福是祸】你意外服食通灵宝玉 没咽下去给噎着了。灵力-6。");
                LingliChangement = -6;
                break;
            case 17:
                System.out.println("【传你一招】你与小伙伴斗法获得路过仙人的赏识，对方传了你一招“亢龙有悔”。灵力+6。");
                LingliChangement = 6;
                break;
            case 18:
                System.out.println("【非礼勿视】你胆大妄为窥视上位者决斗被波及，受了内伤灵力大减。灵力-15。");
                LingliChangement = -15;
                break;
            case 19:
                System.out.println("【古神的召唤】你意外听到了亵渎之语#  .%86*##，请接受sancheck（当前san值=78）。");
                System.out.println("(1d10)/(1d100)");
                new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次进行下一步
                int x = random.nextInt(101); //检定骰子
                if (x < 78) {
                    System.out.println("1d100 = " + x + "，你检定成功。");
                    new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次进行下一步
                    x = random.nextInt(11); //检定骰子
                    System.out.println("1d10 = " + x + "，但你遭受了一次精神冲击。灵力-" + x + "。");
                } else {
                    System.out.println("1d100 = " + x + "，你检定失败。");
                    new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次进行下一步
                    System.out.println("你直面了古神。");
                    new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次进行下一步
                    x = random.nextInt(100); //检定骰子
                    System.out.println("1d100 = " + x + "，你经历了巨大的精神冲击，差点发疯。灵力-" + x + "。");
                }
                LingliChangement = -x;
                break;
        }//每加一条加一个case，random范围+1;
        return LingliChangement;
    }

    public int Small10_20() {
        return 0;
    }
}
