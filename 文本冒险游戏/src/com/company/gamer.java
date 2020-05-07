package com.company;

import java.util.Random;
import java.util.Scanner;

public class gamer implements attack {
    Random rand = new Random();
    Scanner reader = new Scanner(System.in);
    int hp;
    int mp;
    int damagePoints;
    String name;
    String[] namePool = {"法外狂徒张三", "吃瓜群众李四", "野生的傻狍子", "帅气taotao", "激情益达", "鸽子精", "瓜皮怪",};
    String[] skills = {"连续普通攻击", "认真的普通攻击", "连续认真普通攻击"};
    int[] skillsMp = {5, 10, 20};
    int[] goodsHealthPoints = {20, 5, 80};
    int[] goodsMagicPoints = {5, 20, 50};
    int[] goodsNum = {3, 0, 0};
    String[] goodsDescription = {"无公害的苹果，香脆可口，每个人看了都想咬一口",
            "云南大香蕉，拥有惊人的甜度，散发着迷人的香味",
            "澳洲大榴莲，有谁能想到，着散发这异味的东西居然美味异常"};
    String[] goodsName = {"苹果", "香蕉", "榴莲"};

    void goodsInfo() {
        System.out.println("\t食物：");
        for (int i = 0; i < goodsName.length; i++) {
            System.out.println(goodsName[i] + ":" + goodsNum[i] + "  " + "hp回复:" + goodsHealthPoints[i]
                    + "  mp回复:" + goodsMagicPoints[i] + "\n" + goodsDescription[i]);
        }
    }

    void eatGoods() {
        System.out.println("请选择你要吃的食物：");
        for (int i = 0; i < goodsName.length; i++) {
            System.out.println((i + 1) + ". " + goodsName[i] + " 数量:" + goodsNum[i]);
        }
        String input = reader.nextLine();
        switch (input) {
            case "1":
                if (goodsNum[0] > 0) {
                    System.out.println(name + "吃掉了" + goodsName[0] + "，感觉身体充满了活力！！");
                    hp += goodsHealthPoints[0];
                    mp += goodsMagicPoints[0];
                    goodsNum[0]--;
                    info();
                } else {
                    System.out.println("你没有足够的" + goodsName[0] + "并且这操作惊呆了你 ，使你大口吃了两碗米饭（即使这游戏没有米饭）");
                }
                break;
            case "2":
                if (goodsNum[1] > 0) {
                    System.out.println(name + "吃掉了" + goodsName[1] + "，感觉身体充满了活力！！");
                    hp += goodsHealthPoints[1];
                    mp += goodsMagicPoints[1];
                    goodsNum[1]--;
                    info();
                } else {
                    System.out.println("你没有足够的" + goodsName[1] + "并且这操作惊呆了你 ，使你大口吃了两碗米饭（即使这游戏没有米饭）");
                }
                break;
            case "3":
                if (goodsNum[2] > 0) {
                    System.out.println(name + "吃掉了" + goodsName[2] + "，感觉身体充满了活力！！");
                    hp += goodsHealthPoints[2];
                    mp += goodsMagicPoints[2];
                    goodsNum[2]--;
                    info();
                } else {
                    System.out.println("你没有足够的" + goodsName[2] + "并且这操作惊呆了你 ，使你大口吃了两碗米饭（即使这游戏没有米饭）");
                }
                break;
            default:
                System.out.println("输入错误!");
                break;
        }
    }

    gamer(String name) {
        hp = 200;
        mp = 50;
        this.name = name;
        damagePoints = rand.nextInt(30) + 20;

    }

    gamer() {
        int num = rand.nextInt(namePool.length);
        this.name = namePool[num];
        if (num == 3) {
            damagePoints = rand.nextInt(100) + 20;
            hp = 200;
            mp = 200;
        } else if (num == 4) {
            hp = 500;
            mp = 50;
            damagePoints = rand.nextInt(10) + 20;
        } else if (num == 6) {
            damagePoints = rand.nextInt(20) + 20;
            hp = 300;
            mp = 50;
        } else {
            hp = 200;
            mp = 50;
            damagePoints = rand.nextInt(10) + 20;
        }
    }

