package com.firebase.ui.auth.ui.email;

import a2.l;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import b5.c;
import c5.b;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import e5.h;
import r4.j;
import u4.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class RecoverPasswordActivity extends a implements View.OnClickListener, c {
    public static final /* synthetic */ int R = 0;
    public h L;
    public ProgressBar M;
    public Button N;
    public TextInputLayout O;
    public EditText P;
    public b Q;

    @Override // u4.g
    public final void b() {
        this.N.setEnabled(true);
        this.M.setVisibility(4);
    }

    @Override // u4.g
    public final void i(int i) {
        this.N.setEnabled(false);
        this.M.setVisibility(0);
    }

    @Override // b5.c
    public final void k() {
        if (this.Q.k(this.P.getText())) {
            if (w().f8401t != null) {
                z(this.P.getText().toString(), w().f8401t);
            } else {
                z(this.P.getText().toString(), null);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.button_done) {
            k();
        }
    }

    @Override // u4.a, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_forgot_password_layout);
        h hVar = (h) new l(this).q(h.class);
        this.L = hVar;
        hVar.d(w());
        this.L.f2917g.d(this, new j(this, this));
        this.M = (ProgressBar) findViewById(R.id.top_progress_bar);
        this.N = (Button) findViewById(R.id.button_done);
        this.O = (TextInputLayout) findViewById(R.id.email_layout);
        this.P = (EditText) findViewById(R.id.email);
        this.Q = new b(this.O);
        String stringExtra = getIntent().getStringExtra("extra_email");
        if (stringExtra != null) {
            this.P.setText(stringExtra);
        }
        this.P.setOnEditorActionListener(new b5.b(this));
        this.N.setOnClickListener(this);
        com.bumptech.glide.c.Q(this, w(), (TextView) findViewById(R.id.email_footer_tos_and_pp_text));
    }

    public final void z(String str, v9.b bVar) {
        Task taskB;
        h hVar = this.L;
        hVar.f(s4.h.b());
        if (bVar != null) {
            taskB = hVar.i.b(str, bVar);
        } else {
            FirebaseAuth firebaseAuth = hVar.i;
            firebaseAuth.getClass();
            i0.e(str);
            taskB = firebaseAuth.b(str, null);
        }
        taskB.addOnCompleteListener(new e5.c(3, hVar, str));
    }
}
