package com.viranika.tourism

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_blank_fragment_rahimabad.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class BlankFragmentRahimabad : Fragment() {

    var mWebView: WebView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_blank_fragment_rahimabad, container, false)

        val moreInformationR = view.findViewById(R.id.more_information_rahimabad_button) as Button
        moreInformationR.setOnClickListener {
            horizontalScrollViewR.visibility = View.INVISIBLE
            discription_rahimabad.visibility = View.INVISIBLE
            more_information_rahimabad_button.visibility = View.INVISIBLE
            rahimabad_webview.visibility = View.VISIBLE
        }

        mWebView = view.findViewById(R.id.rahimabad_webview)
        mWebView!!.loadUrl("http://www.skchto.com/fa/database/historical-buildings/83")

        // Enable Javascript
        val webSettings = mWebView!!.getSettings()
        webSettings.javaScriptEnabled = true

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView!!.setWebViewClient(WebViewClient())

        return view
    }
}
