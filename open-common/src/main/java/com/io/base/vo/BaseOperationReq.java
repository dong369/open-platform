package com.io.base.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * project - GitHub整理
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/2/28 时间:9:59
 * @JDK 1.8
 * @Description 功能模块：请求数据基础类
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseOperationReq {
    /**
     * 功能描述：id
     */
    private Integer id;

    /**
     * 功能描述：page
     */
    private Integer page;
    /**
     * 功能描述：size
     */
    private Integer size;
}