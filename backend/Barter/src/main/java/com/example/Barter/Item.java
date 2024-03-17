package com.example.Barter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "items")
public class Item {

    @Id
    private String Id;
    private String name;
    private String description;
    private String posterId;
    private Map<String, Map<String, String>> comments;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPosterId(String posterId) {
        this.posterId = posterId;
    }

    public void setComments(Map<String, Map<String, String>> comments) {
        this.comments = comments;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.Id;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPosterId() {
        return this.posterId;
    }

    public Map<String, Map<String, String>> getComments() {
        return this.comments;
    }
}
