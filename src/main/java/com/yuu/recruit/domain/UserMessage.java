package com.yuu.recruit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_message")
public class UserMessage implements Serializable {
    @Id
    @Column(name = "u_id")
    private Integer uId;

    /**
     * 消息发送者
     */
    @Column(name = "username")
    private String username;

    /**
     * 聊天文本
     */
    @Column(name = "message")
    private String message;

    /**
     * 消息接受者
     */
    @Column(name = "tousername")
    private String tousername;

    /**
     * 发送时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

}


