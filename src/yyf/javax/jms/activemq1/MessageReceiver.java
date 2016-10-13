package yyf.javax.jms.activemq1;

import java.util.List;

import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class MessageReceiver {

	// protected Logger log = Logger.getLogger(MessageReceiver.class.getName());

	private static JmsTemplate jmsTemplate = (JmsTemplate) MyApplicationContextUtil.context.getBean("jmsTemplate");
	private static Destination vehPassTopic = (Destination) MyApplicationContextUtil.context.getBean("vehPassTopic");

	/**
	 * 
	 * @return
	 */
	public static List<Message> receiveMessage() {
		List<Message> msgList = null;
		Message message = null;

		for (int i = 0; i < 100;) {// 每次接收100条记录
			message = jmsTemplate.receive(vehPassTopic);
			if (message != null) {
				msgList.add(message);
				/*
				 * if (message instanceof TextMessage) { i++; msg =
				 * (TextMessage)message; returnMsg = msg.getText();
				 * log.debug("收到消息 :" + msg.getText()); }
				 */
			} else {
				break;
			}
		}
		return msgList;
	}

	public static void main(String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext-mq.xml" });
		JmsTemplate jmsTemplate = (JmsTemplate) context.getBean("jmsTemplate");
		Destination destinationTopic = (Destination) context.getBean("vehPassTopic");
		TextMessage msg = null;
		for (int i = 0; i < 10; i++) {
			msg = (TextMessage) jmsTemplate.receive(destinationTopic);
			System.out.println("收到消息 :" + msg.getText());
			Thread.sleep(1000);
		}

	}

}
