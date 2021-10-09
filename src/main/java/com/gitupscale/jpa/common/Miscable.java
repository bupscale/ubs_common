/**
 * 
 */
package com.gitupscale.jpa.common;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

/**
 * @author Noelson
 *
 */
public interface Miscable {

	public default String putMisc(Map<String,String> miscData,String misc) {
		
		Map<String,String> miscMap = new HashMap<String,String>();
		
		if(StringUtils.isAllBlank(misc)) {
			return JSON.toJSONString(miscData);
		} else {
			miscMap = JSON.parseObject(misc, new TypeReference<Map<String, String>>() {});
			miscMap.putAll(miscData);
			return JSON.toJSONString(miscMap);
		}
		
	}
	
	public default String putMisc(String key,String value,String misc) {
		
		Map<String,String> miscMap = new HashMap<String,String>();
		
		if(StringUtils.isAllBlank(misc)) {
			miscMap.put(key, value);
			 return JSON.toJSONString(miscMap);
		} else {
			miscMap = JSON.parseObject(misc, new TypeReference<Map<String, String>>() {});
			miscMap.put(key, value);
			return JSON.toJSONString(miscMap);
		}
		
	}

	public default String getMisc(String miscKey,String misc) {
		Map<String,String> miscMap = JSON.parseObject(misc, new TypeReference<Map<String, String>>(){});
		return miscMap.get(miscKey);
	}
}