package com.example.animatedemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import com.example.animatedemo.databinding.FragmentHomeBinding
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text

class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        //这里绑定了ComposeView
        val view = binding.composeHome
        view.setContent {
            HomePage()
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    @Preview
    @Composable
    fun HomePage() {
        Column(modifier = Modifier.padding(24.dp)) {
            Text(text = "我是 Jetpack Compose")
        }
    }
}
