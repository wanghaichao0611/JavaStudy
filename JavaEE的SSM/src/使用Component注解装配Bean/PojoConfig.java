package 使用Component注解装配Bean;

import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackageClasses = {Role.class,RoleServiceImpl.class})//和POJO的包名和他必须保持一致
public class PojoConfig {
}
