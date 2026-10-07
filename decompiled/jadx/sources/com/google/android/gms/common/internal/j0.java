package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends zzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f2208a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(f fVar, Looper looper) {
        super(looper);
        this.f2208a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f2208a.zzd.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                c0 c0Var = (c0) message.obj;
                c0Var.getClass();
                c0Var.c();
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f2208a.enableLocalFallback()) || message.what == 5)) && !this.f2208a.isConnecting()) {
            c0 c0Var2 = (c0) message.obj;
            c0Var2.getClass();
            c0Var2.c();
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f2208a.zzB = new g7.b(message.arg2);
            if (f.zzo(this.f2208a)) {
                f fVar = this.f2208a;
                if (!fVar.zzC) {
                    fVar.a(3, null);
                    return;
                }
            }
            f fVar2 = this.f2208a;
            g7.b bVar = fVar2.zzB != null ? fVar2.zzB : new g7.b(8);
            this.f2208a.zzc.b(bVar);
            this.f2208a.onConnectionFailed(bVar);
            return;
        }
        if (i11 == 5) {
            f fVar3 = this.f2208a;
            g7.b bVar2 = fVar3.zzB != null ? fVar3.zzB : new g7.b(8);
            this.f2208a.zzc.b(bVar2);
            this.f2208a.onConnectionFailed(bVar2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            g7.b bVar3 = new g7.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f2208a.zzc.b(bVar3);
            this.f2208a.onConnectionFailed(bVar3);
            return;
        }
        if (i11 == 6) {
            this.f2208a.a(5, null);
            f fVar4 = this.f2208a;
            if (fVar4.zzw != null) {
                fVar4.zzw.onConnectionSuspended(message.arg2);
            }
            this.f2208a.onConnectionSuspended(message.arg2);
            f.zzn(this.f2208a, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f2208a.isConnected()) {
            c0 c0Var3 = (c0) message.obj;
            c0Var3.getClass();
            c0Var3.c();
            return;
        }
        int i12 = message.what;
        if (i12 != 2 && i12 != 1 && i12 != 7) {
            Log.wtf("GmsClient", da.v.f(i12, "Don't know how to handle message: "), new Exception());
            return;
        }
        c0 c0Var4 = (c0) message.obj;
        synchronized (c0Var4) {
            try {
                bool = c0Var4.f2182a;
                if (c0Var4.f2183b) {
                    Log.w("GmsClient", "Callback proxy " + c0Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            f fVar5 = c0Var4.f2186f;
            int i13 = c0Var4.f2185d;
            if (i13 != 0) {
                fVar5.a(1, null);
                Bundle bundle = c0Var4.e;
                c0Var4.a(new g7.b(i13, bundle != null ? (PendingIntent) bundle.getParcelable(f.KEY_PENDING_INTENT) : null));
            } else if (!c0Var4.b()) {
                fVar5.a(1, null);
                c0Var4.a(new g7.b(8, null));
            }
        }
        synchronized (c0Var4) {
            c0Var4.f2183b = true;
        }
        c0Var4.c();
    }
}
