package run;


import beans.Plan;
import method.MethodPlan;

import java.util.List;

/**
 * Created by taylor on 11/9/15.
 */
public class Test {

    public static void main(String[] args) {
        MethodPlan methodPlan=new MethodPlan();

        List<Plan> list=methodPlan.getAll();
        System.out.println("listsize:"+list.size());

        for(int i=0;i<list.size();i++){
            Plan plan=list.get(i);
            System.out.println("orgid:"+plan.getOrgid());
            System.out.println("pln:"+plan.getPln());
        }
        System.out.println("***************************************************");
       Plan plan=new Plan();
        plan.setOrgid("013109999999");
        plan.setPln(34422542.341);
        System.out.println("insert:"+methodPlan.insertOne(plan));



    }
}
