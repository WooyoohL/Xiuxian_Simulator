package com.simulator.thing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Thing {        //每加一条加一个case，random范围+1;
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

    public int BigThing(int Lingli) throws IOException {
        int LingliChangement = 0;
        switch (random.nextInt(8)) {
            case 0:
                System.out.println("【三十年大运】你进深山采药迷路，看见一个和尚走来，后面跟着一只猴一只猪和一只社畜。");
                System.out.println("和尚向你问路，你回答：");
                System.out.println("1.往东  2.往西  3.往南  ");
                switch (in.nextInt()) {
                    case 1:
                        System.out.println("东边是个大坑，猴子回来揍了你一顿。灵力-40。");
                        LingliChangement = -40;
                        break;
                    case 2:
                        System.out.println("西边是条坦途，猴子回来教了你一套棍法。灵力+40。");
                        LingliChangement = 40;
                        break;
                    case 3:
                        System.out.println("南边是群妖怪，猴子和猪没打过，和尚被吃了，仨徒弟回来准备爆锤你一顿。");
                        new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次进行下一步
                        int x = random.nextInt(101); //检定骰子。
                        if (x > 90) {
                            System.out.println("你运气不好(10%)，被爆锤致死。道友请重新来过。");
                            LingliChangement = -9999;
                        } else if (x > 60) {
                            System.out.println("你从仨徒弟手上捡了条命（30%），灵力-70。");
                            LingliChangement = -70;
                        } else if (x > 20) {
                            System.out.println("你好言相向，以理服人，说服了徒弟们不要动手。");
                            System.out.println("但猴子还是忍不住给了你一个教训(40%)。灵力-20。");
                            LingliChangement = -20;
                        } else {
                            System.out.println("你用七寸不烂之舌绕晕了徒弟们，猴子听信了你的歪理，送你一场造化(20%)。灵力+80。");
                            LingliChangement = 80;
                        }
                        break;
                    default:
                        System.out.println("请输入正确的答案。");
                }
                break;
            case 1:
                System.out.println("【三十年大运】你误入原始森林，遇到了一条受伤的小蛇。你的选择是：");
                System.out.println("1.救助  2.转身就走  3.趁他病要他命");
                switch (in.nextInt()) {
                    case 1:
                        System.out.println("获得灵蛇一条，灵蛇助你修炼，灵力+20。");
                        LingliChangement = 40;
                        break;
                    case 2:
                        System.out.println("你在森林里迷了路，饿了七天七夜，疲惫不堪，终于走出了森林。灵力-40。");
                        LingliChangement = -40;
                        break;
                    case 3:
                        System.out.println("你击杀了小蛇，继续向前，没想到小蛇的母亲出现，准备为子报仇，你被大蛇追逐。");
                        new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次进行下一步
                        int x = random.nextInt(101); //检定骰子。
                        if (x > 80) {
                            System.out.println("你运气不好(20%)，被大蛇吞入腹中，命丧蛇口。道友请重新来过。");
                            LingliChangement = -9999;
                        } else {
                            System.out.println("你误打误撞逃脱了追逐（80%），还跑出了原始森林，但是被吓得不轻。灵力-30。");
                            LingliChangement = -30;
                        }
                        break;
                    default:
                        System.out.println("请输入正确的答案。");
                }
                break;
            case 2:
                System.out.println("【三十年大运】你遇到一个口音奇怪的人向你问路，你会：");
                System.out.println("1.告诉他正确方向  2.告诉他错误方向  3.趁其不备，偷袭之");
                switch (in.nextInt()) {
                    case 1:
                        if (Lingli < 120) {
                            System.out.println("他见你根骨清奇，送了你一本秘诀《玄功》。");
                            System.out.println("你依照此法修炼。灵力+50。");
                            LingliChangement = 50;
                        } else {
                            System.out.println("他说了句谢谢就走了。无事发生。");
                        }
                        break;
                    case 2:
                        if (Lingli > 100) {
                            System.out.println("走错路的他回来教训你，反被你击倒，你获得秘籍《玄功》。");
                            System.out.println("你依照此法修炼。灵力+50。");
                            LingliChangement = 50;
                        } else {
                            System.out.println("走错路的他回来教训你，你被他打了一顿。灵力-50。");
                            LingliChangement = -50;
                        }
                        break;
                    case 3:
                        if (Lingli > 135) {
                            System.out.println("你偷袭成功，获得功法《玄功》。");
                            System.out.println("你依照此法修炼。灵力+50。");
                            LingliChangement = 50;
                        } else {
                            System.out.println("你偷袭失败，对方说你这是取死之道，你被打个半死。灵力-70。");
                            LingliChangement = -70;
                        }
                        break;
                    default:
                        System.out.println("请输入正确答案！");
                        return 0;
                }
                break;
            case 3:
                System.out.println("【三十年大运】去和朋友谈事情的你坐上了45路公交车，一位长相十分漂亮的女子的诬陷你耍流氓，你会：");
                System.out.println("1.向提着锅的和善阿姨求助  2.跟她下车理论  3.不理她，要求司机停车放你下去。 ");
                switch (in.nextInt()) {
                    case 1:
                        System.out.println("锅姨果断的拉了引线，你因自己是修仙者逃过一劫，修为大退。灵力-50。");
                        LingliChangement = -50;
                        break;
                    case 2:
                        System.out.println("进入循环的你顺利地解决了问题，轮回之神奖励你灵力+50。");
                        LingliChangement = 50;
                        break;
                    case 3:
                        System.out.println("下一站你顺利下车，不久后公交车爆炸，你心有愧疚，心境受损。灵力-10。");
                        LingliChangement = -10;
                        break;
                    default:
                        System.out.println("请输入正确答案！");
                        return 0;
                }
                break;
            case 4:
                System.out.println("【三十年大运】你在野外发现前方天地异兽正在渡劫，你会：");
                System.out.println("1.趁他病要他命  2.帮助他挡下一道天雷  3.悄悄躲远 ");
                switch (in.nextInt()) {
                    case 1:
                        System.out.println("你成功杀掉异兽，心有所感。灵力+40。");
                        LingliChangement = 40;
                        break;
                    case 2:
                        System.out.println("异兽度过天劫，你收获了它的友谊。灵力+50。");
                        LingliChangement = 50;
                        break;
                    case 3:
                        System.out.println("你试图悄悄躲开，却正好被劈歪的天雷砸中。灵力-60。");
                        LingliChangement = -60;
                        break;
                    default:
                        System.out.println("请输入正确答案！");
                        return 0;
                }
                break;
            case 5:
                System.out.println("【三十年大运】古代强者遗留的洞府开启，你决定去看看，你选择：");
                System.out.println("1.招募强者队友一起前去  2.叫上熟悉的群友一起去  3.独自应对这场造化");
                switch (in.nextInt()) {
                    case 1:
                        System.out.println("临时招聘的队友关键时刻反水，你被从悬崖上击落，幸好有棵歪脖子树你才没摔死。");
                        System.out.println("灵力-40。");
                        LingliChangement = -40;
                        break;
                    case 2:
                        System.out.println("你们齐心协力，获得神秘古卷《修仙模拟器》。虽然上面的文字你前所未闻。");
                        System.out.println("灵力+40。");
                        LingliChangement = 40;
                        break;
                    case 3:
                        System.out.println("实力不足的你在外围摸鱼，获得残卷《*+*程*设计基础》。灵力+25。");
                        LingliChangement = 25;
                        break;
                    default:
                        System.out.println("请输入正确答案！");
                        return 0;
                }
                break;
            case 6:
                System.out.println("【三十年大运】你听到旧日的亵渎之语，那充满污秽与堕落的呓语让你痛苦不堪。");
                System.out.println("你选择：1.自己掐个净心决  2.放任亵渎充满自己的大脑  3.去找懂行的尤格索托斯");
                switch (in.nextInt()) {
                    case 1:
                        System.out.println("痛苦使你精疲力尽 但也大大的淬炼了精神力。灵力+40。");
                        LingliChangement = 40;
                        break;
                    case 2:
                        System.out.println("你领悟到旧日的混乱真谛，功力大增。灵力+60。");
                        LingliChangement = 60;
                        break;
                    case 3:

                        System.out.println("尤格索托斯将把你献上祭坛来唤醒阿撒托斯。");
                        new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次进行下一步
                        System.out.println("你永久地堕入旧日支配者的精神世界中。");
                        new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次进行下一步
                        System.out.println("【古神在上】那么，代价是什么呢？");
                        new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次进行下一步
                        LingliChangement = -9999;
                        break;
                    default:
                        System.out.println("请输入正确答案！");
                        return 0;
                }
                break;
            case 7:
                System.out.println("【三十年大运】你遇到一名神秘人，神秘人说他是一个受了伤的大侠，要你帮他报托妻献子之仇");
                System.out.println("你选择：1.听听大侠的复杂经历  2.义不容辞为大侠报仇  3.受伤的大侠肯定不乏财物，嘿嘿嘿");
                switch (in.nextInt()) {
                    case 1:
                        System.out.println("你听笑了，但瘦死的骆驼比马大，你还是被大侠揍了一顿。灵力-30。");
                        LingliChangement = -30;
                        break;
                    case 2:
                        System.out.println("大侠送给你一件宝物，获得通灵马褂一件。灵力+30。");
                        LingliChangement = 30;
                        break;
                    case 3:
                        System.out.println("很遗憾，瘦死的骆驼比马大，你被大侠用三招绝技反杀。灵力-50。");
                        LingliChangement = -50;
                        break;
                    default:
                        System.out.println("请输入正确答案！");
                        return 0;
                }
                break;
        }
        return LingliChangement;
    }

    public int Small10_20() {
        return 0;
    }
}
