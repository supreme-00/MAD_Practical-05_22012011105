package com.example.jettyy

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.jettyy.screen.LoginScreen
import com.example.jettyy.ui.theme.JettyyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JettyyTheme {
                    AppNavigation(context = this)

            }
        }
    }
}
//view is base class
//there is youtube vid. on toolkit - how if we change view class that chnage is implemented everywhere so how to avoid this problem
//there are two type of UI : 1)Imperative (which we do) 2) (by jetpack) - you need to write @composable else you will see your UI
//
fun showMsg(context: Context, msg: String){
    val toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT)
    toast.show()
}