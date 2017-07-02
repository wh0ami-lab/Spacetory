package chat.tox.spacetory;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import chat.tox.spacetory.data.State;
import chat.tox.spacetory.tox.ToxService;
import chat.tox.spacetory.tox.ToxSingleton;

public class AlarmReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent2)
    {

        Thread t = State.serviceThreadMain();
        t.interrupt();
    }
}