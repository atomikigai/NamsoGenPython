package com.firebase.ui.auth.ui.email;

import a2.l;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import com.google.firebase.auth.FirebaseAuth;
import e5.f;
import java.util.HashMap;
import r4.g;
import r4.i;
import r4.j;
import s4.h;
import u4.c;
import u4.e;
import v9.n;
import w9.d0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class EmailLinkCatcherActivity extends e {
    public static final /* synthetic */ int P = 0;
    public f O;

    public static void y(EmailLinkCatcherActivity emailLinkCatcherActivity, int i) {
        if (i != 116 && i != 115) {
            throw new IllegalStateException("Invalid flow param. It must be either RequestCodes.EMAIL_LINK_CROSS_DEVICE_LINKING_FLOW or RequestCodes.EMAIL_LINK_PROMPT_FOR_EMAIL_FLOW");
        }
        emailLinkCatcherActivity.startActivityForResult(c.t(emailLinkCatcherActivity.getApplicationContext(), EmailLinkErrorRecoveryActivity.class, emailLinkCatcherActivity.w()).putExtra("com.firebase.ui.auth.ui.email.recoveryTypeKey", i), i);
    }

    @Override // u4.c, androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        if (i == 115 || i == 116) {
            i iVarB = i.b(intent);
            if (i10 == -1) {
                u(iVarB.g(), -1);
            } else {
                u(null, 0);
            }
        }
    }

    @Override // u4.e, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n nVar;
        l lVar;
        super.onCreate(bundle);
        f fVar = (f) new l(this).q(f.class);
        this.O = fVar;
        fVar.d(w());
        this.O.f2917g.d(this, new j(this, this, 2));
        if (w().f8400s != null) {
            f fVar2 = this.O;
            fVar2.f(h.b());
            String str = ((s4.c) fVar2.f2923f).f8400s;
            fVar2.i.getClass();
            if (!v9.e.i(str)) {
                fVar2.f(h.a(new g(7)));
                return;
            }
            a5.c cVar = a5.c.f190c;
            Application applicationC = fVar2.c();
            cVar.getClass();
            SharedPreferences sharedPreferences = applicationC.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0);
            l lVar2 = null;
            String string = sharedPreferences.getString("com.firebase.ui.auth.data.client.email", null);
            String string2 = sharedPreferences.getString("com.firebase.ui.auth.data.client.sid", null);
            if (string != null && string2 != null) {
                sharedPreferences.getString("com.firebase.ui.auth.data.client.auid", null);
                String string3 = sharedPreferences.getString("com.firebase.ui.auth.data.client.provider", null);
                String string4 = sharedPreferences.getString("com.firebase.ui.auth.data.client.idpToken", null);
                String string5 = sharedPreferences.getString("com.firebase.ui.auth.data.client.idpSecret", null);
                l lVar3 = new l(1, false);
                lVar3.f43b = string2;
                lVar3.f44c = string;
                if (string3 == null || (string4 == null && cVar.f191a == null)) {
                    lVar = lVar3;
                } else {
                    lVar = lVar3;
                    fd.e eVar = new fd.e(new s4.i(string3, string, null, null, null));
                    eVar.f3913c = cVar.f191a;
                    eVar.f3914d = string4;
                    eVar.e = string5;
                    eVar.f3911a = false;
                    lVar.f45d = eVar.c();
                }
                cVar.f191a = null;
                lVar2 = lVar;
            }
            i0.e(str);
            HashMap mapT = a.t(Uri.parse(str));
            if (mapT.isEmpty()) {
                throw new IllegalArgumentException("Invalid link: no parameters found");
            }
            String str2 = (String) mapT.get("ui_sid");
            String str3 = (String) mapT.get("ui_auid");
            String str4 = (String) mapT.get("oobCode");
            String str5 = (String) mapT.get("ui_pid");
            String str6 = (String) mapT.get("ui_sd");
            boolean zEquals = TextUtils.isEmpty(str6) ? false : str6.equals("1");
            if (lVar2 != null) {
                String str7 = (String) lVar2.f43b;
                if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str2) && str2.equals(str7)) {
                    if (str3 == null || ((nVar = fVar2.i.f2702f) != null && (!nVar.j() || str3.equals(((d0) fVar2.i.f2702f).f9820b.f9806a)))) {
                        fVar2.i((String) lVar2.f44c, (i) lVar2.f45d);
                        return;
                    } else {
                        fVar2.f(h.a(new g(11)));
                        return;
                    }
                }
            }
            if (TextUtils.isEmpty(str2)) {
                fVar2.f(h.a(new g(7)));
                return;
            }
            if (zEquals || !TextUtils.isEmpty(str3)) {
                fVar2.f(h.a(new g(8)));
                return;
            }
            FirebaseAuth firebaseAuth = fVar2.i;
            firebaseAuth.getClass();
            i0.e(str4);
            firebaseAuth.e.zzb(firebaseAuth.f2698a, str4, firebaseAuth.f2705k).addOnCompleteListener(new e5.c(0, fVar2, str5));
        }
    }
}
