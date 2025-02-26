package org.reservior.secure_ui.controller.equinox_view;

import org.reservior.secure_ui.model.about.AboutDataInfo;
import org.reservior.secure_ui.model.account.SignInFormData;
import org.reservior.secure_ui.model.navigation.bar.EquinoxViewNavigationBar;
import org.reservior.secure_ui.model.navigation.processor.EquinoxViewNavigationProcessor;
import org.reservior.secure_ui.model.product.*;
import org.reservior.secure_ui.model.table.SampleTableInfo;
import org.reservior.secure_ui.model.table.TableData;
import org.reservior.secure_ui.model.user.UserInfo;
import org.reservior.secure_ui.model.user.UserInfoData;
import org.reservior.secure_ui.model.user.UserSessionManagement;
import org.reservior.secure_ui.model.utility.PerformUtility;
import org.reservior.secure_ui.service.InvoiceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

//in the Name of Allah
@Controller
@RequestMapping("view")
public class EquinoxViewController {
    //navfp -> nav fragment path , navf -> nav fragment
    //nav_bar -> nav bar data
   // redirect:/ is a request path

    private EquinoxViewNavigationBar nav_bar = new EquinoxViewNavigationBar();
    private LeftDrawerFilter left_filter = new LeftDrawerFilter();
    private RightDrawerFilter right_filter = new RightDrawerFilter();
    private SearchFilter search_filter = new SearchFilter();
    private SampleTableInfo info_wishlist = new SampleTableInfo();
    private String pdflink = "";
    private String pdflinkv= "visibility:collapse;";
    private int view_amount = 0;
    private int []viewers = new int[]{0,0,0,0};
    private String sign_in_error = "";

    ConcurrentHashMap<String,String> user_map = new ConcurrentHashMap<String,String>();


    @RequestMapping("ev")
    private String display(Model model,HttpSession session) {
        System.out.println("received request at ev : equinox view controller ");
        view_amount++;
        viewers = PerformUtility.number_to_digit(view_amount,viewers);

        EquinoxViewNavigationBar bar = EquinoxViewNavigationProcessor.process_main_tabs(0,8,nav_bar);

        model.addAttribute("nav_bar",bar);
        //model.addAttribute("navfp","webapp/resplendent/nav_bottom/landing/landing.html");
        model.addAttribute("navfp","resplendent/nav_bottom/landing/landing");
        model.addAttribute("navf", "fragment_landing");
        model.addAttribute("ld_filter",left_filter);
        model.addAttribute("rd_filter",right_filter);
        model.addAttribute("search_filter",search_filter);

        //session
        model.addAttribute("user_map",user_map);

        configure_session(session,model,0);
        //return "webapp/resplendent/equinox_view";
        return "resplendent/equinox_view"; // it is directory path

        //return "redirect:/view/ev"; // it is request path
    }

    @RequestMapping("search")
    private String search(Model model,HttpSession session) {
        System.out.println("received request at search : equinox view controller ");

        EquinoxViewNavigationBar bar = EquinoxViewNavigationProcessor.process_main_tabs(0,8,nav_bar);

        model.addAttribute("nav_bar",bar);
        //model.addAttribute("navfp","webapp/resplendent/nav_bottom/samples/samples");
        model.addAttribute("navfp","resplendent/nav_bottom/samples/samples");
        model.addAttribute("navf", "fragment_samples");
        model.addAttribute("find_list", ProductDataInfo.get_data());
        model.addAttribute("ld_filter",left_filter);
        model.addAttribute("rd_filter",right_filter);
        model.addAttribute("search_filter",search_filter);

        //session
        model.addAttribute("user_map",user_map);

        configure_session(session,model,1);
        //return "webapp/resplendent/equinox_view";
        return "resplendent/equinox_view"; // html directory path
    }

    @PostMapping("search")
    private String search_filter(@Valid SearchFilter filter, BindingResult result) {
        System.out.println("search item: "+filter.getData());

        return "redirect:/view/samples";
    }

    @RequestMapping("trending")
    private String trending(Model model, HttpSession session) {
        System.out.println("received request at trending : equinox view controller ");

        EquinoxViewNavigationBar bar = EquinoxViewNavigationProcessor.process_main_tabs(1,8,nav_bar);

        model.addAttribute("nav_bar",bar);
        //model.addAttribute("navfp", "webapp/resplendent/nav_bottom/trending/trending");
        model.addAttribute("navfp", "resplendent/nav_bottom/trending/trending");
        model.addAttribute("navf", "fragment_trending");
        model.addAttribute("trend_list", ProductDataInfo.get_data());
        model.addAttribute("man_list", ProductDataInfo.get_data());
        model.addAttribute("woman_list", ProductDataInfo.get_data());
        model.addAttribute("child_list", ProductDataInfo.get_data());
        model.addAttribute("v1_digit",viewers[3]);
        model.addAttribute("v2_digit",viewers[2]);
        model.addAttribute("v3_digit",viewers[1]);
        model.addAttribute("v4_digit",viewers[0]);
        model.addAttribute("ld_filter",left_filter);
        model.addAttribute("rd_filter",right_filter);
        model.addAttribute("search_filter",search_filter);

        //session
        model.addAttribute("user_map",user_map);

        configure_session(session,model,2);
        //return "webapp/resplendent/equinox_view";
        return "resplendent/equinox_view"; //  html directory path
    }

