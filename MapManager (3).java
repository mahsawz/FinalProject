import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapManager
{
    Random random=new Random();
    Rectangle[] wall_up = new Rectangle[30];
    Rectangle[] wall_down = new Rectangle[30];
    Rectangle[] wall_left = new Rectangle[30];
    Rectangle[] wall_right = new Rectangle[30];
    // Rectangle[] players = new Rectangle[2];
    ImageView imageView1 = new ImageView();
    ImageView imageView2 = new ImageView();
    ImageView imageView3 = new ImageView();
    ImageView imageView4 = new ImageView();
    ImageView imageView5 = new ImageView();
    ImageView imageView6 = new ImageView();
    ImageView imageView7 = new ImageView();
    ImageView imageView8 = new ImageView();
    List<ImageView> deck = new ArrayList<>();
    List<ImageView> deck2 = new ArrayList<>();
    List<ImageView> deck1 = new ArrayList<>();
    List<ImageView> deck3 = new ArrayList<>();
    List<ImageView> deck4 = new ArrayList<>();
    List<ImageView> deck5 = new ArrayList<>();
    List<ImageView> deck6 = new ArrayList<>();


    //Rectangle[] lock = new Rectangle[42];
    //Rectangle[] brick=new Rectangle[num];


    public void make_wall_up(Image image,int posx, int posy, int height, int width)
    {

        for (int i = 0; i < 16; i++) {
            imageView5 = new ImageView(image);
            imageView5.setX(posx);
            imageView5.setY(posy);
            imageView5.setFitHeight(height);
            imageView5.setFitWidth(width);
            deck2.add(imageView5);
            posx+=40;

            /*wall_up[i] = new Rectangle(posx, posy, height, width);
            wall_up[i].setStroke(Color.BLACK);
            wall_up[i].setFill(Color.GRAY);*/

        }
    }

    public void make_wall_down(Image image,int posx, int posy, int height, int width) {

        for (int i = 0; i < 16; i++)
        {
            imageView6 = new ImageView(image);
            imageView6.setX(posx);
            imageView6.setY(posy);
            imageView6.setFitHeight(height);
            imageView6.setFitWidth(width);
            deck3.add(imageView6);
            posx+=40;


            /*wall_down[i] = new Rectangle(posx, posy, height, width);
            wall_down[i].setStroke(Color.BLACK);
            wall_down[i].setFill(Color.GRAY);*/

        }
    }

    public void make_wall_left(Image image,int posx, int posy, int height, int width)
    {

        for (int i = 0; i < 16; i++)
        {
            imageView6 = new ImageView(image);
            imageView6.setX(posx);
            imageView6.setY(posy);
            imageView6.setFitHeight(height);
            imageView6.setFitWidth(width);
            deck4.add(imageView6);
            posy+=40;

        }
           /* wall_left[i] = new Rectangle(posx, posy, height, width);
            wall_left[i].setStroke(Color.BLACK);
            wall_left[i].setFill(Color.GRAY);*/


    }

    public void make_wall_right(Image image,int posx, int posy, int height, int width)
    {
        for (int i = 0; i < 30; i++)
        {
            imageView7 = new ImageView(image);
            imageView7.setX(posx);
            imageView7.setY(posy);
            imageView7.setFitHeight(height);
            imageView7.setFitWidth(width);
            deck5.add(imageView7);
            posy+=40;

            /*wall_right[i] = new Rectangle(posx, posy, height, width);
            wall_right[i].setStroke(Color.BLACK);
            wall_right[i].setFill(Color.GRAY);*/
        }
    }


    public void make_lock1(Image image,/*int columnNumber,*/int posx,int posy,int height,int width)
    {
        //posy = posy + columnNumber * 40;
        //for (int i = 0; i < 42; i++)

        int i=0;
        while (i!=47)
        {
            if(posx>=70 && posx<580){
                imageView3 = new ImageView(image);
                imageView3.setX(posx);
                imageView3.setY(posy);
                imageView3.setFitHeight(height);
                imageView3.setFitWidth(width);
                deck.add(imageView3);

                //  posx+=80;
          /*  lock[i] = new Rectangle(posx, posy,height,width);
            lock[i].setFill(Color.GRAY);
            lock[i].setStroke(Color.BLACK);*/

           /* if(posx >= 620)
            {
                posx = 70;
                posy += 80;
            }*/
                posx+=80;
                i++;
            }
            else{
                posx=70;
                posy+=80;
                imageView3 = new ImageView(image);
                imageView3.setX(posx);
                imageView3.setY(posy);
                imageView3.setFitHeight(height);
                imageView3.setFitWidth(width);
                deck.add(imageView3);

                i++;
            }
        }
    }


    public void make_brick(Image image,int columnNumber,int posx,int posy,int height,int width)
    {
        posy = posy + columnNumber * 40;
        int x = random.nextInt(17);
        int num=random.nextInt(3)+1;
        int i = 0;
        while(i != num)
        {
            if(((posx-10) * x) - 10 > 70 && ((posx-10) * x) - 10 < 580  /*&& lock1.posx != ((posx-10) * x) - 10*/ )
            {
                imageView2 = new ImageView(image);
                imageView2.setX(((posx - 10) * x) - 10);
                imageView2.setY(posy);
                imageView2.setFitHeight(height);
                imageView2.setFitWidth(width);
                deck.add(imageView2);
              /*  brick[i] = new Rectangle(((posx - 10) * x) - 10, posy, height, width);
                brick[i].setFill(Color.BROWN);
                brick[i].setStroke(Color.BLACK);*/
                i++;
            }

            x = random.nextInt(17);
        }
    }


    public void make_prize(Image image,int columnNumber,int posx,int posy,int height,int width)
    {
        posy = posy + columnNumber * 40;
        int x = random.nextInt(17);
        int num=random.nextInt(1)+1;
        int i = 0;
        while(i != num)
        {
            if(((posx-10) * x) - 10 > 70 && ((posx-10) * x) - 10 < 580  /*&& lock1.posx != ((posx-10) * x) - 10*/ )
            {
                imageView6 = new ImageView(image);
                imageView6.setX(((posx - 10) * x) - 10);
                imageView6.setY(posy);
                imageView6.setFitHeight(height);
                imageView6.setFitWidth(width);
                deck6.add(imageView6);

                i++;
            }

            x = random.nextInt(17);
        }
    }

    public void make_player(Image image,int posx, int posy, int height, int width)
    {
        //for (int i = 0; i < 2; i++)
        // {
        imageView1 = new ImageView(image);
        imageView1.setX(posx);
        imageView1.setY(posy);
        imageView1.setFitHeight(height);
        imageView1.setFitWidth(width);

      /*      players[i] = new Rectangle(posx, posy, height, width);
            players[i].setStroke(Color.BLACK);
            players[i].setFill(Color.GRAY);
        }*/
    }
}