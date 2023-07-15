package com.talhakara.thaber
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var firestore: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Firestore referansını al
        firestore = FirebaseFirestore.getInstance()

        // Firestore'dan haberleri al ve RecyclerView'a ata
        getNewsFromFirestore()
    }

    private fun getNewsFromFirestore() {
        val newsList = mutableListOf<News>()

        // "haberler" koleksiyonundaki verileri dinle
        firestore.collection("haberler")
            .get()
            .addOnSuccessListener { querySnapshot ->
                newsList.clear()

                for (document in querySnapshot.documents) {
                    val title = document.getString("baslik") ?: ""
                    val description = document.getString("metin") ?: ""

                    val news = News(title, description)
                    newsList.add(news)
                }

                // Adapter'ı oluştur ve veri kaynağını ata
                newsAdapter = NewsAdapter(newsList) { news ->
                    // Haber öğesine tıklandığında çağrılacak metot
                    navigateToNewsDetails(news)
                }

                // RecyclerView'a adapter'ı ata
                recyclerView.adapter = newsAdapter
            }
            .addOnFailureListener { exception ->
                // Hata durumunda işlemleri burada yönetebilirsiniz
                Toast.makeText(this, exception.localizedMessage, Toast.LENGTH_LONG).show()
            }
    }

    private fun navigateToNewsDetails(news: News) {
        val intent = Intent(this, HaberIcerik::class.java)
        intent.putExtra("haberBaslik", news.title)
        intent.putExtra("haberIcerik", news.description)
        startActivity(intent)
    }
}





