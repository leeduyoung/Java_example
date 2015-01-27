package Json;

import org.json.simple.JSONObject;

/**
 * 자바 데이터를 JSON객체로 변환
 * Encoding JSON in java
 * @author leedu
 * 자바 데이터를 JSON객체로 변환해서 JSP에 전달하고 JSP는 JSON객체를 받아서 java객체로 변환해 받을 수 있다.
 * 반대로 JSP도 JSON객체로 변환해서 Java(클라이언트)에 전달하고 자바는 java객체로 변환해서 받을 수 있다.
 */
public class JsonEncodeDemo 
{
   public static void main(String[] args) 
   {
      JSONObject obj = new JSONObject();
      
      obj.put("str", "javaking");
      obj.put("num", new Integer(100));
      obj.put("double", new Double(1000.21));
      obj.put("is_boolean", new Boolean(true));

      System.out.print(obj);
   }
}
