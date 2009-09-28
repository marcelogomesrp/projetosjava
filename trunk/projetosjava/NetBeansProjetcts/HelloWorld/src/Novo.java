
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import org.jgraph.JGraph;
import org.jgraph.graph.DefaultCellViewFactory;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.DefaultGraphModel;
import org.jgraph.graph.DefaultPort;
import org.jgraph.graph.GraphConstants;
import org.jgraph.graph.GraphLayoutCache;
import org.jgraph.graph.GraphModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marcelo
 */
public class Novo {

    public static void main(String[] args) {

        GraphModel model = new DefaultGraphModel();
        GraphLayoutCache view = new GraphLayoutCache(model, new DefaultCellViewFactory());
        JGraph graph = new JGraph(model, view);
//        DefaultGraphCell[] cells = new DefaultGraphCell[1];

//        cells[0] = new DefaultGraphCell(new String("Hello"));
//        GraphConstants.setBounds(cells[0].getAttributes(), new Rectangle2D.Double(20, 20, 40, 20));
//        GraphConstants.setGradientColor(cells[0].getAttributes(), Color.orange);
//        GraphConstants.setOpaque(cells[0].getAttributes(), true);
//        DefaultPort port0 = new DefaultPort();
//        cells[0].add(port0);

        No no = new No();
        no.addNo("Ok");
        no.addNo("Ok2");
        no.addNo("Ok3");
        no.addNo("teste");        
        DefaultGraphCell[] cells = no.getDefaultGraphCell();

        int arrow = GraphConstants.ARROW_CLASSIC;
        //GraphConstants.setLineEnd(edge.getAttributes(), arrow);
        //GraphConstants.setEndFill(edge.getAttributes(), true);
        graph.getGraphLayoutCache().insert(cells);

        JFrame frame = new JFrame();
        frame.getContentPane().add(new JScrollPane(graph));
        frame.pack();
        frame.setVisible(true);
    }
}
