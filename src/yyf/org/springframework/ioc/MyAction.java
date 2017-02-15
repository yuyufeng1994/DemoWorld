package yyf.org.springframework.ioc;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyAction {
//	@Resource(name="iSpringService")
	@Resource
	private ISpringService springService;

	public void doAction() {
		springService.hello();
	}
}
