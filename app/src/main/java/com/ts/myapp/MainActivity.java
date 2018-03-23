package com.ts.myapp;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.ts.myapp.activity.LoginActivity;
import com.ts.myapp.fragment.BookrackFragment;
import com.ts.myapp.fragment.CategoryFragment;
import com.ts.myapp.fragment.HomeFragment;
import com.ts.myapp.fragment.UserFragment;
import com.ts.myapp.helper.BottomNavigationViewHelper;
import com.ts.myapp.utils.ToastUtils;


public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private HomeFragment homeFragment;
    private CategoryFragment categoryFragment;
    private BookrackFragment bookrackFragment;
    private UserFragment userFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    repalceFragment(homeFragment, HomeFragment.class);
                    return true;
                case R.id.navigation_category:
                    repalceFragment(categoryFragment, CategoryFragment.class);
                    return true;
                case R.id.navigation_bookrack:
                    repalceFragment(bookrackFragment, BookrackFragment.class);
                    return true;
                case R.id.navigation_user:
                    if (1 == 1) {
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(intent);

                        ToastUtils.showLongToast(MainActivity.this, "登陆成功！");
                    } else {
                        repalceFragment(userFragment, UserFragment.class);
                    }
                    return true;
            }
            return false;
        }
    };

    /**
     * 替换Fragment
     *
     * @param fragment
     * @param fragmentClass
     */
    private void repalceFragment(Fragment fragment, Class fragmentClass) {
        fragmentTransaction = fragmentManager.beginTransaction();

        if (fragment == null) {
            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
//            fragmentTransaction.add(R.id.fragment_content, fragment);
            fragmentTransaction.replace(R.id.fragment_content, fragment);
        }

        //隐藏所有fragment
        hideFragment(fragmentTransaction);
        //显示需要显示的fragment
//        fragmentTransaction.show(fragment);
        fragmentTransaction.commit();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();

        repalceFragment(homeFragment, HomeFragment.class);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        BottomNavigationViewHelper.disableShiftMode(navigation);
    }


    /**
     * 隐藏所有的fragment
     */
    private void hideFragment(FragmentTransaction transaction) {
        if (homeFragment != null) {
            transaction.hide(homeFragment);
        }
        if (categoryFragment != null) {
            transaction.hide(categoryFragment);
        }
        if (bookrackFragment != null) {
            transaction.hide(bookrackFragment);
        }
        if (userFragment != null) {
            transaction.hide(userFragment);
        }
    }

    protected void onResume() {
        super.onResume();
        UserFragment fragment = new UserFragment();
        fragmentManager = getFragmentManager();
        repalceFragment(userFragment, UserFragment.class);
        ToastUtils.showShortToast(MainActivity.this, "1111！");
        Intent intent = new Intent(MainActivity.this, UserFragment.class);
    }
}
