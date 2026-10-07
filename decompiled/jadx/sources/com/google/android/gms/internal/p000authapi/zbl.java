package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.i0;
import x6.b;
import z6.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zbl {
    public final q delete(o oVar, Credential credential) {
        i0.j(oVar, "client must not be null");
        i0.j(credential, "credential must not be null");
        return ((com.google.android.gms.common.api.internal.i0) oVar).f2119b.doWrite(new zbi(this, oVar, credential));
    }

    public final q disableAutoSignIn(o oVar) {
        i0.j(oVar, "client must not be null");
        return ((com.google.android.gms.common.api.internal.i0) oVar).f2119b.doWrite(new zbj(this, oVar));
    }

    public final PendingIntent getHintPickerIntent(o oVar, HintRequest hintRequest) {
        i0.j(oVar, "client must not be null");
        i0.j(hintRequest, "request must not be null");
        i iVar = b.f10298a;
        throw new UnsupportedOperationException();
    }

    public final q request(o oVar, a aVar) {
        i0.j(oVar, "client must not be null");
        i0.j(aVar, "request must not be null");
        return ((com.google.android.gms.common.api.internal.i0) oVar).f2119b.doRead(new zbg(this, oVar, aVar));
    }

    public final q save(o oVar, Credential credential) {
        i0.j(oVar, "client must not be null");
        i0.j(credential, "credential must not be null");
        return ((com.google.android.gms.common.api.internal.i0) oVar).f2119b.doWrite(new zbh(this, oVar, credential));
    }
}
