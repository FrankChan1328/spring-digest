package demo.ctx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.ctx.bean.Person;

public class MyTest {
	@Test
	public void MyBean() {
		// 解析application_context.xml文件 , 生成管理相应的Bean对象
		ApplicationContext context = new ClassPathXmlApplicationContext("ctx.xml");

		Person person = (Person) context.getBean("person");
		System.out.println(person);
		System.out.println(person.hashCode());

		// Person person2 = (Person) context.getBean("person");
		// System.out.println(person2);
		// System.out.println(person2.hashCode());

	}
}
