
package com.ptpt;

import javax.annotation.Generated;
import java.util.*;

@Generated("org.jsonschema2pojo")
public class Cluster {

    private UUID id;
    private String label;
    private int relevance;
    private int clusterType;
    private List<ClusterNode> elements = new ArrayList<ClusterNode>();

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
     *     The clusterType
     */
    public int getClusterType() {
        return clusterType;
    }

    /**
     * 
     * @param clusterType
     *     The clusterType
     */
    public void setClusterType(int clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * 
     * @return
     *     The clusterNodes
     */
    public List<ClusterNode> getClusterNodes() {
        return elements;
    }

    /**
     * 
     * @param clusterNodes
     *     The clusterNodes
     */
    public void setClusterNodes(List<ClusterNode> elements) {
        this.elements = elements;
    }



}
