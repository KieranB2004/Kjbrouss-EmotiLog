package com.example.kjbrouss_emotilog;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
// this class runs the second fragment thorugh the secondfragment.xml file
// it uses the timestamp for each emotion button press which was passed by the first fragment
// to the second fragment. where it is then appended to the old value to show the whole list of log values
// that were just clicked on the first fragment.
// once you go back to first fragment every log value is saved.
// Code advice for timestamps given by oracle.com citation in README file
public class SecondFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState
    ) {

        View binding = inflater.inflate(R.layout.secondfragment, container, false);
        String button_timestamp = SecondFragmentArgs.fromBundle(getArguments()).getButtonTimestamp();
        TextView textView_timestamp = binding.findViewById(R.id.textView_timestamp);
        String textview_current_value = textView_timestamp.getText().toString();
        String timestamp_string_new = textview_current_value + button_timestamp + "\n";
        textView_timestamp.setText(timestamp_string_new);
        return binding;

    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}
