package com.lolimprove.dto.match.timelines;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Lennart Van Damme on 3/07/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchTimelineDTO {

    private List<MatchFrameDTO> frames;
    private Long frameInterval;

    public List<MatchFrameDTO> getFrames() {
        return frames;
    }

    public void setFrames(List<MatchFrameDTO> frames) {
        this.frames = frames;
    }

    public Long getFrameInterval() {
        return frameInterval;
    }

    public void setFrameInterval(Long frameInterval) {
        this.frameInterval = frameInterval;
    }
}
