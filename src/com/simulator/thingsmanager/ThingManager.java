package com.simulator.thingsmanager;

import com.simulator.calatimyrandom.CalatimyRandom;
import com.simulator.birth.IndividualBorn;
import com.simulator.file.Files;
import com.simulator.things.BigThing;
import com.simulator.thingsbyyear.ThingsByYear;
import com.simulator.reborn.Reborn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;

public class ThingManager {
    BigThing BigThing = new BigThing();
    public ThingManager() throws IOException {
    }
    IndividualBorn Person = new IndividualBorn();
    CalatimyRandom calatimyRandom = new CalatimyRandom();

    //开局
    public void NationalityStart(IndividualBorn Person) throws IOException {
        switch (Person.getNationality()) {
            case "人族":
                Person.addMax_Age(150);
                this.HumanJudge(Person);//人族开局
                break;
            case "仙族":
                Person.addMax_Age(200);
                this.GodJudge(Person);//仙族开局
                break;
        }

    }


    //人族
    public void HumanJudge(IndividualBorn Person) throws IOException {
        Scanner in = new Scanner(System.in);
        String RebornMark = null;
        Reborn reborn = new Reborn();
        //开始循环年龄增长
        while (true) {
            //一轮循环前先判断自身情况
            if (Person.getLingli() <= 0) {
                System.out.println("你共转世了" + Person.getReBornTimes() + "次。");
                System.out.println("修仙之路如逆水行舟，不进则退，你的灵力太低了。");
                System.out.println("You died. 你死了。");
                return;
            }
            //125岁时决定是否转世
            RebornMark = reborn.ifHumanReborn(Person);
            //寿终时判断
            if (Person.getAge() == Person.getMax_Age() + 1) {
                System.out.println("RebornMark" + RebornMark);
                if (Objects.equals(RebornMark, "1")) {
                    reborn.goReborn(Person);
                } else if (Person.getLingli() >= 200) {
                    System.out.println("你共修行了" + Person.getReBornTimes() + "世。");
                    System.out.println("你寿元已尽，飞升而去。");
                    exit(1);
                } else if (Person.getLingli() >= 150) {
                    System.out.println("你共修行了" + Person.getReBornTimes() + "世。");
                    System.out.println("你寿终正寝。");
                    return;
                } else {
                    System.out.println("你共转世了" + Person.getReBornTimes() + "次。");
                    System.out.println("修仙之路如同逆水行舟，不进则退。你的灵力尚未足够。");
                    System.out.println("修仙修成这种水平，你修了个寂寞啊。");
                    return;
                }
            }
            //调用一年事件方法
            Happen(Person);
        }

    }

    //仙族
    public void GodJudge(IndividualBorn Person) throws IOException {
        Scanner in = new Scanner(System.in);
        String RebornMark = null;
        Reborn reborn = new Reborn();
        while (true) {
            //一轮循环前先判断自身情况
            if (Person.getLingli() <= 0) {
                System.out.println("修仙之路如逆水行舟不进则退，你的灵力太低了。");
                System.out.println("You died. 你死了。");
                exit(1);
            }
            RebornMark = reborn.ifGodReborn(Person);
            if (Person.getAge() == Person.getMax_Age()) {
                if (Objects.equals(RebornMark, "1")) {
                    reborn.goReborn(Person);
                } else if (Person.getLingli() >= 250) {
                    System.out.println("你共转世了" + Person.getReBornTimes() + "次。");
                    System.out.println("你寿元已到，化虹飞升。");
                    return;
                } else if (Person.getLingli() >= 180) {
                    System.out.println("你共转世了" + Person.getReBornTimes() + "次。");
                    System.out.println("你寿终正寝。");
                    return;
                } else {
                    System.out.println("你共转世了" + Person.getReBornTimes() + "次。");
                    System.out.println("修仙之路如同逆水行舟，不进则退。你的灵力尚未足够。");
                    System.out.println("修仙修成这种水平，你修了个寂寞啊。");
                    return;
                }
            }

            //调用一年事件方法
            Happen(Person);
        }
    }

    //事件发生
    public void Happen(IndividualBorn Person) throws IOException {
        //创建事件对象，传入发生年龄
        ThingsByYear ThingHappen = new ThingsByYear(Person.getAge());
        //获取当前灵力值
        int NowLingli = Person.getLingli();
        //将变动后的灵力传给Person对象
        Person.setLingli(NowLingli + ThingHappen.getLingliChangement());
        //随机，独立进行30年大运
        if (calatimyRandom.getFlag() == 0) {
            //获取当前灵力值
            NowLingli = Person.getLingli();
            //30年大运一次，加灵力值
            Person.setLingli(NowLingli + BigThing.BigThingHappen(Person));
        }
        //一年结束，输出灵力值，小于0时当场去世
        if (Person.getLingli() > 0) {
            System.out.println("你目前的灵力值为：" + Person.getLingli() + "。");
        } else return;
        Person.setAge(); //Person.age++;
        //将灵力值和年龄保存到文件
        Files.writeFileContent("E:\\" + Person.getName() + "_Files.txt",
                "\nAge = " + Person.getAge() +
                        "\nLingli = " + Person.getLingli() +
                        "\nRebornTimes = " + Person.getReBornTimes());
        //每按回车一次长一岁
        new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}


