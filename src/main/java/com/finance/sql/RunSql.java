package com.finance.sql;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.sqlmap.engine.mapping.sql.Sql;
import org.springframework.stereotype.Repository;

import java.io.*;

/**
 * Created by taylor on 11/7/15.
 */
@Repository
public class RunSql {
    public SqlMapClient sqlMapClient(){
        SqlMapClient smc=null;
        try {
            Reader reader= Resources.getResourceAsReader("main/java/com/config/ibatis.xml");
            smc= SqlMapClientBuilder.buildSqlMapClient(reader);
           } catch (Exception e) {
               e.printStackTrace();
           }
        return smc;
    }


    public static void main(String[] args) {
        SqlMapClient smc=null;
        try {
//            Reader reader= Resources.getResourceAsReader("src/main/java/com/config/ibatis.xml");
//            smc= SqlMapClientBuilder.buildSqlMapClient(reader);
            InputStream inputStream=new FileInputStream(new File("src/main/java/com/config/ibatis.xml"));
            smc= SqlMapClientBuilder.buildSqlMapClient(inputStream);
//        File file= new File("src/main/java/com/config/ibatis.xml");
//            System.out.println(file.getPath());

//            File file=new File("src");
//            File[] files=file.listFiles();
//            System.out.println(file.getAbsolutePath());
//            System.out.println(files.length);
//            for(int i=0;i<files.length;i++){
//                System.out.println(files[i]);
//            }
            System.out.println("hello:" + System.getProperty("user.dir"));
//            Reader reader= Resources.getResourceAsReader("src/main/java/com/finance/sql/ibatis.xml");
//            Object o=Resources.getResourceAsStream("src/main/java/com/config/ibatis.xml");


        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(smc.toString());
    }
}
