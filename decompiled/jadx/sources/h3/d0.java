package h3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.SettingsActivity;
import com.firebase.ui.auth.ui.email.EmailActivity;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4657c;

    public /* synthetic */ d0(int i, Object obj, Object obj2) {
        this.f4655a = i;
        this.f4656b = obj;
        this.f4657c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f4655a;
        int i10 = 1;
        int i11 = 0;
        Object obj = this.f4657c;
        Object obj2 = this.f4656b;
        switch (i) {
            case 0:
                e0 e0Var = (e0) obj;
                String string = ((TextView) obj2).getText().toString();
                if (string.length() > 0) {
                    Object systemService = e0.k.getSystemService(e0Var.U(), ClipboardManager.class);
                    jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(e0Var.v(R.string.clipboard_password), string));
                    Toast.makeText(e0Var.U(), e0Var.v(R.string.password_copied), 0).show();
                }
                androidx.fragment.app.w wVarT = e0Var.T();
                MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                if (mainActivity != null) {
                    mainActivity.z();
                    return;
                }
                return;
            case 1:
                ((c) ((n) obj2).f4781f).invoke((i3.f) obj);
                return;
            case 2:
                ((b2) ((g2) obj2).f4711f).invoke((i3.o) obj);
                return;
            case 3:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                int i12 = SettingsActivity.f1300e0;
                if (((Switch) obj2).isChecked()) {
                    SharedPreferences sharedPreferences = i3.p.f5195a;
                    if (sharedPreferences == null) {
                        throw new IllegalStateException("Prefs.init(context) no llamado");
                    }
                    sharedPreferences.edit().putBoolean("tabs_swipe_enabled", false).apply();
                    return;
                }
                SharedPreferences sharedPreferences2 = i3.p.f5195a;
                if (sharedPreferences2 == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                if (sharedPreferences2.getBoolean("viewer_embedded", true)) {
                    ea.j jVar = new ea.j((Context) settingsActivity, R.style.KryptProxyDialog);
                    jVar.l(R.string.swipe_warn_title);
                    jVar.f(R.string.swipe_warn_msg);
                    jVar.i(R.string.swipe_warn_ok, new n2(i11));
                    jVar.j(R.string.swipe_warn_external, new o2(settingsActivity, 0));
                    jVar.g(R.string.cancel, null);
                    ((g.b) jVar.f3530b).f3978n = new m2(settingsActivity, i10);
                    jVar.m();
                    return;
                }
                SharedPreferences sharedPreferences3 = i3.p.f5195a;
                if (sharedPreferences3 == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                sharedPreferences3.edit().putBoolean("tabs_swipe_enabled", true).apply();
                Switch switchA = settingsActivity.A();
                if (switchA != null) {
                    switchA.setChecked(false);
                    return;
                }
                return;
            case 4:
                z2 z2Var = (z2) obj2;
                i3.q qVar = (i3.q) obj;
                if (!z2Var.h) {
                    z2Var.f4923d.invoke(qVar);
                    return;
                }
                String str = qVar.f5196a;
                jc.i.e(str, "email");
                LinkedHashSet linkedHashSet = z2Var.f4925g;
                if (!linkedHashSet.add(str)) {
                    linkedHashSet.remove(str);
                }
                ArrayList arrayList = z2Var.f4924f;
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size) {
                        Object obj3 = arrayList.get(i13);
                        i13++;
                        if (!jc.i.a(((i3.q) obj3).f5196a, str)) {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                    }
                }
                if (i11 >= 0) {
                    z2Var.f10251a.c(i11);
                }
                z2Var.e.invoke(Integer.valueOf(linkedHashSet.size()));
                return;
            case 5:
                ((l3.b) ((n) obj2).f4781f).invoke((l3.d) obj);
                return;
            case 6:
                ((l3.b) ((n) obj2).f4781f).invoke((n3.c) obj);
                return;
            case 7:
                ((c) ((g2) obj2).f4711f).invoke((k3.m) obj);
                return;
            case 8:
                EmailActivity emailActivity = (EmailActivity) ((w4.g) obj2).f9608l0;
                emailActivity.getClass();
                w4.m mVar = new w4.m();
                Bundle bundle = new Bundle();
                bundle.putString("extra_email", (String) obj);
                mVar.Y(bundle);
                emailActivity.y(mVar, "TroubleSigningInFragment", true, true);
                return;
            default:
                WelcomeBackIdpPrompt welcomeBackIdpPrompt = (WelcomeBackIdpPrompt) obj2;
                welcomeBackIdpPrompt.L.h(welcomeBackIdpPrompt.v().f8158b, welcomeBackIdpPrompt, (String) obj);
                return;
        }
    }
}
