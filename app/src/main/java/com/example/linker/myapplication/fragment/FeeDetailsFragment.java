package com.example.linker.myapplication.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.linker.myapplication.R;
import com.example.linker.myapplication.model.Fee;
import com.example.linker.myapplication.model.Profile;
import com.example.linker.myapplication.model.Session;
import com.example.linker.myapplication.other.CustomFeeAdapter;
import com.example.linker.myapplication.other.HeaderVars;
import com.example.linker.myapplication.rest.ApiClient;
import com.example.linker.myapplication.rest.StudentApiInterface;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FeeDetailsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FeeDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FeeDetailsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<Fee> data;
    private static ArrayList<Integer> removedItems;

    Profile profile;
    public Session session;

    public FeeDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FeeDetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FeeDetailsFragment newInstance(String param1, String param2) {
        FeeDetailsFragment fragment = new FeeDetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fee_details, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.fee_recycler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        profile = HeaderVars.getProfile();

        try {
            session = new Session(new JSONObject(getActivity().getIntent().getStringExtra("session")));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if(profile == null) {
            StudentApiInterface studentApiService = ApiClient.getClient().create(StudentApiInterface.class);
            studentApiService.getStudentDetails(session.getStudent_id(), session.getUid(),
                    HeaderVars.getAccessToken(), HeaderVars.getTokenType(), HeaderVars.getClient(),
                    HeaderVars.getExpiry()).enqueue(new retrofit2.Callback<Profile>() {
                @Override
                public void onResponse(Call<Profile> call, Response<Profile> response) {
                    if (response.isSuccessful()) {
                        HeaderVars.setAccessToken(response.headers().get("Access-Token"));
                        HeaderVars.setTokenType(response.headers().get("Token-Type"));
                        HeaderVars.setClient(response.headers().get("Client"));
                        HeaderVars.setExpiry(response.headers().get("Expiry"));

                        HeaderVars.setProfile(response.body());
                    } else {
                        Log.e("Error", response.message());
                    }
                }

                @Override
                public void onFailure(Call<Profile> call, Throwable t) {
                    Log.e("Error", t.getMessage());
                }
            });
        }

        profile = HeaderVars.getProfile();
        adapter = new CustomFeeAdapter(profile.getFees());
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
