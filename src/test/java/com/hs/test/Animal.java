package com.hs.test;

/**
 * @author HS
 * @date 2019/06/24 22:34:51
 **/
 class Animal{
    private int age = 10;
    public Animal(){
        System.out.println("初始化Animal");
    }
    public Animal(int age){
        System.out.println("初始化有参Animal");
    }
    public void move(){
        System.out.println("跑步数："+this.age);
    }
}

 class Dog extends Animal{
    public Dog(int age){
        super(10);//去掉会报异常
        System.out.println("初始化Dog");
    }
    public static void main(String[] args){
        Dog a = new Dog(6);
        //a.move();
    }

}

 /*class BigDogs extends Dog{
    public BigDogs(){
        //super(20);
        System.out.println("初始化BigDog");
    }

    public static void main(String[] args){
        BigDogs a = new BigDogs();
        a.move();
    }
}*/
