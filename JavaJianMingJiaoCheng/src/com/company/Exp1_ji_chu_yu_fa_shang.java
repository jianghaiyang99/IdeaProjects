package com.company;

public class Exp1_ji_chu_yu_fa_shang {
    public static void main(String[] args)
    {
        // we are in main function.

        //experiment 1: variable
        System.out.print("Define a variable a is ");
        int a;
        a = 5;
        System.out.println(a);

        //experiment 2 常量
        //使用 final 在常量前，修饰，
        final String FINAL_STRING = " we can't change it any more!";
        System.out.println(FINAL_STRING);
        //FINAL_STRING = "apple";
        //撤销上面的 两个斜杠，你会发现，这个代码依然是错误的。

        //e3 String
        String s0 = "abc"; //这是一个简单的写法
        String s1 = new String("abcd"); //从这里你就可以看出，String并不是一个基本的数据类型，而更加像是一个对象 object
        //这个给我的感觉是，创建了一个新的object，而String则表示的是一个class

        //计算字符串长度，用到的公式就是 string_name.length()
        String s2 ="i don't know what is your name , my friend, can you tell me ?";
        int len_for_s2 = s2.length();
        System.out.println(len_for_s2);

        String s3 = "haiyang";
        int len_for_s3 = s3.length();
        System.out.println(len_for_s3);

        //字符串比较，这个function的作用是，判断 两个字符串对象 的 内容 是否相同, 如果相同，就返回Ture，不同，就返回False
        System.out.println("字符串比较：");
        String s4 = "haiyang";
        String s5 = "Haiyang";
        boolean result = s4.equals(s5);//注意：这个格式很有趣，而在这里，我没有忽略大小写，在下面的代码，我将忽略大小写
        System.out.println(result);

        boolean result1 = s4.equalsIgnoreCase(s5);//这里忽略掉了大小写，所以得到的应该是TRUE
        System.out.println(result1);

        //用 ==，两个等号，来比较String是不可以的，因为这个比较的是：两个对象在内存中存储的地址是否一样。

        //字符串连接，字符串连接有两种方法：1. + 2. s1.contact(s2)
        String s6 = "hi ";
        String s7 = "my friend ";
        String s8 = s6 + s7;
        String s9 = s6.concat(s7);

        boolean are_they_same = s8.equals(s9);
        System.out.println(s8 + s9 + are_they_same);

        //选取String中指定的字母（字母片段）
        String s10 = "apple";

        char c1 = s10.charAt(0); //由这个function，返回的是一个char，而不是一个String
        System.out.println(c1);

        //运算符--学到了这里
    }

}