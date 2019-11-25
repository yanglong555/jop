package cn.bdqn.service.impl;

import cn.bdqn.entity.User;
import cn.bdqn.mapper.UserMapper;
import cn.bdqn.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wpf
 * @since 2019-11-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
