package org.reservior.secure_ui.model.account;

import org.javaEOX.notification.NotificationListener;
import org.javaEOX.notification.NotifierEOX;
import org.javaEOX.validation.PatternChecker;

import java.util.List;

public class AccountConfiguration {

    public AccountConfiguration() {
        NotifierEOX.get_live_adapter().register_broadcast_listener(new NotificationListener() {
            @Override
            public void onReceive(int id, List<String> msg_list){
            }

            @Override
            public void onBroadCast(List<String> msg_list) {
                if(msg_list.size()>1){
                    print(msg_list.get(1));
                }
            }
        });
    }

    public boolean create_account(String name, String email,
                                         String password, String cpassword){

        int notification_id = NotifierEOX.get_broadcast_notification_helper(NotifierEOX.get_live_adapter()).getId();
        boolean name_f = PatternChecker.letter_only_validity_checker(name,notification_id);
        boolean mail_f = PatternChecker.email_validity_checker(email,notification_id);
        boolean pass_f = PatternChecker.password_validity_checker(password,notification_id);
        boolean cpass_f = PatternChecker.password_validity_checker(password,notification_id);
        boolean condition_f = password.equals(cpassword);

        boolean result = name_f && mail_f && pass_f && cpass_f && condition_f;

        if(result){
            //create account file
            System.out.println("New Account Created");
            return true;
        }

        return false;
    }

    public boolean sign_in(String email, String password){
        int notification_id = NotifierEOX.get_broadcast_notification_helper(NotifierEOX.get_live_adapter()).getId();
        boolean mail_f = PatternChecker.email_validity_checker(email,notification_id);
        boolean pass_f = PatternChecker.password_validity_checker(password,notification_id);

        boolean result = mail_f && pass_f;

        if(result){
            //sign_in session
            return true;
        }

        return false;
    }

    public boolean reset_password(){
        return false;
    }

    private void print(String msg){
        System.out.println(msg+"\n");
    }
}
