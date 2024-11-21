package com.example.jettyy.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormField(
    Label: String,
    isNumber: Boolean = false,
    isPasswordField: Boolean = false
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = Label,
            fontSize = 18.sp,
            modifier = Modifier.weight(1f)
        )
        if (isNumber) {
            OutlinedTextField(
                label = { Text("Enter $Label") },
                placeholder = { Text("Enter $Label") },
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(2f),
                textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                visualTransformation = VisualTransformation.None,
            )
        } else {
            OutlinedTextField(
                label = { Text("Enter $Label") },
                placeholder = { Text("Enter $Label") },
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .padding(16.dp)
                    .weight(2f),
                textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                visualTransformation =
                (if (isPasswordField)
                    PasswordVisualTransformation()
                else
                    VisualTransformation.None)
            )
        }
    }
}