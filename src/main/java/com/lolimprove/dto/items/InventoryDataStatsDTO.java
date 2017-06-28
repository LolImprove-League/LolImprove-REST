package com.lolimprove.dto.items;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by LVDBB73 on 28/06/2017.
 */
public class InventoryDataStatsDTO {

    @JsonProperty(value = "PercentCritDamageMod")
    private Double percentCritDamageMod;

    @JsonProperty(value = "PercentSpellBlockMod")
    private Double percentSpellBlockMod;

    @JsonProperty(value = "PercentHPRegenMod")
    @JsonProperty(value = "PercentMovementSpeedMod")
    @JsonProperty(value = "FlatSpellBlockMod")
    @JsonProperty(value = "FlatCritDamageMod")
    @JsonProperty(value = "FlatEnergyPoolMod")
    @JsonProperty(value = "PercentLifeStealMod")
    @JsonProperty(value = "FlatMPPoolMod")
    @JsonProperty(value = "FlatMovementSpeedMod")
    @JsonProperty(value = "PercentAttackSpeedMod")
    @JsonProperty(value = "FlatBlockMod")
    @JsonProperty(value = "PercentBlockMod")
    @JsonProperty(value = "FlatEnergyRegenMod")
    @JsonProperty(value = "PercentSpellVampMod")
    @JsonProperty(value = "FlatMPRegenMod")
    @JsonProperty(value = "PercentDodgeMod")
    @JsonProperty(value = "FlatAttackSpeedMod")
    @JsonProperty(value = "FlatArmorMod")
    @JsonProperty(value = "FlatHPRegenMod")
    @JsonProperty(value = "PercentMagicDamageMod")
    @JsonProperty(value = "PercentMPPoolMod")
    @JsonProperty(value = "FlatMagicDamageMod")
    @JsonProperty(value = "PercentMPRegenMod")
    @JsonProperty(value = "PercentPhysicalDamageMod")
    @JsonProperty(value = "FlatPhysicalDamageMod")
    @JsonProperty(value = "PercentHPPoolMod")
    @JsonProperty(value = "PercentArmorMod")
    @JsonProperty(value = "PercentCritChanceMod")
    @JsonProperty(value = "PercentEXPBonus")
    @JsonProperty(value = "FlatHPPoolMod")
    @JsonProperty(value = "FlatCritChanceMod")
    @JsonProperty(value = "FlatEXPBonus") }
