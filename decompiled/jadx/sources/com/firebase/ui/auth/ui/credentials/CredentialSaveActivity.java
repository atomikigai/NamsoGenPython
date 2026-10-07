package com.firebase.ui.auth.ui.credentials;

import a2.l;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.y;
import com.bumptech.glide.d;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.tasks.TaskCompletionSource;
import h5.a;
import n9.b;
import r4.g;
import r4.i;
import s4.c;
import s4.h;
import u4.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class CredentialSaveActivity extends e {
    public a O;

    @Override // u4.c, androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        a aVar = this.O;
        aVar.getClass();
        if (i == 100) {
            if (i10 == -1) {
                aVar.f(h.c(aVar.f4968j));
            } else {
                Log.e("SmartLockViewModel", "SAVE: Canceled by user.");
                aVar.f(h.a(new g(0, "Save canceled by user.")));
            }
        }
    }

    @Override // u4.e, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i iVar = (i) getIntent().getParcelableExtra("extra_idp_response");
        Credential credential = (Credential) getIntent().getParcelableExtra("extra_credential");
        a aVar = (a) new l(this).q(a.class);
        this.O = aVar;
        aVar.d(w());
        a aVar2 = this.O;
        aVar2.f4968j = iVar;
        aVar2.f2917g.d(this, new v4.a(this, this, iVar, 0));
        Object obj = this.O.f2917g.e;
        if (obj == y.f1104k) {
            obj = null;
        }
        if (((h) obj) != null) {
            Log.d("CredentialSaveActivity", "Save operation in progress, doing nothing.");
            return;
        }
        Log.d("CredentialSaveActivity", "Launching save operation.");
        a aVar3 = this.O;
        if (!((c) aVar3.f2923f).f8402u) {
            aVar3.f(h.c(aVar3.f4968j));
            return;
        }
        aVar3.f(h.b());
        if (credential == null) {
            aVar3.f(h.a(new g(0, "Failed to build credential.")));
            return;
        }
        if (aVar3.f4968j.e().equals("google.com")) {
            String strZ = d.z("google.com");
            d7.a aVarN = b.n(aVar3.c());
            Credential credentialC = jd.l.c(aVar3.i.f2702f, "pass", strZ);
            if (credentialC == null) {
                throw new IllegalStateException("Unable to build credential");
            }
            q qVarDelete = x6.b.f10300c.delete(aVarN.asGoogleApiClient(), credentialC);
            wa.d dVar = new wa.d();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            qVarDelete.addStatusListener(new z(qVarDelete, taskCompletionSource, dVar));
            taskCompletionSource.getTask();
        }
        d7.a aVar4 = aVar3.h;
        aVar4.getClass();
        q qVarSave = x6.b.f10300c.save(aVar4.asGoogleApiClient(), credential);
        wa.d dVar2 = new wa.d();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        qVarSave.addStatusListener(new z(qVarSave, taskCompletionSource2, dVar2));
        taskCompletionSource2.getTask().addOnCompleteListener(new a5.a(aVar3, 15));
    }
}
