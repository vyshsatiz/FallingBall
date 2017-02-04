/**
 * Created by vijisat on 04-02-2017.
 */

/**
 * Implementations are listeners for game related events
 *
 * @author martin
 *
 */
public interface OnGameEventsListener {

    /**
     * A callback that is fired when the game finishes.
     */
    void onGameEnd();

    /**
     * A callback that is fired when a new point is scored
     */
    void onGameScoreChanged();
}