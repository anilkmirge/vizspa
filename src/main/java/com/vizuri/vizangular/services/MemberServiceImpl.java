package com.vizuri.vizangular.services;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.vizuri.vizangular.domain.Member;
import com.vizuri.vizangular.util.Resources;

public class MemberServiceImpl implements MemberService{
	public List<Member> getMembers() {		
		List<Member> teamMembers = new ArrayList<Member>();
		try {			
				DB db = new MongoClient(Resources.HOST, Integer.parseInt(Resources.PORT)).getDB(Resources.MONGO_DB);
				 if(db.authenticate(Resources.MONGODB_DB_USERNAME, Resources.MONGODB_DB_PASSWORD.toCharArray()) == false) {
			            throw new MongoException("Failed to authenticate against db: "+Resources.MONGO_DB);
			        }																    
				Jongo jongo = new Jongo(db);
				MongoCollection members = jongo.getCollection("members");
				
				Iterable<Member> all = members.find().as(Member.class);
				Iterator<Member> iterator = all.iterator();
				while(iterator.hasNext()){
					teamMembers.add(iterator.next());
				}
				
			} catch (UnknownHostException e) {				
				e.printStackTrace();
			} catch (MongoException me) {				   
			   System.err.println("Mongo connection error:"+ me);					   
		  }
		return teamMembers;
	}
}
