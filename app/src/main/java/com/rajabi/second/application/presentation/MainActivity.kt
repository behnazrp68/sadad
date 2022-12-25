package com.rajabi.second.application.presentation

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.rajabi.second.application.R
import com.rajabi.second.application.data.model.Info
import com.rajabi.second.application.databinding.ActivityMainBinding
import com.rajabi.second.application.presentation.di.core.Injector
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    var CONTENT_URI = Uri.parse("content://com.rajabi.second.firstapplication.provider/users")

    @Inject
    public lateinit var factory: MainActivityViewModelFactory
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding
    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        (application as Injector).createInfoSubComponent().inject(this)
        viewModel = ViewModelProvider(this, factory).get(MainActivityViewModel::class.java)
        val name = getIntent().getExtras()?.get("name") as? String
        val bool = getIntent().getExtras()?.get("bool") as? Boolean
        info = Info(0, name, bool)
        viewModel.saveInfo(info)
        Timer().schedule(object : TimerTask() {
            override fun run() {
                viewModel.updateInfos()
                Log.i("MYTAG","successs")
            }
        }, 50000)

    }


}