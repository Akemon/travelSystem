package travel.common.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpURLConectionUtil {

    /***
     * 模拟GET请求
     * @param url 请求的URL
     * @param params 请求参数 key:参数名字 value:参数值
     * @return 返回GET请求结果
     */
    public static String get(String url,Map<String,String> params){
        String totalUrl=url+"?"+getParams(params);
        return request(totalUrl,"GET");
    }

    /**
     * 模拟POST请求
     * @param url 请求的URL
     * @param params 请求参数 key:参数名字 value:参数值
     * @return 返回POST请求结果
     */
    public static String post(String url,Map<String,String> params){
        String totalUrl=url+"?"+getParams(params);
        return request(totalUrl,"POST");
    }

    private static String getParams(Map<String,String> params){
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(Map.Entry<String,String> entry:params.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue();
            if(count==params.size()){
                sb.append(key+"="+value);
            }else{
                sb.append(key+"="+value+"&");
            }
            count++;
        }
        return sb.toString();
    }

    private static String request(String totalUrl,String method){
        try {
            System.out.println("正在发送请求:"+totalUrl);
            // 把字符串转换为URL请求地址
            URL url = new URL(totalUrl);
            // 打开连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //设置请求方法
            connection.setRequestMethod(method);
            //异步提交
            connection.setRequestProperty("X-Requested-With", "XMLHttpRequest");
            // 连接会话
            connection.connect();
            // 获取输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder sb = new StringBuilder();
            // 循环读取流
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();// 关闭流
            connection.disconnect();// 断开连接
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("连接:"+totalUrl+"\t失败!异常信息:\n");
            e.printStackTrace();
        }
        return null;
    }

}
