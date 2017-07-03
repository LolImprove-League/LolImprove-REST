package com.lolimprove.dto.static_content.realms;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

/**
 * Created by Lennart Van Damme on 30/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RealmDTO {

    private String lg; // Legacy script mode for IE6 or older
    private String dd; // Latest changed version of Dragon Magic
    private String l; // Default language for this realm
    private Map<String, String> n; // Latest changed version for each data type listed
    private Integer profileiconmax; // Special behavior number identifying the largest profile icon ID that can be used under 500. Any profile icon that is requested between this number and 500 should be mapped to 0.
    private String store; // Additional API data drawn from other sources that may be related to Data Dragon functionality.
    private String v; // Current version of this file for this realm.
    private String cdn; // The base CDN URL
    private String css; // Latest changed version of Dragon Magic's CSS file.

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public Map<String, String> getN() {
        return n;
    }

    public void setN(Map<String, String> n) {
        this.n = n;
    }

    public Integer getProfileiconmax() {
        return profileiconmax;
    }

    public void setProfileiconmax(Integer profileiconmax) {
        this.profileiconmax = profileiconmax;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getCdn() {
        return cdn;
    }

    public void setCdn(String cdn) {
        this.cdn = cdn;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }
}
