package nus.iss.tut13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import nus.iss.tut13.model.contactInfo;
import nus.iss.tut13.service.contactFunction;
import nus.iss.tut13.utility.utility;

@Controller
@RequestMapping (path="/")
public class contact 
{
    @Autowired
    utility utility;

    @Autowired
    contactFunction confunc;

    @Value("${data.dir}")
    private String dataDir;
    
    @GetMapping
    public String indexPage(Model model)
    {
        model.addAttribute("contact", new contactInfo());
        return "index";
    }

    @PostMapping(path="/show-contact")
    public String Contact(@Valid contactInfo coninfo, BindingResult bind, Model model)
    {
        if(bind.hasErrors())
        {
            return "index";
        }
        return "showContact";
    }
}
