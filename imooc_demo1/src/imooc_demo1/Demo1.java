package imooc_demo1;
/*Ϊָ���ķ������мӷ֣�ֱ���������ڵ���60��Ϊֹ
 * ����ӷ�ǰ�ķ����ͼӷֺ�ķ���������ͳ�ƼӷֵĴ���
 *���裺1������һ��������������żӷֵĴ���
 *2��ʹ��ѭ��Ϊ�ɼ��ӷ�
 *3��ÿ��ִ��ѭ���ӷֲ�������һ�֣�����ͳ�ƼӷֵĴ���
 * */
public class Demo1 {
	public static void main(String args[]) {
		int init_score = 53;
		int count = 0;
		System.out.println("�ӷ�ǰ�ķ�����"+init_score);
		while(init_score<60) {
			init_score++;
			count++;
		}
		System.out.println("�ӷֺ�ķ�����"+init_score);
		System.out.println("�ӷֵĴ�����"+count);
	}

}
