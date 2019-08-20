package com.leoliang.redis;

import redis.clients.jedis.Jedis;

public class Main {

    public static void main(String... args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("dd", "33");
        System.out.println(jedis.get("dd"));
    }

}
