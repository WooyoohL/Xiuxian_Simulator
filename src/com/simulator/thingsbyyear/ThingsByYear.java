package com.simulator.thingsbyyear;


import com.simulator.thing.DailyThing;
import com.simulator.thing.SmallThing;
import com.simulator.thing.BigThing;

import java.io.IOException;
import java.util.Random;


public class ThingsByYear {
    private static int LingliChangement;
    private int HappenAge;
    private int LifeProbability;
    private int DailyProbability;
    private int SmallProbability;
    private int BigProbability;

    Random ran = new Random();           //随机数种子
    SmallThing Things = new SmallThing();

    public ThingsByYear(int Happenage) throws IOException {
        LingliChangement = 0;
        DailyThing DailyThing = new DailyThing();
        SmallThing SmallThing = new SmallThing();
        BigThing BigThing = new BigThing();
        this.LifeProbability = ran.nextInt(101);        //roll 50%概率摸鱼或者修炼 生活
        if (this.LifeProbability <= 50) {
            System.out.println("你" + Happenage + "岁，今年在修炼。灵力+1。");
            LingliChangement += 1;    //获取事件灵力影响值。
        } else {
            System.out.println("你" + Happenage + "岁，今年在摸鱼。");
        }
        //开始随机事件
        this.DailyProbability = ran.nextInt(101);       //35/65概率日常
        if (this.DailyProbability <= 35 && Happenage <= 10) {
            LingliChangement += DailyThing.Daily0_10();    //日常事件发生，获取0-10岁事件灵力影响值。
        } else if (this.DailyProbability <= 35 && Happenage <= 20) { // ???
            LingliChangement += DailyThing.Daily11_20();   //小运事件发生，获取10-20岁事件灵力影响值。
        }
        this.SmallProbability = ran.nextInt(101);       //35/65概率小运
        if (this.SmallProbability <= 35 && Happenage <= 10) {
            LingliChangement += SmallThing.Small0_10();    //获取事件灵力影响值。
        } else if (this.SmallProbability <= 35 && Happenage <= 20) {
            LingliChangement += SmallThing.Small10_20();
        }
    }


    public int getLifeProbability() {
        return LifeProbability;
    }

    public void setLifeProbability(int lifeProbability) {
        LifeProbability = lifeProbability;
    }

    public int getDailyProbability() {
        return DailyProbability;
    }

    public void setDailyProbability(int dailyProbability) {
        DailyProbability = dailyProbability;
    }

    public int getSmallProbability() {
        return SmallProbability;
    }

    public void setSmallProbability(int smallProbability) {
        SmallProbability = smallProbability;
    }

    public int getBigProbability() {
        return BigProbability;
    }

    public void setBigProbability(int bigProbability) {
        BigProbability = bigProbability;
    }

    public static int getLingliChangement() {
        return LingliChangement;
    }

    public void setLingliChangement(int lingliChangement) {
        LingliChangement = lingliChangement;
    }

    public int getHappenAge() {
        return HappenAge;
    }

    public void setHappenAge(int happenAge) {
        HappenAge = happenAge;
    }
}
