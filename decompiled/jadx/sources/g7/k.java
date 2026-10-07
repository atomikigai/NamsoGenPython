package g7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzd;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends zau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4253b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f4253b = eVar;
        this.f4252a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i10 = f.f4240a;
        e eVar = this.f4253b;
        Context context = this.f4252a;
        int iD = eVar.d(context, i10);
        AtomicBoolean atomicBoolean = h.f4242a;
        if (iD == 1 || iD == 2 || iD == 3 || iD == 9) {
            Intent intentB = eVar.b(context, "n", iD);
            eVar.i(context, iD, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, zzd.zza | 134217728));
        }
    }
}
