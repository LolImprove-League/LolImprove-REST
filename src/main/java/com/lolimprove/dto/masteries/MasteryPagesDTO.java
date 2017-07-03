package com.lolimprove.dto.masteries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryPagesDTO {

    private Set<MasteryPageDTO> pages;
    private Long summmonerId;

    public Set<MasteryPageDTO> getPages() {
        return pages;
    }

    public void setPages(Set<MasteryPageDTO> pages) {
        this.pages = pages;
    }

    public Long getSummmonerId() {
        return summmonerId;
    }

    public void setSummmonerId(Long summmonerId) {
        this.summmonerId = summmonerId;
    }
}
