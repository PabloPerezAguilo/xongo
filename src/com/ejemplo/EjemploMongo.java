package com.ejemplo;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class EjemploMongo {

	public static void main(String[] args) throws UnknownHostException {

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB database = mongoClient.getDB("test");
		DBCollection friends = database.getCollection("friends");

		DBObject friend = new BasicDBObject();

		friend.put("name", "Pablo");
		friend.put("age", 29);

		friends.insert(friend);
	}

}
