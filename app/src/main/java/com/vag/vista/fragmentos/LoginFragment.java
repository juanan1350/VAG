package com.vag.vista.fragmentos;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;

import com.vag.R;
import com.vag.databinding.FragmentLoginBinding;
import com.vag.modelo.Usuarios;


public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;
    private LoginFragInterface mCallback;

    public interface LoginFragInterface {
        void onAceptarLoginFrag(String user);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof LoginFragInterface) {
            mCallback = (LoginFragInterface) context;
        } else {
            throw new RuntimeException(context + " must implement LoginFragInterface");
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }

        // Inits


        // Inits Dptos Observer

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Inits
        // Listeners
//        binding.btLoginAceptar.setOnClickListener(btLoginAceptar_OnClickListener);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallback = null;
    }

    private final View.OnClickListener btLoginAceptar_OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String user;
            InputMethodManager imm = (InputMethodManager) requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null) imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
            if(binding.et00.getText().toString()!=null){
                user= binding.et00.getText().toString();
            }else{
                user=null;
            }

            mCallback.onAceptarLoginFrag(user);

        }
    };
}