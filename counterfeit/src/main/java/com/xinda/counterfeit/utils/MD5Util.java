package com.xinda.counterfeit.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
		public static String ToMd5(String plainText){
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(plainText.getBytes());
				byte b[] = md.digest();
				return byteToHex(b);
			} catch (NoSuchAlgorithmException e) {
				return null;
			}
		}
		
		public static String byteToHex(byte[] b) {
		    int i;

	        StringBuffer buf = new StringBuffer("");
	        for (byte element : b) {
	            i = element;
	            if (i < 0) {
	                i += 256;
	            }
	            if (i < 16) {
	                buf.append("0");
	            }
	            buf.append(Integer.toHexString(i));
	        }
	         
	        return buf.toString();// 32bit encode
		}
}
