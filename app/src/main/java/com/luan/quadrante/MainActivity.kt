package com.luan.quadrante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luan.quadrante.ui.theme.QuadranteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadranteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrante()
                }
            }
        }
    }
}

@Composable
fun Quadrante() {
    Row(modifier = Modifier.fillMaxHeight()) {
        Column(Modifier.weight(1F)) {
            MeuCartao(
                titulo = "Text composable",
                cor = Color.Green,
                descricao = "Displays text and follows Material Design guidelines.",
                modifier = Modifier.weight(1F)
            )
            MeuCartao(
                titulo = "Image composable",
                cor = Color.Yellow,
                descricao = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1F)
            )
        }
        Column(Modifier.weight(1F)) {
            MeuCartao(
                titulo = "Row composable",
                cor = Color.Cyan,
                descricao = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1F)
            )
            MeuCartao(
                titulo = "Column composable",
                cor = Color.LightGray,
                descricao = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1F)
            )
        }
    }
}

@Composable
fun MeuCartao(
    cor: Color,
    descricao: String,
    modifier: Modifier = Modifier,
    titulo: String
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(cor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(

            text = descricao, textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadranteTheme {
        Quadrante()
    }
}