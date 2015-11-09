package run;


import beans.Plan;
import method.ImportFromExcel;
import method.MethodPlan;

import java.util.List;

/**
 * Created by taylor on 11/9/15.
 */
public class Test {

    public static void main(String[] args) {
        MethodPlan methodPlan=new MethodPlan();

        List<Plan> list=methodPlan.getAll();
        System.out.println("listsize:" + list.size());

        for(int i=0;i<list.size();i++){
            Plan plan=list.get(i);
            System.out.print("orgid:" + plan.getOrgid());
            System.out.println("  pln:" + plan.getPln());
        }
        System.out.println("***************************************************");

        methodPlan.importFromExcel("/Users/taylor/Documents/temp/test/test.xlsx");

        //  /Users/taylor/doc/temp/test/test.xlsnx

//        ImportFromExcel importFromExcel=new ImportFromExcel();
//        System.out.println(importFromExcel.excelToSqlData("/Users/taylor/Documents/temp/test/test.xlsx"));


    }
}
