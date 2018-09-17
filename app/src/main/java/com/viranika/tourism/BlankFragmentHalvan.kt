package com.viranika.tourism


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_blank_fragment_halvan.*
import kotlinx.android.synthetic.main.fragment_blank_fragment_rahimabad.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class BlankFragmentHalvan : Fragment() {

    var mWebView: WebView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_blank_fragment_halvan, container, false)

        val moreInformationH = view.findViewById(R.id.more_information_halvan_button) as Button
        moreInformationH.setOnClickListener {
            horizontalScrollViewH.visibility = View.INVISIBLE
            discription_halvan.visibility = View.INVISIBLE
            more_information_halvan_button.visibility = View.INVISIBLE
            halvan_webview.visibility = View.VISIBLE
        }

        mWebView = view.findViewById(R.id.halvan_webview)
        mWebView!!.loadUrl("http://www.skchto.com/fa/%DA%AF%D8%B1%D8%AF%D8%B4%DA%AF%D8%B1%DB%8C-%D9%88-%D8%B3%D8%B1%D9%85%D8%A7%DB%8C%D9%87-%DA%AF%D8%B0%D8%A7%D8%B1%DB%8C/tourist-attractions/81")

        // Enable Javascript
        val webSettings = mWebView!!.getSettings()
        webSettings.javaScriptEnabled = true

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView!!.setWebViewClient(WebViewClient())

        return view
    }
}
