package com.example.jrf_quiz_app.ui.compose.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jrf_quiz_app.Greeting
import com.example.jrf_quiz_app.R
import com.example.jrf_quiz_app.ui.theme.JrfCustomTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeAppbar(
    modifier: Modifier=Modifier
){
    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.app_name))
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(painter = painterResource(id = R.drawable.menu), contentDescription = "menu" )
            }
        }
    )
}
@Preview(showBackground = true)
@Composable
fun HomeAppbarPreview() {
    HomeAppbar ()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuestionAppbar(
    time:String,
    modifier: Modifier=Modifier
){
    CenterAlignedTopAppBar(
        title = {
            Text(text = time)
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(painter = painterResource(id = R.drawable.left), contentDescription = "menu" )
            }
        }

    )
}
@Preview(showBackground = true)
@Composable
fun QuestionAppbarPreview() {
    QuestionAppbar("5.36")
}