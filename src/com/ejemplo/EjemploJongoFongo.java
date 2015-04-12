package com.ejemplo;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import com.github.fakemongo.Fongo;
import com.mongodb.DB;

public class EjemploJongoFongo {

	public static void main(String[] args) {

		DB database = new Fongo("Test").getDB("Database");
		Jongo jongo = new Jongo(database);
		MongoCollection friends = jongo.getCollection("friends");

		friends.insert(new Friend("Pablo", 29));
	}
}
