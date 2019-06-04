package cn.itcast.xc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.xc.pojo.Book;
import cn.itcast.xc.pojo.User;

/*
 * 测试类
 */
public class springTest {
	public static void main(String[] args) {
		//扫描配置文件applicationContext.xml
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		User user=(User)ac.getBean("user");
		System.out.println(user.getAge()+" "+user.getName());
		//通过将对象book注入到user中，通过user的getxx方法得到book对象
		Book book=user.getBook();
		System.out.println(book.getName()+" "+book.getPrice());
	}
}
