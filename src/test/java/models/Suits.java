package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Suits {

    private String name;
    private String description;
    private int id;
}