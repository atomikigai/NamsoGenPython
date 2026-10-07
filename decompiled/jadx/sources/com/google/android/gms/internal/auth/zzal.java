package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import w6.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final q addWorkAccount(o oVar, String str) {
        return ((i0) oVar).f2119b.doWrite(new zzae(this, a.f9680a, oVar, str));
    }

    public final q removeWorkAccount(o oVar, Account account) {
        return ((i0) oVar).f2119b.doWrite(new zzag(this, a.f9680a, oVar, account));
    }

    public final void setWorkAuthenticatorEnabled(o oVar, boolean z4) {
        setWorkAuthenticatorEnabledWithResult(oVar, z4);
    }

    public final q setWorkAuthenticatorEnabledWithResult(o oVar, boolean z4) {
        return ((i0) oVar).f2119b.doWrite(new zzac(this, a.f9680a, oVar, z4));
    }
}
