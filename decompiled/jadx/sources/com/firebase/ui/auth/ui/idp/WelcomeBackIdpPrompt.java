package com.firebase.ui.auth.ui.idp;

import a2.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import d5.c;
import f5.d;
import h3.d0;
import r4.g;
import s4.i;
import t4.e;
import t4.j;
import t4.k;
import u3.b;
import u4.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class WelcomeBackIdpPrompt extends a {
    public c L;
    public Button M;
    public ProgressBar N;
    public TextView O;

    public static Intent z(Context context, s4.c cVar, i iVar, r4.i iVar2) {
        return u4.c.t(context, WelcomeBackIdpPrompt.class, cVar).putExtra("extra_idp_response", iVar2).putExtra("extra_user", iVar);
    }

    @Override // u4.g
    public final void b() {
        this.M.setEnabled(true);
        this.N.setVisibility(4);
    }

    @Override // u4.g
    public final void i(int i) {
        this.M.setEnabled(false);
        this.N.setVisibility(0);
    }

    @Override // u4.c, androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        this.L.g(i, i10, intent);
    }

    @Override // u4.a, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.fui_welcome_back_idp_prompt_layout);
        this.M = (Button) findViewById(R.id.welcome_back_idp_button);
        this.N = (ProgressBar) findViewById(R.id.top_progress_bar);
        this.O = (TextView) findViewById(R.id.welcome_back_idp_prompt);
        i iVar = (i) getIntent().getParcelableExtra("extra_user");
        r4.i iVarB = r4.i.b(getIntent());
        l lVar = new l(this);
        d dVar = (d) lVar.q(d.class);
        dVar.d(w());
        if (iVarB != null) {
            v9.d dVarO = com.bumptech.glide.d.o(iVarB);
            String str = iVar.f8422b;
            dVar.f3601j = dVarO;
            dVar.f3602k = str;
        }
        String str2 = iVar.f8421a;
        String str3 = iVar.f8422b;
        r4.c cVarP = com.bumptech.glide.d.p(str2, w().f8395b);
        int i = 3;
        if (cVarP == null) {
            u(r4.i.d(new g(3, b.b("Firebase login unsuccessful. Account linking failed due to provider not enabled by application: ", str2))), 0);
            return;
        }
        String string2 = cVarP.a().getString("generic_oauth_provider_id");
        v();
        str2.getClass();
        if (str2.equals("google.com")) {
            k kVar = (k) lVar.q(k.class);
            kVar.d(new j(cVarP, str3));
            this.L = kVar;
            string = getString(R.string.fui_idp_name_google);
        } else if (str2.equals("facebook.com")) {
            e eVar = (e) lVar.q(e.class);
            eVar.d(cVarP);
            this.L = eVar;
            string = getString(R.string.fui_idp_name_facebook);
        } else {
            if (!TextUtils.equals(str2, string2)) {
                throw new IllegalStateException("Invalid provider id: ".concat(str2));
            }
            t4.g gVar = (t4.g) lVar.q(t4.g.class);
            gVar.d(cVarP);
            this.L = gVar;
            string = cVarP.a().getString("generic_oauth_provider_name");
        }
        this.L.f2917g.d(this, new v4.a(this, this, dVar, i));
        this.O.setText(getString(R.string.fui_welcome_back_idp_prompt, str3, string));
        this.M.setOnClickListener(new d0(9, this, str2));
        dVar.f2917g.d(this, new r4.j((u4.c) this, (u4.c) this, 10));
        com.bumptech.glide.c.Q(this, w(), (TextView) findViewById(R.id.email_footer_tos_and_pp_text));
    }
}
