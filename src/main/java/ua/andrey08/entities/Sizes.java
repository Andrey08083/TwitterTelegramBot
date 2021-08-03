package ua.andrey08.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ua.andrey08.entities.sizes.Large;
import ua.andrey08.entities.sizes.Medium;
import ua.andrey08.entities.sizes.Small;
import ua.andrey08.entities.sizes.Thumb;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sizes {
    public Medium medium;
    public Thumb thumb;
    public Large large;
    public Small small;

    @Override
    public String toString() {
        return "Sizes{" +
                "medium=" + medium +
                ", thumb=" + thumb +
                ", large=" + large +
                ", small=" + small +
                '}';
    }
}
