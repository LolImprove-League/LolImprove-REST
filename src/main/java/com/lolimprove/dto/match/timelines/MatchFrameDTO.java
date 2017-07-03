package com.lolimprove.dto.match.timelines;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

/**
 * Created by Lennart Van Damme on 3/07/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchFrameDTO {

    private Long timestamp;
    private Map<Integer, MatchParticipantFrameDTO> participantFrames;
    private List<MatchEventDTO> events;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Map<Integer, MatchParticipantFrameDTO> getParticipantFrames() {
        return participantFrames;
    }

    public void setParticipantFrames(Map<Integer, MatchParticipantFrameDTO> participantFrames) {
        this.participantFrames = participantFrames;
    }

    public List<MatchEventDTO> getEvents() {
        return events;
    }

    public void setEvents(List<MatchEventDTO> events) {
        this.events = events;
    }
}
