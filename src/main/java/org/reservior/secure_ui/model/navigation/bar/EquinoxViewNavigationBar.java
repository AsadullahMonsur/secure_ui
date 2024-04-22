package org.reservior.secure_ui.model.navigation.bar;

import java.util.ArrayList;
import java.util.List;

public class EquinoxViewNavigationBar {

    private List<Boolean> focus;

    public EquinoxViewNavigationBar() {
        focus = new ArrayList<Boolean>();
    }

    public List<Boolean> getFocus() {
        return focus;
    }

    public void setFocus(List<Boolean> focus) {
        this.focus = focus;
    }
}
