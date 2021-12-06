package com.gao.service;


import com.gao.entity.User;

public interface FaceEngineService {

    User detectFaces(String file);
}
