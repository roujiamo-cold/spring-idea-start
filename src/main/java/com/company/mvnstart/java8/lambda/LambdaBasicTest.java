package com.company.mvnstart.java8.lambda;

public class LambdaBasicTest {

    interface NoParam {
        String hi();
    }

    interface SingleParam {
        void hei(String name);
    }

    interface MultiParams {
        String greet(String hello, String name);
    }

    public static void print(NoParam noParam) {
        noParam.hi();
    }


    public static void main(String[] args) {

        //入参为空
        NoParam no_param = () -> "hi, no param";
        NoParam no_param2 = () -> { return "hi, no param"; };
        System.out.println(no_param.hi());

        //单个参数
        SingleParam param = name -> System.out.println(name);
        SingleParam param2 = name -> {
            System.out.println(name);
        };
        param.hei("hei, girls");

        //多个参数
        MultiParams multiple = (String hello, String name) -> hello + " " + name;
        //一条返回语句，可以省略大括号和return
        MultiParams multiple2 = (hello, name) -> hello + name;
        //多条处理语句，需要大括号和return
        MultiParams multiple3 = (hello, name) -> {
            System.out.println("进入内部");
            return hello + name;
        };
        System.out.println(multiple.greet("hello", "lambda"));
    }
}
