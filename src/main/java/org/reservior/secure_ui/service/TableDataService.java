package org.reservior.secure_ui.service;

import org.javaEOX.comparison.SortData;
import org.javaEOX.comparison.SortType;
import org.javaEOX.duration.DurationOperation;
import org.javaEOX.utility.DebugUtility;
import org.reservior.secure_ui.model.table.SampleTableInfo;
import org.reservior.secure_ui.model.table.TableData;
import org.springframework.stereotype.Service;
import org.reservior.secure_ui.model.filter.DataFilter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TableDataService {
    public static List<TableData> apply_sort(DataFilter data_filter, List<TableData> data_list){
        if(data_filter==null || data_list==null){
            DebugUtility.println("Null Value");
            return null;
        }
        DebugUtility.println(data_filter.getSort_selection());

        List<String> id_list = new ArrayList<String>();
        List<String> date_list = new ArrayList<String>();
        List<Integer> price_list = new ArrayList<Integer>();

        for(int i=0;i<data_list.get(0).getElements().size();i++){
            if(i==0){
                continue;
            }
            id_list.add(data_list.get(0).getElements().get(i));
            price_list.add(Integer.parseInt(data_list.get(2).getElements().get(i)));
            date_list.add(data_list.get(data_list.size()-1).getElements().get(i));
        }

        List<String> processed_list = new ArrayList<String>();

        if(data_filter.getSort_selection().equals("Ascending")){
           processed_list =  SortData.sort_by_date(id_list,DurationOperation.get_plain_date_list_from_premium(date_list),SortType.ASCENDING);
          // processed_list = SortData.sort_by_price_integer(id_list,price_list,SortType.ASCENDING);
        }
        else if (data_filter.getSort_selection().equals("Descending")) {
           processed_list = SortData.sort_by_date(id_list,DurationOperation.get_plain_date_list_from_premium(date_list),SortType.DESCENDING);
          //  processed_list = SortData.sort_by_price_integer(id_list,price_list,SortType.DESCENDING);
        }

        List<TableData> result = SampleTableInfo.get_mock_filter_list();

        if(processed_list==null){
            return result;
        }
        DebugUtility.println("Dummy Writting: "+processed_list.toString());

        for(int i=0; i<processed_list.size();i++){
            String token = processed_list.get(i);
            int item_previous_index = data_list.get(0).getElements().lastIndexOf(token);

            for(int k=0;k<data_list.size();k++){
                String value = data_list.get(k).getElements().get(item_previous_index);

                if(!DurationOperation.get_date_premium(value).equals("dd-MM-yyyy") && data_filter.getDate_selection().equals("Premium")){
                    try {
                        SimpleDateFormat input_format = new SimpleDateFormat("dd-MM-yyyy");
                        Date date = input_format.parse(value);
                        SimpleDateFormat output_format = new SimpleDateFormat("MMMM dd, yyyy");
                        value = output_format.format(date);
                    }
                    catch (ParseException e) {
                    }
                }

                if(!DurationOperation.get_date_in_dd_mm_yyyy(value).equals("MMMM dd, yyyy") && data_filter.getDate_selection().equals("Plain")){
                    try {
                        SimpleDateFormat input_format = new SimpleDateFormat("MMMM dd, yyyy");
                        Date date = input_format.parse(value);
                        SimpleDateFormat output_format = new SimpleDateFormat("dd-MM-yyyy");
                        value = output_format.format(date);
                    }
                    catch (ParseException e) {
                    }
                }

                result.get(k).getElements().add(value);
            }
        }

        return result;
    }
}
