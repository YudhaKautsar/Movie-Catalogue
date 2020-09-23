package com.moviecatalogue.moviecatalogue.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.moviecatalogue.moviecatalogue.BuildConfig.URL_POSTER
import com.moviecatalogue.moviecatalogue.R
import com.squareup.picasso.Picasso
import org.jetbrains.anko.*

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class DetailActivity : AppCompatActivity() {

    private var titleMovie: String = ""
    private var posterMovie: String = ""
    private var overviewMovie: String = ""

    private lateinit var poster: ImageView
    private lateinit var title: TextView
    private lateinit var overview: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        linearLayout{
            lparams(width = matchParent, height = wrapContent)
            orientation = LinearLayout.VERTICAL
            padding = dip(16)

            poster = imageView{

            }.lparams{
                width = dip(matchParent)
                padding = dip(48)
                gravity = Gravity.CENTER
                height = dip(250)
            }

            title = textView()
            overview = textView()
        }

        val intent = intent
        titleMovie = intent.getStringExtra("TITLE")
        overviewMovie = intent.getStringExtra("OVERVIEW")
        posterMovie = intent.getStringExtra("POSTER")

        title.text = titleMovie
        overview.text = overviewMovie
        Picasso.get().load(URL_POSTER + posterMovie). into(poster)
    }
}