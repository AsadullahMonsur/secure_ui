package org.reservior.secure_ui.controller.drift_view;

import org.reservior.secure_ui.model.drawer.DriftViewDrawer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class DriftViewController {
    @RequestMapping("drift_view")
    private String display(Model model) {
        model.addAttribute("drawer",
                            new DriftViewDrawer());

        return "webapp/primary/drift_view";
        //return "primary/drift_view";
    }
}
