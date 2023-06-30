package cn.fzx.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.Map;

/**
 * @author fangzhixiang
 * @date 2022-06-28
 */
public class ToString {

	public static void main(String[] args) {
		String str = "{\"key\": \"value\"}";

		// json格式的字符串 转 Json对象
		JSONObject jsonObject =  JSON.parseObject(str);
		// 最基本的获取方式 还有其他get ,可指定返回值类型，泛型等
		Object value = jsonObject.get("key");
		String valueStr = jsonObject.getString("key");
		String valueStr2 = jsonObject.getObject("key", String.class);

		// 获取子属性，  JSONObject类型
		//JSONObject key = jsonObject.getJSONObject("key");


		// json格式的字符串 转 具体的对象
		Map<String,String> map = JSON.parseObject(str, Map.class);

		// Json对象  转  Object对象
		String res = JSON.toJavaObject(jsonObject,String.class);


		// Json对象 toString   想要不忽略值为null的属性,需要这样写
		JSON.toJSONString(jsonObject, SerializerFeature.WriteMapNullValue);

	}
}
