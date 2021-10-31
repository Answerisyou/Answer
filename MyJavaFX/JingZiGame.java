Hello world 7036!
import javafx.application.Application;
//井字棋
import javafx.scene.Scene;

import javafx.stage.Stage;

import javafx.scene.layout.GridPane;

import javafx.scene.shape.Circle;

import javafx.scene.shape.Line;

import javafx.scene.control.Button;

import javafx.event.EventHandler;

import javafx.event.ActionEvent;

import javafx.animation.Timeline;

import javafx.util.Duration;

import javafx.animation.KeyFrame;

import javafx.scene.control.TextArea;

//@author Midori



public class JingZiGame extends Application{

    private static int a[][]=new int[3][3]; 

    private static int step=1;

    private static int last=5;

    private static boolean win=false;

    private static boolean draw=false;

    private static int wincount=0;

    private static int drawcount=0;

    private static String s="<(锟ｏ付锟�)鈫梉GO!]"+"\n"+"[锛俱偋锛綸 銈堛倣銇椼亸锛�";

    @Override

    public void start(Stage primaryStage){

        GridPane pane=new GridPane();

        pane.setMinSize(500, 300);

        primaryStage.setResizable(false);

        Button bt1=new Button();

        bt1.setMinSize(100,100);

        Button bt2=new Button();

        bt2.setMinSize(100,100);

        

        Button bt3=new Button();

        bt3.setMinSize(100,100);

        Button bt4=new Button();

        bt4.setMinSize(100,100);

        

        Button bt5=new Button();

        bt5.setMinSize(100,100);

        

        Button bt6=new Button();

        bt6.setMinSize(100,100);

        

        Button bt7=new Button();

        bt7.setMinSize(100,100);

        

        Button bt8=new Button();

        bt8.setMinSize(100,100);

        

        Button bt9=new Button();

        bt9.setMinSize(100,100);

        

        pane.add(bt1,0,0);

        pane.add(bt2,0,1);

        pane.add(bt3,0,2);

        pane.add(bt4,1,0);

        pane.add(bt5,1,1);

        pane.add(bt6,1,2);

        pane.add(bt7,2,0);

        pane.add(bt8,2,1);

        pane.add(bt9,2,2);

        Button bt=new Button("Again");

        pane.add(bt,5,1);

        Scene scene=new Scene(pane);

        EventHandler<ActionEvent>eventHandler=e1->{

            bt.setOnMousePressed(e->{

                for(int i=0;i<3;i++){

                    for(int j=0;j<3;j++)

                        a[i][j]=0;

                }

                step=1;

                last=5;

                win=false;

                draw=false;

                s="<(锟ｏ付锟�)鈫梉GO!]"+"\n"+"[锛俱偋锛綸 銈堛倣銇椼亸锛�";

            });

            

            if(last==0){

                draw=true;

                last=-1;

                drawcount++;

            }

            

            if(win){

                last=-1;

                s="浣犲拫鍙堣緭浜唦"+"\n"+"(锟,锟� )";

            }

            if(draw){

                s="娆竳骞冲眬~~"+"\n"+"鈺�(鈺�-鈺�)鈺�";

            }

            

            

            TextArea t2=new TextArea();

            t2.setText(s);

            t2.setMaxHeight(80);

            pane.add(t2,5,2);

            TextArea t1=new TextArea();

            t1.setText("浣犲凡缁忚緭浜�"+wincount+"灞�锛�"+"\n"+"浣犲凡缁忓钩浜�"+drawcount+"灞�锛�"+"\n"+"浣犺繕娌¤耽杩噡");

            t1.setMaxHeight(80);

            pane.add(t1,5,0);

            

            bt1.setText(Switch(a[0][0]));

            bt2.setText(Switch(a[0][1]));

            bt3.setText(Switch(a[0][2]));

            bt4.setText(Switch(a[1][0]));

            bt5.setText(Switch(a[1][1]));

            bt6.setText(Switch(a[1][2]));

            bt7.setText(Switch(a[2][0]));

            bt8.setText(Switch(a[2][1]));

            bt9.setText(Switch(a[2][2]));

            

            bt1.setOnMousePressed(e->{

                if(step>0&&a[0][0]==0&&last>0){

                    a[0][0]=1;

                    step--;

                    last--;

                    Play(1);

                    step++;

                }

            });

            bt2.setOnMousePressed(e->{

                if(step>0&&a[0][1]==0&&last>0){

                    a[0][1]=1;

                    step--;

                    last--;

                    Play(2);

                    step++;

                }

            });

            bt3.setOnMousePressed(e->{

                if(step>0&&a[0][2]==0&&last>0){

                    a[0][2]=1;

                    step--;

                    last--;

                    Play(3);

                    step++;

                }

            });

            bt4.setOnMousePressed(e->{

                if(step>0&&a[1][0]==0&&last>0){

                    a[1][0]=1;

                    step--;

                    last--;

                    Play(4);

                    step++;

                }

            });

            bt5.setOnMousePressed(e->{

                if(step>0&&a[1][1]==0&&last>0){

                    a[1][1]=1;

                    step--;

                    last--;

                    Play(5);

                    step++;

                }

            });

            bt6.setOnMousePressed(e->{

                if(step>0&&a[1][2]==0&&last>0){

                    a[1][2]=1;

                    step--;

                    last--;

                    Play(6);

                    step++;

                }

            });

            bt7.setOnMousePressed(e->{

                if(step>0&&a[2][0]==0&&last>0){

                    a[2][0]=1;

                    step--;

                    last--;

                    Play(7);

                    step++;

                }

            });

            bt8.setOnMousePressed(e->{

                if(step>0&&a[2][1]==0&&last>0){

                    a[2][1]=1;

                    step--;

                    last--;

                    Play(8);

                    step++;

                }

            });

            bt9.setOnMousePressed(e->{

                if(step>0&&a[2][2]==0&&last>0){

                    a[2][2]=1;

                    step--;

                    last--;

                    Play(9);

                    step++;

                }

            });

        };

        Timeline animation=new Timeline(

                new KeyFrame(Duration.millis(100),eventHandler)

        );

        animation.setCycleCount(Timeline.INDEFINITE);

        animation.play();

        primaryStage.setScene(scene);

        primaryStage.setTitle("浜曞瓧妫�");

        primaryStage.show();

    }

    

