package com.funda.mybatis.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by wonjun-pc on 2016-06-24.
 */
public class ItemBean {

    MultipartFile file;


    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

}