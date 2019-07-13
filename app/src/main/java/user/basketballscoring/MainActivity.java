package user.basketballscoring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final String TAG = "CheckActivityLifecycle";

    TextView txtFirstTeam;
    TextView txtSecondTeam;
    TextView txtScoreFirstTeam;
    TextView txtScoreSecondTeam;

    Button btnTwoPointFirstTeam;
    Button btnThreePointFirstTeam;
    Button btnTwoPointSecondTeam;
    Button btnThreePointSecondTeam;

    Button btnFinish;

    int firstTeamScore = 0;
    int secondTeamScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate called!");

        txtFirstTeam = findViewById(R.id.txt_first_team);
        txtSecondTeam = findViewById(R.id.txt_second_team);
        txtScoreFirstTeam = findViewById(R.id.score_first_team);
        txtScoreSecondTeam = findViewById(R.id.score_second_team);

        btnTwoPointFirstTeam = findViewById(R.id.two_point_first_team);
        btnThreePointFirstTeam = findViewById(R.id.three_point_first_team);
        btnTwoPointSecondTeam = findViewById(R.id.two_point_second_team);
        btnThreePointSecondTeam = findViewById(R.id.three_point_second_team);

        btnFinish = findViewById(R.id.btn_finish);

        btnTwoPointFirstTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPoint(1, 2);
            }
        });

        btnThreePointFirstTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPoint(1, 3);
            }
        });

        btnTwoPointSecondTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPoint(2, 2);
            }
        });

        btnThreePointSecondTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPoint(2, 3);
            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // finish
            }
        });

    }

    private void addPoint(int team, int point) {
        if (team == 1) {
            firstTeamScore = firstTeamScore + point;
        } else {
            secondTeamScore = secondTeamScore + point;
        }
        updateScore(team);
    }

    private void updateScore(int team) {
        if (team == 1) {
            txtScoreFirstTeam.setText(String.valueOf(firstTeamScore));
        } else {
            txtScoreSecondTeam.setText(String.valueOf(secondTeamScore));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called!");
    }
}
