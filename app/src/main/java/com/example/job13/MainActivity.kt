package com.example.job13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var namaEdit: EditText
    private lateinit var umurEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var Btn: Button

    private val NAMA_KEY: String="nama"
    private val AGE_KEY: String="kelas"
    private val NIS_KEY: String="NIS"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEdit=findViewById(R.id.namaEdit)
        umurEdit=findViewById(R.id.umurEdit)
        kelasEdit=findViewById(R.id.kelasEdit)
        Btn = findViewById(R.id.Btn)

        Btn.setOnClickListener{
            val intent = Intent (this, MainActivity2::class.java)
            intent.putExtra(NAMA_KEY, namaEdit.text.toString())
            intent.putExtra(AGE_KEY, umurEdit.text.toString())
            startActivity(intent)
        }
    }
}