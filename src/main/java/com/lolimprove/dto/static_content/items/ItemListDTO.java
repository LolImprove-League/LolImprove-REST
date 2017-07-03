package com.lolimprove.dto.static_content.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemListDTO {

    private Map<String, ItemDTO> data;
    private String version;
    private List<ItemTreeDTO> tree;
    private List<GroupDTO> groups;
    private String type;

    public Map<String, ItemDTO> getData() {
        return data;
    }

    public void setData(Map<String, ItemDTO> data) {
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ItemTreeDTO> getTree() {
        return tree;
    }

    public void setTree(List<ItemTreeDTO> tree) {
        this.tree = tree;
    }

    public List<GroupDTO> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupDTO> groups) {
        this.groups = groups;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
