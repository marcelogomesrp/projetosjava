
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.DefaultPort;
import org.jgraph.graph.GraphConstants;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class No {

  private ArrayList<String> nos;

    public No() {
        this.nos = new ArrayList<String>();
    }

    public void addNo(String nome){
        this.nos.add(nome);
    }

    public DefaultGraphCell[] getDefaultGraphCell() {

        DefaultGraphCell[] cells = new DefaultGraphCell[this.nos.size()];

        for(int x = 0; x < this.nos.size();x++){
        cells[x] = new DefaultGraphCell(new String(this.nos.get(x)));
        GraphConstants.setBounds(cells[x].getAttributes(), new Rectangle2D.Double((x+1)*100, 20, 40, 20));
        GraphConstants.setGradientColor(cells[x].getAttributes(), Color.orange);
        GraphConstants.setOpaque(cells[x].getAttributes(), true);
        DefaultPort port0 = new DefaultPort();
        cells[x].add(port0);
        }


//           DefaultEdge edge = new DefaultEdge();
//           edge.setSource(cells[0].getChildAt(0));
//           edge.setTarget(cells[1].getChildAt(0));
//           cells[this.nos.size()+1] = edge;


//         int x = 0;
//        cells[x] = new DefaultGraphCell(new String(this.nos.get(x)));
//        GraphConstants.setBounds(cells[x].getAttributes(), new Rectangle2D.Double(20, 20, 40, 20));
//        GraphConstants.setGradientColor(cells[x].getAttributes(), Color.orange);
//        GraphConstants.setOpaque(cells[x].getAttributes(), true);
//        DefaultPort port0 = new DefaultPort();
//        cells[x].add(port0);
//
//        x++;
//        cells[x] = new DefaultGraphCell(new String(this.nos.get(x)));
//        GraphConstants.setBounds(cells[x].getAttributes(), new Rectangle2D.Double(20, 20, 40, 20));
//        GraphConstants.setGradientColor(cells[x].getAttributes(), Color.orange);
//        GraphConstants.setOpaque(cells[x].getAttributes(), true);
//        DefaultPort port1 = new DefaultPort();
//        cells[x].add(port1);





        return cells;


    }






}
