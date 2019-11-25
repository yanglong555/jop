package cn.bdqn.controller;


import cn.bdqn.entity.User;
import cn.bdqn.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
 * @author 杨龙
 * @since 2019-11-19
 */
@Controller
@RequestMapping("/smbms/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/select")
    public String index(Model model){
        List<User> list = iUserService.list();
        System.out.print("size:"+list.size());
        model.addAttribute("list",list);
        return "select";
    }

    @RequestMapping("/insert")
    public  String insert(User user){
        return "insert";
    }

    @RequestMapping("/add")
    public  String addLogin(User user){
        boolean save = iUserService.save(user);
        return  "redirect:select";
    }

    @RequestMapping("/updata")
    public  String  updata(User user){
        QueryWrapper<User> query = new QueryWrapper<>();
        query.eq("id",user.getId());
        iUserService.update(user,query);
        return  "redirect:select";
    }

    @RequestMapping("/up")
    public String up(){

        return "updataByid";
    }

    @RequestMapping("/delete")
    public  String delete(){

        return "delete";
    }
    @RequestMapping("deleteByid")
    public String deleteByid(Long id){
        iUserService.removeById(id);
        return "redirect:select";
    }
}
