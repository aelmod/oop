package com.github.aelmod.oop.polymorphism.source;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DownloadStrategyByFile implements DownloadStrategy {
    @Override
    public String getData(String path) {
        File file = new File(path);
        String fileData = null;
        try {
            if (file.isFile()) {
                fileData = FileUtils.readFileToString(file, charset);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileData;
    }

}
