package yyf.org.slf4j.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	private final static Logger LOG = LoggerFactory.getLogger(Test.class.getClass());

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			new Thread() {
				@Override
				public void run() {
					while (true) {
						LOG.info("##test 你http://www.bababus.com/order/list.htm?orderType=T" + Thread.currentThread().getName());
						LOG.error("##test 好http://www.bababus.com/order/list.htm?orderType=T" + Thread.currentThread().getName());
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();

		}
	}
}
