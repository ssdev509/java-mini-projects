package com.sahil;

import java.util.Map;

public class Directory extends Node{
    private Map<String, Node> contents;
    private Directory parent;

    public Directory(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Node> getContents() {
        return contents;
    }

    public void setContents(Map<String, Node> contents) {
        this.contents = contents;
    }

    public String pwdIterative(){
        StringBuilder path = new StringBuilder(this.getName());
        Directory curr = this.getParent();
        while(curr.getParent() != curr){
            path = new StringBuilder(curr.getName()).append("/").append(path);
            curr = curr.getParent();
        }
        if(path.toString().equals("/")){
            return path.toString();
        }
        return new StringBuilder().append("/").append(path).toString();
    }

    public String pwdRecursive(){
        if(this.getParent() == this) {
            return "";
        }
        return this.getParent().pwdRecursive().toString() + "/"+ this.name;
    }
}
