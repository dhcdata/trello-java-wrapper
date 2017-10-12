package com.julienvey.trello.impl.domaininternal;

public class Label {
    // private String value;
    private String color;
    private String name;

    public Label() {
    }

    public Label(String value) {
      String[] parts = value.split(",", 2);
      color = parts[0].trim();
      if(parts.length>1) name = parts[1].trim();
    }

    public String getColor() {
      return color;
    }

    public String getName() {
      return name;
    }

    public void setColor(String color) {
      this.color = color;
    }

    public void setName(String name){
      this.name = name;
    }
}
