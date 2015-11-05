package com.springapp.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taylor on 7/28/15.
 */
public class PageInfo {

    public List<String> getFunctionList(){
       List<String> list=new ArrayList<String>();
        list.add("Finance");
        list.add("func2");
        list.add("func3");
        list.add("func4");
        list.add("func5");
        list.add("func6");
        return list;
    }
}
