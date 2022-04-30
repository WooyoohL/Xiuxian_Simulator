package com.simulator.reborn;

import com.simulator.birth.IndividualBorn;
import com.simulator.calatimyrandom.CalatimyRandom;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author:Wooyooh_L
 * @create: 2022-04-30 14:43
 * @Description: 转世
 */

public class Reborn {
    int ReBornTimes = 0 ;
    CalatimyRandom calatimyRandom = new CalatimyRandom();
    Scanner in = new Scanner(System.in);

    //判断是否转世
    public String ifHumanReborn(IndividualBorn Person){
        String RebornMark = null;
        if (Person.getAge() == 125) {
            if (Person.getReBornTimes() > 0) {
                System.out.println("你已经修行了" + Person.getReBornTimes() + "世。");
            }
            System.out.println("这一世，你看遍了人世间的冷暖，心有所感，道心趋于圆满。请决定是否再修一世。");
            System.out.println("1.继续转世修行   2.不再流连凡尘俗世");
            RebornMark = in.next();
            if (Objects.equals(RebornMark, "1")) {
                System.out.println("RebornMark" + RebornMark);
                System.out.println("你决定下一世继续修行。");
            } else if (Objects.equals(RebornMark, "2")) {
                System.out.println("你越来越无牵无挂。");
                RebornTimes(Person);
            } else {
                System.out.println("输入错误！机不可失时不再来。你错失良机，只能结束这一世修行。");
                RebornMark = "2";
            }
        }
        return RebornMark;
    }

    public String ifGodReborn(IndividualBorn Person){
        String RebornMark = null;
        if (Person.getAge() == 155) {
            if (Person.getReBornTimes() > 0) {
                System.out.println("你已经修行了" + Person.getReBornTimes() + "世。");
            }
            System.out.println("这一世，你看遍了人世间的冷暖，心有所感，道心趋于圆满。请决定是否再修一世。");
            System.out.println("1.继续转世修行   2.不再流连凡尘俗世");
            RebornMark = in.next();
            if (Objects.equals(RebornMark, "1")) {
                System.out.println("你决定下一世继续修行。");
            } else if (Objects.equals(RebornMark, "2")) {
                System.out.println("你越来越无牵无挂。");
                RebornTimes(Person);
            } else {
                System.out.println("输入错误！机不可失时不再来。你错失良机，只能结束这一世修行。");
                RebornMark = "2";
            }
        }
        return RebornMark;
    }

    //操作转世
    public void goReborn(IndividualBorn Person) {
        RebornTimes(Person);
        System.out.println("你决定转世重修，再续一世。");
        System.out.println("你的寿元是：" + Person.getMax_Age() + "岁。");
        Person.setReBornTimes();
        Person.setAge(1);
        Person.setLingli();
        calatimyRandom.setFlag();
        System.out.println("你转世了，带着上一世的部分记忆和灵力。");
        System.out.println("你剩下" + Person.getLingli() + "点灵力。");
    }


    //在最后一年判断转世次数
    public void RebornTimes(IndividualBorn Person) {
        if (Person.getReBornTimes() == 3) {
            System.out.println("你历经两世修行，已证得仙士境界。寿元提升五十年。");
            Person.addMax_Age(50);
        }else if(Person.getReBornTimes() == 5){
            System.out.println("你历经两世修行，已证得仙君境界。寿元提升五十年。");
            Person.addMax_Age(50);

        }
    }


}
