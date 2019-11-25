package cn.bdqn.service.impl;


import cn.bdqn.entity.Address;
import cn.bdqn.mapper.AddressMapper;
import cn.bdqn.service.IAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Created by 杨龙 on 2019/11/23.
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper,Address> implements IAddressService{
}
