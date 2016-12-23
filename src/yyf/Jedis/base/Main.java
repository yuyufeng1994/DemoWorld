package yyf.Jedis.base;

import redis.clients.jedis.Jedis;

public class Main {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		Jedis j = new Jedis("127.0.0.1",6379);
		j.auth("Bbkb_deve");
		System.out.println(j.get("dd") == null);
		String key = "k3";
		while(true){
			long i = j.incr(key);
			if(j.ttl(key) < 0){
				System.out.println("设置过期###");
				j.expire(key, 20);
			}
			System.out.println(j.get(key));
		}
		

	}

}
