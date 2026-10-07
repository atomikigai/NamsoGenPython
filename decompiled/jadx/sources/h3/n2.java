package h3;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import app.namso_gen.spacehowen.SettingsActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n2 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4788a;

    public /* synthetic */ n2(int i) {
        this.f4788a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f4788a) {
            case 0:
                int i10 = SettingsActivity.f1300e0;
                SharedPreferences sharedPreferences = i3.p.f5195a;
                if (sharedPreferences == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                sharedPreferences.edit().putBoolean("tabs_swipe_enabled", true).apply();
                return;
            default:
                return;
        }
    }

    private final void a(DialogInterface dialogInterface, int i) {
    }
}
