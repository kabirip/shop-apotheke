package com.shopapotheke.controllers;

import com.shopapotheke.models.github.GithubRepoResponse;
import com.shopapotheke.service.GithubRepoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/github-repos")
@Slf4j
public class GithubRepoController {

    private final GithubRepoService githubRepoService;

    public GithubRepoController(GithubRepoService githubRepoService) {
        this.githubRepoService = githubRepoService;
    }

    @GetMapping
    public ResponseEntity<GithubRepoResponse> getRepos(
            @RequestParam String repoCreationDate,
            @RequestParam int limit,
            @RequestParam String language
    ) {
        log.info("we are here");
        return ResponseEntity.ok(
                githubRepoService.getRepos(repoCreationDate, language, limit)
        );
    }

}
