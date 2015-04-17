import com.google.gson.Gson;
import com.ptpt.*;
import org.fluttercode.datafactory.impl.DataFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    private static  final int NUMBER_OF_NODES=220;
    private static final int NUMBER_OF_LINKS=540;
    private static final int NUMBER_OF_CLUSTERS=8;
    private static final int NUMBER_OF_FILTER_NODES=4;

    private static  final int NUMBER_OF_NODE_TYPES=6;
    private static final int NUMBER_OF_NODES_SUB_TYPES=4;
    private static final int NUMBER_OF_LINK_TYPES=1;


    public static void main(String[] args) {


        DataFactory df;
        df = new DataFactory();

        List<NodeType> nodeTypes;
        nodeTypes = new ArrayList<NodeType>();

        List<NodeSubtype> nodeSubtypes=new ArrayList<NodeSubtype>();

        List<Linktype> linktypes=new ArrayList<Linktype>();

        List<Node> nodes=new ArrayList<Node>();
        List<Link> links=new ArrayList<Link>();
        List<Cluster> clusters=new ArrayList<Cluster>();
        List<FilterNodeId> filterNodeIds= new ArrayList<FilterNodeId>();

        JSONData jsonData=new JSONData();

        for (int i=1;i<=NUMBER_OF_NODE_TYPES;i++){

            NodeType nodeType=new NodeType();
            nodeType.setId(i);
            nodeType.setName(df.getRandomWord());
            nodeTypes.add(nodeType);

        }

        for (int i=1;i<=NUMBER_OF_NODES_SUB_TYPES;i++){

            String[] values = {"People","Thing","Place","Time"};
            NodeSubtype nodeSubtype=new NodeSubtype();
            nodeSubtype.setName(df.getItem(values,100));
            nodeSubtype.setId(i);
            nodeSubtypes.add(nodeSubtype);
        }
        for (int i=1;i<=NUMBER_OF_LINK_TYPES;i++){

            Linktype linktype=new Linktype();
            linktype.setId(i);
            linktype.setRelevance(df.getNumberBetween(1,6));
            linktype.setDirectionsFlag(df.getNumberBetween(1,3));
            linktypes.add(linktype);
        }


        for (int i=1; i<=NUMBER_OF_NODES;i++){

            Node node=new Node();
            node.setId(UUID.randomUUID());
            node.setLabel(df.getRandomWord());
            node.setExtraInfo(df.getRandomWord());
            node.setRelevance(df.getNumberBetween(1,6));
            node.setNodeType(df.getItem(nodeTypes,100));
            node.setNodeSubtype(df.getItem(nodeSubtypes,100));
            nodes.add(node);
        }

        for (int i=1; i<=NUMBER_OF_LINKS;i++){

            Link link=new Link();
            link.setId(UUID.randomUUID());
            link.setSourceId(df.getItem(nodes, 100).getId());
            link.setTargetId(df.getItem(nodes, 100).getId());
            link.setRelevance(df.getNumberBetween(1, 6));
            List<Linktype> linktypes1=new ArrayList<Linktype>();
            linktypes1.add(df.getItem(linktypes, 100));
            for (Linktype linktype:linktypes1){
                linktype.setRelevance(df.getNumberBetween(1,6));
            }
            link.setLinktypes(linktypes1);
            links.add(link);
        }


        for (int i=0;i<=NUMBER_OF_CLUSTERS;i++){

            Cluster cluster=new Cluster();
            cluster.setId(UUID.randomUUID());
            cluster.setLabel(df.getRandomWord());
            cluster .setRelevance(df.getNumberBetween(1, 6));
            cluster.setClusterType(df.getNumberBetween(1, 6));
            ArrayList<ClusterNode> clusterNodes =new ArrayList<ClusterNode>();
            cluster.setClusterNodes(clusterNodes);
            clusters.add(cluster);
        }


        for(Node node:nodes){

            Cluster cluster=df.getItem(clusters,100);
            ClusterNode clusterNode=new ClusterNode();
            clusterNode.setNode(node.getId());
            List<ClusterNode> clusterNodes =cluster.getClusterNodes();
            clusterNodes.add(clusterNode);
            cluster.setClusterNodes(clusterNodes);

        }


        for (int i=1;i<NUMBER_OF_FILTER_NODES;i++){

            FilterNodeId filterNodeId=new FilterNodeId();
            filterNodeId.setUuid(UUID.randomUUID());
            filterNodeIds.add(filterNodeId);
        }


        jsonData.setNodes(nodes);
        jsonData.setLinks(links);
        jsonData.setClusters(clusters);
        jsonData.setFilterNodeIds(filterNodeIds);


        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
         String json = gson.toJson(jsonData);

         System.out.println(json);


    }




}
