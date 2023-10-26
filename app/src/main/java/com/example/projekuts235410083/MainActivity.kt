//nama paket wisata pantai glagah
package com.example.projekuts235410083

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projekuts235410083.ui.theme.ProjekUTS235410083Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjekUTS235410083Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WisataApp()
                }
            }
        }
    }
}



//Fungsi composable ImageWithButton() menyimpan perintah pilihan klik terbaru,
// dalam variabel result, yang ditentukan dengan composable remember dan fungsi
// mutableStateOf() di baris kode ini "var currentStep by remember { mutableStateOf(1) }"
@Composable
fun ImageWithButton(modifier: Modifier) {
           Column {
    var currentStep by remember { mutableStateOf(1) }
    //kontainer surface menggunakan modifier Max size dan background dari theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        //pernyataan when untuk perintah agar saat tombol button diklik akan pindah ke gambar berikutnya atau sebelumnya
        when (currentStep) {
            1 -> {
                //fungsi kolom
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                     //spasi dengan 32 dp
                    Spacer(modifier = Modifier.height(32.dp))
                    //fungsi image yang berisi gambar dengan nama glagah_pantai yang tersimpan di dwawable
                    Image(
                        //Teruskan argumen painter ke fungsi Image(), lalu tetapkan nilai
                        // painterResource yang menerima argumen ID resource drawable
                        painter = painterResource(id = R.drawable.glagah_pantai),
                        //deskripsi konten
                        contentDescription = stringResource(id = R.string.glagah_content_description),
                        //deskripsi konten
                        modifier = Modifier.wrapContentSize()
                    )
                    //spasi antara tekx dan button yaitu 32 dp
                    Spacer(modifier = Modifier.height(32.dp))
                    //tombol button dengan perintah pindah kehalaman 2
                    Button(onClick = { currentStep = 2 })
                    {
                        //nama tombol sesui dengan yang ada di strings.xml
                        Text (stringResource(R.string.detail))
                    }

                }
            }
            //untuk kebawahnya cuma ngulang seperti yang diatas perbedaan hanya beda di halaman yang akan dituju
            2 -> {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(R.drawable.glagah_pasar),
                        contentDescription = stringResource(id = R.string.glagah_content_description),
                        modifier = Modifier.wrapContentSize()
                    )
                    Text(
                        "Nah, siapa yang saat berwisata merasa bagian paling seru adalah berburu oleh-oleh?" +
                                "Meskipun oleh-oleh hukumnya tidak wajib," +
                                "tapi adakalanya kita memang harus membelinya untuk orang-orang terdekat."
                    )

                    Spacer(modifier = Modifier.height(32.dp))
                    Row() {
                        Button(onClick = { currentStep = 1 })
                        {
                            Text(stringResource(R.string.prevous))
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Button(onClick = { currentStep = 3 })
                        {
                            Text(stringResource(R.string.next))
                        }
                    }
                }
            }
            3 -> {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Image(
                        painter = painterResource(R.drawable.glagah_perahu),
                        contentDescription = stringResource(id = R.string.glagah_content_description),
                        modifier = Modifier.wrapContentSize()
                    )
                    Text("Laguna Pantai Glagah Indah terbentuk dari cekungan yang terisi air pasang sehingga membentuk kolam raksasa." +
                            "Dulu, ada suatu masa di mana laguna ini dimanfaatkan sebagai lokasi memancing " +
                            "Pernah juga laguna difungsikan untuk arena bebek kayuh dan beberapa sarana olahraga air lainnya." +
                            "Sekarang, sebagian besar area laguna digunakan sebagai jalur perahu wisata.")
                    Spacer(modifier = Modifier.height(32.dp))
                    Row(){
                        Button(onClick = { currentStep = 2 })
                        {
                            Text(stringResource(R.string.prevous))
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Button(onClick = { currentStep = 4 })
                        {
                            Text(stringResource(R.string.next))
                        }

                    }


                }
            }
            4 -> {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Image(
                        painter = painterResource(R.drawable.glagah_atv),
                        contentDescription = stringResource(id = R.string.glagah_content_description),
                        modifier = Modifier.wrapContentSize()
                    )
                    Text("Jika Anda berkunjung ke Pantai Glagah tak ada salahnya mencoba permainan ATV ini untuk berkeliling di sekitar pantai." +
                            "Untuk menyewa ATV kita harus membayar sebesar Rp 30.000,00 untuk menikmati permainan ini")


                    Spacer(modifier = Modifier.height(32.dp))
                    Row(){
                        Button(onClick = { currentStep = 3 })
                        {
                            Text(stringResource(R.string.prevous))
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Button(onClick = { currentStep = 5 })
                        {
                            Text(stringResource(R.string.next))
                        }

                    }

                }
            }
            5 -> {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Image(
                        painter = painterResource(R.drawable.glagah_naga),
                        contentDescription = stringResource(id = R.string.glagah_content_description),
                        modifier = Modifier.wrapContentSize()
                    )
                    Text("Di pesisir pantai terdapat perkebunan buah naga yang bernama Agrowisata Kusumo Wanadri." +
                            "Seorang tokoh terkemuka Pantai Glagah bernama Romo Paulus mengubah kebun yang awalnya berupa semak belukar menjadi budidaya buah naga." +
                            "Pengunjung dapat memperoleh informasi singkat mengenai proses penanaman, perawatan, hingga khasiat yang dimiliki.")
                    Spacer(modifier = Modifier.height(32.dp))
                    Row(){
                        Button(onClick = { currentStep = 4 })
                        {
                            Text(stringResource(R.string.prevous))
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Button(onClick = { currentStep = 1 })
                        {
                            Text(stringResource(R.string.awal))
                        }

                    }


                }
            }


        }
    }
           }
}




@Preview
@Composable
//fungsi  WisataApp() yang digunakan untuk memanggil fungsi  ImageWithButton
fun WisataApp() {
    //ungsi ImageWithButton untuk menerima argumen modifier dari jenis Modifier dan tetapkan nilai default Modifier.
    ImageWithButton(modifier = Modifier
        //nilai default Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )

}
