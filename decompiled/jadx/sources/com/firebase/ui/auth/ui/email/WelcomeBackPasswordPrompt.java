package com.firebase.ui.auth.ui.email;

import a2.l;
import a5.g;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import b5.b;
import b5.c;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import e5.k;
import fd.e;
import r4.i;
import r4.j;
import s4.h;
import u4.a;
import v9.d;
import v9.m0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class WelcomeBackPasswordPrompt extends a implements View.OnClickListener, c {
    public static final /* synthetic */ int R = 0;
    public i L;
    public k M;
    public Button N;
    public ProgressBar O;
    public TextInputLayout P;
    public EditText Q;

    @Override // u4.g
    public final void b() {
        this.N.setEnabled(true);
        this.O.setVisibility(4);
    }

    @Override // u4.g
    public final void i(int i) {
        this.N.setEnabled(false);
        this.O.setVisibility(0);
    }

    @Override // b5.c
    public final void k() {
        z();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.button_done) {
            z();
        } else if (id2 == R.id.trouble_signing_in) {
            s4.c cVarW = w();
            startActivity(u4.c.t(this, RecoverPasswordActivity.class, cVarW).putExtra("extra_email", this.L.c()));
        }
    }

    @Override // u4.a, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_welcome_back_password_prompt_layout);
        getWindow().setSoftInputMode(4);
        i iVarB = i.b(getIntent());
        this.L = iVarB;
        String strC = iVarB.c();
        this.N = (Button) findViewById(R.id.button_done);
        this.O = (ProgressBar) findViewById(R.id.top_progress_bar);
        this.P = (TextInputLayout) findViewById(R.id.password_layout);
        EditText editText = (EditText) findViewById(R.id.password);
        this.Q = editText;
        editText.setOnEditorActionListener(new b(this));
        String string = getString(R.string.fui_welcome_back_password_prompt_body, strC);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        android.support.v4.media.session.a.b(spannableStringBuilder, string, strC);
        ((TextView) findViewById(R.id.welcome_back_password_body)).setText(spannableStringBuilder);
        this.N.setOnClickListener(this);
        findViewById(R.id.trouble_signing_in).setOnClickListener(this);
        k kVar = (k) new l(this).q(k.class);
        this.M = kVar;
        kVar.d(w());
        this.M.f2917g.d(this, new j((a) this, (a) this, 7));
        com.bumptech.glide.c.Q(this, w(), (TextView) findViewById(R.id.email_footer_tos_and_pp_text));
    }

    public final void z() {
        i iVarC;
        String string = this.Q.getText().toString();
        if (TextUtils.isEmpty(string)) {
            this.P.setError(getString(R.string.fui_error_invalid_password));
            return;
        }
        this.P.setError(null);
        d dVarO = com.bumptech.glide.d.o(this.L);
        final k kVar = this.M;
        String strC = this.L.c();
        i iVar = this.L;
        kVar.f(h.b());
        kVar.f3291j = string;
        if (dVarO == null) {
            iVarC = new e(new s4.i("password", strC, null, null, null)).c();
        } else {
            e eVar = new e(iVar.f8165a);
            eVar.f3913c = iVar.f8166b;
            eVar.f3914d = iVar.f8167c;
            eVar.e = iVar.f8168d;
            iVarC = eVar.c();
        }
        i iVar2 = iVarC;
        a5.b bVarU = a5.b.u();
        FirebaseAuth firebaseAuth = kVar.i;
        s4.c cVar = (s4.c) kVar.f2923f;
        bVarU.getClass();
        if (!a5.b.s(firebaseAuth, cVar)) {
            FirebaseAuth firebaseAuth2 = kVar.i;
            firebaseAuth2.getClass();
            i0.e(strC);
            i0.e(string);
            String str = firebaseAuth2.f2705k;
            Task taskAddOnSuccessListener = new m0(firebaseAuth2, strC, false, null, string, str).s(firebaseAuth2, str, firebaseAuth2.f2708n).continueWithTask(new e5.c(4, dVarO, iVar2)).addOnSuccessListener(new e5.c(5, kVar, iVar2));
            final int i = 1;
            taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: e5.j
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    switch (i) {
                        case 0:
                            kVar.f(s4.h.a(exc));
                            break;
                        default:
                            kVar.f(s4.h.a(exc));
                            break;
                    }
                }
            }).addOnFailureListener(new g("WBPasswordHandler", "signInWithEmailAndPassword failed."));
            return;
        }
        i0.e(strC);
        i0.e(string);
        v9.e eVar2 = new v9.e(strC, string, null, null, false);
        if (!r4.e.e.contains(iVar.e())) {
            bVarU.v((s4.c) kVar.f2923f).c(eVar2).addOnCompleteListener(new e5.i(kVar, eVar2));
            return;
        }
        final int i10 = 0;
        bVarU.v((s4.c) kVar.f2923f).c(eVar2).continueWithTask(new a5.a(dVarO, 0)).addOnSuccessListener(new e5.i(kVar, eVar2)).addOnFailureListener(new OnFailureListener() { // from class: e5.j
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                switch (i10) {
                    case 0:
                        kVar.f(s4.h.a(exc));
                        break;
                    default:
                        kVar.f(s4.h.a(exc));
                        break;
                }
            }
        });
    }
}
