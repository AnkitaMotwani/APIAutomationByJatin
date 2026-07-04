package org.example.models.request;

public class Files {
    private String name;

    public String getFileName() {
        return fileName;
    }

    public Files(String name, String fileName, String contentType) {
        this.name = name;
        this.fileName = fileName;
        this.contentType = contentType;
    }

    @Override
    public String toString() {
        return "Files{" +
                "name='" + name + '\'' +
                ", fileName='" + fileName + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    private String fileName;
     private String contentType;
}
