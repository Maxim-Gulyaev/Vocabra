package com.maxim.vocabra

import android.os.Bundle
import android.util.Log
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
import com.maxim.vocabra.ui.theme.VocabraTheme
import io.appwrite.Client
import io.appwrite.ID
import io.appwrite.services.Databases
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VocabraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

        /*val client = Client(applicationContext)
            .setEndpoint("https://cloud.appwrite.io/v1")
            .setProject("670bb91300322d72610a")

        val databases = Databases(client)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                databases.createDocument(
                    databaseId = "670bcacd00152856f60a",
                    collectionId = "670bcaeb00141d11506d",
                    documentId = ID.unique(),
                    data = mapOf("userName" to "hamlet", "isFreeAccount" to false),
                )
            } catch (e: Exception) {
                Log.e("Appwrite", "Error: " + e.message)
            }
        }*/
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hellooooo $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VocabraTheme {
        Greeting("Android")
    }
}