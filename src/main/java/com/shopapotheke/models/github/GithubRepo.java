package com.shopapotheke.models.github;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GithubRepo {

    private long id;

    private String name;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("html_url")
    private String url;

    private String description;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("stargazers_count")
    private int stars;

    private String language;

    private String visibility;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getStars() {
        return stars;
    }

    public String getLanguage() {
        return language;
    }


    public String getVisibility() {
        return visibility;
    }

}
