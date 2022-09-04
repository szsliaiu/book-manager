package com.book.manager.util.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 归还 vo对象
 * @Date 2022/9/2 11:24
 * @Author by panjinsheng
 */
@Data
public class BackOut extends BookOut{

    @ApiModelProperty("借阅时间")
    private String borrowTime;

    @ApiModelProperty("应还时间")
    private String endTime;

    @ApiModelProperty("是否逾期")
    private String late;

}
