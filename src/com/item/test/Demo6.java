package com.item.test;

import java.util.Scanner;

public class Demo6 {
    static void main(String[] args) {
       /* 需求：1.初始玩家最大生命值为两百，每次都能收到伤害，这个伤害是键盘录入的值，也可以使用技能回复生命值
                2.玩家永远都不会死亡，最低剩余1滴血*/
        Scanner sc = new Scanner(System.in);
        // 定义一个变量，记录玩家当前生命值
        int hp = 200;
        // 记录当前玩家的生命值
        while (true) {
            System.out.println("请输入技能选择：1.收到的伤害值(被攻击) 2.技能恢复生命值 3.退出");
            // 定义一个变量接收玩家键入的选择
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // 定义一个变量记录玩家受到技能的伤害值，用键盘录入接收
                    System.out.println("请输入收到的伤害值：");
                    int skill = sc.nextInt();
                    if (skill > 0) {
                        hp = hp - skill;
                        if (hp <= 0) {
                            hp = 1;
                            System.out.println("玩家当前血量：" + hp);
                        } else if (hp > 200) {
                            hp = 200;
                            System.out.println("当前玩家血量剩余：" + hp);
                        }else {
                            System.out.println("当前玩家血量剩余：" + hp);
                        }
                    }else {
                        System.out.println("输入错误：请输入正确数值，正确示范：10，错误：-10");
                    }
                    break;
                case 2:
                    // 定义一个变量记录玩家使用技能恢复的生命值，用键盘录入接收
                    System.out.println("请输入恢复值：");
                    int skill2 = sc.nextInt();
                    if (skill2 > 0) {
                        hp = hp + skill2;
                        if (hp > 200) {
                            hp = 200;
                            System.out.println("当前玩家血量剩余：" + hp);
                            break;
                        } else {
                            System.out.println("当前玩家血量剩余：" + hp);
                            break;
                        }
                    }
                    System.out.println("输入错误：请输入正确数值，正确示范：10，错误：-10");
                    break;
            }
            if (choice == 3) {
                System.out.println("游戏结束");
                break;
            }

        }
    }
}
