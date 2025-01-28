package org.reservior.secure_ui.controller.test;


import org.reservior.secure_ui.model.PersonForm;
import org.reservior.secure_ui.model.table.SampleTableInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("view")
public class SampleViewController {

    @RequestMapping("index")
    public String showIndex(PersonForm personForm) {
        return "sample/index";
    }

    @PostMapping("index")
    public String addPerson(@Valid PersonForm personForm, BindingResult bindingResult) {

        System.out.println(personForm.toString());
        if (bindingResult.hasErrors()) {
            System.out.println("inside"+bindingResult.toString());
            //return "webapp/sample/index";
            return "sample/index";
        }

        //return "webapp/sample/results";
        return "sample/results";
    }

//    @RequestMapping("vom")
    public String show(Model model) {
        SampleTableInfo info = new SampleTableInfo();
        model.addAttribute("list1",info.getList1());
        model.addAttribute("list2",info.getList2());
        //return "webapp/sample/table";
        return "sample/table";
    }

    @RequestMapping("tableview")
    public String show_table(Model model) {
        SampleTableInfo info = new SampleTableInfo();
        model.addAttribute("list4",info.getList4());
        //return "webapp/sample/table_board";
        return "sample/table_board";
    }
    
}