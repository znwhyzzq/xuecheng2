package com.xuecheng.content.service;
import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @description 课程基本信息管理业务接口
 * @author ZZQ
 * @Date 2023/3/1
 * @apiNote
 */
public interface CourseBaseInfoService {
    /**
     * @description 课程查询接口
     * @param pageParams 分页参数
     * @param queryCourseParamsDto 条件条件
     * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
     * @author ZZQ
     * @Date 2023/3/1
     * @apiNote
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
    /**
     * @description 添加课程基本信息
     * @param companyId  教学机构id
     * @param addCourseDto  课程基本信息
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @author ZZQ
     * @Date 2023/3/2
     * @apiNote
     */
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);
    /**
     * @description 添加课程基本信息
     * @param courseId  课程id
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @author ZZQ
     * @Date 2023/3/2
     * @apiNote
     */
    CourseBaseInfoDto getCourseBaseInfo(long courseId);
    /**
     * @description 修改课程信息
     * @param companyId  机构id
     * @param dto  课程信息
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @author ZZQ
     * @Date 2023/3/2
     * @apiNote
     */
     CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto dto);

}
