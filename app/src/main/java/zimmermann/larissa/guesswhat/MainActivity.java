package zimmermann.larissa.guesswhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView randomNumber;
    private Button playButton;
    private Button resetButton;

    @Override //Método principal para executar o aplicativo
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) findViewById(R.id.playButtonId);
        resetButton = (Button) findViewById(R.id.resetButtonId);
        randomNumber = (TextView) findViewById(R.id.randomNumberId);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(100);
                randomNumber.setText("" + number);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomNumber.setText(R.string.textNumber);
            }
        });
    }
}
