package com.ejemplo;

import java.net.UnknownHostException;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class EjemploJongo {

	public static void main(String[] args) throws UnknownHostException {

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB database = mongoClient.getDB("test");
		Jongo jongo = new Jongo(database);
		MongoCollection friends = jongo.getCollection("friends");

		friends.insert(new Friend("Pablo", 29));
	}
}
