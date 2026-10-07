package w4;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.common.internal.i0;
import com.google.firebase.auth.FirebaseAuth;
import da.v;
import h3.d0;
import java.util.Random;
import v9.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class g extends u4.f {
    public e5.b k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public f f9608l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ScrollView f9609m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f9610n0;

    public static g b0(String str, v9.b bVar, r4.i iVar, boolean z4) {
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putString("extra_email", str);
        bundle.putParcelable("action_code_settings", bVar);
        bundle.putParcelable("extra_idp_response", iVar);
        bundle.putBoolean("force_same_device", z4);
        gVar.Y(bundle);
        return gVar;
    }

    @Override // androidx.fragment.app.s
    public final void B(Context context) {
        super.B(context);
        androidx.lifecycle.h hVarG = g();
        if (!(hVarG instanceof f)) {
            throw new IllegalStateException("Activity must implement TroubleSigningInListener");
        }
        this.f9608l0 = (f) hVarG;
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_email_link_sign_in_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void J(Bundle bundle) {
        bundle.putBoolean("emailSent", this.f9610n0);
    }

    @Override // u4.f, androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        super.M(bundle, view);
        if (bundle != null) {
            this.f9610n0 = bundle.getBoolean("emailSent");
        }
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.top_level_view);
        this.f9609m0 = scrollView;
        if (!this.f9610n0) {
            scrollView.setVisibility(8);
        }
        String string = this.f977f.getString("extra_email");
        TextView textView = (TextView) view.findViewById(R.id.sign_in_email_sent_text);
        String strW = w(R.string.fui_email_link_email_sent, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strW);
        android.support.v4.media.session.a.b(spannableStringBuilder, strW, string);
        textView.setText(spannableStringBuilder);
        view.findViewById(R.id.trouble_signing_in).setOnClickListener(new d0(8, this, string));
        com.bumptech.glide.c.Q(U(), this.f8855f0.w(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        this.N = true;
        e5.b bVar = (e5.b) new a2.l(this).q(e5.b.class);
        this.k0 = bVar;
        bVar.d(this.f8855f0.w());
        this.k0.f2917g.d(x(), new r4.j(this, this));
        String string = this.f977f.getString("extra_email");
        v9.b bVar2 = (v9.b) this.f977f.getParcelable("action_code_settings");
        r4.i iVar = (r4.i) this.f977f.getParcelable("extra_idp_response");
        boolean z4 = this.f977f.getBoolean("force_same_device");
        if (this.f9610n0) {
            return;
        }
        e5.b bVar3 = this.k0;
        if (bVar3.i == null) {
            return;
        }
        bVar3.f(s4.h.b());
        a5.b bVarU = a5.b.u();
        FirebaseAuth firebaseAuth = bVar3.i;
        s4.c cVar = (s4.c) bVar3.f2923f;
        bVarU.getClass();
        String str = a5.b.s(firebaseAuth, cVar) ? ((w9.d0) bVar3.i.f2702f).f9820b.f9806a : null;
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            sb2.append("1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(10)));
        }
        String string2 = sb2.toString();
        String str2 = bVar2.f9216a;
        e7.i iVar2 = new e7.i(5);
        i0.e(str2);
        StringBuilder sb3 = new StringBuilder(v.h(str2, "?"));
        iVar2.f3489b = sb3;
        iVar2.l("ui_sid", string2);
        iVar2.l("ui_auid", str);
        iVar2.l("ui_sd", z4 ? "1" : "0");
        if (iVar != null) {
            iVar2.l("ui_pid", iVar.e());
        }
        v9.a aVar = new v9.a();
        if (sb3.charAt(sb3.length() - 1) == '?') {
            sb3.setLength(sb3.length() - 1);
        }
        String string3 = sb3.toString();
        aVar.f9207a = string3;
        aVar.f9211f = true;
        String str3 = bVar2.f9219d;
        boolean z10 = bVar2.e;
        String str4 = bVar2.f9220f;
        aVar.f9209c = str3;
        aVar.f9210d = z10;
        aVar.e = str4;
        aVar.f9208b = bVar2.f9217b;
        if (string3 == null) {
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }
        v9.b bVar4 = new v9.b(aVar);
        FirebaseAuth firebaseAuth2 = bVar3.i;
        firebaseAuth2.getClass();
        i0.e(string);
        if (!bVar4.f9221r) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str5 = firebaseAuth2.i;
        if (str5 != null) {
            bVar4.f9222s = str5;
        }
        new k0(firebaseAuth2, string, bVar4, 1).s(firebaseAuth2, firebaseAuth2.f2705k, firebaseAuth2.f2707m).addOnCompleteListener(new e5.a(bVar3, string, string2, str));
    }
}
