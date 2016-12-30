package yyf.Jedis.base;

import java.util.concurrent.atomic.AtomicInteger;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

public class Main {
	static AtomicInteger ai = new AtomicInteger(1);

	public static void main(String[] args) {

		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(20);
		config.setMaxIdle(5);
		config.setMaxWaitMillis(1000);
		config.setTestOnBorrow(false);
		System.out.println(System.currentTimeMillis());
		Jedis j = new Jedis("127.0.0.1", 6379);
		j.auth("Bbkb_deve");

		while (true) {
			System.out.println(ai.incrementAndGet() + ": " + j.ping());
		}

	}

}
