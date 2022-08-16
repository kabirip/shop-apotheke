package com.shopapotheke.service.external;

import com.shopapotheke.models.github.GithubRepoResponse;
import com.shopapotheke.service.external.dto.GithubRepoRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class GithubApiService {

    private final RestTemplate restTemplate;
    private static final String GITHUB_REPO_URL = "https://api.github.com/search/repositories?q=" +
            "created:>%s&language=%s&page=%s&per_page=%s&&sort=stars&order=desc";

    public GithubApiService() {
        restTemplate = new RestTemplate();
    }

    public GithubRepoResponse searchRepos(GithubRepoRequest query) {
        log.info("Fetching github popular repos with query {}..", query);
        return restTemplate.getForObject(String.format(GITHUB_REPO_URL, query.getCreationDate(), query.getLanguage(),
                1, query.getLimit()), GithubRepoResponse.class);
    }

}
