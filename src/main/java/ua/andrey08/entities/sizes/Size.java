package ua.andrey08.entities.sizes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Size {

    public int w;

    public int h;

    public String resize;

    @Override
    public String toString() {
        return "Size{" +
                "w=" + w +
                ", h=" + h +
                ", resize='" + resize + '\'' +
                '}';
    }
}

