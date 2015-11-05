package com.springapp.mvc;

import com.finance.beans.User;
import com.finance.method.MenuMethod;
import com.finance.method.ResultMethod;
import com.finance.method.UserMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {

    User user=new User();
    UserMethod userMethod=new UserMethod();
    PageInfo pageInfo=new PageInfo();

    private  String menuName="";


    @Autowired
    private MenuMethod menuMethod;

    @Autowired
    private ResultMethod resultMethod;

    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Please logIn");
		return "hello";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String checkPassword(@RequestParam Map<String,String> req , ModelMap modelMap){

        if (userMethod.logIn(req.get("username"), req.get("password"))) {
            user.setEmail("ttw789@gmail.com");
            modelMap.addAttribute("user",user);

            modelMap.addAttribute("menus",menuMethod.allMenu());
            return "mainpage";
        } else {
            modelMap.addAttribute("message", "Please logIn");
            modelMap.addAttribute("info","Username or password error");
            return "hello";
        }
    }

    @RequestMapping(value = "/showtop")
    public String showTop(ModelMap modelMap){
        modelMap.addAttribute("user",user);
        return "top";
    }
    @RequestMapping(value = "/showedge")
    public String showEdge(ModelMap modelMap){
        modelMap.addAttribute("functions",pageInfo.getFunctionList());
        return "edge";
    }
    @RequestMapping(value = "/showContext")
    public String showContext(ModelMap modelMap){

        return "finance/home";
    }



    @RequestMapping(method =RequestMethod.GET   ,value = "/menuactive")
    public String showQuery(@RequestParam Map<String,String> req, ModelMap modelMap){
        modelMap.addAttribute("menus", menuMethod.allMenu());
        modelMap.addAttribute("currentMenu", req.get("menuid"));
        menuName=req.get("menuname");
        return "mainpage";
    }

    @RequestMapping(value = "/showMenuContext")
    public String showMenuContext(@RequestParam Map<String,String> req, ModelMap modelMap){
        System.out.println("heloCurrentMenu:" + req.get("currentMenu"));

        modelMap.addAttribute("currentMenu", req.get("currentMenu"));
        modelMap.addAttribute("currentMenuName", menuName);
        if(req.get("currentMenu").equals("")){
            return "finance/blankPage";
        }else{
            return "finance/menu1qry";
        }

    }




    @RequestMapping(method = RequestMethod.POST, value = "/queryReport")
    public String QueryReport(@RequestParam Map<String,String> req , ModelMap modelMap){
        System.out.println(req.get("repdate"));
        modelMap.addAttribute("currentMenuName", menuName);
        modelMap.addAttribute("Results",resultMethod.getResutlt("aa"));
         return "finance/menu1result";
    }




}