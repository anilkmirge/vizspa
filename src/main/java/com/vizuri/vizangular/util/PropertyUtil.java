/**
 * 
 */
package com.vizuri.vizangular.util;

/**
 * @author amirge
 *
 */
public class PropertyUtil {
	public static String getParam(String sysEnv, String sysProp) {
		if (System.getenv(sysEnv) != null) {
			return System.getenv(sysEnv);
		} else if (System.getProperty(sysProp) != null) {
			return System.getProperty(sysProp);
		} else {
			return null;
		}
	}
}
