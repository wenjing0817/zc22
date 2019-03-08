package com.zy.project.service.impl;

import com.zy.project.dao.ProjectDao;
import com.zy.project.pojo.Projects;
import com.zy.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao dao;

    @Override
    public List<Projects> getPro() {
        return dao.getPro();
    }
}
