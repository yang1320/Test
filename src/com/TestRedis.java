package com;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.bean.Emp;

import redis.clients.jedis.Jedis;
/**
 * 
* @ClassName: TestRedis  
* @Description: TODO(redis测试类)  
* @author yangfei
* @date 2018年3月23日  
*
 */
public class TestRedis {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功！");
		jedis.set("runoobkey", "www.runoob.com");

	}

	/**
	 * @throws Exception
	 * 
	 * @Title: redisIoObj
	 * @Description: TODO(Object对象的Redis 读写操作)
	 * @param:
	 * @return: void
	 * @throws
	 */
	@SuppressWarnings("resource")
	@Test
	public void redisWRObj() throws Exception {
		// 字节流作中介，由对象操作流读或写对象（对象需实现序列化，当对象转化为字节数组时会有序列化体现）
		Jedis jedis = new Jedis("localhost");
		Emp emp = new Emp("张三", 18);
		ByteArrayOutputStream bas = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bas);
		oos.writeObject(emp);
		byte[] bz = bas.toByteArray();
		jedis.set("emp".getBytes(), bz);
		// 获取存储的数据并输出
		System.out.println("redis 存储的字符串为: " + jedis.get("emp".getBytes()));

		System.out.println(emp);

		System.out.println("-----------------------");
		ByteArrayInputStream bais = new ByteArrayInputStream(jedis.get("emp"
				.getBytes()));
		ObjectInputStream ois = new ObjectInputStream(bais);
		Emp emp1 = (Emp) ois.readObject();
		System.out.println(emp1);
	}
}
