import java.awt.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author SRNil
 */
public class SphereTest {
    public static void main(String[] args)
    {
        List<Triangle> tris = new ArrayList<>();
        tris.add(new Triangle(new Vertex(100, 100, 100),
                              new Vertex(-100, -100, 100),
                              new Vertex(-100, 100, -100),
                         Color.WHITE));
        tris.add(new Triangle(new Vertex(100, 100, 100),
                              new Vertex(-100, -100, 100),
                              new Vertex(100, -100, -100),
                         Color.RED));
        tris.add(new Triangle(new Vertex(-100, 100, -100),
                              new Vertex(100, -100, -100),
                              new Vertex(100, 100, 100),
                              Color.GREEN));
        tris.add(new Triangle(new Vertex(-100, 100, -100),
                              new Vertex(100, -100, -100),
                              new Vertex(-100, -100, 100),
                         Color.BLUE));
        for (int i = 0; i < 4; i++) 
        {
            tris = subDivide(tris);
        }
        
        Viewer viewer = new Viewer();
        viewer.Render(tris);
    }
    
    public static List<Triangle> subDivide(List<Triangle> tris) {
        List<Triangle> result = new ArrayList<>();
        for (Triangle t : tris) {
            Vertex m1 = new Vertex((t.v1.x + t.v2.x)/2, (t.v1.y + t.v2.y)/2, (t.v1.z + t.v2.z)/2);
            Vertex m2 = new Vertex((t.v2.x + t.v3.x)/2, (t.v2.y + t.v3.y)/2, (t.v2.z + t.v3.z)/2);
            Vertex m3 = new Vertex((t.v1.x + t.v3.x)/2, (t.v1.y + t.v3.y)/2, (t.v1.z + t.v3.z)/2);
            result.add(new Triangle(t.v1, m1, m3, t.color));
            result.add(new Triangle(t.v2, m1, m2, t.color));
            result.add(new Triangle(t.v3, m2, m3, t.color));
            result.add(new Triangle(m1, m2, m3, t.color));
        }
        for (Triangle t : result) {
            for (Vertex v : new Vertex[] { t.v1, t.v2, t.v3 }) {
                double l = Math.sqrt(v.x * v.x + v.y * v.y + v.z * v.z) / Math.sqrt(30000);
                v.x /= l;
                v.y /= l;
                v.z /= l;
            }
        }
        return result;
    }
}