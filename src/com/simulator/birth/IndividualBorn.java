package com.simulator.birth;

import com.simulator.file.Files;
import com.simulator.thingsmanager.ThingManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class IndividualBorn {
    public boolean getReBornTimes;       //人类类
    private int Level;             //Max_Level == 100;
    private String Nationality;    //种族
    private int BirthPlace;        //出生地代码 =1 人族 =2 神族
    private String BirthPlaceName; //出生地名称
    private String Name;           //昵称
    private int age;               //年龄，Normal_Max_Age == 200  Max_Age == 400;
    private int Real_Lingli;       //真实灵力 = random(1,10000)
    private int Lingli;            //显示灵力 = random(1,100)
    private int ReBornTimes = 0;   //转世次数
    private int Max_Age;           //寿命上限

    public IndividualBorn() throws IOException {
        ThingManager thingsmanager = new ThingManager();
        //灵力设置
        Random r = new Random();           //随机数种子
        Scanner in = new Scanner(System.in);

        System.out.println("欢迎使用修仙模拟器,为自己起一个法号吧！");
        this.Name = in.next();     //输入昵称
        this.age = 1;              //初始化年龄
        this.Real_Lingli = r.nextInt(10000 + 1);        //roll真实灵力
        this.Lingli = Real_Lingli / 100;
        System.out.println("请选择种族：1.人族 2.仙族");
        int x = in.nextInt();  //接收种族选择
        switch (x) {
            case 1:
                this.Nationality = "人族";
                break;
            case 2:
                this.Nationality = "仙族";
                break;
            default:
                return;
        }
//      等级设置
        this.Level = 1;
//      出生地设置
        if (Objects.equals(this.Nationality, "人族")) {       //人族开局
            System.out.println(this.Name + "，欢迎来到修仙的世界！");
            this.BirthPlace = this.HumanSelectBirthPlace(Real_Lingli);    //判断灵力水平,返回选择的出生地
            if (this.BirthPlace == 0) {   //灵力太低 别修了 退出。
                exit();
                return;
            } else {
                switch (this.BirthPlace) {
                    case 1:
                        this.BirthPlaceName = "平顶山";
                        break;
                    case 2:
                        this.BirthPlaceName = "桃花镇";
                        break;
                    default:
                        System.out.println("输入错误！请重新输入！");
                        return;
                }
            }
            //开局
            System.out.println("你的种族是" + this.Nationality + "。");
            System.out.println("你出生在" + this.BirthPlaceName + "，出生那天，天降异象，天雷滚滚，瓢泼大雨，实属罕见之景象。");
            System.out.println("大雨下了七天七夜。大雨给村民们带来了巨大的损失，从此村民们视你为异端。");
            new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次
//          stories begin
//          每运行一次你会在D盘根目录下找到一个txt文件
//          修改后缀名为txt后打开 可以看到你的真实灵力以及年龄
            Files.createFile(getName() + "_Files",
                    "Name = " + getName() +
                            "\nNationality = " + getNationality() +
                            "\nBirthPlace = " + getBirthPlaceName() +
                            "\nAge = " + getAge() +
                            "\nLingli = " + getLingli());
        } else if (Objects.equals(this.Nationality, "仙族")) {    //仙族开局  别去掉判断条件，以后可能加别的种族。
            System.out.println(this.Name + "，欢迎来到修仙的世界！");
            this.BirthPlace = this.GodSelectBirthPlace(Real_Lingli);
            if (this.BirthPlace == 0) {   //灵力太低 别修了 退出。
                exit();
                return;
            } else {
                switch (this.BirthPlace) {
                    case 1:
                        this.BirthPlaceName = "灵泉";
                        break;
                    case 2:
                        this.BirthPlaceName = "上清池";
                        break;
                    default:
                        System.out.println("输入错误！请重新输入！");
                        return;
                }
            }
            System.out.println("仙界战争，风起云涌。");
            System.out.println("你出生在一个仙族世家，但作为旁系，父母天生灵力很低，所以你们一家一直被家族所排挤。");
            new BufferedReader(new InputStreamReader(System.in)).readLine(); //按回车一次
//          stories begin
//          每运行一次你会在D盘根目录下找到一个txt文件
//          修改后缀名为txt后打开 可以看到你的真实灵力以及年龄
            Files.createFile(getName() + "_Files",
                    "Name = " + getName() +
                            "\nNationality = " + getNationality() +
                            "\nBirthPlace = " + getBirthPlaceName() +
                            "\nAge = " + getAge() +
                            "\nLingli = " + getLingli());
        }
    }

    public int HumanSelectBirthPlace(int Real_Lingli) {   //判断灵力水平，选择出生地，开局用
        Scanner in = new Scanner(System.in);
        if (Real_Lingli > 9990) {
            System.out.println("你天资聪颖，百年难遇！");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            System.out.println("请选择你的出生地：1.平顶山 2.桃花镇 ");
            return in.nextInt();
        } else if (Real_Lingli > 9000) {
            System.out.println("你在同龄人里出类拔萃。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            System.out.println("请选择你的出生地：1.平顶山 2.桃花镇 ");
            return in.nextInt();
        } else if (Real_Lingli > 8000) {
            System.out.println("你生来就比普通人强得多。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            System.out.println("请选择你的出生地：1.平顶山 2.桃花镇 ");
            return in.nextInt();
        } else if (Real_Lingli > 6000) {
            System.out.println("你的灵力比普通人略强。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            System.out.println("请选择你的出生地：1.平顶山 2.桃花镇 ");
            return in.nextInt();
        } else if (Real_Lingli > 4000) {
            System.out.println("你天资平平。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            System.out.println("请选择你的出生地：1.平顶山 2.桃花镇 ");
            return in.nextInt();
        } else if (Real_Lingli > 2000) {

            System.out.println("请选择你的出生地：1.平顶山 2.桃花镇 ");
            int birthPlace = in.nextInt();
            System.out.println("你天生就不如隔壁王叔叔家孩子。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            return birthPlace;
        } else {
            System.out.println("你没什么修炼的天资，平平安安地过完这一生就是最大的美好。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            return 0;
        }
    }

    public int GodSelectBirthPlace(int Real_Lingli) {   //判断灵力水平，选择出生地，开局用
        Scanner in = new Scanner(System.in);
        if (Real_Lingli > 9990) {
            System.out.println("你天资聪颖，百年难遇！");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            System.out.println("请选择你的出生地：1.灵泉 2.上清池 ");
            return in.nextInt();
        } else if (Real_Lingli > 9000) {
            System.out.println("你在同龄者中十分优秀。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            System.out.println("请选择你的出生地：1.灵泉 2.上清池 ");
            return in.nextInt();
        } else if (Real_Lingli > 8000) {
            System.out.println("你生来就比身边的人强得多。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            System.out.println("请选择你的出生地：1.灵泉 2.上清池 ");
            return in.nextInt();
        } else if (Real_Lingli > 6000) {
            System.out.println("你的灵力比一般仙人略强。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            System.out.println("请选择你的出生地：1.灵泉 2.上清池 ");
            return in.nextInt();
        } else if (Real_Lingli > 4000) {
            System.out.println("你天资平平。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            System.out.println("请选择你的出生地：1.灵泉 2.上清池 ");
            return in.nextInt();
        } else if (Real_Lingli > 2000) {

            System.out.println("请选择你的出生地：1.灵泉 2.上清池 ");
            int birthPlace = in.nextInt();
            System.out.println("你天生就不如隔壁王叔叔家孩子。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            return birthPlace;
        } else {
            System.out.println("你没什么修炼的天资，平平安安地过完这一生就是最大的美好。");
            System.out.println("你的灵力是 (0-100随机)：" + Lingli);
            return 0;
        }
    }

    public int getReBornTimes() {
        return ReBornTimes;
    }

    //正常转世无传入值直接++，有大运积攒直接增加转世次数n次
    public void setReBornTimes() {
        this.ReBornTimes++;
    }

    public void setReBornTimes(int reBornTimes) {
        this.ReBornTimes += reBornTimes;
    }

    public int getReal_Lingli() {
        return Real_Lingli;
    }

    public void setReal_Lingli(int real_Lingli) {
        Real_Lingli = real_Lingli;
    }

    public int getAge() {
        return age;
    }

    //正常年龄增长无传入值，转世直接重写年龄值
    public void setAge() {
        this.age++;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public int getLingli() {
        return Lingli;
    }

    //正常灵力增长有传入值，转世直接重写灵力值
    public void setLingli(int lingli) {
        Lingli = lingli;
    }

    public void setLingli() {
        this.Lingli /=2.5;
    }

    public int getBirthPlace() {
        return BirthPlace;
    }

    public void setBirthPlace(int birthPlace) {
        BirthPlace = birthPlace;
    }

    public String getBirthPlaceName() {
        return BirthPlaceName;
    }

    public void setBirthPlaceName(String birthPlaceName) {
        BirthPlaceName = birthPlaceName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void collaboration() {    //显示当前属性
        System.out.println("你目前的等级是：" + this.Level);
        System.out.println("你的灵力是 (0-100随机)：" + this.Lingli);
    }
    public void addMax_Age(int age){
        this.Max_Age += age;
    }
    public int getMax_Age(){
        return this.Max_Age;
    }
    public void initMax_Age(int age){
        this.Max_Age = age;
    }

}

