package com.example.jettyy.screen

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jettyy.R
import com.example.jettyy.navigateToRegistrationScreen
import com.example.jettyy.screen.components.FormField
import com.example.jettyy.showMsg

@Preview(showBackground = true)
@Composable
fun RegisterScreen(context: Context? = null, modifier: Modifier = Modifier, navController: NavController?=null)
{
    // two ways to show msg , one is using context and second is :    fun RegisterScreen(showMsg:((msg:String)->Unit)?=null,modifier: Modifier = Modifier)

    var name by remember {
        mutableStateOf("")
    }
    var city by remember {
        mutableStateOf("")
    }
    var confirm by remember {
        mutableStateOf("")
    }
    var phone by remember {
        mutableStateOf("")
    }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.End
    )
    {

        Image(
            painter = painterResource(id = R.drawable.guni), // Reference to guni.png
            contentDescription = "GUNI Logo",
            modifier = Modifier
                .height(130.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )

        Card(elevation = CardDefaults.cardElevation(20.dp),
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
                FormField(Label = "Name", textState = name, onTextChange = {name = it})
                FormField(Label = "Phone Number", textState = phone, onTextChange = {phone = it} , isNumber = true)
                FormField(Label = "City",textState = city, onTextChange = {city = it})
                FormField(Label = "Email",textState = email, onTextChange = {email = it})
                FormField(Label = "Password",textState = password, onTextChange = {password = it}, isPasswordField = true)
                FormField(Label = "Confirm Password",textState = confirm, onTextChange = {confirm = it}, isPasswordField = true)
                Button(onClick = { showMsg(context!!, "You have logged in.")
                    navigateToRegistrationScreen(navController!!)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally),
                ) {
                    Text(text = "REGISTER")

                }
                Text(
                    text="Already have an Account?",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(bottom = 50.dp)
                        .align(Alignment.End)
                        .clickable {
                            navigateToRegistrationScreen(navController!!) // Trigger navigation
                        }
                )
            }
        }
    }
}