package com.example.lab_6

/*
 * Replication prompt - Build the Android Studio shell
 *
 * Turn this repository into an Android Studio project that can be opened from
 * the repository root.
 *
 * Use Kotlin, Jetpack Compose, package com.example.lab_6, minimum SDK 24, and a
 * compatible Android/Gradle configuration. Add the Gradle wrapper, manifest,
 * resources, application icon, and MainActivity.
 *
 * MainActivity must show visible centered text saying "Lab 6" and
 * "Code Documentation and Unit Testing." Build the debug APK and verify the
 * application launches on an emulator without crashing or showing an empty
 * screen.
 */

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/** Hosts the simple landing screen for the Lab 6 demonstration app. */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Lab6Screen()
                }
            }
        }
    }
}

@Composable
private fun Lab6Screen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Lab 6",
            style = MaterialTheme.typography.headlineLarge,
        )
        Text(
            text = "Code Documentation and Unit Testing",
            style = MaterialTheme.typography.bodyLarge,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Lab6ScreenPreview() {
    MaterialTheme {
        Lab6Screen()
    }
}
