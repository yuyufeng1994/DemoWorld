package yyf.javax.jms.activemq1;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;

public class MyMessageCreator implements MessageCreator {
	private String msg;

	public MyMessageCreator(String msg) {
		this.msg = msg;
	}

	@Override
	public Message createMessage(Session paramSession) throws JMSException {
		return paramSession.createTextMessage(msg);
	}

	@Override
	public String toString() {
		return "MyMessageCreator [msg=" + msg + "]";
	}
	
}
