package ua.andrey08.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtendedEntities {
    public List<Media> media;

    @Override
    public String toString() {
        return "ExtendedEntities{" +
                "media=" + media +
                '}';
    }
}
