package fm.jiecao.jcvideoplayer_lib;

@SuppressWarnings("ALL")
public interface JCMediaPlayerListener {
    void onPrepared();

    void onCompletion();

    void onAutoCompletion();

    void onBufferingUpdate(int percent);

    void onSeekComplete();

    void onError(int what, int extra);

    void onInfo(int what, int extra);

    void onVideoSizeChanged();

    void goBackThisListener();

    boolean goToOtherListener();

    void autoFullscreenLeft();

    void autoFullscreenRight();

    void autoQuitFullscreen();
}
