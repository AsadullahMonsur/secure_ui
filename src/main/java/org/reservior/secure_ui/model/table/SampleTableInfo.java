package org.reservior.secure_ui.model.table;

import org.reservior.secure_ui.model.product.ProductDataInfo;

import java.util.ArrayList;
import java.util.List;

public class SampleTableInfo {
    private List<TableData> list2 = new ArrayList<TableData>();
    private List<TableData> list1 = new ArrayList<TableData>();
    private List<TableData> listp = new ArrayList<TableData>();
    private List<TableData> listq = new ArrayList<TableData>();
    private List<TableData> list3 = new ArrayList<TableData>();

    public SampleTableInfo() {
        List<String> data = new ArrayList<String>();
        data.add("Type");
        data.add("Gender");
        data.add("Size");
        data.add("Color");
        data.add("Price");
        data.add("Discount");

        List<String> data1 = new ArrayList<String>();
        data1.add("Type");
        data1.add("Full-Shirt");
        data1.add("Half-Shirt");
        data1.add("T-Shirt");
        data1.add("Full-pant");
        data1.add("Trouser");
        data1.add("Underwear");
        data1.add("Panjabi");
        data1.add("Shari");
        data1.add("Three Piece");
        data1.add("Towel");
        data1.add("Handkerchief");

        List<String> data2 = new ArrayList<String>();
        data2.add("Gender");
        data2.add("Male");
        data2.add("Female");
        data2.add("Children");
        data2.add("Elder");


        List<String> data3 = new ArrayList<String>();
        data3.add("Size");
        data3.add("L");
        data3.add("XL");
        data3.add("XXL");
        data3.add("Gigantic");

        List<String> data4 = new ArrayList<String>();
        data4.add("Color");
        data4.add("Violate/Purple");
        data4.add("Indigo/Deep Blue");
        data4.add("Sky Blue/Light Blue");
        data4.add("Green");
        data4.add("Yellow");
        data4.add("Orange");
        data4.add("Red");
        data4.add("White");
        data4.add("Black");
        data4.add("Other");
        data4.add("Mix/Random");

        List<String> data5 = new ArrayList<String>();
        data5.add("Price");
        data5.add("check product for details");

        List<String> data6= new ArrayList<String>();
        data6.add("Discount");
        data6.add("check product for details");

        List<String> data7= new ArrayList<String>();
        data7.add("Back-end");
        data7.add("Front-end");
        data7.add("Rendering Type");
        data7.add("Java Version");
        data7.add("Project Management Tool");
        data7.add("Database");
        data7.add("Hosted Platform");


        List<String> data8= new ArrayList<String>();
        data8.add("Java, SpringBoot");
        data8.add("HTML, CSS3, Thymeleaf");
        data8.add("Server Side Rendering [SSR]");
        data8.add("Java-11");
        data8.add("Gradle");
        data8.add("Mongo-DB");
        data8.add("Amazon");


        TableData td = new TableData(data);
        TableData td1 = new TableData(data1);
        TableData td2 = new TableData(data2);
        TableData td3 = new TableData(data3);
        TableData td4 = new TableData(data4);
        TableData td5 = new TableData(data5);
        TableData td6 = new TableData(data6);

        TableData td7 = new TableData(data7);
        TableData td8 = new TableData(data8);

        list1.add(td1);
        list1.add(td2);
        list1.add(td3);
        list1.add(td4);
        list1.add(td5);
        list1.add(td6);

        list2.add(td);
        list2.add(td);
        list2.add(td);
        list2.add(td);
        list2.add(td);
        list2.add(td);
        list2.add(td);
        list2.add(td);
        list2.add(td);
        list2.add(td);

        listp.add(td7);
        listp.add(td8);

        List<String> data9 = new ArrayList<String>();
        data9.add("Serial No");
        data9.add("1");
        data9.add("2");
        data9.add("3");
        data9.add("4");
        data9.add("5");
        data9.add("6");
        data9.add("7");
        data9.add("");

        List<String> data10 = new ArrayList<String>();
        data10.add("Product Id");
        data10.add("#001");
        data10.add("#002");
        data10.add("#003");
        data10.add("#004");
        data10.add("#005");
        data10.add("#006");
        data10.add("#007");
        data10.add("Full List's Price = ");

        List<String> data11 = new ArrayList<String>();
        data11.add("Details");
        data11.add("It is an item");
        data11.add("It is an item");
        data11.add("It is an item");
        data11.add("It is an item");
        data11.add("It is an item");
        data11.add("It is an item");
        data11.add("It is an item");
        data11.add("");

        List<String> data12 = new ArrayList<String>();
        data12.add("Amount");
        data12.add("7");
        data12.add("2");
        data12.add("3");
        data12.add("2");
        data12.add("2");
        data12.add("1");
        data12.add("1");
        data12.add("");

        List<String> data13 = new ArrayList<String>();
        data13.add("Per Item [USD]");
        data13.add("10");
        data13.add("14");
        data13.add("5");
        data13.add("5");
        data13.add("7");
        data13.add("3");
        data13.add("3");
        data13.add("");

        List<String> data14 = new ArrayList<String>();
        data14.add("Total Price [USD]");
        data14.add("70");
        data14.add("28");
        data14.add("15");
        data14.add("10");
        data14.add("14");
        data14.add("3");
        data14.add("3");
        data14.add("143");

        List<String> data15 = new ArrayList<String>();
        data15.add("Remove Item");
        data15.add("X");
        data15.add("X");
        data15.add("X");
        data15.add("X");
        data15.add("X");
        data15.add("X");
        data15.add("X");
        data15.add("");

        TableData td9 = new TableData(data9);
        TableData td10 = new TableData(data10);
        TableData td11 = new TableData(data11);
        TableData td12 = new TableData(data12);
        TableData td13 = new TableData(data13);
        TableData td14 = new TableData(data14);
        TableData td15 = new TableData(data15);

        list3.add(td9);
        list3.add(td10);
        list3.add(td11);
        list3.add(td12);
        list3.add(td13);
        list3.add(td14);
        list3.add(td15);
    }

    public List<TableData> getList2() {
        return list2;
    }

    public List<TableData> getList1() {
        return list1;
    }

    public List<TableData> getListp() {
        return listp;
    }

    public List<TableData> getListq() {
        return listq;
    }

    public List<TableData> getList3() {
        return list3;
    }

    public List<TableData> delete_list3_data(int index){
        for (TableData data : getList3()) {
            data.getElements().remove(index);
        }

        return re_total();
    }

//    public List<TableData> add_list3_data(ProductDataInfo data){
//        getList3().add(data);
//
//        return re_total();
//    }

    private  List<TableData> re_total(){
        TableData data = getList3().get(getList3().size()-2);
        List<String> element = data.getElements();

        double sum = 0;

        for (int i = 1; i< element.size()-1; i++ ){
            double value = Double.parseDouble(element.get(i));
            sum = sum + value;
        }

        getList3().get(getList3().size()-2).getElements().remove(data.getElements().size()-1);
        getList3().get(getList3().size()-2).getElements().add(sum+"");

        return  getList3();
    }
}
