package id.sch.xirpl6_23smktelkom_mlg.advancedwidget3;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import id.sch.xirpl6_23smktelkom_mlg.advancedwidget3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    String nama;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setNama(nama);
    }
}
