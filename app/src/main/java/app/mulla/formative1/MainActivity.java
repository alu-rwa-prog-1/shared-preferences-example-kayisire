package app.mulla.formative1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner session = findViewById(R.id.session_spinner);
        session.setOnItemSelectedListener(this);
        List<String> sessions = new ArrayList<String>();
        sessions.add("Session 1");
        sessions.add("Session 2");
        sessions.add("Session 3");

        ArrayAdapter<String> adapterSession = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, sessions);
        adapterSession.setDropDownViewResource(android.R.layout.activity_list_item);
        session.setAdapter(adapterSession);

        Spinner dept = findViewById(R.id.dept_spinner);
        dept.setOnItemSelectedListener(this);
        List<String> deptList = new ArrayList<String>();
        deptList.add("Department 1");
        deptList.add("Department 2");
        deptList.add("Department 3");

        ArrayAdapter<String> deptAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, deptList);
        deptAdapter.setDropDownViewResource(android.R.layout.activity_list_item);
        session.setAdapter(deptAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
