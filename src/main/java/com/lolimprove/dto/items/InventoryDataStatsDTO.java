package com.lolimprove.dto.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InventoryDataStatsDTO {

    @JsonProperty(value = "PercentCritDamageMod")
    private Double percentCritDamageMod;

    @JsonProperty(value = "PercentSpellBlockMod")
    private Double percentSpellBlockMod;

    @JsonProperty(value = "PercentHPRegenMod")
    private Double percentHPRegenMod;

    @JsonProperty(value = "PercentMovementSpeedMod")
    private Double percentMovementSpeedMod;

    @JsonProperty(value = "FlatSpellBlockMod")
    private Double flatSpellBlockMod;

    @JsonProperty(value = "FlatCritDamageMod")
    private Double flatCritDamageMod;

    @JsonProperty(value = "FlatEnergyPoolMod")
    private Double flatEnergyPoolMod;

    @JsonProperty(value = "PercentLifeStealMod")
    private Double percentLifeStealMod;

    @JsonProperty(value = "FlatMPPoolMod")
    private Double flatMPPoolMod;

    @JsonProperty(value = "FlatMovementSpeedMod")
    private Double flatMovementSpeedMod;

    @JsonProperty(value = "PercentAttackSpeedMod")
    private Double percentAttackSpeedMod;

    @JsonProperty(value = "FlatBlockMod")
    private Double flatBlockMod;

    @JsonProperty(value = "PercentBlockMod")
    private Double percentBlockMod;

    @JsonProperty(value = "FlatEnergyRegenMod")
    private Double flatEnergyRegenMod;

    @JsonProperty(value = "PercentSpellVampMod")
    private Double percentSpellVampMod;

    @JsonProperty(value = "FlatMPRegenMod")
    private Double flatMPRegenMod;

    @JsonProperty(value = "PercentDodgeMod")
    private Double percentDodgeMod;

    @JsonProperty(value = "FlatAttackSpeedMod")
    private Double flatAttackSpeedMod;

    @JsonProperty(value = "FlatArmorMod")
    private Double flatArmorMod;

    @JsonProperty(value = "FlatHPRegenMod")
    private Double flatHPRegenMod;

    @JsonProperty(value = "PercentMagicDamageMod")
    private Double percentMagicDamageMod;

    @JsonProperty(value = "PercentMPPoolMod")
    private Double percentMPPoolMod;

    @JsonProperty(value = "FlatMagicDamageMod")
    private Double flatMagicDamageMod;

    @JsonProperty(value = "PercentMPRegenMod")
    private Double percentMPRegenMod;

    @JsonProperty(value = "PercentPhysicalDamageMod")
    private Double percentPhysicalDamageMod;

    @JsonProperty(value = "FlatPhysicalDamageMod")
    private Double flatPhysicalDamageMod;

    @JsonProperty(value = "PercentHPPoolMod")
    private Double percentHPPoolMod;

    @JsonProperty(value = "PercentArmorMod")
    private Double percentArmorMod;

    @JsonProperty(value = "PercentCritChanceMod")
    private Double percentCritChanceMod;

    @JsonProperty(value = "PercentEXPBonus")
    private Double percentEXPBonus;

    @JsonProperty(value = "FlatHPPoolMod")
    private Double flatHPPoolMod;

    @JsonProperty(value = "FlatCritChanceMod")
    private Double flatCritChanceMod;

    @JsonProperty(value = "FlatEXPBonus")
    private Double flatEXPBonus;

    public Double getPercentCritDamageMod() {
        return percentCritDamageMod;
    }

    public void setPercentCritDamageMod(Double percentCritDamageMod) {
        this.percentCritDamageMod = percentCritDamageMod;
    }

    public Double getPercentSpellBlockMod() {
        return percentSpellBlockMod;
    }

    public void setPercentSpellBlockMod(Double percentSpellBlockMod) {
        this.percentSpellBlockMod = percentSpellBlockMod;
    }

    public Double getPercentHPRegenMod() {
        return percentHPRegenMod;
    }

    public void setPercentHPRegenMod(Double percentHPRegenMod) {
        this.percentHPRegenMod = percentHPRegenMod;
    }

    public Double getPercentMovementSpeedMod() {
        return percentMovementSpeedMod;
    }

    public void setPercentMovementSpeedMod(Double percentMovementSpeedMod) {
        this.percentMovementSpeedMod = percentMovementSpeedMod;
    }

    public Double getFlatSpellBlockMod() {
        return flatSpellBlockMod;
    }

    public void setFlatSpellBlockMod(Double flatSpellBlockMod) {
        this.flatSpellBlockMod = flatSpellBlockMod;
    }

    public Double getFlatCritDamageMod() {
        return flatCritDamageMod;
    }

    public void setFlatCritDamageMod(Double flatCritDamageMod) {
        this.flatCritDamageMod = flatCritDamageMod;
    }

    public Double getFlatEnergyPoolMod() {
        return flatEnergyPoolMod;
    }

    public void setFlatEnergyPoolMod(Double flatEnergyPoolMod) {
        this.flatEnergyPoolMod = flatEnergyPoolMod;
    }

    public Double getPercentLifeStealMod() {
        return percentLifeStealMod;
    }

    public void setPercentLifeStealMod(Double percentLifeStealMod) {
        this.percentLifeStealMod = percentLifeStealMod;
    }

    public Double getFlatMPPoolMod() {
        return flatMPPoolMod;
    }

    public void setFlatMPPoolMod(Double flatMPPoolMod) {
        this.flatMPPoolMod = flatMPPoolMod;
    }

    public Double getFlatMovementSpeedMod() {
        return flatMovementSpeedMod;
    }

    public void setFlatMovementSpeedMod(Double flatMovementSpeedMod) {
        this.flatMovementSpeedMod = flatMovementSpeedMod;
    }

    public Double getPercentAttackSpeedMod() {
        return percentAttackSpeedMod;
    }

    public void setPercentAttackSpeedMod(Double percentAttackSpeedMod) {
        this.percentAttackSpeedMod = percentAttackSpeedMod;
    }

    public Double getFlatBlockMod() {
        return flatBlockMod;
    }

    public void setFlatBlockMod(Double flatBlockMod) {
        this.flatBlockMod = flatBlockMod;
    }

    public Double getPercentBlockMod() {
        return percentBlockMod;
    }

    public void setPercentBlockMod(Double percentBlockMod) {
        this.percentBlockMod = percentBlockMod;
    }

    public Double getFlatEnergyRegenMod() {
        return flatEnergyRegenMod;
    }

    public void setFlatEnergyRegenMod(Double flatEnergyRegenMod) {
        this.flatEnergyRegenMod = flatEnergyRegenMod;
    }

    public Double getPercentSpellVampMod() {
        return percentSpellVampMod;
    }

    public void setPercentSpellVampMod(Double percentSpellVampMod) {
        this.percentSpellVampMod = percentSpellVampMod;
    }

    public Double getFlatMPRegenMod() {
        return flatMPRegenMod;
    }

    public void setFlatMPRegenMod(Double flatMPRegenMod) {
        this.flatMPRegenMod = flatMPRegenMod;
    }

    public Double getPercentDodgeMod() {
        return percentDodgeMod;
    }

    public void setPercentDodgeMod(Double percentDodgeMod) {
        this.percentDodgeMod = percentDodgeMod;
    }

    public Double getFlatAttackSpeedMod() {
        return flatAttackSpeedMod;
    }

    public void setFlatAttackSpeedMod(Double flatAttackSpeedMod) {
        this.flatAttackSpeedMod = flatAttackSpeedMod;
    }

    public Double getFlatArmorMod() {
        return flatArmorMod;
    }

    public void setFlatArmorMod(Double flatArmorMod) {
        this.flatArmorMod = flatArmorMod;
    }

    public Double getFlatHPRegenMod() {
        return flatHPRegenMod;
    }

    public void setFlatHPRegenMod(Double flatHPRegenMod) {
        this.flatHPRegenMod = flatHPRegenMod;
    }

    public Double getPercentMagicDamageMod() {
        return percentMagicDamageMod;
    }

    public void setPercentMagicDamageMod(Double percentMagicDamageMod) {
        this.percentMagicDamageMod = percentMagicDamageMod;
    }

    public Double getPercentMPPoolMod() {
        return percentMPPoolMod;
    }

    public void setPercentMPPoolMod(Double percentMPPoolMod) {
        this.percentMPPoolMod = percentMPPoolMod;
    }

    public Double getFlatMagicDamageMod() {
        return flatMagicDamageMod;
    }

    public void setFlatMagicDamageMod(Double flatMagicDamageMod) {
        this.flatMagicDamageMod = flatMagicDamageMod;
    }

    public Double getPercentMPRegenMod() {
        return percentMPRegenMod;
    }

    public void setPercentMPRegenMod(Double percentMPRegenMod) {
        this.percentMPRegenMod = percentMPRegenMod;
    }

    public Double getPercentPhysicalDamageMod() {
        return percentPhysicalDamageMod;
    }

    public void setPercentPhysicalDamageMod(Double percentPhysicalDamageMod) {
        this.percentPhysicalDamageMod = percentPhysicalDamageMod;
    }

    public Double getFlatPhysicalDamageMod() {
        return flatPhysicalDamageMod;
    }

    public void setFlatPhysicalDamageMod(Double flatPhysicalDamageMod) {
        this.flatPhysicalDamageMod = flatPhysicalDamageMod;
    }

    public Double getPercentHPPoolMod() {
        return percentHPPoolMod;
    }

    public void setPercentHPPoolMod(Double percentHPPoolMod) {
        this.percentHPPoolMod = percentHPPoolMod;
    }

    public Double getPercentArmorMod() {
        return percentArmorMod;
    }

    public void setPercentArmorMod(Double percentArmorMod) {
        this.percentArmorMod = percentArmorMod;
    }

    public Double getPercentCritChanceMod() {
        return percentCritChanceMod;
    }

    public void setPercentCritChanceMod(Double percentCritChanceMod) {
        this.percentCritChanceMod = percentCritChanceMod;
    }

    public Double getPercentEXPBonus() {
        return percentEXPBonus;
    }

    public void setPercentEXPBonus(Double percentEXPBonus) {
        this.percentEXPBonus = percentEXPBonus;
    }

    public Double getFlatHPPoolMod() {
        return flatHPPoolMod;
    }

    public void setFlatHPPoolMod(Double flatHPPoolMod) {
        this.flatHPPoolMod = flatHPPoolMod;
    }

    public Double getFlatCritChanceMod() {
        return flatCritChanceMod;
    }

    public void setFlatCritChanceMod(Double flatCritChanceMod) {
        this.flatCritChanceMod = flatCritChanceMod;
    }

    public Double getFlatEXPBonus() {
        return flatEXPBonus;
    }

    public void setFlatEXPBonus(Double flatEXPBonus) {
        this.flatEXPBonus = flatEXPBonus;
    }
}
