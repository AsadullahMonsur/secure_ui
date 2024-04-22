package org.reservior.secure_ui.model.table;

import java.util.List;

//in the Name of Allah
public class TableData {
//flex table approach with css, html only

 private List<String> elements;

 public TableData(List<String> elements) {
    this.elements = elements;
 }

 public List<String> getElements() {
  return elements;
 }
}
