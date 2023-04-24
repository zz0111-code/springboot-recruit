package com.yuu.recruit.service.impl;

import com.yuu.recruit.domain.UserMessage;
import com.yuu.recruit.mapper.UserMessageMapper;
import com.yuu.recruit.service.UserMessageService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public class UserMessageServiceImpl implements UserMessageService {

    @Resource
    private UserMessageMapper userMessageMapper;

    @Override
    public UserMessage save(UserMessage userMessage) {
        userMessageMapper.insertSelective(userMessage);
        UserMessage currUserMsg = userMessageMapper.selectByPrimaryKey(userMessage);
        return currUserMsg;
    }

    @Override
    public UserMessage getUsername(String username) {
        // 构造查询条件
        Example example = new Example(UserMessage.class);
        // 按用户名查询
        example.createCriteria().andEqualTo("username", username);
        UserMessage userMessage = userMessageMapper.selectByPrimaryKey(example);
        return userMessage;
    }

//    @Override
//    public UserMessage getByUid(int uid) {
//        // 通过id查询信息
//        UserMessage userMessage = userMessageMapper.selectByPrimaryKey(uid);
//
//        Example example = new Example(UserMessage.class);
//        example.createCriteria().andEqualTo("userMessage", userMessage.getUId());
//
//        return userMessage;
//    }
}
