package yyf.javax.jms.activemq1;

import java.util.List;

import javax.jms.Destination;
import javax.jms.Message;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class MessageSender {

//	protected Logger log = Logger.getLogger(MessageReceiver.class.getName());

	private static JmsTemplate jmsTemplate = (JmsTemplate) MyApplicationContextUtil.context.getBean("jmsTemplate");
	private static Destination vehAlarmTopic = (Destination) MyApplicationContextUtil.context.getBean("vehAlarmTopic");
	private static Destination vehPassTopic = (Destination) MyApplicationContextUtil.context.getBean("vehPassTopic");
	static MyMessageCreator mc = null;

	/*  
	 *  
	 */
	public static boolean sendLiveMessage(String msg) {
		boolean isSend = false;
		mc = new MyMessageCreator(msg);
		jmsTemplate.send(vehPassTopic, mc);
		isSend = true;

		return isSend;
	}

	public static boolean sendBKMessage(String msg) {
		boolean isSend = false;
		MyMessageCreator mc = new MyMessageCreator(msg);
		jmsTemplate.send(vehAlarmTopic, mc);
		isSend = true;

		return isSend;
	}

	public static void main(String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext-mq.xml" });
		JmsTemplate jmsTemplate = (JmsTemplate) context.getBean("jmsTemplate");
		Destination destinationTopic = (Destination) context.getBean("vehPassTopic");
		
		for (int i = 1; i < 10; i++) {
			MyMessageCreator mc = new MyMessageCreator("test"+i);// 生成消息
			System.out.println(mc);
			jmsTemplate.send(destinationTopic, mc);
			Thread.sleep(1000);// 1秒后发送下一条消息
		}

	}}

	