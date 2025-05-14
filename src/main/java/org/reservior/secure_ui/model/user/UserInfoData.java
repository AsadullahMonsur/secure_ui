package org.reservior.secure_ui.model.user;

import java.util.ArrayList;
import java.util.List;

public class UserInfoData {
    public static List<UserInfo> get_user_info(){
        List<UserInfo> list = new ArrayList<UserInfo>();
        list.add(new UserInfo("apple@gmail.com","apples","user"));
        list.add(new UserInfo("orange@gmail.com","oranges","user"));
        list.add(new UserInfo("mango@gmail.com","mangoes","admin"));

        return list;
    }

    public static UserInfo check_user(String name,String password){
        List<UserInfo> list = get_user_info();

        for (UserInfo info:list){
            if (info.getUsername().equals(name)){
                if(info.getPassword().equals(password)){
                    return info;
                }
                else {
                    return null;
                }
            }
        }

        return null;
    }
}
