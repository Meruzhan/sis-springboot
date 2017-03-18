package com.synisys.cms;

/**
 * Author  Yerem.Gevorgyan
 * 3/17/2017.
 */
public enum ResourceType {
    HTML("html"), RSS("rss"), VIDEO("video"), SLIDE_SHOW("slide");
    private final String description;

    ResourceType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
