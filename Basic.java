package E;
import java.util.Scanner;
import java.io.*;
public class HomeworkTest {
	public static void main(String args[]) {
        Basic student = new Basic();
        System.out.println("��������������,�Ա�,����,ѧ��");
        Scanner stu = new Scanner(System.in);
        String name = stu.nextLine();
        String sex = stu.nextLine();
        int age = stu.nextInt();
        int number = stu.nextInt();
        student.setBasic(name, sex, age, number);
        try {
            FileReader fileReader = new FileReader("D:\\���޸�.txt");//��ȡD���ļ�
            BufferedReader bufferedReader = new BufferedReader(fileReader);//���ļ��浽������
            Writer writer = new FileWriter(new File("D:\\A.txt"));//���������ļ�д��A�ļ���
            String str = bufferedReader.readLine();
            String regex = "(.{7})";
            str = str.replaceAll(regex, "$1��");
            StringBuffer x = new StringBuffer(str);
            for (int  i = 15; i <289; i = i + 17) {
                x.replace(i, i + 1, "��\n");
            }
            System.out.println(x);
            writer.write(String.valueOf(student));
            writer.write("\n");
            writer.write(String.valueOf(x));
            bufferedReader.close();//�رջ�����
            fileReader.close();//�ر��ļ���ȡ
            writer.close();//�ر�д��

            a:
            while (true) {
                System.out.println("����1����2ѡ���ѯ�ֺʹʻ����˳�");
                Scanner in = new Scanner(System.in);
                int nu = in.nextInt();
                switch (nu) {
                    case 1:
                        Scanner y = new Scanner(System.in);
                        System.out.println("��������Ҫ��ѯ����:");
                        String c = y.nextLine();
                        int count = (str.length() - str.replace(c, "").length()) / c.length(); 
                        System.out.println(count);
                        break;
                    case 2:
                        System.out.println("�˳�");
                        break a;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("���ִ���!");
        }
    }
}