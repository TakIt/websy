package com.example.wsp_spring;

import com.example.wsp_spring.model.RetrospectService;
import com.example.wsp_spring.model.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.wsp_spring.model.RetrospectService;
import com.example.wsp_spring.model.SignService;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDateTime;

@Controller
public class WebController {
    @Autowired
    private RetrospectService service;
    private SignService signService;

    @GetMapping("test")
    @ResponseBody
    public String test(Model model){
        return LocalDateTime.now().toString();
    }

    @GetMapping("GetPost")
    public String get(Model model){
        return "retrospect";
    }


    @PostMapping("GetPost")
    public String post(String text,Model model){
        model.addAttribute("message",service.register(text));
        var retrospectives = service.findAll();
        model.addAttribute("retrospectives",retrospectives);
        return "retrospect";
    }



    @PostMapping("signed")
    public String signed(String userId,String passphrase,Model model){
        model.addAttribute("userId",signService.doSignIn(userId, passphrase));
        if(true) { return "signed"; }else{return "signin";}
    }

    @GetMapping("signin")
    public String signin(Model model){
        return "signin";
    }



}
