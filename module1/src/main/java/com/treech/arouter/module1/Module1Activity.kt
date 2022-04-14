package com.treech.arouter.module1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = "/test/activity")
class Module1Activity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module1)
    }


    fun toModule2(view: View) {
//        ARouter.getInstance()
//            .build(RoutePath.PATH_MODULE2)
//            .navigation()
    }
}