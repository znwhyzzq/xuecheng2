package com.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 添加课程dto
 * @author ZZQ
 * @Date 2023/3/2
 * @apiNote
 */
@Data
@ApiModel(value="EditCourseDto", description="修改课程基本信息")
public class EditCourseDto extends AddCourseDto {

    @ApiModelProperty(value = "课程名称", required = true)
    private Long id;

}