package cn.itcast.xc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.xc.pojo.Book;
import cn.itcast.xc.pojo.User;

/*
 * ������
 */
public class springTest {
	public static void main(String[] args) {
		//ɨ�������ļ�applicationContext.xml
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		User user=(User)ac.getBean("user");
		System.out.println(user.getAge()+" "+user.getName());
		//ͨ��������bookע�뵽user�У�ͨ��user��getxx�����õ�book����
		Book book=user.getBook();
		System.out.println(book.getName()+" "+book.getPrice());
	}
}
