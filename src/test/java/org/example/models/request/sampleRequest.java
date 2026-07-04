package org.example.models.request;

import java.util.List;

public class sampleRequest {

    private List<Files> files;

    public sampleRequest(List<Files> files, String fullName, String userName, String email) {
        this.files = files;
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Files> getFiles() {
        return files;
    }

    public void setFiles(List<Files> files) {
        this.files = files;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String fullName;
    private String userName;
    private String email;
    @Override
    public String toString() {
        return "sampleRequest{" +
                "files=" + files +
                ", fullName='" + fullName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static class Builder
    {
        private List<Files> files;

        public Builder setFullName(String fullName) {
             this.fullName = fullName;
            return this;
        }

        public Builder setFiles(List<Files> files) {
            this.files = files;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        private String fullName;
        private String userName;
        private String email;

        public sampleRequest build()
        {
            sampleRequest request = new sampleRequest(files,fullName,userName,email);
            return request;
        }
    }
}
