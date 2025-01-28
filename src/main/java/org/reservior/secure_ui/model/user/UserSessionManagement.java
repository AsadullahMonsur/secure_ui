package org.reservior.secure_ui.model.user;

import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.concurrent.ConcurrentHashMap;

public class UserSessionManagement {
    public static int session_handler(Model model, ConcurrentHashMap<String, String> user_map, HttpSession session, String username){
//       System.out.println("Post Map Session Id: "+session_id);

        boolean []flag = new boolean[]{false};

        user_map.forEach((key, value) -> {
            if(key== session.getId()){
                flag[0] = true;
            }
        });

        if(!flag[0]){
            user_map.put(session.getId(),username);
            session.setAttribute("user",username);
            model.addAttribute("user_map",user_map);
        }

        return 0;
    }

}
