package com.bjpowernode.javase.test012;

/**
 *
 * @author willi
 */
public class ExtendsTest02 {
    public static void main(String[] args){
        C c=new C();
        c.doSome();//这里调用的doSome方法是从B类中继承过来的doSome方法
    }
}

class A{
    public void doSome(){
        System.out.println("do some!");
    }
}
class B extends A{
    
}
class C extends B{
    
}