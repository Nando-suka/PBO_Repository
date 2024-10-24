import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roy Mubarak
 */
public class AStarSearch {
    private List<Node> closedList;
    private PriorityQueue<Node> openList;
    private double costTotal;

    public AStarSearch() {
        this.closedList = new ArrayList<>();
        this.openList = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                if (n1.getFn() > n2.getFn()) {
                    return 1;
                } else if (n1.getFn() < n2.getFn()) {
                    return -1;
                }
                return 0;
            }
        });
    }

    public void Astarsearch(Node startNode, Node goalNode) {
        startNode.setGn(0);
        startNode.setFn(startNode.getHn());

        openList.add(startNode);

        while (!openList.isEmpty()) {
            Node currentNode = openList.poll();

            if (currentNode.getNama().equals(goalNode.getNama())) {
                costTotal = currentNode.getGn();
                return;
            }

            closedList.add(currentNode);

            for (Edge edge : currentNode.getChildlist()) {
                Node childNode = edge.getTargetnode();
                double tentative_gn = currentNode.getGn() + edge.getCost();

                if (closedList.contains(childNode)) {
                    continue;
                }

                if (!openList.contains(childNode) || tentative_gn < childNode.getGn()) {
                    childNode.setParentnode(currentNode);
                    childNode.setGn(tentative_gn);
                    childNode.setFn(tentative_gn + childNode.getHn());

                    if (!openList.contains(childNode)) {
                        openList.add(childNode);
                    }
                }
            }
        }
    }

    public void printRute(Node goalNode) {
        if (goalNode.getParentnode() != null) {
            printRute(goalNode.getParentnode());
        }
        System.out.print(goalNode.getNama() + " ");
    }

    public double getCosttotal() {
        return costTotal;
    }
}