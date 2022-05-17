import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {

    MaterialTheme {
        Column {
            Text("Pikachu")
            Image(painter = painterResource("pikachu.png"),
                  contentDescription = "imagem do pokemon",
                  modifier = Modifier.height(200.dp)
                )
            Text("Número Pokédex: 025 - Tipo: Elétrico")
        }




    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication,
           title = "Pokédex"
    ) {
        App()
    }
}
