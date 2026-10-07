package w4;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.internal.p000authapi.zbn;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class b extends u4.b implements View.OnClickListener, b5.c {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public c f9600g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Button f9601h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ProgressBar f9602i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public EditText f9603j0;
    public TextInputLayout k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public c5.b f9604l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public a f9605m0;

    @Override // androidx.fragment.app.s
    public final void A(int i, int i10, Intent intent) {
        c cVar = this.f9600g0;
        cVar.getClass();
        if (i == 101 && i10 == -1) {
            cVar.f(s4.h.b());
            Credential credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
            String str = credential.f1981a;
            com.bumptech.glide.d.l(cVar.i, (s4.c) cVar.f2923f, str).continueWithTask(new a5.f(0)).addOnCompleteListener(new e5.d(cVar, str, credential, 12));
        }
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_check_email_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        this.f9601h0 = (Button) view.findViewById(R.id.button_next);
        this.f9602i0 = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.k0 = (TextInputLayout) view.findViewById(R.id.email_layout);
        this.f9603j0 = (EditText) view.findViewById(R.id.email);
        this.f9604l0 = new c5.b(this.k0);
        this.k0.setOnClickListener(this);
        this.f9603j0.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(R.id.header_text);
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f9603j0.setOnEditorActionListener(new b5.b(this));
        if (Build.VERSION.SDK_INT >= 26 && this.f8855f0.w().f8403v) {
            this.f9603j0.setImportantForAutofill(2);
        }
        this.f9601h0.setOnClickListener(this);
        TextView textView2 = (TextView) view.findViewById(R.id.email_tos_and_pp_text);
        TextView textView3 = (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text);
        s4.c cVarW = this.f8855f0.w();
        if (!cVarW.a()) {
            aa.c.H(U(), cVarW, -1, (TextUtils.isEmpty(cVarW.f8398f) || TextUtils.isEmpty(cVarW.f8399r)) ? -1 : R.string.fui_tos_and_pp, textView2);
        } else {
            textView2.setVisibility(8);
            com.bumptech.glide.c.Q(U(), cVarW, textView3);
        }
    }

    @Override // u4.g
    public final void b() {
        this.f9601h0.setEnabled(true);
        this.f9602i0.setVisibility(4);
    }

    public final void b0() {
        String string = this.f9603j0.getText().toString();
        if (this.f9604l0.k(string)) {
            c cVar = this.f9600g0;
            cVar.f(s4.h.b());
            com.bumptech.glide.d.l(cVar.i, (s4.c) cVar.f2923f, string).continueWithTask(new a5.f(0)).addOnCompleteListener(new e5.c(26, cVar, string));
        }
    }

    @Override // u4.g
    public final void i(int i) {
        this.f9601h0.setEnabled(false);
        this.f9602i0.setVisibility(0);
    }

    @Override // b5.c
    public final void k() {
        b0();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.button_next) {
            b0();
        } else if (id2 == R.id.email_layout || id2 == R.id.email) {
            this.k0.setError(null);
        }
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        this.N = true;
        c cVar = (c) new a2.l(this).q(c.class);
        this.f9600g0 = cVar;
        cVar.d(this.f8855f0.w());
        androidx.lifecycle.h hVarG = g();
        if (!(hVarG instanceof a)) {
            throw new IllegalStateException("Activity must implement CheckEmailListener");
        }
        this.f9605m0 = (a) hVarG;
        this.f9600g0.f2917g.d(x(), new r4.j(this, this));
        if (bundle != null) {
            return;
        }
        String string = this.f977f.getString("extra_email");
        if (!TextUtils.isEmpty(string)) {
            this.f9603j0.setText(string);
            b0();
        } else if (this.f8855f0.w().f8403v) {
            c cVar2 = this.f9600g0;
            cVar2.getClass();
            d7.a aVar = new d7.a(cVar2.c(), z6.d.f10995d);
            cVar2.f(s4.h.a(new s4.e(101, zbn.zba(aVar.getApplicationContext(), (x6.a) aVar.getApiOptions(), new HintRequest(2, new CredentialPickerConfig(2, false, true, false, 1), true, false, new String[0], false, null, null), ((x6.a) aVar.getApiOptions()).f10297b))));
        }
    }
}
