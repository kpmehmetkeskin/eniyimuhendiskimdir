package com.grandmesalabs.eniyimuhendiskimdir;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eniyimuhendiskimdir.com/"));
        startActivity(browserIntent);

    }
}
