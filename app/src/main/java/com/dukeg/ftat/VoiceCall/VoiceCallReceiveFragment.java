package com.dukeg.ftat.VoiceCall;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dukeg.ftat.LogUtils.logger;
import com.dukeg.ftat.R;

/**
 * Created by Administrator on 2017/12/19.
 * This is voice call receive fragment.
 */

public class VoiceCallReceiveFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View voice_call_send_view = inflater.inflate(R.layout.voicecall_receive_fragment, container, false);

        logger.d("This is voice call receive interface");

        return voice_call_send_view;
    }
}
