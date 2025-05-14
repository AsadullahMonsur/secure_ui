package org.reservior.secure_ui.model.filter;

public class DataFilter {
    private String sort_selection;
    private String date_selection;

    public DataFilter(String type, String plain, String male) {
        sort_selection = type;
        date_selection = plain;
    }

    public String getSort_selection() {
        return sort_selection;
    }

    public void setSort_selection(String sort_selection) {
        this.sort_selection = sort_selection;
    }

    public String getDate_selection() {
        return date_selection;
    }

    public void setDate_selection(String date_selection) {
        this.date_selection = date_selection;
    }

}
