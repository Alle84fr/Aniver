package com.impacta.niver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.impacta.anivers.ui.theme.AniversTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // deletar enableEdgeToEdge()
        setContent {
            AniversTheme{
                Surface(
                    // tem  haver com cor de fundo/ conteiner
                    modifier = Modifier.fillMaxSize(), //Lembrar de por virgular
                    color = MaterialTheme.colorScheme.background
                ) {
                    // deve chamar a função aqui também
                    Festinha()
                }
            }
        }
    }

// Novas funções de configuração
// Sempre ter @omposable
// tab para aceitar sugestão

    @Composable
// mostra texto na interface
    fun TextoSaudacao(message: String, from: String, modifier: Modifier = Modifier) {
        Column (
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        ){
            Text(
                text = message,
                fontSize = 50.sp,
                lineHeight = 60.sp,    // altura da linha (espaço entre elas)
                textAlign = TextAlign.Center,   //centraliza
                color = Color.Blue,
                modifier = Modifier
                    .offset(y = 45.dp) // se (-20).dp -> sobe, se 20.dp desce
            )

            // ir para função Aniversário e chamar esta lá
            // ir para class e chamar lá
            Text(
                text = from,
                fontSize = 36.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(25.dp)
                    .align(alignment = Alignment.CenterHorizontally)
                    .offset(y = 69.dp)
            )
        }
    }




    // @ preview é rodar no Android sem usar o app, mostrando como fundo padrão, algo assim.
    @Preview(showBackground = true)
    @Composable
    fun Festinha() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            TextoSaudacao(
                message = "Um Feliz Aniversário Prooo!!",
                from = "Ale",
                modifier = Modifier.fillMaxSize(),
            )
        }}
}
