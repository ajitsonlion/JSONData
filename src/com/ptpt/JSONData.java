
package com.ptpt;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class JSONData {

    private List<Node> nodes = new ArrayList<Node>();
    private List<Link> links = new ArrayList<Link>();
    private List<Cluster> clusters = new ArrayList<Cluster>();
    private List<FilterNodeId> filterNodeIds = new ArrayList<FilterNodeId>();

    /**
     * 
     * @return
     *     The nodes
     */
    public List<Node> getNodes() {
        return nodes;
    }

    /**
     * 
     * @param nodes
     *     The nodes
     */
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    /**
     * 
     * @return
     *     The links
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The clusters
     */
    public List<Cluster> getClusters() {
        return clusters;
    }

    /**
     * 
     * @param clusters
     *     The clusters
     */
    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }

    /**
     * 
     * @return
     *     The filterNodeIds
     */
    public List<FilterNodeId> getFilterNodeIds() {
        return filterNodeIds;
    }

    /**
     * 
     * @param filterNodeIds
     *     The filterNodeIds
     */
    public void setFilterNodeIds(List<FilterNodeId> filterNodeIds) {
        this.filterNodeIds = filterNodeIds;
    }


}
