package com.springapp.mvc;

import com.finance.method.UserMethod;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by taylor on 7/23/15.
 */
public class MethodTests {

    UserMethod userMethod=new UserMethod();

    @Test
    public void logIn() {
        boolean a= userMethod.logIn("jfd","jfkd");
        assertEquals(false,a);
    }
}
