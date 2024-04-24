package com.example.treesintheorchard;

// This class is acting as: "Model Class"
// it represents tge data structure or individual data items
// that your adapter is going to display

public class Orchard {

    int orchardImg;
    String orchardName;

    public Orchard(int orchardImg, String orchardName) {
        this.orchardImg = orchardImg;
        this.orchardName = orchardName;
    }

    public int getOrchardImg() {
        return orchardImg;
    }

    public void setOrchardImg(int orchardImg) {
        this.orchardImg = orchardImg;
    }

    public String getOrchardName() {
        return orchardName;
    }

    public void setOrchardName(String orchardName) {
        this.orchardName = orchardName;
    }
}
