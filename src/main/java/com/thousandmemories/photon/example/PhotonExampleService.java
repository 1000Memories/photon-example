package com.thousandmemories.photon.example;

import com.thousandmemories.photon.core.PhotoResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;

public class PhotonExampleService extends Service<Configuration> {
    public static void main(String[] args) throws Exception {
        new PhotonExampleService().run(args);
    }

    @Override
    protected void initialize(Configuration configuration, Environment environment) throws Exception {
        environment.addResource(new PhotoResource(new TwitterPhotoProvider()));
    }
}
