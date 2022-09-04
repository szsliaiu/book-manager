package com.book.manager.util.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 分页返回
 * @Date 2022/9/2 20:53
 * @Author by panjinsheng
 */
@Data
public class PageOut {

    @ApiModelProperty("当前页")
    private Integer currPage;

    @ApiModelProperty("每页条数")
    private Integer pageSize;

    @ApiModelProperty("总数")
    private Integer total;

    @ApiModelProperty("数据")
    private Object list;
}
