package imooc_demo1;
/*为指定的分数进行加分，直到分数大于等于60分为止
 * 输出加分前的分数和加分后的分数，并且统计加分的次数
 *步骤：1、定义一个变量，用来存放加分的次数
 *2、使用循环为成绩加分
 *3、每次执行循环加分操作，加一分，并且统计加分的次数
 * */
public class Demo1 {
	public static void main(String args[]) {
		int init_score = 53;
		int count = 0;
		System.out.println("加分前的分数："+init_score);
		while(init_score<60) {
			init_score++;
			count++;
		}
		System.out.println("加分后的分数："+init_score);
		System.out.println("加分的次数："+count);
	}

}
