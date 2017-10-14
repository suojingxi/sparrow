package com.sonymm.sparrow.service.impl;

import com.sonymm.sparrow.common.service.impl.BaseServiceImpl;
import com.sonymm.sparrow.model.SparrowUser;
import com.sonymm.sparrow.service.SparrowUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @Author suojx(1466200463@qq.com)
 * @Date 2017/10/14 10:01
 */
@Service("sparrowUserService")
public class SparrowUserServiceImpl extends BaseServiceImpl<SparrowUser> implements SparrowUserService {
    private static Logger logger = LoggerFactory.getLogger(SparrowUserServiceImpl.class);

    @Override
    public SparrowUser selectSparrowUserByUserName(String userName) {
        Example sparrowUserExample = new Example(SparrowUser.class, true, true);
        sparrowUserExample.createCriteria().andEqualTo("userName", userName);
        return selectOneByExample(sparrowUserExample);
    }
}
