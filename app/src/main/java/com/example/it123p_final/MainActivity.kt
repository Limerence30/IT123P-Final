package com.example.it123p_final

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.it123p_final.ui.theme.IT123PFinalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IT123PFinalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "asdafdgwsedrf vsdvfb sdx cfdvc vddfcxvzfdsx cxvdfscf ",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
// asdasdfkjasofdhoidhflisadbfvdkjsdfkjgfhaslkfh
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hasdfasdfzsdfa$name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IT123PFinalTheme {
        Greeting("Android")
    }
}