// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ingest track discontinuity detected event data. Schema of the data property of an EventGridEvent for a
 * Microsoft.Media.LiveEventTrackDiscontinuityDetected event.
 */
@Immutable
public final class MediaLiveEventTrackDiscontinuityDetectedEventData {
    /*
     * Gets the type of the track (Audio / Video).
     */
    @JsonProperty(value = "trackType", access = JsonProperty.Access.WRITE_ONLY)
    private String trackType;

    /*
     * Gets the track name.
     */
    @JsonProperty(value = "trackName", access = JsonProperty.Access.WRITE_ONLY)
    private String trackName;

    /*
     * Gets the bitrate.
     */
    @JsonProperty(value = "bitrate", access = JsonProperty.Access.WRITE_ONLY)
    private Long bitrate;

    /*
     * Gets the timestamp of the previous fragment.
     */
    @JsonProperty(value = "previousTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String previousTimestamp;

    /*
     * Gets the timestamp of the current fragment.
     */
    @JsonProperty(value = "newTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String newTimestamp;

    /*
     * Gets the timescale in which both timestamps and discontinuity gap are represented.
     */
    @JsonProperty(value = "timescale", access = JsonProperty.Access.WRITE_ONLY)
    private String timescale;

    /*
     * Gets the discontinuity gap between PreviousTimestamp and NewTimestamp.
     */
    @JsonProperty(value = "discontinuityGap", access = JsonProperty.Access.WRITE_ONLY)
    private String discontinuityGap;

    /** Creates an instance of MediaLiveEventTrackDiscontinuityDetectedEventData class. */
    public MediaLiveEventTrackDiscontinuityDetectedEventData() {}

    /**
     * Get the trackType property: Gets the type of the track (Audio / Video).
     *
     * @return the trackType value.
     */
    public String getTrackType() {
        return this.trackType;
    }

    /**
     * Get the trackName property: Gets the track name.
     *
     * @return the trackName value.
     */
    public String getTrackName() {
        return this.trackName;
    }

    /**
     * Get the bitrate property: Gets the bitrate.
     *
     * @return the bitrate value.
     */
    public Long getBitrate() {
        return this.bitrate;
    }

    /**
     * Get the previousTimestamp property: Gets the timestamp of the previous fragment.
     *
     * @return the previousTimestamp value.
     */
    public String getPreviousTimestamp() {
        return this.previousTimestamp;
    }

    /**
     * Get the newTimestamp property: Gets the timestamp of the current fragment.
     *
     * @return the newTimestamp value.
     */
    public String getNewTimestamp() {
        return this.newTimestamp;
    }

    /**
     * Get the timescale property: Gets the timescale in which both timestamps and discontinuity gap are represented.
     *
     * @return the timescale value.
     */
    public String getTimescale() {
        return this.timescale;
    }

    /**
     * Get the discontinuityGap property: Gets the discontinuity gap between PreviousTimestamp and NewTimestamp.
     *
     * @return the discontinuityGap value.
     */
    public String getDiscontinuityGap() {
        return this.discontinuityGap;
    }
}
