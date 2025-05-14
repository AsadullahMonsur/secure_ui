package org.reservior.secure_ui.controller.random_view;

import org.javaEOX.utility.DebugUtility;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class DesignSkeletonController {

    @RequestMapping("skeleton01")
    private String get_page(Model model){
        DebugUtility.println("design01.html requested");

        model.addAttribute("notification_status",true);
        model.addAttribute("layout_background","/image/other/design01_image03.jpg");
        return "design/design01";
    }
}
