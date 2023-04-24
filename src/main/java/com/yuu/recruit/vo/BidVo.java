package com.yuu.recruit.vo;

import com.yuu.recruit.domain.Employee;
import com.yuu.recruit.domain.Task;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 任务投标视图展示对象
 *
 * @author by zz
 * @Classname BidVo
 * @Date 2022/10/10 10:20
 * @see com.yuu.recruit.vo
 */
@Data
public class BidVo implements Serializable {
    private static final long serialVersionUID = 3975866737778834292L;
    /**
     * 投标ID
     */
    private Long id;

    /**
     * 职业者ID
     */
    private Employee employee;

    /**
     * 投标价格
     */
    private Double bidPrice;

    /**
     * 交货时间描述
     */
    private String deliveryDesc;

    /**
     * 交货时间
     */
    private String deliveryTime;

    /**
     * 竞标状态，0 未中标，1 已中标
     */
    private Byte bidStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 竞标任务信息
     */
    private Task task;
}
