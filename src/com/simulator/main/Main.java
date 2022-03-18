package com.simulator.main;

import com.simulator.birth.IndividualBorn;
import com.simulator.thingsmanager.ThingManager;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        IndividualBorn Person = new IndividualBorn();
        ThingManager thingsmanager = new ThingManager();
        if (Person.getNationality().equals("人族")) {        //人族开局
            thingsmanager.HumanThingsHappen(Person);
        } else if (Person.getNationality().equals("仙族")) {
            thingsmanager.GodThingsHappen(Person);           //仙族开局
        }
//            string rename = "Account: " + AccountName;
//            ofstream outfile = null;
//            outfile.open(rename, out);
//            outfile << "Real_Lingli = " << HumanPerson.getLingli() << endl;
//            outfile << "Nationality = " << HumanPerson.getNationality() << endl;
//            outfile << "Birth_Place = " << HumanPerson.getBirthPlace() << endl;
//            outfile.close();
        //每运行一次你会在D盘根目录下找到一个dat文件
        //修改后缀名为txt后打开 可以看到你随到的真实灵力

        else {
            System.out.println("请输入正确的选项!");
        }
    }
}

