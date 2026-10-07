package f7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import z7.a1;
import z7.a3;
import z7.b0;
import z7.f3;
import z7.i0;
import z7.k2;
import z7.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Parcelable f3625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3626d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z4, BroadcastReceiver.PendingResult pendingResult) {
        this.f3623a = 0;
        this.f3625c = intent;
        this.f3626d = context;
        this.f3624b = z4;
        this.e = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f3623a) {
            case 0:
                Intent intent = (Intent) this.f3625c;
                Context context = (Context) this.f3626d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int iB = intent2 != null ? FirebaseInstanceIdReceiver.b(intent2) : FirebaseInstanceIdReceiver.a(context, intent);
                    if (this.f3624b) {
                        pendingResult.setResultCode(iB);
                        break;
                    }
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                f3 f3Var = (f3) this.f3625c;
                k2 k2Var = (k2) this.e;
                b0 b0Var = k2Var.f11238d;
                if (b0Var != null) {
                    k2Var.g(b0Var, this.f3624b ? null : (a3) this.f3626d, f3Var);
                    k2Var.o();
                    return;
                } else {
                    i0 i0Var = ((a1) k2Var.f159a).f11007t;
                    a1.f(i0Var);
                    i0Var.f11190f.b("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                f3 f3Var2 = (f3) this.f3625c;
                k2 k2Var2 = (k2) this.e;
                b0 b0Var2 = k2Var2.f11238d;
                if (b0Var2 != null) {
                    k2Var2.g(b0Var2, this.f3624b ? null : (q) this.f3626d, f3Var2);
                    k2Var2.o();
                    return;
                } else {
                    i0 i0Var2 = ((a1) k2Var2.f159a).f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11190f.b("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                f3 f3Var3 = (f3) this.f3625c;
                k2 k2Var3 = (k2) this.e;
                b0 b0Var3 = k2Var3.f11238d;
                if (b0Var3 != null) {
                    k2Var3.g(b0Var3, this.f3624b ? null : (z7.c) this.f3626d, f3Var3);
                    k2Var3.o();
                    return;
                } else {
                    i0 i0Var3 = ((a1) k2Var3.f159a).f11007t;
                    a1.f(i0Var3);
                    i0Var3.f11190f.b("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ f(k2 k2Var, f3 f3Var, boolean z4, h7.a aVar, int i) {
        this.f3623a = i;
        this.e = k2Var;
        this.f3625c = f3Var;
        this.f3624b = z4;
        this.f3626d = aVar;
    }
}
