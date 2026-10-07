package h3;

import app.namso_gen.spacehowen.SettingsActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f4803b;

    public /* synthetic */ p2(SettingsActivity settingsActivity, int i) {
        this.f4802a = i;
        this.f4803b = settingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4802a;
        SettingsActivity settingsActivity = this.f4803b;
        switch (i) {
            case 0:
                int i10 = SettingsActivity.f1300e0;
                settingsActivity.C();
                break;
            case 1:
                settingsActivity.C();
                break;
            default:
                settingsActivity.C();
                break;
        }
    }
}
