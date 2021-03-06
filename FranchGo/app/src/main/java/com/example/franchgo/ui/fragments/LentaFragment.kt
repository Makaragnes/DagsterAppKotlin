package com.example.franchgo.ui.fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.franchgo.R
import com.example.franchgo.utilits.APP_ACTIVITY
import kotlinx.android.synthetic.main.fragment_lenta.*

class LentaFragment : BaseFragment(R.layout.fragment_lenta) {

    private val url = "http://192.168.1.43:80/vac"

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Лента"

        lenta_web_view.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }
        }
        val webSettings = lenta_web_view.settings

        webSettings.javaScriptEnabled = true
        lenta_web_view.loadUrl(url)
    }
}