package com.finance.method;

import com.finance.beans.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by taylor on 7/21/15.
 */
@Repository
public class TransactionMethod {

    public Integer getNextID(){

        return null;
    }

    public boolean insertNewTransaction(Transaction transaction){

        return true;
    }

    public boolean updateTransaction(Transaction transaction) {

        return true;
    }

    public List<Transaction> listAllTransation(){
        List<Transaction> list=null;
        return list;
    }


}
