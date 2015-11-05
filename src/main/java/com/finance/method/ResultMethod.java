package com.finance.method;

import com.finance.beans.Result5;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taylor on 11/5/15.
 */
@Repository
public class ResultMethod {

    public List<Result5> getResutlt(String report) {
        List<Result5> list = new ArrayList<Result5>();


        for (int i=0;i<10;i++){
            Result5 result5=new Result5();
            result5.setCol1("col1,"+i);
            result5.setCol2("col2,"+i);
            result5.setCol3("col3,"+i);
            result5.setCol4("col4,"+i);
            result5.setCol5("col5,"+i);
            list.add(result5);
        }


        System.out.println("list context :");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getCol1());
            System.out.println(list.get(i).getCol2());
            System.out.println(list.get(i).getCol3());
            System.out.println(list.get(i).getCol4());
            System.out.println(list.get(i).getCol5());
        }

        return list;
    }


}
