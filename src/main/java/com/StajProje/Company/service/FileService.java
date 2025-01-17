package com.StajProje.Company.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileService {

    String uploadFile(MultipartFile file);
    List<String> uploadFiles(List<MultipartFile> files);
    void deleteFile(String fileName);

}

