package imooc_demo1;
import java.util.Scanner;
/*
 * ���ܣ�����3���༶��4��ѧԱ�ĳɼ���Ϣ��Ȼ�����ÿ���༶ѧԱ��ƽ���ɼ�
 * ֪ʶҪ�㣺����ѭ���������ư༶���������ڲ����ÿ���༶ѧԱ��������
 */
public class Demo2 {
	public static void main(String[] args) {//������main,�ٰ�alt+/���Զ����main������
		int class_num = 3;//�༶����
		int stu_num = 4;//ѧ������
		double sum = 0;//������
		double avg = 0;//ƽ������
		Scanner input = new Scanner(System.in);//����scanner����
		for(int i=1;i<=class_num;i++) {
			System.out.println("***�������"+i+"���༶�ĳɼ���***");
			sum=0;
			for(int j=1;j<=stu_num;j++) {
				System.out.println("***�������"+j+"��ѧ���ĳɼ�!***");
				int score = input.nextInt();
				sum=sum+score;
			}
			avg = sum/stu_num;
			System.out.println("��"+i+"���༶��ѧ��ƽ����Ϊ:"+avg);
		}
	}

}
