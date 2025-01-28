package org.reservior.secure_ui.model.table;

import java.util.ArrayList;
import java.util.List;

public class SampleTableInfo {
    private List<TableData> list2 = new ArrayList<TableData>();
    private List<TableData> list1 = new ArrayList<TableData>();
    private List<TableData> listp = new ArrayList<TableData>();
    private List<TableData> listq = new ArrayList<TableData>();
    private List<TableData> list3 = new ArrayList<TableData>();
    private List<TableData> list4 = new ArrayList<TableData>();

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
        data8.add("Self-Hosted");


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
        data10.add("#0001");
        data10.add("#0002");
        data10.add("#0003");
        data10.add("#0004");
        data10.add("#0005");
        data10.add("#0006");
        data10.add("#0007");
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
        data13.add("Per Item [BDT]");
        data13.add("10");
        data13.add("14");
        data13.add("5");
        data13.add("5");
        data13.add("7");
        data13.add("3");
        data13.add("3");
        data13.add("");

        List<String> data14 = new ArrayList<String>();
        data14.add("Total Price [BDT]");
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


        List<String> data17 = new ArrayList<String>();
        data17.add("ID");
        data17.add("#001");
        data17.add("#009");
        data17.add("#915");
        data17.add("#054");
        data17.add("#017");
        data17.add("#077");
        data17.add("#085");
        data17.add("#0041");
        data17.add("#019");
        data17.add("#916");
        data17.add("#055");
        data17.add("#013");
        data17.add("#071");
        data17.add("#082");

        List<String> data18 = new ArrayList<String>();
        data18.add("Name");
        data18.add("ab");
        data18.add("apm");
        data18.add("cluv");
        data18.add("bdz");
        data18.add("fgn");
        data18.add("hkp");
        data18.add("qrv");
        data18.add("ab");
        data18.add("apm");
        data18.add("cluv");
        data18.add("bdz");
        data18.add("fgn");
        data18.add("hkp");
        data18.add("qrv");

        List<String> data19 = new ArrayList<String>();
        data19.add("Price");
        data19.add("100");
        data19.add("150");
        data19.add("100");
        data19.add("250");
        data19.add("250");
        data19.add("300");
        data19.add("200");
        data19.add("100");
        data19.add("150");
        data19.add("100");
        data19.add("250");
        data19.add("250");
        data19.add("300");
        data19.add("200");

        List<String> data20 = new ArrayList<String>();
        data20.add("Color");
        data20.add("white");
        data20.add("black");
        data20.add("mixed");
        data20.add("black");
        data20.add("blue");
        data20.add("pink");
        data20.add("yellow");
        data20.add("white");
        data20.add("black");
        data20.add("mixed");
        data20.add("black");
        data20.add("blue");
        data20.add("pink");
        data20.add("yellow");

        List<String> data21 = new ArrayList<String>();
        data21.add("Size");
        data21.add("XL");
        data21.add("L");
        data21.add("XL");
        data21.add("XL");
        data21.add("XXL");
        data21.add("XL");
        data21.add("L");
        data21.add("XL");
        data21.add("L");
        data21.add("XL");
        data21.add("XL");
        data21.add("XXL");
        data21.add("XL");
        data21.add("L");

        List<String> data22 = new ArrayList<String>();
        data22.add("Date");
        data22.add("12-10-2024");
        data22.add("12-10-2023");
        data22.add("11-07-2023");
        data22.add("10-05-2021");
        data22.add("05-01-2015");
        data22.add("25-08-2024");
        data22.add("23-06-2024");
        data22.add("12-10-2024");
        data22.add("12-10-2023");
        data22.add("11-07-2023");
        data22.add("10-05-2021");
        data22.add("05-01-2015");
        data22.add("25-08-2024");
        data22.add("23-06-2024");

