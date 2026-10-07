package com.firebase.ui.auth.ui.idp;

import a2.l;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.y;
import com.bumptech.glide.d;
import d5.c;
import f5.h;
import r4.g;
import s4.i;
import t4.j;
import t4.k;
import u3.b;
import u4.e;
import v4.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SingleSignInActivity extends e {
    public static final /* synthetic */ int Q = 0;
    public h O;
    public c P;

    @Override // u4.c, androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        this.O.i(i, i10, intent);
        this.P.g(i, i10, intent);
    }

    @Override // u4.e, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i iVar = (i) getIntent().getParcelableExtra("extra_user");
        String str = iVar.f8421a;
        r4.c cVarP = d.p(str, w().f8395b);
        if (cVarP == null) {
            u(r4.i.d(new g(3, b.b("Provider not enabled: ", str))), 0);
            return;
        }
        l lVar = new l(this);
        h hVar = (h) lVar.q(h.class);
        this.O = hVar;
        hVar.d(w());
        v();
        str.getClass();
        if (str.equals("google.com")) {
            k kVar = (k) lVar.q(k.class);
            kVar.d(new j(cVarP, iVar.f8422b));
            this.P = kVar;
        } else if (str.equals("facebook.com")) {
            t4.e eVar = (t4.e) lVar.q(t4.e.class);
            eVar.d(cVarP);
            this.P = eVar;
        } else {
            if (TextUtils.isEmpty(cVarP.a().getString("generic_oauth_provider_id"))) {
                throw new IllegalStateException("Invalid provider id: ".concat(str));
            }
            t4.i iVar2 = (t4.i) lVar.q(t4.i.class);
            iVar2.d(cVarP);
            this.P = iVar2;
        }
        this.P.f2917g.d(this, new a(this, this, str, 2));
        this.O.f2917g.d(this, new r4.j(this, this, 9));
        Object obj = this.O.f2917g.e;
        if (obj == y.f1104k) {
            obj = null;
        }
        if (obj == null) {
            this.P.h(v().f8158b, this, str);
        }
    }
}
