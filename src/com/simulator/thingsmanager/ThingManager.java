package com.simulator.thingsmanager;

import com.simulator.calatimyrandom.CalatimyRandom;
import com.simulator.birth.IndividualBorn;
import com.simulator.file.Files;
import com.simulator.thing.Thing;
import com.simulator.thingsbyyear.ThingsByYear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThingManager {
    private CalatimyRandom calatimyRandom = new CalatimyRandom();

    public void HumanThingsHappen(IndividualBorn Person) throws IOException {
        System.out.println("你出生在一个平凡的小村庄，出生那天，天降异象，天雷滚滚，瓢泼大雨，实属罕见之景象。");
        System.out.println("大雨下了七天七夜。大雨给村民们带来了巨大的损失，从此村民们视你为异端。");
        new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次
//      stories begin
        Files.createFile(Person.getName() + "_Files",
                "Name = " + Person.getName() +
                        "\nNationality = " + Person.getNationality() +
                        "\nBirthPlace = " + Person.getBirthPlaceName() +
                        "\nAge = " + Person.getAge() +
                        "\nLingli = " + Person.getLingli());
        while (true) {
            if (Person.getLingli() <= 0) {
                System.out.println("You died. 你死了。");
                return;
            }
            if (Person.getAge() == 151) {
                if (Person.getLingli() >= 200) {
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

    public void GodThingsHappen(IndividualBorn Person) throws IOException {
        System.out.println("仙界战争，风起云涌。");
        System.out.println("你出生在一个仙族世家，但作为旁系，父母天生灵力很低，所以你们一家一直被家族所排挤。");
        new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次
//      stories begin
        Files.createFile(Person.getName() + "_Files",
                "Name = " + Person.getName() +
                        "\nNationality = " + Person.getNationality() +
                        "\nBirthPlace = " + Person.getBirthPlaceName() +
                        "\nAge = " + Person.getAge() +
                        "\nLingli = " + Person.getLingli());
        while (true) {
            if (Person.getLingli() <= 0) {
                System.out.println("You died. 你死了。");
                return;
            }
            if (Person.getAge() == 201) {
                if (Person.getLingli() >= 250) {
                    System.out.println("你寿元已到，化虹飞升。");
                    return;
                } else if (Person.getLingli() >= 150) {
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

    public void ThingHappen(IndividualBorn Person) throws IOException {
        Thing thing = new Thing();
        ThingsByYear ThingHappen = new ThingsByYear(Person.getAge());  //创建事件对象，传入发生年龄
        int NowLingli = Person.getLingli();  //获取当前灵力值
        Person.setLingli(NowLingli + ThingsByYear.getLingliChangement());  //将变动后的灵力传给Person对象
        double flag = calatimyRandom.getFlag();
        if (flag == 0) {
            int NowLingli1 = Person.getLingli();  //获取当前灵力值
            Person.setLingli(NowLingli1 + thing.BigThing(Person.getLingli()));    //30年大运一次，加灵力值
        }
        if (Person.getLingli() > 0) {
            System.out.println("你目前的灵力值为：" + Person.getLingli() + "。");
        } else return;
        Person.setAge(); //Person.age++;
        Files.writeFileContent("E:\\" + Person.getName() + "_Files.txt",
                "\nAge = " + Person.getAge() +
                        "\nLingli = " + Person.getLingli());
        new BufferedReader(new InputStreamReader(System.in)).readLine(); //每按回车一次长一岁
    }
}

