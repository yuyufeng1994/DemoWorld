package yyf.redis;

import java.util.HashSet;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

public class JedisTest {

	public static void main(String[] args) {
//		Jedis jedis = new Jedis("192.168.21.129", 6379);
//		System.out.println(jedis.ping());
		HashSet<String> sentinels = new HashSet<String>();

		// 添加sentinel主机和端口
		sentinels.add("192.168.21.128:26379");
		JedisSentinelPool pool = new JedisSentinelPool("mymaster", sentinels,"Bbkb_deve");
	}

}
