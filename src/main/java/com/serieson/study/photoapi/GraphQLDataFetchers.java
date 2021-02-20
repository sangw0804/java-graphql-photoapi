package com.serieson.study.photoapi;

import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GraphQLDataFetchers {
    private List<Photo> photos = new ArrayList<>();

    public DataFetcher totalPhotosDataFetcher() {
        return dataFetchingEnvironment -> photos.size();
    }

    public DataFetcher postPhotoDataFetcher() {
        return dataFetchingEnvironment -> {
            try {
                String name = dataFetchingEnvironment.getArgument("name");
                String description = dataFetchingEnvironment.getArgument("description");
                Photo created = new Photo(name, description);
                photos.add(created);
                return created;
            } catch (Exception e) {
                return null;
            }
        };
    }

    public DataFetcher allPhotosDataFetcher() {
        return dataFetchingEnvironment -> photos;
    }
}

