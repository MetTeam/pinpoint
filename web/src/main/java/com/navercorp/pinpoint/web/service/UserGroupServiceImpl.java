/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navercorp.pinpoint.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navercorp.pinpoint.web.dao.UserGroupDao;

/**
 * @author minwoo.jung
 */
@Service
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    UserGroupDao userGroupDao;
    
    @Override
    public void createUserGroup(String userGroupId) {
        userGroupDao.createUserGroup(userGroupId);
    }

    @Override
    public List<String> selectUserGroupList() {
        return null;
    }

    @Override
    public void updateUserGroup() {
    }

    @Override
    public void deleteUserGroup(String userGroupId) {
        userGroupDao.deleteUserGroup(userGroupId);
    }

}