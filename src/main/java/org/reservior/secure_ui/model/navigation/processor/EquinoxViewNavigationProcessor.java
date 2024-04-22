package org.reservior.secure_ui.model.navigation.processor;

import org.reservior.secure_ui.model.navigation.bar.EquinoxViewNavigationBar;

public class EquinoxViewNavigationProcessor {

    public static EquinoxViewNavigationBar process_main_tabs(int index, int max_items, EquinoxViewNavigationBar bar){
       // color & length_x -- same amount

        bar.getFocus().clear();

        for (int i=0; i<max_items;i++){
           if(index== i){
               bar.getFocus().add(true);
           }
           else {
               bar.getFocus().add(false);
           }
        }

        return bar;
    }
}
