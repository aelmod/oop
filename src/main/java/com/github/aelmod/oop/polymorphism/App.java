package com.github.aelmod.oop.polymorphism;

import com.github.aelmod.oop.polymorphism.source.Data;
import com.github.aelmod.oop.polymorphism.source.DataDownloader;

public class App {
    public static void main(String[] args) {
        DataDownloader dataDownloader = new DataDownloader();
        Data dataFromUrl = dataDownloader.getDataUsingStrategies("http://example.com");
        System.out.println("Path: " + dataFromUrl.getPath() + "\n\n" + dataFromUrl.getData());
        Data dataFromFile = dataDownloader.getDataUsingStrategies("/home/aelmod/pony.txt");
        System.out.println("Path: " + dataFromFile.getPath() + "\n\n" + dataFromFile.getData());
    }
}
