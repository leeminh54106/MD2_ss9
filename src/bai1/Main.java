package bai1;

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4,5);
        shapes[2] = new Square(6);

        for(int i = 0; i < shapes.length; i++){
            if(shapes[i] instanceof Circle || shapes[i] instanceof Rectangle || shapes[i] instanceof Square){
                //Thông báo ra màn hình diện tích của phần tử trước
                System.out.println("% trước khi: = " + shapes[i]);

//                 tăng kích thước phần tử đó lên theo một tỉ lệ ngẫu nhiên từ 1-100
                int percent = (int) Math.round(Math.random() *100);
                System.out.println("phần trăm = " + percent + "%");

                ((Resizable) shapes[i]).resize(percent);
                System.out.println("phần trăm sau khi= " + shapes[i]);
            }

        }

    }
}
