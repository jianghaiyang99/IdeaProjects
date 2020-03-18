package com.company;
public class Exp1_ji_chu_yu_fa_shang
{
    public static void main(String[] args) //在main function中
    {
        /*
            Java的概述
        A. 初学者，学习的都是java se，这个最简单。
        B. JVM 就是java虚拟机，JRE，JDK。这三者的关系也是从左到右递增的。
         */

        /*
            我用编辑器，写了java的代码，那么，我如何用终端来执行，我写的文件呢？
        A. cd到该文件所在的文件夹
        B. 打开terminal，使用 javac file_name.java 注：记得加后缀java，这一步是在编译我们敲的代码，
        把从我们能看懂的代码，编译成机器能看懂的代码。
        C. 再输入 java file_name 注:没有后缀
         */

            //1. variable 变量
        System.out.print("Define a variable a is ");
        int a;
        a = 5;
        System.out.println(a);

            //2. 常量
            //怎么用？使用 final 在变量前修饰
        final String FINAL_STRING = " we can't change it any more!";
        System.out.println(FINAL_STRING);
            //FINAL_STRING = "apple";
            //uncomment 上面的代码，你会发现这个代码是错误的。

        /*
        数据类型
            下面这四个数据类型，都是用来储存数字的，不同的数据类型，可以储存的数字大小不一样
        short
        int --> 最常用的
        byte
        long
            下面这两个数据类型，是专门用来储存小数的，
        float
        double
            用来储存boolean的
        boolean
            用来储存单个字符的，如 a,b,c,d,e,f之类的
        char
         */

            //3. String
            //示例：
        String s0 = "abc"; //这是一个简单的写法
        String s1 = new String("abcd");
            //从这里就可以看出，String并不是一个基本的数据类型，而更加像是一个类class（而s1是一个object对象）
            //创建了一个新的object，而String则表示的是一个class

            //B. 计算字符串长度，用到的公式就是 string_name.length()
        String s2 ="i don't know what is your name , my friend, can you tell me ?";
        int len_for_s2 = s2.length();
        System.out.println(len_for_s2);

        String s3 = "haiyang";
        int len_for_s3 = s3.length();
        System.out.println(len_for_s3);

            //C.字符串比较，这个function的作用是，判断 两个字符串对象 的 内容 是否相同, 如果相同，就返回Ture，不同，就返回False
        System.out.println("字符串比较：");
        String s4 = "haiyang";
        String s5 = "Haiyang";

        boolean result = s4.equals(s5);//注: 在这里，我没有忽略大小写，在下面的代码，我将忽略大小写
        System.out.println(result);

        boolean result1 = s4.equalsIgnoreCase(s5);//这里忽略掉了大小写，所以得到的应该是TRUE
        System.out.println(result1);

            //注：用 ==，两个等号，来比较String是不可以的，因为这个比较的是：两个对象在内存中存储的地址是否一样。

            //D. 字符串连接，字符串连接有两种方法：1. + 2. s1.contact(s2)
        String s6 = "hi ";
        String s7 = "my friend ";
        String s8 = s6 + s7;
        String s9 = s6.concat(s7);

        boolean are_they_same = s8.equals(s9);
        System.out.println(s8 + s9 + are_they_same);

            //E. 选取String中指定的字母（字母片段）
        String s10 = "apple";

        char c1 = s10.charAt(0); //注：这个function，return的是一个char，而不是一个String
        System.out.println(c1);

        /* 运算符
            1.算式运算符
            +
            -
            *
            /
            %
            ++
            -

         */


    }

}