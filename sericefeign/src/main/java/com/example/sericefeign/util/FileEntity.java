package com.example.sericefeign.util;

import org.springframework.web.multipart.MultipartFile;

public class FileEntity {
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
