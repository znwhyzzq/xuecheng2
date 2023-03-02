package com.xuecheng.content.api;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZZQ
 * @Date 2023/3/2
 * @apiNote
 */
@Slf4j
@Api("课程分类相关接口")
@RestController
public class CourseCategoryController {
    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNodes() {
        return null;
    }
}
