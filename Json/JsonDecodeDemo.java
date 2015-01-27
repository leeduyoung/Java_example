package Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * JSON 데이터를 자바 데이터로 변환
 * @author leedu
 *
 */
public class JsonDecodeDemo 
{
   public static void main(String[] args) 
   {
      JSONParser parser=new JSONParser();
      
      //JSON형태의 단순 문자열
      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
      
      //String s = "{\"num\":100, \"str\":\"javaking\", \"is_boolean\":true, \"double\":1000.21}"; 
      
      try{
         Object obj = parser.parse(s); 
         //json형태의 문자열을 파싱한후 Object로 반환
         //json의 구조가 배열 형태이면  JSONArray 타입으로 캐스팅
         //json의 구조가 단순 객체 형태이면 JSONObject 타입으로 캐스팅
         JSONArray array = (JSONArray)obj;
         System.out.println("The 2nd element of array");
         System.out.println(array.get(0)); //0번째 인덱스의 값 또는 객체
         System.out.println(array.get(1)); //1번째 인덱스의 값 또는 객체
         System.out.println();

         JSONObject obj2 = (JSONObject)array.get(1); 
         System.out.println("Field \"1\"");
         System.out.println(obj2.get("1"));    
         System.out.println();
         
         
         s = "{\"name\":10, \"id\":\"leedu\", \"password\":1234}";
         obj = parser.parse(s);
         System.out.println(obj);
         JSONObject jobj = (JSONObject)obj;
         System.out.println(jobj.get("name"));
         System.out.println(jobj.get("id"));
         System.out.println(jobj.get("password"));
         
         
         s= "[5,]";
         obj = parser.parse(s);
         System.out.println(obj);

         s= "[5,2,1,4,6,7,8,9]";
         obj = parser.parse(s);
         System.out.println(obj);
         JSONArray arr = (JSONArray)obj;
         
         for(int i=0; i<arr.size(); i++)
        	 System.out.println(arr.get(i));
         
      }catch(ParseException pe){
         System.out.println("position: " + pe.getPosition());
         System.out.println(pe);
      }
   }
}
