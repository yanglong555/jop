package cn.bdqn.controller;


import cn.bdqn.entity.Address;

import cn.bdqn.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wpf
 * @since 2019-11-23
 */
@Controller
@RequestMapping("/smbms/address")
public class AddressController{

   @Autowired
  private IAddressService i;


    @RequestMapping("/selectAllAddress")
    public  String selectAll(Model model){
        List<Address> list = i.list();
        model.addAttribute("addressList",list);
        return  "selectAllAddress";
    }
}
