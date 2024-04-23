package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeImage()
                }
            }
        }
    }
}

@Composable
fun ComposeText(col1 : String, col2 : String, col3 : String, modifier: Modifier = Modifier){
    Column {
        Text(
            text = col1,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = col2,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = col3,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Composable
fun ComposeImage(){
    Column {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "Compose depiction image"
        )
        ComposeText(col1 = stringResource(id = R.string.jetpack_compose_tutorial),
            col2 = stringResource(id = R.string.jetpack_compose_intro),
            col3 = stringResource(id = R.string.jetpack_compose_main)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        ComposeImage(

        )
    }
}