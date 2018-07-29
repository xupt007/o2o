package com.hui.o2o.util;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestUtil {

	public static int getInt(HttpServletRequest req, String key) {
		try {
			return Integer.decode(req.getParameter(key));
		} catch (Exception e) {
			return -1;
		}
	}

	public static long getLong(HttpServletRequest req, String key) {
		try {
			return Long.valueOf(req.getParameter(key));
		} catch (Exception e) {
			return -1;
		}
	}
	
	public static Double getDouble(HttpServletRequest req, String key) {
		try {
			return Double.valueOf(req.getParameter(key));
		} catch (Exception e) {
			return -1d;
		}
	}
	
	public static boolean getBoolean(HttpServletRequest req, String key) {
		try {
			return Boolean.valueOf(req.getParameter(key));
		} catch (Exception e) {
			return false ;
		}
	}
	
	public static String getString(HttpServletRequest req, String key) {
		try {
			String result = req.getParameter(key);
			if(result != null) {
				result = result.trim();
			}
			if("".equals(result)) {
				result = null;
			}
			return result;
		} catch (Exception e) {
			return null ;
		}
	}
}
