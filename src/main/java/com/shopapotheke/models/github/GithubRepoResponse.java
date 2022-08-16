package com.shopapotheke.models.github;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GithubRepoResponse {

    @JsonProperty("total_count")
    private int count;

    @JsonProperty("items")
    private List<GithubRepo> repositories;

    public int getCount() {
        return count;
    }

    public List<GithubRepo> getRepositories() {
        return repositories;
    }
}
