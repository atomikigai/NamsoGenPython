package a3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import gb.t;
import h6.h0;
import h6.r0;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f94b;

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((t) this.f94b).f4503c.f2730b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f93a) {
            case 0:
                if (intent != null) {
                    ((d) this.f94b).g(intent);
                    return;
                }
                return;
            case 1:
                ((androidx.fragment.app.f) this.f94b).h();
                return;
            case 2:
                t tVar = (t) this.f94b;
                if (tVar != null && tVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    t tVar2 = (t) this.f94b;
                    tVar2.f4503c.getClass();
                    FirebaseMessaging.b(tVar2, 0L);
                    ((t) this.f94b).f4503c.f2730b.unregisterReceiver(this);
                    this.f94b = null;
                    return;
                }
                return;
            case 3:
                h0 h0Var = (h0) this.f94b;
                synchronized (h0Var) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : h0Var.f5000b.entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                r0 r0Var = (r0) this.f94b;
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    r0Var.e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        r0Var.e = false;
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ c(Object obj, int i) {
        this.f93a = i;
        this.f94b = obj;
    }
}
