package imooc_demo1;
import java.util.Scanner;
/*
 * 功能：接收3个班级各4个学员的成绩消息，然后计算每个班级学员的平均成绩
 * 知识要点：二重循环，外层控制班级的数量，内层控制每个班级学员的数量。
 */
public class Demo2 {
	public static void main(String[] args) {//先输入main,再按alt+/，自动添加main方法。
		int class_num = 3;//班级数量
		int stu_num = 4;//学生数量
		double sum = 0;//分数和
		double avg = 0;//平均分数
		Scanner input = new Scanner(System.in);//创建scanner对象
		for(int i=1;i<=class_num;i++) {
			System.out.println("***请输入第"+i+"个班级的成绩！***");
			sum=0;
			for(int j=1;j<=stu_num;j++) {
				System.out.println("***请输入第"+j+"个学生的成绩!***");
				int score = input.nextInt();
				sum=sum+score;
			}
			avg = sum/stu_num;
			System.out.println("第"+i+"个班级的学生平均分为:"+avg);
		}
	}

}
