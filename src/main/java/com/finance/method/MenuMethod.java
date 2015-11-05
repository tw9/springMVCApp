package com.finance.method;

import com.finance.beans.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taylor on 11/4/15.
 */
@Repository
public class MenuMethod {

    @Autowired
    private Menu menu;

    public List<Menu> allMenu(){
        List<Menu> list=new ArrayList<Menu>();

       for(int i=0;i<45;i++){
           Menu mu=new Menu();
           mu.setMenuid("id" + i);
           mu.setMenuname("name" + i);
           list.add(mu);
       }
        return list;
    }

}
