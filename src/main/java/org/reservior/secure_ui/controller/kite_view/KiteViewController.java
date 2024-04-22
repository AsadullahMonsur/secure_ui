package org.reservior.secure_ui.controller.kite_view;

import org.reservior.secure_ui.model.navigation.bar.KiteViewNavigationBar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class KiteViewController {
    @RequestMapping("kite_view")
    private String display(Model model) {
        model.addAttribute("nav_bar",
                            new KiteViewNavigationBar());
        return "webapp/primary/kite_view";
        //return "primary/kite_view";
    }
}
