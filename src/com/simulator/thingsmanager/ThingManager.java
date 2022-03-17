package com.simulator.thingsmanager;

import com.simulator.calatimyrandom.CalatimyRandom;
import com.simulator.birth.IndividualBorn;
import com.simulator.thing.Thing;
import com.simulator.things.ThingsByYear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThingManager {
    private static CalatimyRandom calatimyRandom = new CalatimyRandom();

    public static void HumanThingsHappen(IndividualBorn Person) throws IOException {
        System.out.println("你出生在一个平凡的小村庄，出生那天，天降异象，天雷滚滚，瓢泼大雨，实属罕见之景象。");
        System.out.println("大雨下了七天七夜。大雨给村民们带来了巨大的损失，从此村民们视你为异端。");
//      stories begin
        while (true) {
            if(Person.getLingli()<=0){
                System.out.println("You died. 你死了。");
                return;
            }
            if (Person.getAge() == 151) {
                if (Person.getLingli() >= 250) {
                    System.out.println("你寿元已到，飞升成仙。");
                    return;
                } else if (Person.getLingli() / 100 >= 150) {
                    System.out.println("你寿终正寝。");
                    return;
                } else {
                    System.out.println("修仙修成这种水平，你修了个寂寞啊。");
                    return;
                }
            }
            ThingHappen(Person);
        }
    }

    public static void GodThingsHappen(IndividualBorn Person) throws IOException {
        System.out.println("仙界战争，风起云涌。");
        System.out.println("你出生在一个仙族世家，但作为旁系，父母天生灵力很低，所以你们一家一直被家族所排挤。");
//      stories begin
        while (true) {
            if(Person.getLingli()<=0){
                System.out.println("You died. 你死了。");
                return;
            }
            if (Person.getAge() == 201) {
                if (Person.getLingli() >= 250) {
                    System.out.println("你寿元已到，化虹飞升。");
                    return;
                } else if (Person.getLingli() / 100 >= 150) {
                    System.out.println("你寿终正寝。");
                    return;
                } else {
                    System.out.println("修仙修成这种水平，你修了个寂寞啊。");
                    return;
                }
            }
            ThingHappen(Person);
        }
    }

    public static void ThingHappen(IndividualBorn Person) throws IOException {
        ThingsByYear ThingHappen = new ThingsByYear(Person.getAge());  //创建事件对象，传入发生年龄
        int NowLingli = Person.getLingli();  //获取当前灵力值
        Person.setLingli(NowLingli + ThingsByYear.getLingliChangement());  //将变动后的灵力传给Person对象
        if (calatimyRandom.getFlag() == 0) {   //flag = 0 累计满
            int NowLingli1 = Person.getLingli();  //获取当前灵力值
            Person.setLingli(NowLingli1 + Thing.BigThing(Person.getLingli()));    //30年大运一次，加灵力值
        }
        System.out.println("你目前的灵力值为：" + Person.getLingli() + "。");
        Person.setAge(); //Person.age++;
        new BufferedReader(new InputStreamReader(System.in)).readLine(); //每按回车一次长一岁
    }
}

