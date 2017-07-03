package com.lolimprove.dto.static_content.champions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lolimprove.dto.static_content.images.ImageDTO;

import java.util.List;

/**
 * Created by Lennart Van Damme on 21/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionSpellDTO {

    private String cooldownBurn;
    private String resource;
    private LevelTipDTO leveltip;
    private List<SpellVarsDTO> vars;
    private String costType;
    private ImageDTO image;
    private String sanitizedDescription;
    private List<List<Double>> effect;
    private String tooltip;
    private Integer maxrank;
    private String costBurn;
    private String rageBurn;
    private Object range;
    private List<Double> cooldown;
    private List<Integer> cost;
    private String key;
    private List<String> effectBurn;
    private List<ImageDTO> altImages;
    private String name;

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public void setCooldownBurn(String cooldownBurn) {
        this.cooldownBurn = cooldownBurn;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public LevelTipDTO getLeveltip() {
        return leveltip;
    }

    public void setLeveltip(LevelTipDTO leveltip) {
        this.leveltip = leveltip;
    }

    public List<SpellVarsDTO> getVars() {
        return vars;
    }

    public void setVars(List<SpellVarsDTO> vars) {
        this.vars = vars;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public ImageDTO getImage() {
        return image;
    }

    public void setImage(ImageDTO image) {
        this.image = image;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public List<List<Double>> getEffect() {
        return effect;
    }

    public void setEffect(List<List<Double>> effect) {
        this.effect = effect;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public Integer getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(Integer maxrank) {
        this.maxrank = maxrank;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public void setCostBurn(String costBurn) {
        this.costBurn = costBurn;
    }

    public String getRageBurn() {
        return rageBurn;
    }

    public void setRageBurn(String rageBurn) {
        this.rageBurn = rageBurn;
    }

    public Object getRange() {
        return range;
    }

    public void setRange(Object range) {
        this.range = range;
    }

    public List<Double> getCooldown() {
        return cooldown;
    }

    public void setCooldown(List<Double> cooldown) {
        this.cooldown = cooldown;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public void setCost(List<Integer> cost) {
        this.cost = cost;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public void setEffectBurn(List<String> effectBurn) {
        this.effectBurn = effectBurn;
    }

    public List<ImageDTO> getAltImages() {
        return altImages;
    }

    public void setAltImages(List<ImageDTO> altImages) {
        this.altImages = altImages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
