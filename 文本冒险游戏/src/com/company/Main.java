package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        gamer a = null;
        System.out.println("哦，沉睡的勇士，快醒醒，快醒醒！！");
        System.out.println("~~~~~~~~~~~~~~");
        System.out.println("哦，勇士，还记得你的名字吗？\n" +
                "1. 记得 2. 不记得了");
        String input = reader.nextLine();
        while (!input.equals("1") && !input.equals("2")) {
            System.out.println("勇士，你连字都不认识了吗？请重新选择：");
            input = reader.nextLine();
        }
        if (input.equals("1")) {
            System.out.print("我的名字是：");
            String name = reader.nextLine();
            a = new gamer(name);
        } else if (input.equals("2")) {
            System.out.println("好吧，可怜的勇士，别担心，我会给你起个名字");
            a = new gamer();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~欢迎来到 " + a.name + " 的妙妙屋~~~~~~~~~~~~");
        GAME:
        while (true) {

            monster b = new monster();
            System.out.println("\t\t\t一只野生的" + b.name + "出现了");
            b.info();
            while (b.hp > 0) {
                a.info();
                System.out.println("你要怎么做？");
                System.out.println("1. 使用普通攻击攻击 " + b.name + " " +
                        "2. 使用技能攻击 " + b.name + " " +
                        "3. 吃东西 " +
                        "4. 逃跑 ");
                input = reader.nextLine();
                if (input.equals("1")) {
                    b.damageTaken(a.NormalAttack());

                } else if (input.equals("2")) {
                    b.damageTaken(a.SkillAttack());

                } else if (input.equals("3")) {
                    a.goodsInfo();
                    a.eatGoods();

                } else if (input.equals("4")) {
                    System.out.println("你因畏惧 " + b.name + " 逃离了这场战斗");
                    continue GAME;

                } else {
                    System.out.println("输入错误!!\n你陷入了沉思");
                }
                if (a.hp < 1) {
                    System.out.println(a.name + " 技差半招，被 " + b.name + " 击败");
                    break;
                }
                System.out.println(" " + b.name + "朝你发起了攻击");
                a.damageTaken(b.NormalAttack());
            }
            b.death(a);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(a.name + "下一步想做什么？");
            System.out.println("1. 继续战斗\t2. 退出游戏");
            input = reader.nextLine();
            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("输入错误，请重新输入：");
                input = reader.nextLine();
            }
            if (input.equals("1")) {
                System.out.println(a.name + "这是我最后的波纹了 ，继续你的战斗吧！！");
                a.hp += 100;
                a.mp += 20;
            } else if (input.equals("2")) {
                System.out.println(" 你逃离了战斗，那是一个艰难的决定");
                break;
            }
        }
        System.out.println("#####################");
        System.out.println("感谢游玩 妙妙屋1.0 游戏 ");
        System.out.println("#####################");

    }
}
