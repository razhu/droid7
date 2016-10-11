package agetic.gob.bo.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private Button b1;
    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            et1 = (EditText) findViewById(R.id.et_1);
            b1 = (Button) findViewById(R.id.b_1);
            t1 = (TextView) findViewById(R.id.tv_1);
            b1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          t1.setText(et1.getText().toString());
                                          et1.setText("");
                                      }
                                  }
            );
    }
}
