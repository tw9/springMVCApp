package method;

import beans.Plan;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

/**
 * Created by taylor on 11/9/15.
 */
public class MethodPlan {

    private SqlMapClient dbrun;


    private SqlMapClient getDbrun(){
        SqlMapClient smc=null;
        try {
            Reader reader= Resources.getResourceAsReader("config/ibatis.xml");
            smc= SqlMapClientBuilder.buildSqlMapClient(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return smc;
    }

    public List<Plan> getAll(){
        dbrun=getDbrun();
        List<Plan> list= null;
        try {
            list = dbrun.queryForList("getAll");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


    public void insertOne(Plan plan){
        dbrun=getDbrun();
        try {
            dbrun.insert("insertOne",plan);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void importFromExcel(String filePath){
        dbrun=getDbrun();
        ImportFromExcel importFromExcel=new ImportFromExcel();
        try {
            String datas=importFromExcel.excelToSqlData(filePath);
            dbrun.insert("insertAll",datas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
