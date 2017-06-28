package com.lolimprove.dto.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lolimprove.dto.static_content.ImageDTO;

import java.util.List;
import java.util.Map;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDTO {

    private GoldDTO gold;
    private String plaintext;
    private Boolean hideFromAll;
    private Boolean inStore;
    private List<String> into;
    private Integer id;
    private InventoryDataStatsDTO stats;
    private String colloq;
    private Map<String, Boolean> maps;
    private Integer specialRecipe;
    private ImageDTO image;
    private String description;
    private List<String> tags;
    private Map<String, String> effect;
    private String requiredChampion;
    private List<String> from;
    private String group;
    private Boolean consumeOnFull;
    private String name;
    private Boolean consumed;
    private String sanitizedDescription;
    private Integer depth;
    private Integer stacks;

    public GoldDTO getGold() {
        return gold;
    }

    public void setGold(GoldDTO gold) {
        this.gold = gold;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public Boolean getHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(Boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
    }

    public Boolean getInStore() {
        return inStore;
    }

    public void setInStore(Boolean inStore) {
        this.inStore = inStore;
    }

    public List<String> getInto() {
        return into;
    }

    public void setInto(List<String> into) {
        this.into = into;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public InventoryDataStatsDTO getStats() {
        return stats;
    }

    public void setStats(InventoryDataStatsDTO stats) {
        this.stats = stats;
    }

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Boolean> maps) {
        this.maps = maps;
    }

    public Integer getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(Integer specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public ImageDTO getImage() {
        return image;
    }

    public void setImage(ImageDTO image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Map<String, String> getEffect() {
        return effect;
    }

    public void setEffect(Map<String, String> effect) {
        this.effect = effect;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public void setRequiredChampion(String requiredChampion) {
        this.requiredChampion = requiredChampion;
    }

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Boolean getConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(Boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getConsumed() {
        return consumed;
    }

    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getStacks() {
        return stacks;
    }

    public void setStacks(Integer stacks) {
        this.stacks = stacks;
    }
}
