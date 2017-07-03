package com.lolimprove.dto.runes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RunePageDTO {

    private Boolean current;
    private Set<RuneSlotDTO> slots;
    private String name;
    private Long id;

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }

    public Set<RuneSlotDTO> getSlots() {
        return slots;
    }

    public void setSlots(Set<RuneSlotDTO> slots) {
        this.slots = slots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
