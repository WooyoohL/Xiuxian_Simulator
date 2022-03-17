package com.simulator.things;


import com.simulator.thing.Thing;

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
    Thing Things = new Thing();

    public ThingsByYear(int Happenage) throws IOException {
        LingliChangement = 0;
        if (Happenage <= 10) {   //10岁以内
        this.LifeProbability = ran.nextInt(101);        //roll 50%概率摸鱼或者修炼 生活
            if (this.LifeProbability <= 50) {
                System.out.println("你" + Happenage + "岁，今年在修炼。灵力+1。");
                LingliChangement += 1;    //获取事件灵力影响值。
            } else {
                System.out.println("你" + Happenage + "岁，今年在摸鱼。");
            }

            this.DailyProbability = ran.nextInt(101);       //35/65概率日常
            if (this.DailyProbability <= 35) {
                LingliChangement +=Things.Daily0_10();    //获取事件灵力影响值。
            }
            this.SmallProbability = ran.nextInt(101);       //35/65概率小运
            if (this.SmallProbability <= 35) {
                LingliChangement +=Things.Small0_10();    //获取事件灵力影响值。
            }
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
