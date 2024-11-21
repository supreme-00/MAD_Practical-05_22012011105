package com.example.jettyy.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jettyy.R
import com.example.jettyy.screen.components.FormField


@Preview(showBackground = true)
@Composable
fun RegisterScreen(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(0.dp)
    )
    {

        Image(
            painter = painterResource(id = R.drawable.guni), // Reference to guni.png
            contentDescription = "GUNI Logo",
            modifier = Modifier
                .size(120.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )

        Card(elevation = CardDefaults.cardElevation(20.dp),
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
                FormField(Label = "Name")
                FormField(Label = "Phone Number")
                FormField(Label = "City")
                FormField(Label = "Email")
                FormField(Label = "Password", isPasswordField = true)
                FormField(Label = "Confirm Password", isPasswordField = true)
                Button(onClick = { /*TODO*/ },
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
                )
            }
        }
    }
}
