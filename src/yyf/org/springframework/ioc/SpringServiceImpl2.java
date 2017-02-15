package yyf.org.springframework.ioc;

import org.springframework.stereotype.Service;

@Service("springService")
public class SpringServiceImpl2 implements ISpringService {
	@Override
	public void hello() {
		System.out.println("SpringServiceImpl.hello()2222222");
	}

}
