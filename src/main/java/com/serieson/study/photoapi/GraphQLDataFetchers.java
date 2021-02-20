package com.serieson.study.photoapi;

import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

@Component
public class GraphQLDataFetchers {
    public DataFetcher totalPhotosDataFetcher() {
        return dataFetchingEnvironment -> 42;
    }
}
