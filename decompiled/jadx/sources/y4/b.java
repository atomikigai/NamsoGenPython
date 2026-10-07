package y4;

import a2.l;
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
import com.firebase.ui.auth.ui.phone.CountryListSpinner;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.internal.p000authapi.zbn;
import com.google.android.material.datepicker.n;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import r4.j;
import s4.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class b extends u4.b implements View.OnClickListener {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public d f10554g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public a f10555h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f10556i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ProgressBar f10557j0;
    public Button k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public CountryListSpinner f10558l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public View f10559m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public TextInputLayout f10560n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public EditText f10561o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextView f10562p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f10563q0;

    @Override // androidx.fragment.app.s
    public final void A(int i, int i10, Intent intent) {
        String strA;
        a aVar = this.f10555h0;
        aVar.getClass();
        if (i == 101 && i10 == -1 && (strA = a5.d.a(((Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential")).f1981a, a5.d.d(aVar.c()))) != null) {
            aVar.f(h.c(a5.d.e(strA)));
        }
    }

    @Override // u4.b, androidx.fragment.app.s
    public final void C(Bundle bundle) {
        super.C(bundle);
        this.f10554g0 = (d) new l(T()).q(d.class);
        this.f10555h0 = (a) new l(this).q(a.class);
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_phone_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        this.f10557j0 = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.k0 = (Button) view.findViewById(R.id.send_code);
        this.f10558l0 = (CountryListSpinner) view.findViewById(R.id.country_list);
        this.f10559m0 = view.findViewById(R.id.country_list_popup_anchor);
        this.f10560n0 = (TextInputLayout) view.findViewById(R.id.phone_layout);
        this.f10561o0 = (EditText) view.findViewById(R.id.phone_number);
        this.f10562p0 = (TextView) view.findViewById(R.id.send_sms_tos);
        this.f10563q0 = (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text);
        this.f10562p0.setText(w(R.string.fui_sms_terms_of_service, v(R.string.fui_verify_phone_number)));
        if (Build.VERSION.SDK_INT >= 26 && this.f8855f0.w().f8403v) {
            this.f10561o0.setImportantForAutofill(2);
        }
        T().setTitle(v(R.string.fui_verify_phone_number_title));
        this.f10561o0.setOnEditorActionListener(new b5.b(new t4.f(this)));
        this.k0.setOnClickListener(this);
        s4.c cVarW = this.f8855f0.w();
        String str = cVarW.f8398f;
        String str2 = cVarW.f8399r;
        boolean z4 = (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
        if (cVarW.a() || !z4) {
            com.bumptech.glide.c.Q(U(), cVarW, this.f10563q0);
            this.f10562p0.setText(w(R.string.fui_sms_terms_of_service, v(R.string.fui_verify_phone_number)));
        } else {
            aa.c.H(U(), cVarW, R.string.fui_verify_phone_number, (TextUtils.isEmpty(cVarW.f8398f) || TextUtils.isEmpty(str2)) ? -1 : R.string.fui_sms_terms_of_service_and_privacy_policy_extended, this.f10562p0);
        }
        this.f10558l0.c(this.f977f.getBundle("extra_params"), this.f10559m0);
        this.f10558l0.setOnClickListener(new n(this, 14));
    }

    @Override // u4.g
    public final void b() {
        this.k0.setEnabled(true);
        this.f10557j0.setVisibility(4);
    }

    public final void b0() {
        String string = this.f10561o0.getText().toString();
        String strA = TextUtils.isEmpty(string) ? null : a5.d.a(string, this.f10558l0.getSelectedCountryInfo());
        if (strA == null) {
            this.f10560n0.setError(v(R.string.fui_invalid_phone_number));
        } else {
            this.f10554g0.g(T(), strA, false);
        }
    }

    public final void c0(s4.f fVar) {
        if (fVar != null) {
            String str = fVar.f8414b;
            String str2 = fVar.f8415c;
            String str3 = fVar.f8413a;
            s4.f fVar2 = s4.f.f8412d;
            if (!fVar2.equals(fVar) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                this.f10561o0.setText(str3);
                this.f10561o0.setSelection(str3.length());
                if (fVar2.equals(fVar) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || !this.f10558l0.d(str)) {
                    return;
                }
                CountryListSpinner countryListSpinner = this.f10558l0;
                Locale locale = new Locale("", str);
                countryListSpinner.getClass();
                if (countryListSpinner.d(locale.getCountry()) && !TextUtils.isEmpty(locale.getDisplayName()) && !TextUtils.isEmpty(str2)) {
                    countryListSpinner.e(Integer.parseInt(str2), locale);
                }
                b0();
                return;
            }
        }
        this.f10560n0.setError(v(R.string.fui_invalid_phone_number));
    }

    @Override // u4.g
    public final void i(int i) {
        this.k0.setEnabled(false);
        this.f10557j0.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b0();
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        String string;
        String string2;
        String string3;
        this.N = true;
        this.f10555h0.f2917g.d(x(), new j(this, this, 11));
        if (bundle != null || this.f10556i0) {
            return;
        }
        this.f10556i0 = true;
        Bundle bundle2 = this.f977f.getBundle("extra_params");
        if (bundle2 != null) {
            string = bundle2.getString("extra_phone_number");
            string3 = bundle2.getString("extra_country_iso");
            string2 = bundle2.getString("extra_national_number");
        } else {
            string = null;
            string2 = null;
            string3 = null;
        }
        if (!TextUtils.isEmpty(string)) {
            c0(a5.d.e(string));
            return;
        }
        if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string2)) {
            int iB = a5.d.b(string3);
            if (iB == null) {
                iB = 1;
                string3 = a5.d.f192a;
            }
            c0(new s4.f(string2.replaceFirst("^\\+?", ""), string3, String.valueOf(iB)));
            return;
        }
        if (TextUtils.isEmpty(string3)) {
            if (this.f8855f0.w().f8403v) {
                a aVar = this.f10555h0;
                aVar.getClass();
                d7.a aVar2 = new d7.a(aVar.c(), z6.d.f10995d);
                aVar.f(h.a(new s4.e(101, zbn.zba(aVar2.getApplicationContext(), (x6.a) aVar2.getApiOptions(), new HintRequest(2, new CredentialPickerConfig(2, false, true, false, 1), false, true, new String[0], false, null, null), ((x6.a) aVar2.getApiOptions()).f10297b))));
                return;
            }
            return;
        }
        String strValueOf = String.valueOf(a5.d.b(string3));
        CountryListSpinner countryListSpinner = this.f10558l0;
        Locale locale = new Locale("", string3);
        countryListSpinner.getClass();
        if (!countryListSpinner.d(locale.getCountry()) || TextUtils.isEmpty(locale.getDisplayName()) || TextUtils.isEmpty(strValueOf)) {
            return;
        }
        countryListSpinner.e(Integer.parseInt(strValueOf), locale);
    }
}
