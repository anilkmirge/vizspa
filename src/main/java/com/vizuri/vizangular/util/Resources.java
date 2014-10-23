/**
 * 
 */
package com.vizuri.vizangular.util;


/**
 * @author amirge
 *
 */
public class Resources {

	public static final String HOST = PropertyUtil.getParam("OPENSHIFT_MONGODB_DB_HOST", "MONGODB_DB_HOST");
	public static final String PORT = PropertyUtil.getParam("OPENSHIFT_MONGODB_DB_PORT", "MONGODB_DB_PORT");
	public static final String MONGO_DB = PropertyUtil.getParam("", "MONGO_DB");
	public static final String MONGODB_DB_USERNAME = PropertyUtil.getParam("OPENSHIFT_MONGODB_DB_USERNAME", "MONGODB_DB_USERNAME");
	public static final String MONGODB_DB_PASSWORD = PropertyUtil.getParam("OPENSHIFT_MONGODB_DB_PASSWORD", "MONGODB_DB_PASSWORD");
	
}
