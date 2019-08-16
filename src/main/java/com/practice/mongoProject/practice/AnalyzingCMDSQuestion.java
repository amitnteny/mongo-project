package com.practice.mongoProject.practice;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;

public class AnalyzingCMDSQuestion {
    public static void main(String[] args) {
        MongoCredential mongoCredential = MongoCredential.createCredential("vedantureadonly", "vedantumoodle", "bjAdp3UD4uswqSUY".toCharArray());
        /*try (MongoClient mongoClient = new MongoClient(new ServerAddress("ds021008-a0.mlab.com", 21008),
                Collections.singletonList(mongoCredential))) {
            System.out.println("Yay. Connected!");
            System.out.println(Arrays.asList(mongoClient.getUsedDatabases().toArray()));
        }*/

            MongoClient mongoClient = new MongoClient(new ServerAddress("ds021008-a0.mlab.com", 21008), Collections.singletonList(mongoCredential));
            DB db = mongoClient.getDB("vedantumoodle");
            db.getCollectionNames().forEach(System.out::println);

    }
}
