# 计192 2019311380 徐昊
# Java 实验
模拟学生作业处理
## 实验目的
1、掌握字符串String及其方法的使用
2、掌握文件的读取/写入方法
3、掌握异常处理结构 
## 实验内容
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
文件A包括两部分内容：
一是学生的基本信息；
二是学生处理后的作业信息，该作业的业务逻辑内容是：
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法。
## 功能要求
1、每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2、允许提供输入参数，统计古诗中某个字或词出现的次数
3、输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
4、考虑操作中可能出现的异常，在程序中设计异常处理程序
## 实验要求
1、设计学生类（可利用之前的）；
2、采用交互式方式实例化某学生；
3、设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
## 实验步骤
1、创建Basic类和HomeworkTest类；
2、在Basic类里面表达出所需要的学生基本信息，在HomeworkTest类里面用scanner函数收集学生输入的信息；
3、在HomeworkTest类里读取在D盘中文件名为“长恨歌”的文本文件，暂存缓存区，再进读取；
4、利用readLine方法，使原来的文本文件在每七个汉字后加入标点符号，奇数次为逗号，偶数次为句号；
5、写入新的文本文件,并将文件命名为"A"；
6、利用replace方法计算出现次数，利用switch函数进行查找用户输入的字或词出现的次数；
7、进行异常情况处理，利用try-catch进行。
## 核心代码 

1.打开“长恨歌”文本文件并进行排版并录入新的文本文件“A”
```
try {
            FileReader fileReader = new FileReader("D:\\长恨歌.txt");//读取D盘文件
            BufferedReader bufferedReader = new BufferedReader(fileReader);//把文件存到缓冲区
            Writer writer = new FileWriter(new File("D:\\A.txt"));//将缓冲区文件写入A文件中
            String str = bufferedReader.readLine();
            String regex = "(.{7})";
            str = str.replaceAll(regex, "$1，");
            StringBuffer x = new StringBuffer(str);
            for (int  i = 15; i <289; i = i + 17) {
                x.replace(i, i + 1, "。\n");
            }
            System.out.println(x);
            writer.write(String.valueOf(student));
            writer.write("\n");
            writer.write(String.valueOf(x));
            bufferedReader.close();//关闭缓冲区
            fileReader.close();//关闭文件读取
            writer.close();//关闭写入

``` 
2.查询字或词出现次数的switch循环 
```
switch (nu) {
                    case 1:
                        Scanner y = new Scanner(System.in);
                        System.out.println("请输入想要查询的字:");
                        String c = y.nextLine();
                        int count = (str.length() - str.replace(c, "").length()) / c.length(); 
                        System.out.println(count);
                        break;
                    case 2:
                        System.out.println("退出");
                        break a;
                }
``` 

## 实验截图
The right result:
![The right result](***你的图片网络地址***)  
## 实验感想  
通过此次实验我真正地感受到java和其他文件产生的练习,可以通过几行代码的处理去整理自己的文档数据,并且还能进行查找,是一个十分方便的功能,同时我也学会了如何将设置转为UTF-8,即正常地输出中文字符,同时又熟悉了编程语言的逻辑,将循环和判断写得更好.
