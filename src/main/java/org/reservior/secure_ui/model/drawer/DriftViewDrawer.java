package org.reservior.secure_ui.model.drawer;

import java.util.ArrayList;
import java.util.List;

public class DriftViewDrawer {
    // this drawer includes: left && right both drawers
    private List<String> visibility;

    public DriftViewDrawer() {
        visibility = new ArrayList<String>();

        visibility.add("display: inherit;"); // left nav visible
        visibility.add("display: inherit;"); // right nav omitted
    }

    @Override
    public String toString() {
        return "DriftViewDrawer{" +
                "visibility=" + visibility +
                '}';
    }

    public List<String> getVisibility() {
        return visibility;
    }

    public void setVisibility(List<String> visibility) {
        this.visibility = visibility;
    }
}
