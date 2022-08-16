package com.shopapotheke.service;

import com.shopapotheke.models.RepositoryLimit;
import com.shopapotheke.models.github.GithubRepoResponse;
import com.shopapotheke.service.external.GithubApiService;
import com.shopapotheke.service.external.dto.GithubRepoRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GithubRepoService {

    private final GithubApiService githubApiService;

    public GithubRepoService(GithubApiService githubApiService) {
        this.githubApiService = githubApiService;
    }

    public GithubRepoResponse getRepos(String creationDate, String language, int limit) {
        RepositoryLimit.toRepositoryLimit(limit);

        GithubRepoRequest query = GithubRepoRequest.builder()
                .language(language)
                .creationDate(creationDate)
                .limit(limit)
                .build();

        return githubApiService.searchRepos(query);
    }
}
