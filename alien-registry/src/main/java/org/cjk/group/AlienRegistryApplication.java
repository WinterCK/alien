package org.cjk.group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * SpringBootApplication注解 = (默认属性)@Configuration + @EnableAutoConfiguration + @ComponentScan
 * 		@Configuration的注解类标识这个类可以使用Spring IoC容器作为bean定义的来源
 * 		@EnableAutoConfiguration：能够自动配置spring的上下文
 * 		@ComponentScan：会自动扫描指定包下的全部标有@Component的类，并注册成bean，
 * 			包括@Component下的子注解@Service,@Repository,@Controller
 * EnableEurekaServer注解注册为EurekaServer
 * @author chenjk
 */
@SpringBootApplication
@EnableEurekaServer
public class AlienRegistryApplication {

	public static void main(String[] args) {
		
        SpringApplication.run(AlienRegistryApplication.class, args);
	}
}
