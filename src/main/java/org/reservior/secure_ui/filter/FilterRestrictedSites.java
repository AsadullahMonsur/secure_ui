package org.reservior.secure_ui.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterRestrictedSites {
public static List<String> get_restricted_page_list(){
    List<String> list = new ArrayList<String>();
    list.add("wishlist");

    return list;
}

}
