package com.ejemplo;

import java.net.UnknownHostException;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import com.github.fakemongo.Fongo;
import com.mongodb.DB;
import com.mongodb.MongoClient;

public class EjemploCompleto {

	private static boolean MODO_REAL = true;

	public static void main(String[] args) throws UnknownHostException {

		DB database;
		if (MODO_REAL) {
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			database = mongoClient.getDB("test");
		} else {
			database = new Fongo("Test").getDB("Database");
		}

		Jongo jongo = new Jongo(database);
		MongoCollection friends = jongo.getCollection("friends");

		friends.insert(new Friend("Pablo", 29));
	}
}
