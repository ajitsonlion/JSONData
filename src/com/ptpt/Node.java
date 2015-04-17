
package com.ptpt;

import javax.annotation.Generated;
import java.util.UUID;

@Generated("org.jsonschema2pojo")
public class Node {

    private UUID id;
    private String label;
    private String extraInfo;
    private int relevance;
    private NodeType nodeType;
    private NodeSubtype nodeSubtype;

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
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The extraInfo
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * 
     * @param extraInfo
     *     The extraInfo
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
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
     *     The nodeType
     */
    public NodeType getNodeType() {
        return nodeType;
    }

    /**
     * 
     * @param nodeType
     *     The nodeType
     */
    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * 
     * @return
     *     The nodeSubtype
     */
    public NodeSubtype getNodeSubtype() {
        return nodeSubtype;
    }

    /**
     * 
     * @param nodeSubtype
     *     The nodeSubtype
     */
    public void setNodeSubtype(NodeSubtype nodeSubtype) {
        this.nodeSubtype = nodeSubtype;
    }


}
