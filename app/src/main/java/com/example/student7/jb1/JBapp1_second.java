package com.example.student7.jb1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JBapp1_second extends ActionBarActivity {
    private EditText urlView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_jbapp1);

        Bundle intentExtras = getIntent().getExtras();
        String username = intentExtras.getString("username");
        String password = intentExtras.getString("password");

        TextView helloView = (TextView) findViewById(R.id.hello);
        helloView.setText("Witaj " + username + " !");
        urlView = (EditText) findViewById(R.id.url);
    }
    public void openClicked(View view) {

        String url = urlView.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
}