package abhinav.hackdev.co.fetchmarker102;

import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Surface;

import com.google.android.exoplayer.ExoPlayer;


public class VideoPlayer extends AppCompatActivity {

    private ExoPlayer exoPlayer ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    /*void play(String strUri, Surface surface) {
        Uri uri = Uri.parse(strUri);
        final int numRenderers = 2;

        // Build the sample source
        SampleSource sampleSource =
                new FrameworkSampleSource(this.getApplicationContext(), uri, *//* headers *//* null, numRenderers);

        // Build the track renderers
        TrackRenderer videoRenderer = new MediaCodecVideoTrackRenderer(sampleSource, MediaCodec.VIDEO_SCALING_MODE_SCALE_TO_FIT);
        TrackRenderer audioRenderer = new MediaCodecAudioTrackRenderer(sampleSource);

        // Build the ExoPlayer and start playback
        exoPlayer = ExoPlayer.Factory.newInstance(numRenderers);
        exoPlayer.prepare(videoRenderer, audioRenderer);

        // Pass the surface to the video renderer.
        exoPlayer.sendMessage(videoRenderer, MediaCodecVideoTrackRenderer.MSG_SET_SURFACE, surface);
        exoPlayer.setPlayWhenReady(true);
    }*/


    @Override
    protected void onPause() {
        assert exoPlayer!=null ;
        exoPlayer.release();
        super.onPause();
    }

}
