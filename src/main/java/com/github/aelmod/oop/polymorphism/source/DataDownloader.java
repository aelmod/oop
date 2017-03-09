package com.github.aelmod.oop.polymorphism.source;

import java.util.ArrayList;
import java.util.List;

public class DataDownloader {
    private List<DownloadStrategy> downloadStrategies = new ArrayList<>();

    public DataDownloader() {
        downloadStrategies.add(new DownloadStrategyByFile());
        downloadStrategies.add(new DownloadStrategyByUrl());
    }

    public Data getDataUsingStrategies(String path) {
        for (DownloadStrategy downloadStrategy : downloadStrategies) {
            String data = downloadStrategy.getData(path);
            if (data != null) return new Data(data, path);
        }
        throw new IllegalStateException("No have strategies for this protocol!");
    }
}
