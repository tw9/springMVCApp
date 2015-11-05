package com.springapp.mvc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by taylor on 7/28/15.
 */
public class PageInfoTest {

    PageInfo pageInfo=new PageInfo();
    @Test
    public void functionList(){
        assertEquals(6,pageInfo.getFunctionList().size());
    }
}
