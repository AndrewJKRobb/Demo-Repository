package demo.showcase;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TabHost;



public class ReportActivity extends FragmentActivity {


    private TabHost mTabHost;
    public ReportActivity(){

    }

    public void BarClick(View view) {
        Fragment myfragment;
        myfragment = new BarReportFragment();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_switch, myfragment);
        fragmentTransaction.commit();

    }

    public void LineClick(View view) {
        Fragment myfragment;
        myfragment = new LineReportFragment();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_switch, myfragment);
        fragmentTransaction.commit();

    }

    public void PieClick(View view) {
        Fragment myfragment;
        myfragment = new PieReportFragment();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_switch, myfragment);
        fragmentTransaction.commit();

    }
}
