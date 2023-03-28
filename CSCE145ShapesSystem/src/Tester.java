/*
 * Written by Anna Phan
 */
public class Tester {

    public static void main(String[] args) {
        //Shape s = new Shape();
        Shape s = new BasicShape();
        s.drawShape();

        Shape[] shapes = new Shape[11];
        shapes[0] = new BasicShape();
        shapes[1] = new BasicShape(4);
        shapes[2] = new BasicRectangle(0,2,3);
        shapes[3] = new BasicRectangle(2,3,4);
        shapes[4] = new HollowRectangle(0,4,4);
        shapes[5] = new HollowRectangle(5,5,5);
        shapes[6] = new CheckeredRectangle(0,7,7);
        shapes[7] = new CheckeredRectangle(5,10,10);
        shapes[8] = new BasicTriangle(0,3);
        shapes[9] = new UpsideDownTriangle(3,5);
        shapes[10] = new HollowTriangle(6,7);
        for(int i=0;i< shapes.length;i++)
        {
            if(shapes[i] != null)
            {
                shapes[i].drawShape();
                //shape[i].drawShapeAt(i);
            }
        }
    }
}
