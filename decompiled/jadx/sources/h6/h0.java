package h6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5002d;
    public Context e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5001c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f5000b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.c f4999a = new a3.c(this, 3);

    public final synchronized void a(Context context) {
        try {
            if (this.f5001c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.e = applicationContext;
            if (applicationContext == null) {
                this.e = context;
            }
            zzbcn.zza(this.e);
            zzbce zzbceVar = zzbcn.zzdT;
            e6.t tVar = e6.t.f3437d;
            this.f5002d = ((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) tVar.f3440c.zza(zzbcn.zzkG)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.e.registerReceiver(this.f4999a, intentFilter);
            } else {
                this.e.registerReceiver(this.f4999a, intentFilter, 4);
            }
            this.f5001c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f5002d) {
            this.f5000b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbcn.zza(context);
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzkG)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f5002d) {
            this.f5000b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
