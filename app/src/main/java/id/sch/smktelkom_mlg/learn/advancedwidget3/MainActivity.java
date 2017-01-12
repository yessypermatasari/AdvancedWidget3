package id.sch.smktelkom_mlg.learn.advancedwidget3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.databinding.DataBindingUtil;
import id.sch.smktelkom_mlg.learn.advancedwidget3.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    String nama;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setNama(nama);
    }
}
