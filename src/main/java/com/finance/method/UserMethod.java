package com.finance.method;

import com.finance.beans.User;
import com.finance.sql.RunSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by taylor on 7/21/15.
 */
@Repository
public class UserMethod {

    @Autowired
   private RunSql runSql;

    public boolean logIn(String login_name,String passwored) {

        return true;
    }

    public List<User> getAllUser(){
        List<User> list= null;
        try {
            list = runSql.sqlMapClient().queryForList("getAll");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}
