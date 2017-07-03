package com.lolimprove.dto.runes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RunePagesDTO {

    private Set<RunePageDTO> pages;
    private Long SummonerId;

    public Set<RunePageDTO> getPages() {
        return pages;
    }

    public void setPages(Set<RunePageDTO> pages) {
        this.pages = pages;
    }

    public Long getSummonerId() {
        return SummonerId;
    }

    public void setSummonerId(Long summonerId) {
        SummonerId = summonerId;
    }
}
