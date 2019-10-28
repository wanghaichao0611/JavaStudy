package 定义多个切面;

import org.springframework.stereotype.Component;

@Component
public class MutiBeanImpl implements MultiBean {
    @Override
    public void testMulti() {
        System.out.println("test multi aspects!!");
    }
}
