import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SRNil
 */
public class TeapotTest {
    public static void main(String[] args)
    {
        List<Triangle> tris = new ArrayList<>();
        
        //WARNING: 306 Lines of vertices coming your way!
        //WARNING: THATS 102 POLYGONS SEND HELP
        
        //If you want the data source: its here:https://github.com/dasch/graphics/blob/master/data/teapot.data
        
        tris.add(new Triangle(new Vertex(1.40000, 0.00000, 2.40000),
                              new Vertex(1.40000, -0.78400, 2.40000),
                              new Vertex(0.78000, -1.40000,  2.40000),
                         Color.WHITE)); //1
        tris.add(new Triangle(new Vertex(0.00000, -1.40000,  2.40000),
                              new Vertex(1.33750,  0.00000,  2.53125),
                              new Vertex(1.33750, -0.74900,  2.53125),
                         Color.WHITE)); //2
        tris.add(new Triangle(new Vertex(0.74900, -1.33750,  2.53125),
                              new Vertex(0.00000, -1.33750,  2.53125),
                              new Vertex(1.43750,  0.00000,  2.53125),
                         Color.WHITE)); //3
                         //line 9 of data
        tris.add(new Triangle(new Vertex(1.43750, -0.80500,  2.53125),
                              new Vertex(0.80500, -1.43750,  2.53125),
                              new Vertex(0.00000, -1.43750,  2.53125),
                         Color.WHITE)); //4
        tris.add(new Triangle(new Vertex(1.50000,  0.00000,  2.40000),
                              new Vertex(1.50000, -0.84000,  2.40000),
                              new Vertex(0.84000,  -1.5000,   2.40000),
                         Color.WHITE)); //5
        tris.add(new Triangle(new Vertex(0.00000, -1.50000,  2.40000),
                              new Vertex(-0.78400, -1.40000,   2.40000),
                              new Vertex(-1.40000, -0.78400,  2.40000),
                         Color.WHITE)); //6
                         //Line 18 of data
        tris.add(new Triangle(new Vertex(-1.40000,  0.00000,  2.40000),
                              new Vertex(-0.74900, -1.33750,  2.53125),
                              new Vertex(-1.33750, -0.74900,  2.53125),
                         Color.WHITE)); //7
        tris.add(new Triangle(new Vertex(-1.33750,  0.00000,  2.53125),
                              new Vertex(-0.80500, -1.43750,  2.53125),
                              new Vertex(-1.43750, -0.80500,  2.53125),
                         Color.WHITE)); //8
        tris.add(new Triangle(new Vertex(-1.43750,  0.00000,  2.53125),
                              new Vertex(-0.84000, -1.50000,  2.40000),
                              new Vertex(-1.50000, -0.84000,  2.40000),
                         Color.WHITE)); //9
                         //line 27 of data
        tris.add(new Triangle(new Vertex(-1.50000, 0.00000, 2.40000),
                              new Vertex(-1.40000,  0.78400,  2.40000),
                              new Vertex(-0.78400, 1.40000,  2.40000),
                         Color.WHITE)); //10
        tris.add(new Triangle(new Vertex(0.00000, 1.40000,  2.40000),
                              new Vertex(-1.33750, 0.74900 ,  2.53125),
                              new Vertex(-0.74900, 1.33750 ,  2.53125),
                         Color.WHITE)); //11
        tris.add(new Triangle(new Vertex(0.00000, 1.33750, 2.53125),
                              new Vertex(-1.43750,  0.80500,  2.53125),
                              new Vertex(-0.80500, 1.43750, 2.53125),
                         Color.WHITE)); //12
                         //line 36 of data
        tris.add(new Triangle(new Vertex(0.00000,   1.43750,   2.53125),
                              new Vertex(-1.50000,   0.84000,   2.40000),
                              new Vertex(-0.84000,   1.50000,   2.40000),
                         Color.WHITE)); //13
        tris.add(new Triangle(new Vertex(0.00000,   1.50000,   2.40000),
                              new Vertex(0.78400 ,  1.40000,   2.40000),
                              new Vertex(1.40000,   0.78400,   2.40000),
                         Color.WHITE)); //14
        tris.add(new Triangle(new Vertex(0.74900,   1.33750,   2.53125),
                              new Vertex(1.33750,   0.74900,   2.53125),
                              new Vertex(0.80500,   1.43750,   2.53125),
                         Color.WHITE)); //15
                         //line 45 of data
        tris.add(new Triangle(new Vertex(1.43750,   0.80500,   2.53125),
                              new Vertex(0.84000,   1.50000 ,  2.40000),
                              new Vertex(1.50000,   0.84000,   2.40000),
                         Color.WHITE)); //16
        tris.add(new Triangle(new Vertex(1.75000,   0.00000,   1.87500),
                              new Vertex(1.75000,  -0.98000,   1.87500),
                              new Vertex(0.98000,  -1.75000,   1.87500),
                         Color.WHITE)); //17
        tris.add(new Triangle(new Vertex(0.00000,  -1.75000,   1.87500),
                              new Vertex(2.00000,   0.00000,   1.35000),
                              new Vertex(2.00000,  -1.12000,   1.35000),
                         Color.WHITE)); //18
                         //line 54 of data
        tris.add(new Triangle(new Vertex(1.12000,  -2.00000,   1.35000),
                              new Vertex(0.00000,  -2.00000,   1.35000),
                              new Vertex(2.00000,   0.00000,   0.90000),
                         Color.WHITE)); //19
        tris.add(new Triangle(new Vertex(2.00000,  -1.12000,   0.90000),
                              new Vertex(1.12000,  -2.00000,   0.90000),
                              new Vertex(0.00000,  -2.00000,   0.90000),
                         Color.WHITE)); //20 YAAY
        tris.add(new Triangle(new Vertex(-0.98000,  -1.75000,   1.87500),
                              new Vertex(-1.75000,  -0.98000,   1.87500),
                              new Vertex(-1.75000,   0.00000,   1.87500),
                         Color.WHITE)); //21
                         //line 63 of data
        tris.add(new Triangle(new Vertex(-1.12000,  -2.00000,   1.35000),
                              new Vertex(-2.00000,  -1.12000,   1.35000),
                              new Vertex(-2.00000,   0.00000,   1.35000),
                         Color.WHITE)); //22
        tris.add(new Triangle(new Vertex(-1.12000,  -2.00000,   0.90000),
                              new Vertex(-2.00000,  -1.12000,   0.90000),
                              new Vertex(-2.00000,   0.00000,   0.90000),
                         Color.WHITE)); //23
        tris.add(new Triangle(new Vertex(-1.75000,   0.98000,   1.87500),
                              new Vertex(-0.98000,   1.75000,   1.87500),
                              new Vertex(0.00000,  1.75000,   1.87500),
                         Color.WHITE)); //24
                         //line 72 of data
        tris.add(new Triangle(new Vertex(-2.00000,   1.12000 ,  1.35000),
                              new Vertex(-1.12000,   2.00000,   1.35000),
                              new Vertex(0.00000,   2.00000,   1.35000),
                         Color.WHITE)); //25
        tris.add(new Triangle(new Vertex(-2.00000,   1.12000,   0.90000),
                              new Vertex(-1.12000,   2.00000,   0.90000),
                              new Vertex(0.00000,   2.00000,   0.90000),
                         Color.WHITE)); //26
        tris.add(new Triangle(new Vertex(0.98000,   1.75000,   1.87500),
                              new Vertex(1.75000,   0.98000,   1.87500),
                              new Vertex(1.12000,   2.00000,   1.35000),
                         Color.WHITE)); //27
                         //line 81 of data
        tris.add(new Triangle(new Vertex(2.00000,   1.12000,   1.35000),
                              new Vertex(1.12000,   2.00000,   0.90000),
                              new Vertex(2.00000,   1.12000,   0.90000),
                         Color.WHITE)); //28
        tris.add(new Triangle(new Vertex(2.00000,   0.00000,   0.45000),
                              new Vertex(2.00000,  -1.12000,   0.45000),
                              new Vertex(1.12000,  -2.00000,   0.45000),
                         Color.WHITE)); //29
        tris.add(new Triangle(new Vertex(0.00000,  -2.00000,   0.45000),
                              new Vertex(1.50000,   0.00000,   0.22500),
                              new Vertex(1.50000,  -0.84000,   0.22500),
                         Color.WHITE)); //30
                         //line 90 of data
        tris.add(new Triangle(new Vertex(0.84000,  -1.50000,   0.22500),
                              new Vertex(0.00000,  -1.50000,   0.22500),
                              new Vertex(1.50000,   0.00000,   0.15000),
                         Color.WHITE)); //31
        tris.add(new Triangle(new Vertex(1.50000,  -0.84000,   0.15000),
                              new Vertex(0.84000,  -1.50000,   0.15000),
                              new Vertex(0.00000,  -1.50000,   0.15000),
                         Color.WHITE)); //32
        tris.add(new Triangle(new Vertex(-1.12000,  -2.00000,   0.45000),
                              new Vertex(-2.00000,  -1.12000,   0.45000),
                              new Vertex(-2.00000,   0.00000,   0.45000),
                         Color.WHITE)); //33
                         //line 99 of data
        tris.add(new Triangle(new Vertex(-0.84000,  -1.50000,  0.22500),//LINE 100!
                              new Vertex(-1.50000,  -0.84000,   0.22500),
                              new Vertex(-1.50000,   0.00000,   0.22500),//1/3 THERE
                         Color.WHITE)); //34
        tris.add(new Triangle(new Vertex(-0.84000,  -1.50000,   0.15000),
                              new Vertex(-1.50000,  -0.84000,   0.15000),
                              new Vertex(-1.50000,   0.00000,   0.15000),
                         Color.WHITE)); //35
        tris.add(new Triangle(new Vertex(-2.00000,   1.12000,   0.45000),
                              new Vertex(-1.12000,   2.00000,   0.45000),
                              new Vertex(0.00000,   2.00000,   0.45000),
                         Color.WHITE)); //36
                         //line 108 of data
        tris.add(new Triangle(new Vertex(-1.50000,   0.84000,   0.22500),
                              new Vertex(-0.84000,   1.50000,   0.22500),
                              new Vertex(0.00000 ,  1.50000,   0.22500),
                         Color.WHITE)); //37
        tris.add(new Triangle(new Vertex(-1.50000,   0.84000,   0.15000),
                              new Vertex(-0.84000,   1.50000,   0.15000),
                              new Vertex(0.00000 ,  1.50000,   0.15000),
                         Color.WHITE)); //38
        tris.add(new Triangle(new Vertex(1.12000,   2.00000,   0.45000),
                              new Vertex(2.00000,   1.12000,   0.45000),
                              new Vertex(0.84000,   1.50000,   0.22500),
                         Color.WHITE)); //39
                         //line 117 of data
        tris.add(new Triangle(new Vertex(1.50000,   0.84000,   0.22500),
                              new Vertex(0.84000,   1.50000,   0.15000),
                              new Vertex(1.50000,   0.84000,   0.15000),
                         Color.WHITE)); //40
        tris.add(new Triangle(new Vertex(-1.60000,   0.00000,   2.02500),
                              new Vertex(-1.60000,  -0.30000,   2.02500),
                              new Vertex(-1.50000,  -0.30000,   2.25000),
                         Color.WHITE)); //41
        tris.add(new Triangle(new Vertex(-1.50000,   0.00000,   2.25000),
                              new Vertex(-2.30000,   0.00000,   2.02500),
                              new Vertex(-2.30000,  -0.30000,   2.02500),
                         Color.WHITE)); //42
                         //line 126 of data
        /*
        for (int i = 0; i < 4; i++) 
        {
            tris = inflate(tris, 4);
        }  
        */
        
        Viewer viewer = new Viewer();
        viewer.Render(tris);
    }
    
    public static List<Triangle> inflate(List<Triangle> tris, double scale) {
        List<Triangle> result = tris;
        for (Triangle t : result) {
            t.v1.x *= scale;
            t.v1.y *= scale;
            t.v1.z *= scale;
            
            t.v2.x *= scale;
            t.v2.y *= scale;
            t.v2.z *= scale;
            
            t.v3.x *= scale;
            t.v3.y *= scale;
            t.v3.z *= scale;
        }
        return result;
    }
}


