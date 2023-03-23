package com.pluralsight.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pluralsight.entity.Release;
import com.pluralsight.repository.ReleaseRepository;

@Component
public class ReleaseQuery implements GraphQLQueryResolver {
    private ReleaseRepository releaseRepository;

    public ReleaseQuery(ReleaseRepository releaseRepository) {
        this.releaseRepository = releaseRepository;
    }

    public Iterable<Release> findAllReleases() {
        return releaseRepository.findAll();
    }

    public Long countReleases() {
        return releaseRepository.count();
    }
    
}