    @RequestMapping("about")
    private String about(Model model,HttpSession session) {
        System.out.println("received request at about : equinox view controller ");

        SampleTableInfo info = new SampleTableInfo();
        EquinoxViewNavigationBar bar = EquinoxViewNavigationProcessor.process_main_tabs(2,8,nav_bar);

        model.addAttribute("nav_bar",bar);
        //model.addAttribute("navfp","webapp/resplendent/nav_bottom/about/about");
        model.addAttribute("navfp","resplendent/nav_bottom/about/about");
        model.addAttribute("navf", "fragment_about");
        model.addAttribute("list1",info.getList1());
        model.addAttribute("listp",info.getListp());
        model.addAttribute("listq",info.getListq());
        model.addAttribute("authority", AboutDataInfo.get_about_info());
        model.addAttribute("ld_filter",left_filter);
        model.addAttribute("rd_filter",right_filter);
        model.addAttribute("search_filter",search_filter);

        //session
        model.addAttribute("user_map",user_map);

        configure_session(session,model,3);
        //return "webapp/resplendent/equinox_view";
        return "resplendent/equinox_view"; //html directory path
    }

    @RequestMapping("contact")
    private String contact(Model model,HttpSession session) {
        System.out.println("received request at contact : equinox view controller ");

        EquinoxViewNavigationBar bar = EquinoxViewNavigationProcessor.process_main_tabs(3,8,nav_bar);

        model.addAttribute("nav_bar",bar);
        //model.addAttribute("navfp","webapp/resplendent/nav_bottom/contact/contact");
        model.addAttribute("navfp","resplendent/nav_bottom/contact/contact");
        model.addAttribute("navf", "fragment_contact");
        model.addAttribute("ld_filter",left_filter);
        model.addAttribute("rd_filter",right_filter);
        model.addAttribute("search_filter",search_filter);

        //session
        model.addAttribute("user_map",user_map);

        configure_session(session,model,4);
        //return "webapp/resplendent/equinox_view";
        return "resplendent/equinox_view"; //html directory path
    }

    @RequestMapping("samples")
    private String samples(Model model,HttpSession session) {
        System.out.println("received request at samples : equinox view controller ");

        EquinoxViewNavigationBar bar = EquinoxViewNavigationProcessor.process_main_tabs(4,8,nav_bar);

        model.addAttribute("nav_bar",bar);
        //model.addAttribute("navfp","webapp/resplendent/nav_bottom/samples/samples");
        model.addAttribute("navfp","resplendent/nav_bottom/samples/samples");
        model.addAttribute("navf", "fragment_samples");
        model.addAttribute("find_list", ProductDataInfo.get_data());
        model.addAttribute("ld_filter",left_filter);
        model.addAttribute("rd_filter",right_filter);
        model.addAttribute("search_filter",search_filter);

        //session
        model.addAttribute("user_map",user_map);

        configure_session(session,model,5);
        //return "webapp/resplendent/equinox_view";
        return "resplendent/equinox_view"; // html directory path
    }

    @PostMapping("samples/price_range")
    private String price_filter(@Valid LeftDrawerFilter filter, BindingResult result){
        System.out.println(filter.getMin_price()+"....."+filter.getMax_price());

        return "redirect:/view/samples";
    }

    @PostMapping("samples/lft")
    private String left_drawer_filter(@Valid LeftDrawerFilter filter, BindingResult result){
        System.out.println(filter.getCtype()+"....."+filter.getStype()+"....."+filter.getDiscount());

        return "redirect:/view/samples";
    }

    @PostMapping("samples/rft")
    private String right_drawer_filter(@Valid RightDrawerFilter filter, BindingResult result){
        System.out.println(filter.getCltype()+"....."+filter.getColor());

        return "redirect:/view/samples";
    }

    @RequestMapping("wishlist")
    private String wishlist(Model model, HttpSession session) {
        System.out.println("received request at wishlist : equinox view controller ");

        EquinoxViewNavigationBar bar = EquinoxViewNavigationProcessor.process_main_tabs(5,8,nav_bar);

        model.addAttribute("nav_bar",bar);
        //model.addAttribute("navfp","webapp/resplendent/nav_bottom/wishlist/wishlist");
        model.addAttribute("navfp","resplendent/nav_bottom/wishlist/wishlist");
        model.addAttribute("navf", "fragment_wishlist");
        model.addAttribute("ld_filter",left_filter);
        model.addAttribute("rd_filter",right_filter);
        model.addAttribute("search_filter",search_filter);
        model.addAttribute("list3",info_wishlist.getList3());
        model.addAttribute("pdflink",pdflink);
        model.addAttribute("pdflinkv",pdflinkv);

        //session
        model.addAttribute("user_map",user_map);

        configure_session(session,model,6);
        //return "webapp/resplendent/equinox_view";
        return "resplendent/equinox_view"; // html directory path
    }

