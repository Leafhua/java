package day8;

import java.util.Scanner;

public class 创建动物类 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String species,sex;
        System.out.println("请输入动物种类：");
        species = reader.next();
        System.out.println("请输入动物性别：");
        sex = reader.next();
        Animal a = new Animal(species,sex);
        System.out.println(a.toString());
    }
}
class Animal{
    String species,sex;

    Animal(String species, String sex) {
        this.species = species;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}