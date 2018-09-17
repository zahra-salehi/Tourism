package com.viranika.tourism


import android.opengl.Visibility
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_blank_fragment_fork.*
import kotlinx.android.synthetic.main.fragment_blank_fragment_rahimabad.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class BlankFragmentFork : Fragment() {

    var mWebView: WebView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_blank_fragment_fork, container, false)

        val moreInformationF = view.findViewById(R.id.more_information_fork_button) as Button
        moreInformationF.setOnClickListener {
            horizontalScrollViewF.visibility = View.INVISIBLE
            discription_fork.visibility = View.INVISIBLE
            more_information_fork_button.visibility = View.INVISIBLE
            fork_webview.visibility = View.VISIBLE
        }

        mWebView = view.findViewById(R.id.fork_webview)
        mWebView!!.loadUrl("http://www.skchto.com/fa/database/historical-buildings/643")

        // Enable Javascript
        val webSettings = mWebView!!.getSettings()
        webSettings.javaScriptEnabled = true

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView!!.setWebViewClient(WebViewClient())

        return view
    }
}
