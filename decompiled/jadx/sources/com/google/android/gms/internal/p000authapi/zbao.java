package com.google.android.gms.internal.p000authapi;

import a7.j;
import a7.o;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import c9.f;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fa.c1;
import g7.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zbao extends l {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        h hVar = new h();
        zba = hVar;
        zbal zbalVar = new zbal();
        zbb = zbalVar;
        zbc = new i("Auth.Api.Identity.CredentialSaving.API", zbalVar, hVar);
    }

    public zbao(Activity activity, o oVar) {
        super(activity, activity, zbc, oVar, k.f2167c);
        this.zbd = zbbb.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status = Status.f2042r;
        if (intent == null) {
            return status;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : c1.q(byteArrayExtra, creator));
        return status2 == null ? status : status2;
    }

    public final Task<a7.i> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        i0.i(saveAccountLinkingTokenRequest);
        new ArrayList();
        List list = saveAccountLinkingTokenRequest.f2004d;
        String str = saveAccountLinkingTokenRequest.f2003c;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f2001a;
        String str2 = saveAccountLinkingTokenRequest.f2002b;
        int i = saveAccountLinkingTokenRequest.f2005f;
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.e);
        String str3 = this.zbd;
        i0.a("Consent PendingIntent cannot be null", pendingIntent != null);
        i0.a("Invalid tokenType", "auth_code".equals(str2));
        i0.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str));
        i0.a("scopes cannot be null", list != null);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str, list, str3, i);
        f fVarA = x.a();
        fVarA.e = new d[]{zbba.zbg};
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth-api.zbaj
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbao zbaoVar = this.zba;
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                zbam zbamVar = new zbam(zbaoVar, (TaskCompletionSource) obj2);
                zbz zbzVar = (zbz) ((zbw) obj).getService();
                i0.i(saveAccountLinkingTokenRequest3);
                zbzVar.zbc(zbamVar, saveAccountLinkingTokenRequest3);
            }
        };
        fVarA.f1816b = false;
        fVarA.f1817c = 1535;
        return doRead(fVarA.a());
    }

    public final Task<a7.k> savePassword(j jVar) {
        i0.i(jVar);
        final j jVar2 = new j(jVar.f228a, this.zbd, jVar.f230c);
        f fVarA = x.a();
        fVarA.e = new d[]{zbba.zbe};
        fVarA.f1818d = new t() { // from class: com.google.android.gms.internal.auth-api.zbak
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbao zbaoVar = this.zba;
                j jVar3 = jVar2;
                zban zbanVar = new zban(zbaoVar, (TaskCompletionSource) obj2);
                zbz zbzVar = (zbz) ((zbw) obj).getService();
                i0.i(jVar3);
                zbzVar.zbd(zbanVar, jVar3);
            }
        };
        fVarA.f1816b = false;
        fVarA.f1817c = 1536;
        return doRead(fVarA.a());
    }

    public zbao(Context context, o oVar) {
        super(context, null, zbc, oVar, k.f2167c);
        this.zbd = zbbb.zba();
    }
}
