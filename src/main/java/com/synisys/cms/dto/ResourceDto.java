package com.synisys.cms.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * Author  Yerem.Gevorgyan
 * 3/18/2017.
 */
public final class ResourceDto {
    public final long id;
    public final String type;
    public final String title;
    public final String description;
    public final String url;

    public Map<String, String> preferences = new HashMap<>();

    public ResourceDto(long id, String type, String title, String description, String url) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.description = description;
        this.url = url;
    }
}
