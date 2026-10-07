package h3;

import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.widget.CompoundButton;
import app.namso_gen.spacehowen.SettingsActivity;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q2 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f4817b;

    public /* synthetic */ q2(KeyEvent.Callback callback, int i) {
        this.f4816a = i;
        this.f4817b = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
        int i = this.f4816a;
        KeyEvent.Callback callback = this.f4817b;
        switch (i) {
            case 0:
                SettingsActivity settingsActivity = (SettingsActivity) callback;
                int i10 = SettingsActivity.f1300e0;
                jc.i.e(compoundButton, "<unused var>");
                SharedPreferences sharedPreferences = i3.p.f5195a;
                if (sharedPreferences == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                if (z4 != sharedPreferences.getBoolean("viewer_embedded", true)) {
                    if (SettingsActivity.t() > 0) {
                        settingsActivity.z(z4, false);
                        return;
                    }
                    if (z4) {
                        SharedPreferences sharedPreferences2 = i3.p.f5195a;
                        if (sharedPreferences2 == null) {
                            throw new IllegalStateException("Prefs.init(context) no llamado");
                        }
                        if (sharedPreferences2.getBoolean("tabs_swipe_enabled", false)) {
                            settingsActivity.y();
                            return;
                        }
                    }
                    SharedPreferences sharedPreferences3 = i3.p.f5195a;
                    if (sharedPreferences3 == null) {
                        throw new IllegalStateException("Prefs.init(context) no llamado");
                    }
                    sharedPreferences3.edit().putBoolean("viewer_embedded", z4).apply();
                    settingsActivity.B();
                    return;
                }
                return;
            default:
                Chip chip = (Chip) callback;
                u8.g gVar = chip.f2394u;
                if (gVar != null) {
                    u8.a aVar = (u8.a) ((ta.c) gVar).f8662a;
                    if (!z4 ? aVar.e(chip, aVar.e) : aVar.a(chip)) {
                        aVar.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f2393t;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z4);
                    return;
                }
                return;
        }
    }
}
