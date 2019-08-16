package com.practice.mongoProject.domain;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Priorities {
    public static void main(String[] args) {
        Set<String> matchingKeys = new HashSet<>();
        ScanParams params = new ScanParams();
        params.match("IDLI*");
        try(Jedis jedis = new JedisPool().getResource()) {
            String nextCursor = "0";
            do {
                ScanResult<String> scanResult = jedis.scan(nextCursor, params);
                List<String> keys = scanResult.getResult();
                nextCursor = scanResult.getStringCursor();
                matchingKeys.addAll(keys);
            } while(!nextCursor.equals("0"));
            if (matchingKeys.isEmpty()) {
                return;
            }
            jedis.del(matchingKeys.toArray(new String[0]));
        }
    }
}
