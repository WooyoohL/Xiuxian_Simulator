package com.simulator.thing;

import com.simulator.birth.IndividualBorn;
import com.simulator.calatimyrandom.CalatimyRandom;
import com.simulator.thingsbyyear.ThingsByYear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class BigThing {
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    private CalatimyRandom calatimyRandom = new CalatimyRandom();

    public int BigThingHappen(IndividualBorn Person) throws IOException {
        int LingliChangement = 0;
        int Lingli = Person.getLingli();
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

}


