package h3;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Switch;
import app.namso_gen.spacehowen.SettingsActivity;
import com.firebase.ui.auth.ui.email.RecoverPasswordActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m2 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.g f4779b;

    public /* synthetic */ m2(g.g gVar, int i) {
        this.f4778a = i;
        this.f4779b = gVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f4778a;
        g.g gVar = this.f4779b;
        switch (i) {
            case 0:
                SettingsActivity settingsActivity = (SettingsActivity) gVar;
                int i10 = SettingsActivity.f1300e0;
                settingsActivity.B();
                Switch switchA = settingsActivity.A();
                if (switchA != null) {
                    SharedPreferences sharedPreferences = i3.p.f5195a;
                    if (sharedPreferences == null) {
                        throw new IllegalStateException("Prefs.init(context) no llamado");
                    }
                    switchA.setChecked(!sharedPreferences.getBoolean("tabs_swipe_enabled", false));
                    return;
                }
                return;
            case 1:
                SettingsActivity settingsActivity2 = (SettingsActivity) gVar;
                int i11 = SettingsActivity.f1300e0;
                Switch switchA2 = settingsActivity2.A();
                if (switchA2 != null) {
                    SharedPreferences sharedPreferences2 = i3.p.f5195a;
                    if (sharedPreferences2 == null) {
                        throw new IllegalStateException("Prefs.init(context) no llamado");
                    }
                    switchA2.setChecked(!sharedPreferences2.getBoolean("tabs_swipe_enabled", false));
                }
                settingsActivity2.B();
                return;
            case 2:
                SettingsActivity settingsActivity3 = (SettingsActivity) gVar;
                int i12 = SettingsActivity.f1300e0;
                Switch switchA3 = settingsActivity3.A();
                if (switchA3 != null) {
                    SharedPreferences sharedPreferences3 = i3.p.f5195a;
                    if (sharedPreferences3 == null) {
                        throw new IllegalStateException("Prefs.init(context) no llamado");
                    }
                    switchA3.setChecked(!sharedPreferences3.getBoolean("tabs_swipe_enabled", false));
                }
                settingsActivity3.B();
                return;
            default:
                RecoverPasswordActivity recoverPasswordActivity = (RecoverPasswordActivity) gVar;
                int i13 = RecoverPasswordActivity.R;
                recoverPasswordActivity.getClass();
                recoverPasswordActivity.u(new Intent(), -1);
                return;
        }
    }
}
