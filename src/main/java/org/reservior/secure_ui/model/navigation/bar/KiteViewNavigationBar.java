package org.reservior.secure_ui.model.navigation.bar;

import java.util.ArrayList;
import java.util.List;

public class KiteViewNavigationBar {
    // this bar includes: top && bottom both bars
    private List<String> visibility;

    public KiteViewNavigationBar() {
        visibility = new ArrayList<String>();

        visibility.add("display: inherit;"); // top nav visible
        visibility.add("display: inherit;"); // bottom nav omitted
    }

    @Override
    public String toString() {
        return "KiteViewNavigationBar{" +
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
