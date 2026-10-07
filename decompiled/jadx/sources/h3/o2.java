package h3;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import app.namso_gen.spacehowen.SettingsActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o2 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f4795b;

    public /* synthetic */ o2(SettingsActivity settingsActivity, int i) {
        this.f4794a = i;
        this.f4795b = settingsActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i10 = this.f4794a;
        SettingsActivity settingsActivity = this.f4795b;
        switch (i10) {
            case 0:
                if (SettingsActivity.t() > 0) {
                    settingsActivity.z(false, true);
                    return;
                }
                SharedPreferences sharedPreferences = i3.p.f5195a;
                if (sharedPreferences == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                sharedPreferences.edit().putBoolean("tabs_swipe_enabled", true).apply();
                SharedPreferences sharedPreferences2 = i3.p.f5195a;
                if (sharedPreferences2 == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                if (!sharedPreferences2.getBoolean("viewer_embedded", true)) {
                    settingsActivity.B();
                    return;
                }
                SettingsActivity.u();
                SharedPreferences sharedPreferences3 = i3.p.f5195a;
                if (sharedPreferences3 == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                sharedPreferences3.edit().putBoolean("viewer_embedded", false).apply();
                settingsActivity.B();
                return;
            case 1:
                int i11 = SettingsActivity.f1300e0;
                SharedPreferences sharedPreferences4 = i3.p.f5195a;
                if (sharedPreferences4 == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                sharedPreferences4.edit().putBoolean("viewer_embedded", true).apply();
                settingsActivity.B();
                return;
            default:
                int i12 = SettingsActivity.f1300e0;
                i3.p.b().edit().putBoolean("viewer_embedded", true).apply();
                i3.p.b().edit().putBoolean("tabs_swipe_enabled", false).apply();
                settingsActivity.B();
                return;
        }
    }
}
