package yyf.org.springframework.ioc;

import org.springframework.stereotype.Service;

@Service("iSpringService")
public class SpringServiceImpl implements ISpringService {
	@Override
	public void hello() {
		System.out.println("SpringServiceImpl.hello()");
	}

}
