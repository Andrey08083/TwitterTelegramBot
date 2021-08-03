package ua.andrey08.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalMediaInfo {
    public boolean monetizable;

    @Override
    public String toString() {
        return "AdditionalMediaInfo{" +
                "monetizable=" + monetizable +
                '}';
    }
}