    @PostMapping("wishlist/add")
    private String on_wishlist_item_add(Model model,Product data){
        // the parameter data must refer to thymeleaf object value [hint: input hidden]
         System.out.println("product Id: "+data.getPid());

         List<TableData> item =  info_wishlist.add_list3_data(data.getPid());
         model.addAttribute("list3",item);

        return "redirect:/view/wishlist";
    }

    @PostMapping("wishlist/delete")
    private String on_wishlist_item_delete(Model model,int index){
        System.out.println("delete item called at "+(index-1));
        List<TableData> data = info_wishlist.delete_list3_data(index);
        model.addAttribute("list3",data);

        return "redirect:/view/wishlist";
    }

    @PostMapping("wishlist/bill")
    private void on_wishlist_bill(Model model, HttpServletRequest request, HttpServletResponse response){
        System.out.println("bill : request");
//        pdflink = java.util.UUID.randomUUID().toString();
//        model.addAttribute("pdflink", pdflink);
//        pdflinkv = "visibility:visible;";
//        model.addAttribute("pdflinkv", pdflinkv);

        InvoiceService.pdf_exporter(request, response);

    }

    @RequestMapping("account")
    private String account(Model model,HttpSession session) {
        System.out.println("received request at account : equinox view controller ");

        EquinoxViewNavigationBar bar = EquinoxViewNavigationProcessor.process_main_tabs(6,8,nav_bar);

        model.addAttribute("nav_bar",bar);
        //model.addAttribute("navfp","webapp/resplendent/nav_bottom/account/account.html");
        model.addAttribute("navfp","resplendent/nav_bottom/account/account");
        model.addAttribute("navf", "fragment_account");
        model.addAttribute("ld_filter",left_filter);
        model.addAttribute("rd_filter",right_filter);
        model.addAttribute("search_filter",search_filter);
        model.addAttribute("background_img01","/image/nav_bar/accounts/dark_forest.jpg");
        //model.addAttribute("sectionfp","webapp/resplendent/nav_bottom/account/profile_card.html");
        model.addAttribute("sectionfp","resplendent/nav_bottom/account/profile_card");
        model.addAttribute("sectionf", "fragment_profile_card");

        //model user_inputs
        model.addAttribute("sign_in_form_data", new SignInFormData());
        model.addAttribute("sign_in_error",sign_in_error);

        //session
        model.addAttribute("user_map",user_map);

        configure_session(session,model,7);
        //return "webapp/resplendent/equinox_view";
        return "resplendent/equinox_view"; // html directory path
    }


    @PostMapping("account/sign_in")
    private String on_account_sign_in(Model model, SignInFormData form_data, HttpSession session){

        UserInfo info = UserInfoData.check_user(form_data.getUser_id(), form_data.getPassword());
        if(info==null){
            System.out.println("Invalid User");
            sign_in_error = "Invalid Form Information";
            model.addAttribute("sign_in_error",sign_in_error);

            String sign_in_sections ="display:none;";
            session.setAttribute("sign_in_sections",sign_in_sections);
            session.setAttribute("user","empty");
        }
        else {
            System.out.println("Valid User");
            sign_in_error = "";
            model.addAttribute("sign_in_error",sign_in_error);

            String sign_in_sections = "display:block;";
            session.setAttribute("sign_in_sections",sign_in_sections);

            int x = UserSessionManagement.session_handler(model,user_map,session,info.getUsername());
        }

        return "redirect:/view/account";
    }

    @PostMapping("account/sign_out")
    private String on_account_sign_out(Model model,HttpSession session){

        user_map.remove(session.getId());
        model.addAttribute("user_map",user_map);
        session.invalidate();

        return "redirect:/view/account";
    }

    private String bam(Model model,HttpSession session) {
        //@RequestMapping("bam")
        System.out.println("received request at bam : equinox view controller ");
        configure_session(session,model,10);

        EquinoxViewNavigationBar bar = EquinoxViewNavigationProcessor.process_main_tabs(0,8,nav_bar);

        model.addAttribute("nav_bar",bar);
        model.addAttribute("navfp","webapp/sample/results");
        model.addAttribute("navf", "fragmentX");

        //return "webapp/resplendent/equinox_view";
        return "resplendent/equinox_view"; // html directory path
    }

    private void configure_session(HttpSession session,Model model,int options){
        //options : ev=0, search=1, trending=2, about=3, contact=4..............

        user_map.forEach((key, value) -> {
            System.out.println(key+" has user : "+value);
        });
    }
}
