package com.example.btsaplication.ui.main.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.example.btsaplication.MainViewModel
import com.example.btsaplication.R
import kotlinx.android.synthetic.main.fragment_sign_up.*

/**
 * A simple [Fragment] subclass.
 */
class SignUpFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel

    companion object{
        fun newInstance(): SignUpFragment {
            return SignUpFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mainViewModel = ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java)

        val username = edt_username.text.toString()
        val email = edt_email.text.toString()
        val password = edt_email.text.toString()
        val phone = edt_phone.text.toString()
        val address = edt_address.toString()
        val city = edt_city.text.toString()
        val country = edt_country.text.toString()
        val name = edt_name.text.toString()
        val postCode = edt_post_code.text.toString()
    }


}
