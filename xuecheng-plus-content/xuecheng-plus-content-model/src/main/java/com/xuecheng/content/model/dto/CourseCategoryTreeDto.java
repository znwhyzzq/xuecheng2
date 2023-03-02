package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @description 课程分类树型结点dto
 * @author ZZQ
 * @Date 2023/3/2
 * @apiNote
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory implements Serializable {
    List childrenTreeNodes;
}
