package comsic.fred.animalforfun;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Game extends AppCompatActivity {
    //ประกาศตัวแปร
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;
    int questionCount=10;//กำหนดจำนวนข้อ
    ArrayList<Integer>qID = new ArrayList<Integer>();//qid ใช้ วน array
    String answer;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //ผูกตัวแปร
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        questionImageView = (ImageView) findViewById(R.id.imvOuestion);
        volumnImageButton = (ImageButton) findViewById(R.id.imbVolumn);

        for (int i=1;i<=questionCount;i++) {
            qID.add(i);//จองพื้นที่หน่วยความจำของจำนวนข้อ
        }
        //ramdomข้อคำถาม
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));
    }//end oncreate

    private void setQuestion(Integer qID) {//เเสดงผลคำถาม
        if (qID == 1) {
            answer="นก";
            questionImageView.setImageResource(R.drawable.bird_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("หมู");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 2) {
            answer="แมว";
            questionImageView.setImageResource(R.drawable.cat_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แมว");
            choice.add("หมา");
            choice.add("เเกะ");
            choice.add("ยุง");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 3) {
            answer="วัว";
            questionImageView.setImageResource(R.drawable.cow_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("วัว");
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("หมู");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 4) {
            answer="หมา";
            questionImageView.setImageResource(R.drawable.dog_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมา");
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("เเกะ");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 5) {
            answer="ช้าง";
            questionImageView.setImageResource(R.drawable.elephant_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("ม้า");
            choice.add("แมว");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 6) {
            answer="ม้า";
            questionImageView.setImageResource(R.drawable.horse_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ม้า");
            choice.add("วัว");
            choice.add("ยุง");
            choice.add("แกะ");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 7) {
            answer="สิงโต";
            questionImageView.setImageResource(R.drawable.lion_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("เเมว");
            choice.add("หมา");
            choice.add("วัว");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 😎 {
            answer="ยุง";
            questionImageView.setImageResource(R.drawable.mosquito_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ยุง");
            choice.add("ม้า");
            choice.add("นก");
            choice.add("หมู");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9) {
            answer="หมู";
            questionImageView.setImageResource(R.drawable.pig_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมู");
            choice.add("แกะ");
            choice.add("วัว");
            choice.add("แมว");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 10) {
            answer="แกะ";
            questionImageView.setImageResource(R.drawable.sheep_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แกะ");
            choice.add("หมา");
            choice.add("นก");
            choice.add("ม้า");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
    }//end setquestion
    public void chioiceAns(View view){//metboh สำหรับตรวจคำตอบ
        Button button = (Button) view;
        String buttonString =button.getText().toString();// เก็บข้อความบนปุ่มลงตัวแปร buttomString
        if(buttonString.equals(answer)){//ถ้าข้อความตรงกับที่เฉลย ให้ +1
            score++;
        }
        // เช็ดว่าทำครบทุกข้อ
        if(qID.isEmpty()){//ถ้าครบ ก็show score
            dialogBoxScore();

        }
        else{//ถ้่ไม่ครบ ก็ไปเรียกคำถามข้อต่อไปมาอยู่ index 0
            setQuestion(qID.remove(0));
        }

    }//end chioiceAns

    private void dialogBoxScore() {//เเสดงคะเเนน
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะเเนน");
        builder.setMessage("คุณได้คะเเนน : "+score+"คะเเนน")
                .setCancelable(false)
                .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("เล่นต่อ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        AlertDialog alertDialog = builder.create();// คำสั่งสร้าง dialogbox ออกมา
        alertDialog.show();


    }//end dialogboxscore

    public void playSound(View view){

        mediaPlayer.start();

    }//end playsound
}//end class
