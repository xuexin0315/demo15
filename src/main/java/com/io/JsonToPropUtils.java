package com.io;




import net.sf.json.JSONObject;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author xuexin
 * @creat 2020/7/13 16:58
 */
public class JsonToPropUtils {

    public static void jsonToProp(String jsonStr,String Path) {
        JSONObject jsonObj=JSONObject.fromObject(jsonStr);

        File file = new File(Path);
        try {
            OutputStream os = new FileOutputStream(Path);
            InputStream is = new FileInputStream(file);
            Properties prop=new Properties();
            prop.load(is);
            Iterator it =jsonObj.keys();
            while(it.hasNext()){
                String key=(String) it.next();
                String value=(String)jsonObj.get(key);
                prop.setProperty(key, value);
            }
            prop.store(os, null);
            is.close();
            os.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //主方法
    public static void main(String[] args) {
        String jsonStr="{'key':'1','name':'liuli'}";
        jsonToProp(jsonStr,"Pro.properties");

    }



}
