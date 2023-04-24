package com.yuu.recruit.service;

import com.yuu.recruit.domain.UserMessage;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserMessageService{

    /**
     * 保存信息
     *
     * @param userMessage
     * @return
     */
    UserMessage save(UserMessage userMessage);

    UserMessage getUsername(String username);


//    UserMessage getByUid(int uid);

}
