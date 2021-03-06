package com.example.linker.myapplication.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.linker.myapplication.R;
import com.example.linker.myapplication.activity.MainActivity;
import com.example.linker.myapplication.model.Profile;
import com.example.linker.myapplication.model.Session;
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
 * {@link ProfileFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MainActivity mainActivity;
    public Session session;

    ArrayList<Profile> profileArrayList;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_profile, container, false);

        CollapsingToolbarLayout collapsingToolbarLayout = getActivity().findViewById(R.id.htab_collapse_toolbar);

        collapsingToolbarLayout.setTitle("Profile");
        Profile profile = HeaderVars.getProfile();

        try {
            session = new Session(new JSONObject(getActivity().getIntent().getStringExtra("session")));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ImageView studentProfilePhoto = rootView.findViewById(R.id.user_profile_photo);
        final TextView studentName = rootView.findViewById(R.id.user_profile_name);
        final TextView studentDateOfBirth = rootView.findViewById(R.id.txt_date_of_birth);
        final TextView studentGender = rootView.findViewById(R.id.txt_gender);
        final TextView studentBirthPlace = rootView.findViewById(R.id.txt_birth_place);
        final TextView studentBloodGroup = rootView.findViewById(R.id.txt_blood_group);
        final TextView studentMotherTongue = rootView.findViewById(R.id.txt_mother_tongue);
        final TextView studentNationality = rootView.findViewById(R.id.txt_nationality);
        final TextView studentAdhar = rootView.findViewById(R.id.txt_adhar);
        final TextView studentCasteCategory = rootView.findViewById(R.id.txt_caste_category);
        final TextView studentCaste = rootView.findViewById(R.id.txt_caste);
        final TextView studentReligion = rootView.findViewById(R.id.txt_religion);
        final TextView studentMedicalHistory = rootView.findViewById(R.id.txt_medical_history);
        final TextView studentSiblingsInfo = rootView.findViewById(R.id.txt_sibling_info);
        final TextView studentSkills = rootView.findViewById(R.id.txt_skills);
        final TextView studentDisability = rootView.findViewById(R.id.txt_disability);

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
        studentName.setText(getFullName(profile.getFirstName(), profile.getMiddleName(), profile.getLastName()));
        if (profile.getProfilePhoto() != null) {
            if (profile.getProfilePhoto().getUrl() != null) {
                Glide.with(getActivity()).load(profile.getProfilePhoto().getUrl())
                        .crossFade()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(studentProfilePhoto);
            }
        }

        studentDateOfBirth.setText(profile.getDateOfBirth());
        studentGender.setText(profile.getGender());
        studentBloodGroup.setText(profile.getBloodGroup());
        studentBirthPlace.setText(profile.getBirthPlace());
        studentNationality.setText(profile.getNationality());
        studentMotherTongue.setText(profile.getMotherTongue());
        studentAdhar.setText(profile.getStudentAdhar());
        studentCasteCategory.setText(profile.getCasteCategory().getCategory());
        studentCaste.setText(profile.getCaste().getName());
        studentReligion.setText(profile.getReligion().getName());
        studentMedicalHistory.setText(profile.getMedicalHistory());
        studentSiblingsInfo.setText(profile.getSiblingsSchoolingDetails());
        studentSkills.setText(profile.getSkillOfChild());
        studentDisability.setText(profile.getDisabilityOfStudent());


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

    public String getFullName(String firstName, String middleName, String lastName){
        return firstName +" "+ middleName +" "+ lastName;
    }
}