    public String Switch(int i){

        String s="";

        switch(i){

            case 0:

                s="  ";

                break;

            case -1:

                s="O";

                break;

            case 1:

                s="X";

                

        }return s;

    }

    

    

    public static void main(String[] args) {

        Application.launch(args);

    }

    

    public void Reset(){

        

    }

    

    public void Play(int i){

        if(last==4)

            if(i!=5)

                a[1][1]=-1;

            else

                a[0][0]=-1;

        else{

            if(a[0][0]!=1&&a[0][1]!=1&&a[0][2]!=1&&a[0][0]+a[0][1]+a[0][2]<-1){

                for(int j=0;j<3;j++)

                    if(a[0][j]==0)

                        a[0][j]=-1;

                win=true;wincount++;

            }

            else if(a[1][0]!=1&&a[1][1]!=1&&a[1][2]!=1&&a[1][0]+a[1][1]+a[1][2]<-1){

                for(int j=0;j<3;j++)

                    if(a[1][j]==0)

                        a[1][j]=-1;

                win=true;wincount++;

            }

            else if(a[2][0]!=1&&a[2][1]!=1&&a[2][2]!=1&&a[2][0]+a[2][1]+a[2][2]<-1){

                for(int j=0;j<3;j++)

                    if(a[2][j]==0)

                        a[2][j]=-1;

                win=true;wincount++;

            }

            else if(a[0][0]!=1&&a[1][0]!=1&&a[2][0]!=1&&a[0][0]+a[1][0]+a[2][0]<-1){

                for(int j=0;j<3;j++)

                    if(a[j][0]==0)

                        a[j][0]=-1;

                win=true;wincount++;

            }

            else if(a[0][1]!=1&&a[1][1]!=1&&a[2][1]!=1&&a[0][1]+a[1][1]+a[2][1]<-1){

                for(int j=0;j<3;j++)

                    if(a[j][1]==0)

                        a[j][1]=-1;

                win=true;wincount++;

            }

            else if(a[0][2]!=1&&a[1][2]!=1&&a[2][2]!=1&&a[0][2]+a[1][2]+a[2][2]<-1){

                for(int j=0;j<3;j++)

                    if(a[j][2]==0)

                        a[j][2]=-1;

                win=true;wincount++;

            }else if(a[0][0]!=1&&a[1][1]!=1&&a[2][2]!=1&&a[0][0]+a[1][1]+a[2][2]<-1){

                for(int j=0;j<3;j++)

                    if(a[j][j]==0)

                        a[j][j]=-1;

                win=true;wincount++;

            }

            else if(a[2][0]!=1&&a[1][1]!=1&&a[0][2]!=1&&a[2][0]+a[1][1]+a[0][2]<-1){

                for(int j=0;j<3;j++)

                    if(a[j][2-j]==0)

                        a[j][2-j]=-1;

                win=true;wincount++;

            }

            

            

            

            else if(a[0][0]!=-1&&a[0][1]!=-1&&a[0][2]!=-1&&a[0][0]+a[0][1]+a[0][2]>1){

                for(int j=0;j<3;j++)

                    if(a[0][j]==0)

                        a[0][j]=-1;

            }

            else if(a[1][0]!=-1&&a[1][1]!=-1&&a[1][2]!=-1&&a[1][0]+a[1][1]+a[1][2]>1){

                for(int j=0;j<3;j++)

                    if(a[1][j]==0)

                        a[1][j]=-1;

            }

            else if(a[2][0]!=-1&&a[2][1]!=-1&&a[2][2]!=-1&&a[2][0]+a[2][1]+a[2][2]>1){

                for(int j=0;j<3;j++)

                    if(a[2][j]==0)

                        a[2][j]=-1;

            }

            else if(a[0][0]!=-1&&a[1][0]!=-1&&a[2][0]!=-1&&a[0][0]+a[1][0]+a[2][0]>1){

                for(int j=0;j<3;j++)

                    if(a[j][0]==0)

                        a[j][0]=-1;

            }

            else if(a[0][1]!=-1&&a[1][1]!=-1&&a[2][1]!=-1&&a[0][1]+a[1][1]+a[2][1]>1){

                for(int j=0;j<3;j++)

                    if(a[j][1]==0)

                        a[j][1]=-1;

            }

            else if(a[0][2]!=-1&&a[1][2]!=-1&&a[2][2]!=-1&&a[0][2]+a[1][2]+a[2][2]>1){

                for(int j=0;j<3;j++)

                    if(a[j][2]==0)

                        a[j][2]=-1;

            }else if(a[0][0]!=-1&&a[1][1]!=-1&&a[2][2]!=-1&&a[0][0]+a[1][1]+a[2][2]>1){

                for(int j=0;j<3;j++)

                    if(a[j][j]==0)

                        a[j][j]=-1;

            }

            else if(a[2][0]!=-1&&a[1][1]!=-1&&a[0][2]!=-1&&a[2][0]+a[1][1]+a[0][2]>1){

                for(int j=0;j<3;j++)

                    if(a[j][2-j]==0)

                        a[j][2-j]=-1;

            }else{

                if(a[0][0]==0)

                    a[0][0]=-1;

                else if(a[2][0]==0)

                    a[2][0]=-1;

                else if(a[0][2]==0)

                    a[0][2]=-1;

                else if(a[2][2]==0)

                    a[2][2]=-1;

                else if(a[0][1]==0)

                    a[0][1]=-1;

                else if(a[1][0]==0)

                    a[1][0]=-1;

                else if(a[1][2]==0)

                    a[1][2]=-1;

                else

                    a[2][1]=-1;

            }

        }
    }

}
