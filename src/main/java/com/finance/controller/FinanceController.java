package com.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by taylor on 7/21/15.
 */
@Controller
@RequestMapping("/finance")
public class FinanceController {

    int i=0;

    @RequestMapping(value = "/fhome")
    public String toFinanceHome(ModelMap modelMap,@RequestParam Map<String,String> req){
        modelMap.addAttribute("num",i++);
        return "finance/home";
    }
}