        TableData td17 = new TableData(data17);
        TableData td18 = new TableData(data18);
        TableData td19 = new TableData(data19);
        TableData td20 = new TableData(data20);
        TableData td21 = new TableData(data21);
        TableData td22 = new TableData(data22);

        list4.add(td17);
        list4.add(td18);
        list4.add(td19);
        list4.add(td20);
        list4.add(td21);
        list4.add(td22);
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

    public List<TableData> getList4() {
        return list4;
    }

    public void setList4(List<TableData> list4) {
        this.list4 = list4;
    }

    public List<TableData> delete_list3_data(int index){
        for (TableData data : getList3()) {
            data.getElements().remove(index);
        }

        return re_total();
    }

    public List<TableData> add_list3_data(String pid){
        //search index of pid
        boolean flag = false;
        int index = 0;
        List<String>  abc = list3.get(1).getElements();

        for(int i=0; i<abc.size();i++){
            if(abc.get(i).equals(pid)){
                index = i;
                flag = true;
            }
        }

        if(flag){
            System.out.println("Duplicate ID :" +pid);

            String value1 = list3.get(3).getElements().get(index);
            int amount = Integer.parseInt(value1);
            list3.get(3).getElements().set(index,(++amount)+"");
            System.out.println("amount:"+amount);

            String value2 = list3.get(4).getElements().get(index);
            int per_item_price = Integer.parseInt(value2);
            System.out.println("per item:"+per_item_price);

            String value3 = list3.get(5).getElements().get(index);
            int total_price = per_item_price * amount;
            list3.get(5).getElements().set(index,total_price+"");
            System.out.println("total:"+total_price);
        }
        else {
            System.out.println("New ID Added:" +pid);

            list3.get(0).getElements().remove(list3.get(0).getElements().size()-1);
            list3.get(0).getElements().add(list3.get(0).getElements().size()+"");
            list3.get(0).getElements().add("");

            list3.get(1).getElements().remove(list3.get(1).getElements().size()-1);
            list3.get(1).getElements().add(pid);
            list3.get(1).getElements().add("");

            list3.get(2).getElements().remove(list3.get(2).getElements().size()-1);
            list3.get(2).getElements().add("It is an item");
            list3.get(2).getElements().add("");

            list3.get(3).getElements().remove(list3.get(3).getElements().size()-1);
            list3.get(3).getElements().add(1+"");
            list3.get(3).getElements().add("");

            list3.get(4).getElements().remove(list3.get(4).getElements().size()-1);
            list3.get(4).getElements().add(17+"");
            list3.get(4).getElements().add("");

            list3.get(5).getElements().remove(list3.get(5).getElements().size()-1);
            list3.get(5).getElements().add(17+"");
            list3.get(5).getElements().add("");

            list3.get(6).getElements().remove(list3.get(6).getElements().size()-1);
            list3.get(6).getElements().add("X");
            list3.get(6).getElements().add("");
        }


        return re_total();
    }

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

    public static List<TableData> get_mock_filter_list() {
        List<TableData> mock_list = new ArrayList<TableData>();

        List<String> data1 = new ArrayList<String>();
        data1.add("ID");
        List<String> data2 = new ArrayList<String>();
        data2.add("Name");
        List<String> data3 = new ArrayList<String>();
        data3.add("Price");
        List<String> data4 = new ArrayList<String>();
        data4.add("Color");
        List<String> data5 = new ArrayList<String>();
        data5.add("Size");
        List<String> data6 = new ArrayList<String>();
        data6.add("Date");

        TableData td1 = new TableData(data1);
        TableData td2 = new TableData(data2);
        TableData td3 = new TableData(data3);
        TableData td4 = new TableData(data4);
        TableData td5 = new TableData(data5);
        TableData td6 = new TableData(data6);

        mock_list.add(td1);
        mock_list.add(td2);
        mock_list.add(td3);
        mock_list.add(td4);
        mock_list.add(td5);
        mock_list.add(td6);

        return mock_list;
    }
}
