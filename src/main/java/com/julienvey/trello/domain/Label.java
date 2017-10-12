package com.julienvey.trello.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Label extends TrelloEntity {

    private String color;
    private String name;

    public Label() {
    }

    public Label(String value) {
      String[] parts = value.split(",", 2);
      color = parts[0].trim();
      if(parts.length>1) name = parts[1].trim();
    }

    /* Accessors */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
