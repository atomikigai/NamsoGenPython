package com.firebase.ui.auth.ui.idp;

import a2.l;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import app.namso_gen.spacehowen.R;
import d5.c;
import f5.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jc.i;
import r4.b;
import r4.j;
import t4.e;
import t4.k;
import u4.a;
import z.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class AuthMethodPickerActivity extends a {
    public static final /* synthetic */ int Q = 0;
    public h L;
    public ArrayList M;
    public ProgressBar N;
    public ViewGroup O;
    public b P;

    @Override // u4.g
    public final void b() {
        if (this.P == null) {
            this.N.setVisibility(4);
            for (int i = 0; i < this.O.getChildCount(); i++) {
                View childAt = this.O.getChildAt(i);
                childAt.setEnabled(true);
                childAt.setAlpha(1.0f);
            }
        }
    }

    @Override // u4.g
    public final void i(int i) {
        if (this.P == null) {
            this.N.setVisibility(0);
            for (int i10 = 0; i10 < this.O.getChildCount(); i10++) {
                View childAt = this.O.getChildAt(i10);
                childAt.setEnabled(false);
                childAt.setAlpha(0.75f);
            }
        }
    }

    @Override // u4.c, androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        this.L.i(i, i10, intent);
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((c) obj).g(i, i10, intent);
        }
    }

    @Override // u4.a, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        super.onCreate(bundle);
        s4.c cVarW = w();
        b bVar = cVarW.f8407z;
        List<r4.c> list = cVarW.f8395b;
        this.P = bVar;
        h hVar = (h) new l(this).q(h.class);
        this.L = hVar;
        hVar.d(cVarW);
        this.M = new ArrayList();
        b bVar2 = this.P;
        int i10 = 8;
        if (bVar2 != null) {
            setContentView(bVar2.f8142a);
            HashMap map = this.P.f8144c;
            for (r4.c cVar : list) {
                String str2 = cVar.f8145a;
                if (str2.equals("emailLink")) {
                    str2 = "password";
                }
                Integer num = (Integer) map.get(str2);
                if (num == null) {
                    throw new IllegalStateException("No button found for auth provider: " + cVar.f8145a);
                }
                z(cVar, findViewById(num.intValue()));
            }
            for (String str3 : map.keySet()) {
                if (str3 != null) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            Integer num2 = (Integer) map.get(str3);
                            if (num2 != null) {
                                findViewById(num2.intValue()).setVisibility(8);
                                break;
                            }
                            break;
                        }
                        str = ((r4.c) it.next()).f8145a;
                        if (str.equals("emailLink")) {
                            str = "password";
                        }
                    } while (!str3.equals(str));
                }
            }
        } else {
            setContentView(R.layout.fui_auth_method_picker_layout);
            this.N = (ProgressBar) findViewById(R.id.top_progress_bar);
            this.O = (ViewGroup) findViewById(R.id.btn_holder);
            t0 t0VarF = f();
            s0 s0VarC = c();
            a4.l lVarD = i0.d(this);
            i.e(t0VarF, "store");
            i.e(s0VarC, "factory");
            i.e(lVarD, "defaultCreationExtras");
            this.M = new ArrayList();
            for (r4.c cVar2 : list) {
                String str4 = cVar2.f8145a;
                str4.getClass();
                switch (str4) {
                    case "anonymous":
                        i = R.layout.fui_provider_button_anonymous;
                        break;
                    case "google.com":
                        i = R.layout.fui_idp_button_google;
                        break;
                    case "facebook.com":
                        i = R.layout.fui_idp_button_facebook;
                        break;
                    case "phone":
                        i = R.layout.fui_provider_button_phone;
                        break;
                    case "password":
                    case "emailLink":
                        i = R.layout.fui_provider_button_email;
                        break;
                    default:
                        if (TextUtils.isEmpty(cVar2.a().getString("generic_oauth_provider_id"))) {
                            throw new IllegalStateException("Unknown provider: ".concat(str4));
                        }
                        i = cVar2.a().getInt("generic_oauth_button_id");
                        break;
                        break;
                }
                View viewInflate = getLayoutInflater().inflate(i, this.O, false);
                z(cVar2, viewInflate);
                this.O.addView(viewInflate);
            }
            int i11 = cVarW.e;
            if (i11 == -1) {
                findViewById(R.id.logo).setVisibility(8);
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.root);
                m mVar = new m();
                mVar.b(constraintLayout);
                mVar.e(R.id.container).f10785d.f10821w = 0.5f;
                mVar.e(R.id.container).f10785d.f10822x = 0.5f;
                mVar.a(constraintLayout);
                constraintLayout.setConstraintSet(null);
                constraintLayout.requestLayout();
            } else {
                ((ImageView) findViewById(R.id.logo)).setImageResource(i11);
            }
        }
        boolean z4 = (TextUtils.isEmpty(w().f8399r) || TextUtils.isEmpty(w().f8398f)) ? false : true;
        b bVar3 = this.P;
        int i12 = bVar3 == null ? R.id.main_tos_and_pp : bVar3.f8143b;
        if (i12 >= 0) {
            TextView textView = (TextView) findViewById(i12);
            if (z4) {
                s4.c cVarW2 = w();
                aa.c.H(this, cVarW2, -1, (TextUtils.isEmpty(cVarW2.f8398f) || TextUtils.isEmpty(cVarW2.f8399r)) ? -1 : R.string.fui_tos_and_pp, textView);
            } else {
                textView.setVisibility(8);
            }
        }
        this.L.f2917g.d(this, new j((a) this, (a) this, i10));
    }

    public final void z(r4.c cVar, View view) {
        d5.b bVar;
        l lVar = new l(this);
        String str = cVar.f8145a;
        v();
        str.getClass();
        switch (str) {
            case "anonymous":
                bVar = (t4.b) lVar.q(t4.b.class);
                bVar.d(w());
                break;
            case "google.com":
                bVar = (k) lVar.q(k.class);
                bVar.d(new t4.j(cVar, null));
                break;
            case "facebook.com":
                bVar = (e) lVar.q(e.class);
                bVar.d(cVar);
                break;
            case "phone":
                bVar = (t4.l) lVar.q(t4.l.class);
                bVar.d(cVar);
                break;
            case "password":
            case "emailLink":
                bVar = (t4.c) lVar.q(t4.c.class);
                bVar.d(null);
                break;
            default:
                if (!TextUtils.isEmpty(cVar.a().getString("generic_oauth_provider_id"))) {
                    bVar = (t4.i) lVar.q(t4.i.class);
                    bVar.d(cVar);
                    break;
                } else {
                    throw new IllegalStateException("Unknown provider: ".concat(str));
                }
                break;
        }
        this.M.add(bVar);
        bVar.f2917g.d(this, new v4.a(this, this, str, 1));
        view.setOnClickListener(new h3.k(this, bVar, cVar, 2));
    }
}
