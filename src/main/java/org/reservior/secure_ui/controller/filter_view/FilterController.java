package org.reservior.secure_ui.controller.filter_view;

import org.javaEOX.utility.DebugUtility;
import org.reservior.secure_ui.model.filter.DataFilter;
import org.reservior.secure_ui.model.table.SampleTableInfo;
import org.reservior.secure_ui.service.TableDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class FilterController {
    private SampleTableInfo info = new SampleTableInfo();
    private DataFilter data_filter = new DataFilter("Ascending","Plain","Male");

    @RequestMapping("filter01")
    public String get_page_for_filters(Model model){
        DebugUtility.println("design02.html requested");

        info.setList4(TableDataService.apply_sort(data_filter,info.getList4()));
        model.addAttribute("list",info.getList4());
        model.addAttribute("notification_status",true);
        model.addAttribute("data_filter", data_filter);
        return "design/design02";
    }

    @PostMapping("filter01/filter")
    public String apply_filter(@ModelAttribute DataFilter filter, Model  model){
        DebugUtility.println("redirect requested");
        info.setList4(TableDataService.apply_sort(filter,info.getList4()));
        data_filter = filter;

        return "redirect:/view/filter01";
    }
}
