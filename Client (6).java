import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.FileReader;
import java.util.Random;

public class Client extends Application
{


    @Override
    public void start(Stage theStage) throws Exception
    {
        Image image5 = new Image("g.jpg");
        ImageView imageView = new ImageView(image5);
        imageView.setFitHeight(660);
        imageView.setFitWidth(660);
        Group root = new Group(imageView);
        Scene scene = new Scene(root,660,660, Color.GREEN);

        MapManager map=new MapManager();
        theStage.setTitle("BomberMan");
        theStage.setScene(scene);
        theStage.show();

        JsonParser parser = new JsonParser();
        FileReader jsonfile = new FileReader("map.json.txt");
        Object obj = parser.parse(jsonfile);
        JsonObject jsonobj = (JsonObject)obj;


        int height = jsonobj.get("height").getAsInt();
        int width=jsonobj.get("width").getAsInt();
        int posyup=jsonobj.get("posyup").getAsInt();
        int posydown=jsonobj.get("posydown").getAsInt();
        int posxleft=jsonobj.get("posxleft").getAsInt();
        int posxright=jsonobj.get("posxright").getAsInt();
        int heightplayer=jsonobj.get("heightplayer").getAsInt();
        int widthplayer=jsonobj.get("widthplayer").getAsInt();
        int posylock=jsonobj.get("posylock").getAsInt();
        int posxlock=jsonobj.get("posxlock").getAsInt();
        int heightlock=jsonobj.get("heightlock").getAsInt();
        int posxbrick=jsonobj.get("posxbrick").getAsInt();
        int posybrick=jsonobj.get("posybrick").getAsInt();


        JsonArray array0 = jsonobj.get("posx").getAsJsonArray();
        JsonArray array1 = jsonobj.get("posy").getAsJsonArray();
        JsonArray array2 = jsonobj.get("posxplayer").getAsJsonArray();
        JsonArray array3 = jsonobj.get("posyplayer").getAsJsonArray();



        Image image0 = new Image("a1.jpg");
        Image image3 = new Image("a2.jpg");
        Image image1 = new Image("b3.jpg");
        Image image2 = new Image("c1.jpg");
        Image image4 = new Image("s.jpg");

        map.make_wall_up(image2,array0.get(0).getAsInt(),posyup,height,width);
        root.getChildren().addAll(map.deck2);

       // for(int i=0;i<16;i++)
       // {
           // map.make_wall_up(image4,array0.get(i).getAsInt(),posyup,height,width);
            map.make_wall_left(image2,posxleft,array1.get(0).getAsInt(),height,width);
            map.make_wall_down(image2,array0.get(0).getAsInt(),posydown,height,width);
            map.make_wall_right(image2,posxright,array1.get(0).getAsInt(),height,width);
            //root.getChildren().addAll(map.deck2);
            root.getChildren().addAll(map.deck3);
            root.getChildren().addAll(map.deck4);
            root.getChildren().addAll(map.deck5);
        //}

        for(int i = 0;i < 13; i++)
        {
            map.make_brick(image1,i,posxbrick,posybrick,heightlock,heightlock);
            root.getChildren().addAll(map.deck1);

        }

        map.make_lock1(image2, posxlock, posylock, heightlock, heightlock);
        root.getChildren().addAll(map.deck);



            map.make_player(image0,array2.get(0).getAsInt(),array3.get(0).getAsInt(),widthplayer,heightplayer);
            root.getChildren().addAll(map.imageView1);
            map.make_player(image3,array2.get(1).getAsInt(),array3.get(1).getAsInt(),widthplayer,heightplayer);
            root.getChildren().addAll(map.imageView1);
    }

    public static void main(String args[])
    {
        launch (args);
    }
}
