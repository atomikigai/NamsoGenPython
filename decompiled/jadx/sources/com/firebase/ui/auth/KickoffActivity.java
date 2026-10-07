package com.firebase.ui.auth;

import a2.l;
import a5.a;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import r4.f;
import r4.g;
import r4.i;
import s4.c;
import s4.h;
import s4.j;
import t4.n;
import u4.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class KickoffActivity extends e {
    public static final /* synthetic */ int P = 0;
    public n O;

    @Override // u4.c, androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        if (i == 106 && (i10 == 113 || i10 == 114)) {
            c cVarW = w();
            cVarW.f8400s = null;
            setIntent(getIntent().putExtra("extra_flow_params", cVarW));
        }
        n nVar = this.O;
        nVar.getClass();
        if (i == 101) {
            if (i10 == -1) {
                nVar.i((Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential"));
                return;
            } else {
                nVar.k();
                return;
            }
        }
        if (i != 109) {
            switch (i) {
            }
            return;
        }
        if (i10 == 113 || i10 == 114) {
            nVar.k();
            return;
        }
        i iVarB = i.b(intent);
        if (iVarB == null) {
            nVar.f(h.a(new j(0)));
            return;
        }
        if (iVarB.f()) {
            nVar.f(h.c(iVarB));
            return;
        }
        g gVar = iVarB.f8169f;
        if (gVar.f8160a == 5) {
            nVar.f(h.a(new f(iVarB)));
        } else {
            nVar.f(h.a(gVar));
        }
    }

    @Override // u4.e, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Task taskForResult;
        super.onCreate(bundle);
        n nVar = (n) new l(this).q(n.class);
        this.O = nVar;
        nVar.d(w());
        this.O.f2917g.d(this, new r4.j(this, this, 0));
        c cVarW = w();
        Iterator it = cVarW.f8395b.iterator();
        do {
            if (!it.hasNext()) {
                if (cVarW.f8403v || cVarW.f8402u) {
                    break;
                } else {
                    taskForResult = Tasks.forResult(null);
                }
                taskForResult.addOnSuccessListener(this, new e5.c(19, this, bundle)).addOnFailureListener(this, new a(this, 24));
            }
        } while (!((r4.c) it.next()).f8145a.equals("google.com"));
        taskForResult = g7.e.e.e(this);
        taskForResult.addOnSuccessListener(this, new e5.c(19, this, bundle)).addOnFailureListener(this, new a(this, 24));
    }
}
