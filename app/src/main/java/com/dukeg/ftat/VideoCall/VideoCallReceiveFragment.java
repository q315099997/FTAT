package com.dukeg.ftat.VideoCall;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dukeg.ftat.LogUtils.logger;
import com.dukeg.ftat.R;

/**
 * Created by Administrator on 2017/12/19.
 * This is video call receive fragment.
 */

public class VideoCallReceiveFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View video_call_receive_view = inflater.inflate(R.layout.videocall_receive_fragment, container, false);

        logger.d("This is video call receive interface");

        return video_call_receive_view;
    }
}
