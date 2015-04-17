
package com.ptpt;

import javax.annotation.Generated;
import java.util.*;

@Generated("org.jsonschema2pojo")
public class Link {

    private UUID id;
    private UUID sourceId;
    private UUID targetId;
    private int relevance;
    private List<Linktype> linktypes = new ArrayList<Linktype>();

    /**
     * 
     * @return
     *     The id
     */
    public UUID getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The sourceId
     */
    public UUID getSourceId() {
        return sourceId;
    }

    /**
     * 
     * @param sourceId
     *     The sourceId
     */
    public void setSourceId(UUID sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 
     * @return
     *     The targetId
     */
    public UUID getTargetId() {
        return targetId;
    }

    /**
     * 
     * @param targetId
     *     The targetId
     */
    public void setTargetId(UUID targetId) {
        this.targetId = targetId;
    }

    /**
     * 
     * @return
     *     The relevance
     */
    public int getRelevance() {
        return relevance;
    }

    /**
     * 
     * @param relevance
     *     The relevance
     */
    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    /**
     * 
     * @return
     *     The linktypes
     */
    public List<Linktype> getLinktypes() {
        return linktypes;
    }

    /**
     * 
     * @param linktypes
     *     The linktypes
     */
    public void setLinktypes(List<Linktype> linktypes) {
        this.linktypes = linktypes;
    }



}
