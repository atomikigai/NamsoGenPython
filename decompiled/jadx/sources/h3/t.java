package h3;

import android.content.SharedPreferences;
import android.os.Build;
import android.widget.CompoundButton;
import app.namso_gen.spacehowen.SettingsActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f4843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4844c;

    public /* synthetic */ t(SharedPreferences sharedPreferences, Object obj, int i) {
        this.f4842a = i;
        this.f4843b = sharedPreferences;
        this.f4844c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
        int i = this.f4842a;
        Object obj = this.f4844c;
        SharedPreferences sharedPreferences = this.f4843b;
        switch (i) {
            case 0:
                jc.i.e(compoundButton, "<unused var>");
                sharedPreferences.edit().putBoolean(((v) obj).f4870o0, z4).apply();
                break;
            default:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                int i10 = SettingsActivity.f1300e0;
                jc.i.e(compoundButton, "<unused var>");
                sharedPreferences.edit().putBoolean("notifications_enabled", z4).apply();
                yb.d dVar = null;
                if (!z4) {
                    rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), rc.k0.f8293b, new s2(settingsActivity, dVar, 0), 2);
                } else {
                    if (Build.VERSION.SDK_INT >= 33 && e0.k.checkSelfPermission(settingsActivity, "android.permission.POST_NOTIFICATIONS") != 0) {
                        settingsActivity.f1303c0.a("android.permission.POST_NOTIFICATIONS");
                    }
                    rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), rc.k0.f8293b, new s2(settingsActivity, dVar, 1), 2);
                }
                break;
        }
    }
}
