package connersimmons.me.recyclerviewexample;

import android.view.View;

/**
 * Created by Conner Simmons on 11/19/16.
 * The Blue Book Building & Construction Network
 * csimmons@mail.thebluebook.com
 */

public interface ClickListener {
    void onClick(View view, int position);
    void onLongClick(View view, int position);
}
