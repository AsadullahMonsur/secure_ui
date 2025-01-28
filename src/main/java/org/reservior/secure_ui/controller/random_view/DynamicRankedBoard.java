package org.reservior.secure_ui.controller.random_view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

@Controller
@RequestMapping("view")
public class DynamicRankedBoard {
    private int value,value1,value2,value3,value4,value5,value6,value7 = 0;
    private boolean flag = true;

    @RequestMapping("ranking")
    private String board(Model model, HttpSession session) {
        model.addAttribute("rank",value);
        model.addAttribute("rank1",value1);
        model.addAttribute("rank2",value2);
        model.addAttribute("rank3",value3);
        model.addAttribute("rank4",value4);
        model.addAttribute("rank5",value5);
        model.addAttribute("rank6",value6);
        model.addAttribute("rank7",value7);

        changes();

        //return "webapp/sample/ranked_board";
        return "sample/ranked_board";
    }

    @PostMapping("ranking")
    private String update(Model model, HttpSession session) {
        System.out.println("update : new info");
        model.addAttribute("rank",value);

        return "redirect:/view/ranking";
    }

    private void changes(){
        if(!flag){
            return;
        }

        flag = false;

        Timer timer = new Timer();

        // Create an instance of TimerTask with the desired behavior
        TimerTask task = new TimerTask() {
            private Random random = new Random();

            @Override
            public void run() {
                // Generate a random integer (for example, between 0 and 100)
                int rm = random.nextInt(8);

                System.out.println("Generated random value: " + rm);
                value = rm;

                int rm1 = random.nextInt(8);
                int rm2 = random.nextInt(8);
                int rm3 = random.nextInt(8);
                int rm4 = random.nextInt(8);
                int rm5 = random.nextInt(8);
                int rm6 = random.nextInt(8);
                int rm7 = random.nextInt(8);

                value1 = rm1;
                value2 = rm2;
                value3 = rm3;
                value4 = rm4;
                value5 = rm5;
                value6 = rm6;
                value7 = rm7;
            }
        };

        // Schedule the task to run every 60,000 milliseconds (1 minute)
        // Delay is 0, period is 60,000 ms (1 minute)
        timer.scheduleAtFixedRate(task, 0, 5000);

    }
}
