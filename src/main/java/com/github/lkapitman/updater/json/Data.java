package com.github.lkapitman.updater.json;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private DataMaintenance maintenance;
    private List<DataFile> files = new ArrayList<DataFile>();
    private List<String> ignoreFiles = new ArrayList<String>();


    public DataMaintenance getMaintenance() {
        return maintenance;
    }

    public List<DataFile> getFiles() {
        return files;
    }

    public List<String> getIgnoreFiles() {
        return ignoreFiles;
    }

    public void setMaintenance(DataMaintenance maintenance) {
        this.maintenance = maintenance;
    }

    public void setFiles(List<DataFile> files) {
        this.files = files;
    }

    public void setIgnoreFiles(List<String> ignoreFiles) {
        this.ignoreFiles = ignoreFiles;
    }
}
