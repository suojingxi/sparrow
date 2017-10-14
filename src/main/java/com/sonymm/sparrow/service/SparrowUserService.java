package com.sonymm.sparrow.service;

import com.sonymm.sparrow.common.service.BaseService;
import com.sonymm.sparrow.model.SparrowUser;

public interface SparrowUserService extends BaseService<SparrowUser> {
    public SparrowUser selectSparrowUserByUserName(String userName);
}
