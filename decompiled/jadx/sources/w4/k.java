package w4;

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
import androidx.fragment.app.w;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import u8.o;
import v9.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class k extends u4.b implements View.OnClickListener, View.OnFocusChangeListener, b5.c {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public e5.g f9617g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Button f9618h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ProgressBar f9619i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public EditText f9620j0;
    public EditText k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public EditText f9621l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public TextInputLayout f9622m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public TextInputLayout f9623n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public c5.b f9624o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public c5.c f9625p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public c5.a f9626q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public j f9627r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public s4.i f9628s0;

    @Override // u4.b, androidx.fragment.app.s
    public final void C(Bundle bundle) {
        super.C(bundle);
        if (bundle == null) {
            this.f9628s0 = (s4.i) this.f977f.getParcelable("extra_user");
        } else {
            this.f9628s0 = (s4.i) bundle.getParcelable("extra_user");
        }
        e5.g gVar = (e5.g) new a2.l(this).q(e5.g.class);
        this.f9617g0 = gVar;
        gVar.d(this.f8855f0.w());
        this.f9617g0.f2917g.d(this, new r4.j(this, this));
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_register_email_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void J(Bundle bundle) {
        bundle.putParcelable("extra_user", new s4.i("password", this.f9620j0.getText().toString(), null, this.k0.getText().toString(), this.f9628s0.e));
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        c5.b bVar;
        this.f9618h0 = (Button) view.findViewById(R.id.button_create);
        this.f9619i0 = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.f9620j0 = (EditText) view.findViewById(R.id.email);
        this.k0 = (EditText) view.findViewById(R.id.name);
        this.f9621l0 = (EditText) view.findViewById(R.id.password);
        this.f9622m0 = (TextInputLayout) view.findViewById(R.id.email_layout);
        this.f9623n0 = (TextInputLayout) view.findViewById(R.id.password_layout);
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.name_layout);
        boolean z4 = com.bumptech.glide.d.q("password", this.f8855f0.w().f8395b).a().getBoolean("extra_require_name", true);
        TextInputLayout textInputLayout2 = this.f9623n0;
        int integer = u().getInteger(R.integer.fui_min_password_length);
        c5.c cVar = new c5.c(textInputLayout2);
        cVar.f1778d = integer;
        cVar.f1775b = textInputLayout2.getResources().getQuantityString(R.plurals.fui_error_weak_password, integer, Integer.valueOf(integer));
        this.f9625p0 = cVar;
        if (z4) {
            String string = u().getString(R.string.fui_missing_first_and_last_name);
            bVar = new c5.b(textInputLayout, 2);
            bVar.f1775b = string;
        } else {
            bVar = new c5.b(textInputLayout, 1);
        }
        this.f9626q0 = bVar;
        this.f9624o0 = new c5.b(this.f9622m0);
        this.f9621l0.setOnEditorActionListener(new b5.b(this));
        this.f9620j0.setOnFocusChangeListener(this);
        this.k0.setOnFocusChangeListener(this);
        this.f9621l0.setOnFocusChangeListener(this);
        this.f9618h0.setOnClickListener(this);
        textInputLayout.setVisibility(z4 ? 0 : 8);
        if (Build.VERSION.SDK_INT >= 26 && this.f8855f0.w().f8402u) {
            this.f9620j0.setImportantForAutofill(2);
        }
        com.bumptech.glide.c.Q(U(), this.f8855f0.w(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
        if (bundle != null) {
            return;
        }
        String str = this.f9628s0.f8422b;
        if (!TextUtils.isEmpty(str)) {
            this.f9620j0.setText(str);
        }
        String str2 = this.f9628s0.f8424d;
        if (!TextUtils.isEmpty(str2)) {
            this.k0.setText(str2);
        }
        if (!z4 || !TextUtils.isEmpty(this.k0.getText())) {
            EditText editText = this.f9621l0;
            editText.post(new o(editText, 1));
        } else if (TextUtils.isEmpty(this.f9620j0.getText())) {
            EditText editText2 = this.f9620j0;
            editText2.post(new o(editText2, 1));
        } else {
            EditText editText3 = this.k0;
            editText3.post(new o(editText3, 1));
        }
    }

    @Override // u4.g
    public final void b() {
        this.f9618h0.setEnabled(true);
        this.f9619i0.setVisibility(4);
    }

    public final void b0() {
        String str;
        Task taskS;
        String string = this.f9620j0.getText().toString();
        String string2 = this.f9621l0.getText().toString();
        String string3 = this.k0.getText().toString();
        boolean zK = this.f9624o0.k(string);
        boolean zK2 = this.f9625p0.k(string2);
        boolean zK3 = this.f9626q0.k(string3);
        if (zK && zK2 && zK3) {
            e5.g gVar = this.f9617g0;
            r4.i iVarC = new fd.e(new s4.i("password", string, null, string3, this.f9628s0.e)).c();
            gVar.getClass();
            if (!iVarC.f()) {
                gVar.f(s4.h.a(iVarC.f8169f));
                return;
            }
            if (!iVarC.e().equals("password")) {
                throw new IllegalStateException("This handler can only be used with the email provider");
            }
            gVar.f(s4.h.b());
            a5.b bVarU = a5.b.u();
            String strC = iVarC.c();
            FirebaseAuth firebaseAuth = gVar.i;
            s4.c cVar = (s4.c) gVar.f2923f;
            bVarU.getClass();
            if (a5.b.s(firebaseAuth, cVar)) {
                i0.e(strC);
                i0.e(string2);
                str = string2;
                taskS = firebaseAuth.f2702f.k(new v9.e(strC, str, null, null, false));
            } else {
                str = string2;
                firebaseAuth.getClass();
                i0.e(strC);
                i0.e(str);
                taskS = new k0(firebaseAuth, strC, str, 2).s(firebaseAuth, firebaseAuth.f2705k, firebaseAuth.f2709o);
            }
            taskS.continueWithTask(new q3.e(iVarC)).addOnFailureListener(new a5.g("EmailProviderResponseHa", "Error creating user")).addOnSuccessListener(new e5.c(2, gVar, iVarC)).addOnFailureListener(new e5.d(gVar, bVarU, strC, str));
        }
    }

    @Override // u4.g
    public final void i(int i) {
        this.f9618h0.setEnabled(false);
        this.f9619i0.setVisibility(0);
    }

    @Override // b5.c
    public final void k() {
        b0();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.button_create) {
            b0();
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R.id.email) {
            this.f9624o0.k(this.f9620j0.getText());
        } else if (id2 == R.id.name) {
            this.f9626q0.k(this.k0.getText());
        } else if (id2 == R.id.password) {
            this.f9625p0.k(this.f9621l0.getText());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        this.N = true;
        w wVarT = T();
        wVarT.setTitle(R.string.fui_title_register_email);
        if (!(wVarT instanceof j)) {
            throw new IllegalStateException("Activity must implement CheckEmailListener");
        }
        this.f9627r0 = (j) wVarT;
    }
}
