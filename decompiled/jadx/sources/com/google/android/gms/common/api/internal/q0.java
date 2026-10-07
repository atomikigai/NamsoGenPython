package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.base.zac;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends b8.c implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a8.b f2140s = a8.c.f245a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f2142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a8.b f2143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f2144d;
    public final com.google.android.gms.common.internal.i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b8.a f2145f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h0 f2146r;

    public q0(Context context, Handler handler, com.google.android.gms.common.internal.i iVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f2141a = context;
        this.f2142b = handler;
        this.e = iVar;
        this.f2144d = iVar.f2194a;
        this.f2143c = f2140s;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void onConnectionFailed(g7.b bVar) {
        this.f2146r.d(bVar);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onConnectionSuspended(int i) {
        h0 h0Var = this.f2146r;
        f0 f0Var = (f0) ((h) h0Var.f2118f).f2108u.get((a) h0Var.f2116c);
        if (f0Var != null) {
            if (f0Var.f2089t) {
                f0Var.n(new g7.b(17));
            } else {
                f0Var.onConnectionSuspended(i);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void y() {
        b8.a aVar = this.f2145f;
        aVar.getClass();
        try {
            aVar.f1421b.getClass();
            Account account = new Account(com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount googleSignInAccountB = com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT.equals(account.name) ? e7.b.a(aVar.getContext()).b() : null;
            Integer num = aVar.f1423d;
            com.google.android.gms.common.internal.i0.i(num);
            com.google.android.gms.common.internal.a0 a0Var = new com.google.android.gms.common.internal.a0(2, account, num.intValue(), googleSignInAccountB);
            b8.d dVar = (b8.d) aVar.getService();
            b8.g gVar = new b8.g(1, a0Var);
            Parcel parcelZaa = dVar.zaa();
            zac.zac(parcelZaa, gVar);
            zac.zad(parcelZaa, this);
            dVar.zac(12, parcelZaa);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f2142b.post(new a1(3, this, new b8.h(1, new g7.b(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
