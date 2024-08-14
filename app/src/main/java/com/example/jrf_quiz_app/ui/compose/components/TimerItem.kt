package com.example.jrf_quiz_app.ui.compose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jrf_quiz_app.ui.theme.JrfCustomTheme

@Composable
fun TimerItem(
    modifier: Modifier=Modifier,
    time :Int,
    timerText:String

){
    Card (
        modifier= modifier
            .width(80.dp)
            .padding(4.dp)
            .background(MaterialTheme.colorScheme.onPrimary),
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(4.dp)

    ){
        Column(
            modifier=modifier
                .align(Alignment.CenterHorizontally)
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = time.toString(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )

            Text(
                text = timerText,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimaryContainer,

            )
        }
    }

}








@Preview(showBackground = true)
@Composable
fun TimerItemPreview() {
    JrfCustomTheme {
        TimerItem(time = 5, timerText = "Seconds")
    }
}