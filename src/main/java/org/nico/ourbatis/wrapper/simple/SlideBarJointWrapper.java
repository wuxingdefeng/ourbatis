package org.nico.ourbatis.wrapper.simple;

import org.nico.ourbatis.wrapper.Wrapper;

public class SlideBarJointWrapper extends Wrapper<String>{

	public static final char UNDERLINE='_';
	
	@Override
	public String wrapping(String value) {
		if (value == null || "".equals(value.trim())){
            return "";
        }
        int len = value.length();
        StringBuilder sb = new StringBuilder(len);
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = value.charAt(i);
            if (Character.isUpperCase(c)){
            	if(index > 0) {
            		sb.append(UNDERLINE);
            	}
            	index ++;
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
	}

}
