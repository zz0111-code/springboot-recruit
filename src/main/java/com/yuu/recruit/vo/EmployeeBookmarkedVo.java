package com.yuu.recruit.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 雇员收藏视图展示对象
 *
 * @Classname EmployeeBookmarVo
 * @see com.yuu.recruit.vo
 */
@Data
public class EmployeeBookmarkedVo implements Serializable {
    /**
     * 雇员收藏任务ID
     */
    private Long id;

    /**
     * 任务
     */
    private TaskVo taskVo;

}
