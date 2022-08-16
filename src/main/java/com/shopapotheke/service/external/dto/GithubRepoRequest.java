package com.shopapotheke.service.external.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class GithubRepoRequest {

    private String creationDate;
    private String language;
    private int limit;
}
