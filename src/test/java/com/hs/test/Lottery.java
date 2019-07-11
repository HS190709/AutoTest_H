package com.hs.test;

import java.util.*;

/**
 * @Author: hs
 * @Date: 2019/3/1 2:23
 */
public class Lottery {
    /**set*/
    public static void main(String[] args) {
        Lottery lottery=new Lottery();
        System.out.println("彩票号码为："+lottery.toStrb(lottery.getDifferentNumber(6,32)));
    }
    public Set<Integer> getDifferentNumber (int m,int n){
        Set<Integer> set=new HashSet<
                >();
        Random random=new Random();
        int num=0;
        for (int i=0;i<m;){
            num=random.nextInt(n);
            if (set.add(num)){
                i++;
            }
        }
        return set;
    }
    public String toStrb(Collection<Integer> set){
        StringBuilder stringBuilder=new StringBuilder();
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()){
            stringBuilder.append(iterator.next()).append(",").append(" ");
        }
        if (stringBuilder.length()>2){
            stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length());
        }
        return stringBuilder.toString();
    }
    /**list*/
    /*public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println("彩票号码为：" + lottery.toString(lottery.getDifferentNumber(6, 32)));
    }

    public List<Integer> getDifferentNumber(int m, int n) {
        int num = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (count < m) {
            num = random.nextInt(n);
            if (!list.contains(num)) {
                list.add(num);
                count++;
            }
        }
        return list;
    }

    public String toString(List<Integer> str) {
        StringBuilder stringBuilder = new StringBuilder();
        *//**迭代器*//*
        Iterator iterator = str.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next()).append(",").append(" ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        *//**for循环*//*
        *//*for (int i=0;i<str.size();i++){
            if (i == str.size() - 1) {
                stringBuilder.append(str.get(i));
            } else {
                stringBuilder.append(str.get(i)).append(",").append(" ");
            }
        }*//*
        *//**while循环*//*
        *//*int count = 0;
        while (count < str.size()) {
            if (count == str.size() - 1) {
                stringBuilder.append(str.get(count));
            } else {
                stringBuilder.append(str.get(count)).append(",").append(" ");
            }
            count++;
        }*//*
        return stringBuilder.toString();
    }*/
    /** String.join方法 */
    /*public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println("彩票号码为：" + String.join(" ", lottery.getDifferentNumber(6, 32)));
    }

    public List<String> getDifferentNumber(int m, int n) {
        int num = 0;
        int count = 0;
        List<String> list = new ArrayList<>();
        Random random = new Random();
        while (count < m) {
            num = random.nextInt(n);
            if (!list.contains(num))
                list.add(num + " ");
            count++;
        }
        return list;
    }*/
}
