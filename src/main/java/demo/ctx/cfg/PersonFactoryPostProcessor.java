package demo.ctx.cfg;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class PersonFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("调用PersonFactoryPostProcessor的postProcessBeanFactory方法");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("person");
		MutablePropertyValues pv = beanDefinition.getPropertyValues();
		if (pv.contains("age")) {
			pv.addPropertyValue("age", "23");
		}
		beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
		System.out.println("====================================================");
	}

}
