package com.fiberhome.testgroup.freeman.mapper;

import com.fiberhome.testgroup.freeman.entity.ProjectEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface projectMapper {

    //添加项目
    Integer insertProject(ProjectEntity projectEntity);

    //删除项目
    Integer deleteProject();

    //

}