    void info() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("人物信息");
        System.out.println("姓名：" + name + "\n" + "生命值：" + hp + "\n法力值：" + mp + "\n攻击力：" + damagePoints);
    }

    class skills {
        int skill0() {
            System.out.println("天哪! " + name + " 使用了 连续的普通攻击！");
            return rand.nextInt(damagePoints) * (rand.nextInt(3) + 1);
        }

        int skill1() {
            System.out.println("天哪! " + name + " 使用了 认真的普通攻击！");
            return rand.nextInt(damagePoints * 2) + damagePoints;
        }

        int skill2() {
            System.out.println("天哪! " + name + " 使用了 连续认真普通攻击！");
            return (rand.nextInt(damagePoints * 2) + damagePoints) * (rand.nextInt(3) + 1);
        }
    }

    @Override
    public int NormalAttack() {
        System.out.println("天哪! " + name + " 使用了普通攻击！");
        return rand.nextInt(damagePoints);
    }

    @Override
    public int SkillAttack() {
        int damagePoint;
        System.out.println("你能使用:");
        for (int i = 0; i < skills.length; i++) {
            System.out.println(+(i + 1) + "." + skills[i] + " " + "MP消耗：" + skillsMp[i]);

        }
        System.out.print("\n请选择你想使用的技能：");
        int skillNum = reader.nextInt();
        while (skillNum > skills.length || skillNum <= 0) {
            System.out.println("输入错误！");
            System.out.print("请选择你想使用的技能：");
            skillNum = reader.nextInt();
        }
        if (skillNum == 1) {
            if (mp >= skillsMp[0]) {
                mp -= skillsMp[0];
            } else {
                System.out.println("!!! " + name + " 没有足够的mp,无法使用" + skills[skillNum - 1] + ",呆在原地");
                return 0;
            }
            damagePoint = new skills().skill0();
            return damagePoint;
        } else if (skillNum == 2) {
            if (mp >= skillsMp[1]) {
                mp -= skillsMp[1];
            } else {
                System.out.println("!!! " + name + " 没有足够的mp,无法使用" + skills[skillNum - 1] + ",呆在原地");
                return 0;
            }
            damagePoint = new skills().skill1();
            return damagePoint;
        } else if (skillNum == 3) {
            if (mp >= skillsMp[2]) {
                mp -= skillsMp[2];
            } else {
                System.out.println("!!! " + name + " 没有足够的mp,无法使用" + skills[skillNum - 1] + ",呆在原地");
                return 0;
            }
            damagePoint = new skills().skill2();
            return damagePoint;
        }
        return 0;


    }

    @Override
    public void damageTaken(int damageDealt) {
        hp -= damageDealt;
        if (damageDealt == 0) {
            System.out.println(name + " 展示出灵活的身法，躲开了这次攻击");
        }
        System.out.println(name + " 受到" + damageDealt + "点伤害");
        System.out.println(name + " 生命值剩余" + hp);


    }

}

class monster implements attack {
    int appleDropChance = 60, bananaDropChance = 30, durianDropChance = 10;
    int hp;
    String[] namePool = {"鸹貔", "瓜皮", "鸟", "虫子"};
    String name;
    Random rand = new Random();
    int damagePoints;

    @Override
    public int NormalAttack() {
        if (hp <= 0) {
            System.out.println(name + " 它身可能已经死了，但是它的意志长存，" + name + " 进行最后的临死反扑！！！");
        }
        System.out.println("天哪! " + name + " 使用了普通攻击！");
        return rand.nextInt(damagePoints);
    }

    @Override
    public int SkillAttack() {
        return 0;
    }

    @Override
    public void damageTaken(int damageDealt) {
        hp -= damageDealt;
        if (damageDealt == 0) {
            System.out.println(name + " 展示出灵活的身法，躲开了这次攻击");
        }
        System.out.println(name + " 受到" + damageDealt + "点伤害");
        System.out.println(name + " 生命值剩余" + hp);

    }

    monster() {
        int i = rand.nextInt(namePool.length);
        name = namePool[i];
        if (i == 0) {
            damagePoints = 50;
            hp = 200;
        } else if (i == 1) {
            damagePoints = 30;
            hp = 100;
        } else if (i == 2) {
            damagePoints = 60;
            hp = 30;
        } else if (i == 3) {
            damagePoints = 5;
            hp = 60;
        }
    }

    void info() {
        System.out.println("鲜活的" + name + "  生命值为：" + hp + "  攻击力为：" + damagePoints);
    }

    void death(gamer a) {
        System.out.println("恭喜你完成战斗");
        if (rand.nextInt(100) < appleDropChance) {
            a.goodsNum[0]++;
            System.out.print("击败了" + name + ",获得了" + a.goodsName[0]);
        }
        if (rand.nextInt(100) < bananaDropChance) {
            a.goodsNum[1]++;
            System.out.print("击败了" + name + ",获得了" + a.goodsName[1]);
        }
        if (rand.nextInt(100) < durianDropChance) {
            a.goodsNum[2]++;
            System.out.print("击败了" + name + ",获得了" + a.goodsName[2]);
        }

    }

}

interface attack {
    int NormalAttack();

    int SkillAttack();

    void damageTaken(int damageDealt);
}

interface defence {
    void Defence();
}
