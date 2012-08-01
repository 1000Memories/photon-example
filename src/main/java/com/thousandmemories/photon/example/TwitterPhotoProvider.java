package com.thousandmemories.photon.example;

import com.thousandmemories.photon.core.PhotoProvider;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class TwitterPhotoProvider implements PhotoProvider {
    @Override
    public InputStream getPhotoInputStream(String path) throws IOException {
        return new URL("https://api.twitter.com/1/users/profile_image?size=original&screen_name=" + path).openStream();
    }
}
