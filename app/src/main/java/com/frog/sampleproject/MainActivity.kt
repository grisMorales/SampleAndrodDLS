package com.frog.sampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import com.example.mylibrary.componentes.PrimaryButton
import com.example.mylibrary.componentes.SecondaryButton
import com.example.mylibrary.ui.DlsTheme
import com.example.mylibrary.ui.dlsDarkColorPalette
import com.example.mylibrary.ui.dlsLightColorPalette


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val isDarkState = mutableStateOf(false)
        val helloView = findViewById<ComposeView>(R.id.hello)

        helloView.setContent {
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Switch(
                    checked = isDarkState.value,
                    onCheckedChange = { checked ->
                        isDarkState.value = checked
                    },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = DlsTheme.colors.primary,
                        uncheckedThumbColor = DlsTheme.colors.basic
                    )
                )
                DlsTheme(
                    colors = if (isDarkState.value) dlsDarkColorPalette() else dlsLightColorPalette()
                ) {
                    PrimaryButton("PrimaryButton") { }
                    SecondaryButton("SecondaryButton") { }
                }
            }
        }
    }
}


@Preview
@Composable
private fun Hello(){
    Text("Hello Jetpack Compose",
        modifier = Modifier
            .wrapContentWidth(Alignment.CenterHorizontally))
}