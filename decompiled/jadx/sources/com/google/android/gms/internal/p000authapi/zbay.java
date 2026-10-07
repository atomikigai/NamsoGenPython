package com.google.android.gms.internal.p000authapi;

import a7.b;
import a7.c;
import a7.d;
import a7.e;
import a7.f;
import a7.g;
import a7.p;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fa.c1;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zbay extends l {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        h hVar = new h();
        zba = hVar;
        zbat zbatVar = new zbat();
        zbb = zbatVar;
        zbc = new i("Auth.Api.Identity.SignIn.API", zbatVar, hVar);
    }

    public zbay(Activity activity, p pVar) {
        super(activity, activity, zbc, pVar, k.f2167c);
        this.zbd = zbbb.zba();
    }

    public final Task<f> beginSignIn(e eVar) {
        i0.i(eVar);
        a7.a aVar = eVar.f215b;
        i0.i(aVar);
        d dVar = eVar.f214a;
        i0.i(dVar);
        c cVar = eVar.f218f;
        i0.i(cVar);
        b bVar = eVar.f219r;
        i0.i(bVar);
        final e eVar2 = new e(dVar, aVar, this.zbd, eVar.f217d, eVar.e, cVar, bVar);
        c9.f fVarA = x.a();
        fVarA.e = new g7.d[]{zbba.zba};
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth-api.zbap
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbay zbayVar = this.zba;
                e eVar3 = eVar2;
                zbau zbauVar = new zbau(zbayVar, (TaskCompletionSource) obj2);
                zbai zbaiVar = (zbai) ((zbaz) obj).getService();
                i0.i(eVar3);
                zbaiVar.zbc(zbauVar, eVar3);
            }
        };
        fVarA.f1816b = false;
        fVarA.f1817c = 1553;
        return doRead(fVarA.a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws j {
        Status status = Status.f2042r;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : c1.q(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f2044t);
        }
        if (!status2.g()) {
            throw new j(status2);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new j(status);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final g gVar) {
        i0.i(gVar);
        c9.f fVarA = x.a();
        fVarA.e = new g7.d[]{zbba.zbh};
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth-api.zbas
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zba.zba(gVar, (zbaz) obj, (TaskCompletionSource) obj2);
            }
        };
        fVarA.f1817c = 1653;
        return doRead(fVarA.a());
    }

    public final a7.l getSignInCredentialFromIntent(Intent intent) throws j {
        Status status = Status.f2042r;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : c1.q(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f2044t);
        }
        if (!status2.g()) {
            throw new j(status2);
        }
        Parcelable.Creator<a7.l> creator2 = a7.l.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        a7.l lVar = (a7.l) (byteArrayExtra2 != null ? c1.q(byteArrayExtra2, creator2) : null);
        if (lVar != null) {
            return lVar;
        }
        throw new j(status);
    }

    public final Task<PendingIntent> getSignInIntent(a7.h hVar) {
        i0.i(hVar);
        String str = hVar.f222a;
        i0.i(str);
        String str2 = hVar.f225d;
        final a7.h hVar2 = new a7.h(str, hVar.f223b, this.zbd, str2, hVar.e, hVar.f226f);
        c9.f fVarA = x.a();
        fVarA.e = new g7.d[]{zbba.zbf};
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth-api.zbaq
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbay zbayVar = this.zba;
                a7.h hVar3 = hVar2;
                zbaw zbawVar = new zbaw(zbayVar, (TaskCompletionSource) obj2);
                zbai zbaiVar = (zbai) ((zbaz) obj).getService();
                i0.i(hVar3);
                zbaiVar.zbe(zbawVar, hVar3);
            }
        };
        fVarA.f1817c = 1555;
        return doRead(fVarA.a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = o.f2170a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        com.google.android.gms.common.api.internal.h.a();
        c9.f fVarA = x.a();
        fVarA.e = new g7.d[]{zbba.zbb};
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zba.zbb((zbaz) obj, (TaskCompletionSource) obj2);
            }
        };
        fVarA.f1816b = false;
        fVarA.f1817c = 1554;
        return doWrite(fVarA.a());
    }

    public final /* synthetic */ void zba(g gVar, zbaz zbazVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zbai) zbazVar.getService()).zbd(new zbax(this, taskCompletionSource), gVar, this.zbd);
    }

    public final /* synthetic */ void zbb(zbaz zbazVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zbai) zbazVar.getService()).zbf(new zbav(this, taskCompletionSource), this.zbd);
    }

    public zbay(Context context, p pVar) {
        super(context, null, zbc, pVar, k.f2167c);
        this.zbd = zbbb.zba();
    }
}
