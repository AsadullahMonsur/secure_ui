package org.reservior.secure_ui.controller.error_view;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class IPController implements ErrorController {
    private static int trick_index = -1;

    @RequestMapping("/too_much_curious")
    private String handleError(Model model, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("received request at death zone : by too much curious customer");
        HttpSession session = request.getSession(false);

        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        System.out.println("error code at death zone: "+
                            request.getAttribute(RequestDispatcher.ERROR_REQUEST_URI).toString()+
                            "\n \n *****");

        trick_index++;

        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());


            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return get_path(model);
            }
            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return get_path(model);
            }
        }

        return get_path(model);
    }

    private String get_path(Model model){
        String []virtues =  new String[]{"you looks cool","oh  oh","Your are owned","Take a selfie","coming soon to visit you" };

        if(trick_index>=virtues.length){
            trick_index = 0;
        }
        model.addAttribute("that_make_you_hooker", virtues[trick_index]);
        //return "webapp/curiosity/bank_hacker";
        return "curiosity/bank_hacker";
    }
}
