package com.firebase.ui.auth.ui.email;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import app.namso_gen.spacehowen.R;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.i0;
import r4.c;
import r4.i;
import u4.a;
import w4.b;
import w4.f;
import w4.g;
import w4.j;
import w4.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class EmailActivity extends a implements w4.a, j, f, l {
    public static final /* synthetic */ int L = 0;

    @Override // u4.g
    public final void b() {
        throw new UnsupportedOperationException("Email fragments must handle progress updates.");
    }

    @Override // u4.g
    public final void i(int i) {
        throw new UnsupportedOperationException("Email fragments must handle progress updates.");
    }

    @Override // u4.c, androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        if (i == 104 || i == 103) {
            u(intent, i10);
        }
    }

    @Override // u4.a, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_activity_register_email);
        if (bundle != null) {
            return;
        }
        String string = getIntent().getExtras().getString("extra_email");
        i iVar = (i) getIntent().getExtras().getParcelable("extra_idp_response");
        if (string == null || iVar == null) {
            c cVarP = d.p("password", w().f8395b);
            if (cVarP != null) {
                string = cVarP.a().getString("extra_default_email");
            }
            b bVar = new b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("extra_email", string);
            bVar.Y(bundle2);
            y(bVar, "CheckEmailFragment", false, false);
            return;
        }
        c cVarQ = d.q("emailLink", w().f8395b);
        v9.b bVar2 = (v9.b) cVarQ.a().getParcelable("action_code_settings");
        a5.c cVar = a5.c.f190c;
        Application application = getApplication();
        cVar.getClass();
        v9.d dVar = iVar.f8166b;
        if (dVar != null) {
            cVar.f191a = dVar;
        }
        i0.i(application);
        SharedPreferences.Editor editorEdit = application.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
        editorEdit.putString("com.firebase.ui.auth.data.client.email", iVar.c());
        editorEdit.putString("com.firebase.ui.auth.data.client.provider", iVar.e());
        editorEdit.putString("com.firebase.ui.auth.data.client.idpToken", iVar.f8167c);
        editorEdit.putString("com.firebase.ui.auth.data.client.idpSecret", iVar.f8168d);
        editorEdit.apply();
        y(g.b0(string, bVar2, iVar, cVarQ.a().getBoolean("force_same_device")), "EmailLinkFragment", false, false);
    }

    public final void z(c cVar, String str) {
        y(g.b0(str, (v9.b) cVar.a().getParcelable("action_code_settings"), null, false), "EmailLinkFragment", false, false);
    }
}
