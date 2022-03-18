package com.simulator.thingsmanager;

import com.simulator.calatimyrandom.CalatimyRandom;
import com.simulator.birth.IndividualBorn;
import com.simulator.file.Files;
import com.simulator.thing.BigThing;
import com.simulator.thingsbyyear.ThingsByYear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class ThingManager {
    BigThing BigThing = new BigThing();

    public ThingManager() throws IOException {
    }

    CalatimyRandom calatimyRandom = new CalatimyRandom();

    public void HumanThingsHappen(IndividualBorn Person) throws IOException {
        //一轮循环前先判断自身情况
        if (Person.getLingli() <= 0) {
            System.out.println("You died. 你死了。");
            return;
        }
        if (Person.getAge() == 151) {
            if (Person.getLingli() >= 200) {
                System.out.println("你寿元已到，飞升成仙。");
                exit(1);
            } else if (Person.getLingli() / 100 >= 150) {
                System.out.println("你寿终正寝。");
                return;
            } else {
                System.out.println("修仙修成这种水平，你修了个寂寞啊。");
                return;
            }
        }
        //调用一年事件方法
        Happen(Person);
    }

    public void GodThingsHappen(IndividualBorn Person) throws IOException {
        //一轮循环前先判断自身情况
        if (Person.getLingli() <= 0) {
            System.out.println("You died. 你死了。");
            exit(1);
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
        //调用一年事件方法
        Happen(Person);
    }

    public void Happen(IndividualBorn Person) throws IOException {
        ThingsByYear ThingHappen = new ThingsByYear(Person.getAge());  //创建事件对象，传入发生年龄
        int NowLingli = Person.getLingli();  //获取当前灵力值
        Person.setLingli(NowLingli + ThingsByYear.getLingliChangement());  //将变动后的灵力传给Person对象
        if (calatimyRandom.getFlag() == 0) { //随机
            NowLingli = Person.getLingli();  //获取当前灵力值
            Person.setLingli(NowLingli + BigThing.BigThingHappen(Person));    //30年大运一次，加灵力值
        }
        if (Person.getLingli() > 0) {
            System.out.println("你目前的灵力值为：" + Person.getLingli() + "。");
        } else return;
        Person.setAge(); //Person.age++;
        Files.writeFileContent("E:\\" + Person.getName() + "_Files.txt",
                "\nAge = " + Person.getAge() +
                        "\nLingli = " + Person.getLingli());
        new BufferedReader(new InputStreamReader(System.in)).readLine(); //每按回车一次长一岁
    }//调用一年事件方法


}


